package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.GlideG: ImageVector
    get() {
        if (_glideG != null) {
            return _glideG!!
        }
        _glideG = Builder(name = "GlideG", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(407.1f, 211.2f)
                curveToRelative(-3.5f, -1.4f, -11.6f, -3.8f, -15.4f, -3.8f)
                curveToRelative(-37.1f, 0.0f, -62.2f, 16.8f, -93.5f, 34.5f)
                lineToRelative(-0.9f, -0.9f)
                curveToRelative(7.0f, -47.3f, 23.5f, -91.9f, 23.5f, -140.4f)
                curveTo(320.8f, 29.1f, 282.6f, 0.0f, 212.4f, 0.0f)
                curveTo(97.3f, 0.0f, 39.0f, 113.7f, 39.0f, 198.4f)
                curveTo(39.0f, 286.3f, 90.3f, 335.0f, 177.6f, 335.0f)
                curveToRelative(12.0f, 0.0f, 11.0f, -1.0f, 11.0f, 3.8f)
                curveToRelative(-16.9f, 128.9f, -90.8f, 133.1f, -90.8f, 94.6f)
                curveToRelative(0.0f, -39.2f, 45.0f, -58.6f, 45.5f, -61.0f)
                curveToRelative(-0.3f, -12.2f, -47.0f, -27.6f, -58.9f, -27.6f)
                curveToRelative(-33.9f, 0.1f, -52.4f, 51.2f, -52.4f, 79.3f)
                curveTo(32.0f, 476.0f, 64.8f, 512.0f, 117.5f, 512.0f)
                curveToRelative(77.4f, 0.0f, 134.0f, -77.8f, 151.4f, -145.4f)
                curveToRelative(15.1f, -60.5f, 11.2f, -63.3f, 19.7f, -67.6f)
                curveToRelative(32.2f, -16.2f, 57.5f, -27.0f, 93.8f, -27.0f)
                curveToRelative(17.8f, 0.0f, 30.5f, 3.7f, 58.9f, 8.4f)
                curveToRelative(2.9f, 0.0f, 6.7f, -2.9f, 6.7f, -5.8f)
                curveToRelative(0.0f, -8.0f, -33.4f, -60.5f, -40.9f, -63.4f)
                close()
                moveTo(231.8f, 126.8f)
                curveToRelative(-9.3f, 44.7f, -18.6f, 89.6f, -27.8f, 134.3f)
                curveToRelative(-2.3f, 10.2f, -13.3f, 7.8f, -22.0f, 7.8f)
                curveToRelative(-38.3f, 0.0f, -49.0f, -41.8f, -49.0f, -73.1f)
                curveToRelative(0.0f, -47.0f, 18.0f, -109.3f, 61.8f, -133.4f)
                curveToRelative(7.0f, -4.1f, 14.8f, -6.7f, 22.6f, -6.7f)
                curveToRelative(18.6f, 0.0f, 20.0f, 13.3f, 20.0f, 28.7f)
                curveToRelative(-0.1f, 14.3f, -2.7f, 28.5f, -5.6f, 42.4f)
                close()
            }
        }
        .build()
        return _glideG!!
    }

private var _glideG: ImageVector? = null
