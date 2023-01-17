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

public val SolidGroup.LessThanEqual: ImageVector
    get() {
        if (_lessThanEqual != null) {
            return _lessThanEqual!!
        }
        _lessThanEqual = Builder(name = "LessThanEqual", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(395.9f, 93.7f)
                curveToRelative(16.4f, -6.6f, 24.4f, -25.2f, 17.8f, -41.6f)
                reflectiveCurveToRelative(-25.2f, -24.4f, -41.6f, -17.8f)
                lineToRelative(-320.0f, 128.0f)
                curveTo(40.0f, 167.1f, 32.0f, 178.9f, 32.0f, 192.0f)
                reflectiveCurveToRelative(8.0f, 24.9f, 20.1f, 29.7f)
                lineToRelative(320.0f, 128.0f)
                curveToRelative(16.4f, 6.6f, 35.0f, -1.4f, 41.6f, -17.8f)
                reflectiveCurveToRelative(-1.4f, -35.0f, -17.8f, -41.6f)
                lineTo(150.2f, 192.0f)
                lineTo(395.9f, 93.7f)
                close()
                moveTo(32.0f, 416.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineTo(416.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineTo(32.0f)
                close()
            }
        }
        .build()
        return _lessThanEqual!!
    }

private var _lessThanEqual: ImageVector? = null
