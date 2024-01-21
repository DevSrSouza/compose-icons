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
        _child = Builder(name = "Child", defaultWidth = 320.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 64.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 128.0f, 0.0f)
                arcTo(64.0f, 64.0f, 0.0f, true, true, 96.0f, 64.0f)
                close()
                moveTo(144.0f, 384.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(80.0f, 287.8f)
                lineTo(59.1f, 321.0f)
                curveToRelative(-9.4f, 15.0f, -29.2f, 19.4f, -44.1f, 10.0f)
                reflectiveCurveTo(-4.5f, 301.9f, 4.9f, 287.0f)
                lineToRelative(39.9f, -63.3f)
                curveTo(69.7f, 184.0f, 113.2f, 160.0f, 160.0f, 160.0f)
                reflectiveCurveToRelative(90.3f, 24.0f, 115.2f, 63.6f)
                lineTo(315.1f, 287.0f)
                curveToRelative(9.4f, 15.0f, 4.9f, 34.7f, -10.0f, 44.1f)
                reflectiveCurveToRelative(-34.7f, 4.9f, -44.1f, -10.0f)
                lineTo(240.0f, 287.8f)
                lineTo(240.0f, 480.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(176.0f, 384.0f)
                lineTo(144.0f, 384.0f)
                close()
            }
        }
        .build()
        return _child!!
    }

private var _child: ImageVector? = null
