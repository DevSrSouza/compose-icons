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

public val SolidGroup.Fill: ImageVector
    get() {
        if (_fill != null) {
            return _fill!!
        }
        _fill = Builder(name = "Fill", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(86.6f, 9.4f)
                curveTo(74.1f, -3.1f, 53.9f, -3.1f, 41.4f, 9.4f)
                reflectiveCurveToRelative(-12.5f, 32.8f, 0.0f, 45.3f)
                lineTo(122.7f, 136.0f)
                lineTo(30.6f, 228.1f)
                curveToRelative(-37.5f, 37.5f, -37.5f, 98.3f, 0.0f, 135.8f)
                lineTo(148.1f, 481.4f)
                curveToRelative(37.5f, 37.5f, 98.3f, 37.5f, 135.8f, 0.0f)
                lineTo(474.3f, 290.9f)
                curveToRelative(28.1f, -28.1f, 28.1f, -73.7f, 0.0f, -101.8f)
                lineTo(322.9f, 37.7f)
                curveToRelative(-28.1f, -28.1f, -73.7f, -28.1f, -101.8f, 0.0f)
                lineTo(168.0f, 90.7f)
                lineTo(86.6f, 9.4f)
                close()
                moveTo(168.0f, 181.3f)
                lineToRelative(49.4f, 49.4f)
                curveToRelative(12.5f, 12.5f, 32.8f, 12.5f, 45.3f, 0.0f)
                reflectiveCurveToRelative(12.5f, -32.8f, 0.0f, -45.3f)
                lineTo(213.3f, 136.0f)
                lineToRelative(53.1f, -53.1f)
                curveToRelative(3.1f, -3.1f, 8.2f, -3.1f, 11.3f, 0.0f)
                lineTo(429.1f, 234.3f)
                curveToRelative(3.1f, 3.1f, 3.1f, 8.2f, 0.0f, 11.3f)
                lineTo(386.7f, 288.0f)
                horizontalLineTo(67.5f)
                curveToRelative(1.4f, -5.4f, 4.2f, -10.4f, 8.4f, -14.6f)
                lineTo(168.0f, 181.3f)
                close()
            }
        }
        .build()
        return _fill!!
    }

private var _fill: ImageVector? = null
