package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
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
                curveToRelative(0.0f, -39.765f, 32.235f, -72.0f, 72.0f, -72.0f)
                reflectiveCurveToRelative(72.0f, 32.235f, 72.0f, 72.0f)
                curveToRelative(0.0f, 39.764f, -32.235f, 72.0f, -72.0f, 72.0f)
                reflectiveCurveToRelative(-72.0f, -32.236f, -72.0f, -72.0f)
                close()
                moveTo(374.627f, 73.373f)
                curveToRelative(-12.496f, -12.497f, -32.758f, -12.497f, -45.254f, 0.0f)
                lineTo(242.745f, 160.0f)
                lineTo(141.254f, 160.0f)
                lineTo(54.627f, 73.373f)
                curveToRelative(-12.496f, -12.497f, -32.758f, -12.497f, -45.254f, 0.0f)
                curveToRelative(-12.497f, 12.497f, -12.497f, 32.758f, 0.0f, 45.255f)
                lineTo(104.0f, 213.254f)
                lineTo(104.0f, 480.0f)
                curveToRelative(0.0f, 17.673f, 14.327f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(17.673f, 0.0f, 32.0f, -14.327f, 32.0f, -32.0f)
                lineTo(184.0f, 368.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(112.0f)
                curveToRelative(0.0f, 17.673f, 14.327f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(17.673f, 0.0f, 32.0f, -14.327f, 32.0f, -32.0f)
                lineTo(280.0f, 213.254f)
                lineToRelative(94.627f, -94.627f)
                curveToRelative(12.497f, -12.497f, 12.497f, -32.757f, 0.0f, -45.254f)
                close()
            }
        }
        .build()
        return _child!!
    }

private var _child: ImageVector? = null
