package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.Number0: ImageVector
    get() {
        if (_number0 != null) {
            return _number0!!
        }
        _number0 = Builder(name = "Number0", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.5f)
                curveToRelative(1.321f, 0.0f, 2.484f, 0.348f, 3.447f, 0.994f)
                curveToRelative(0.963f, 0.645f, 1.726f, 1.588f, 2.249f, 2.778f)
                curveToRelative(0.522f, 1.19f, 0.804f, 2.625f, 0.804f, 4.257f)
                verticalLineToRelative(4.942f)
                curveToRelative(0.0f, 1.632f, -0.282f, 3.068f, -0.804f, 4.257f)
                curveToRelative(-0.523f, 1.19f, -1.286f, 2.133f, -2.25f, 2.778f)
                curveToRelative(-0.962f, 0.646f, -2.125f, 0.994f, -3.446f, 0.994f)
                curveToRelative(-1.321f, 0.0f, -2.484f, -0.348f, -3.447f, -0.994f)
                curveToRelative(-0.963f, -0.645f, -1.726f, -1.588f, -2.249f, -2.778f)
                curveToRelative(-0.522f, -1.19f, -0.804f, -2.625f, -0.804f, -4.257f)
                lineTo(5.5f, 9.529f)
                curveToRelative(0.0f, -1.632f, 0.282f, -3.068f, 0.804f, -4.257f)
                curveToRelative(0.523f, -1.19f, 1.286f, -2.133f, 2.25f, -2.778f)
                curveTo(9.515f, 1.848f, 10.678f, 1.5f, 12.0f, 1.5f)
                close()
                moveTo(12.0f, 3.5f)
                curveToRelative(-0.916f, 0.0f, -1.694f, 0.226f, -2.333f, 0.655f)
                curveToRelative(-0.637f, 0.427f, -1.158f, 1.07f, -1.532f, 1.92f)
                curveToRelative(-0.412f, 0.94f, -0.635f, 2.108f, -0.635f, 3.454f)
                verticalLineToRelative(4.942f)
                curveToRelative(0.0f, 1.346f, 0.223f, 2.514f, 0.635f, 3.453f)
                curveToRelative(0.374f, 0.851f, 0.895f, 1.494f, 1.532f, 1.921f)
                curveToRelative(0.639f, 0.429f, 1.417f, 0.655f, 2.333f, 0.655f)
                curveToRelative(0.916f, 0.0f, 1.694f, -0.226f, 2.333f, -0.655f)
                curveToRelative(0.637f, -0.427f, 1.158f, -1.07f, 1.532f, -1.92f)
                curveToRelative(0.412f, -0.94f, 0.635f, -2.108f, 0.635f, -3.454f)
                lineTo(16.5f, 9.529f)
                curveToRelative(0.0f, -1.346f, -0.223f, -2.514f, -0.635f, -3.453f)
                curveToRelative(-0.374f, -0.851f, -0.895f, -1.494f, -1.532f, -1.921f)
                curveTo(13.694f, 3.726f, 12.916f, 3.5f, 12.0f, 3.5f)
                close()
            }
        }
        .build()
        return _number0!!
    }

private var _number0: ImageVector? = null
