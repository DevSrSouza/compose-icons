package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Child: ImageVector
    get() {
        if (_child != null) {
            return _child!!
        }
        _child = Builder(name = "Child", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.0f, 72.0f)
                curveToRelative(0.0f, -39.76f, 32.24f, -72.0f, 72.0f, -72.0f)
                reflectiveCurveToRelative(72.0f, 32.24f, 72.0f, 72.0f)
                curveToRelative(0.0f, 39.76f, -32.24f, 72.0f, -72.0f, 72.0f)
                reflectiveCurveToRelative(-72.0f, -32.24f, -72.0f, -72.0f)
                close()
                moveTo(374.63f, 73.37f)
                curveToRelative(-12.5f, -12.5f, -32.76f, -12.5f, -45.25f, 0.0f)
                lineTo(242.74f, 160.0f)
                lineTo(141.25f, 160.0f)
                lineTo(54.63f, 73.37f)
                curveToRelative(-12.5f, -12.5f, -32.76f, -12.5f, -45.25f, 0.0f)
                curveToRelative(-12.5f, 12.5f, -12.5f, 32.76f, 0.0f, 45.26f)
                lineTo(104.0f, 213.25f)
                lineTo(104.0f, 480.0f)
                curveToRelative(0.0f, 17.67f, 14.33f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(17.67f, 0.0f, 32.0f, -14.33f, 32.0f, -32.0f)
                lineTo(184.0f, 368.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(112.0f)
                curveToRelative(0.0f, 17.67f, 14.33f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(17.67f, 0.0f, 32.0f, -14.33f, 32.0f, -32.0f)
                lineTo(280.0f, 213.25f)
                lineToRelative(94.63f, -94.63f)
                curveToRelative(12.5f, -12.5f, 12.5f, -32.76f, 0.0f, -45.25f)
                close()
            }
        }
        .build()
        return _child!!
    }

private var _child: ImageVector? = null
