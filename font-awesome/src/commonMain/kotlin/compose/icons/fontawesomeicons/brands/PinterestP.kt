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

public val BrandsGroup.PinterestP: ImageVector
    get() {
        if (_pinterestP != null) {
            return _pinterestP!!
        }
        _pinterestP = Builder(name = "PinterestP", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.0f, 6.5f)
                curveTo(101.4f, 6.5f, 0.0f, 74.9f, 0.0f, 185.6f)
                curveTo(0.0f, 256.0f, 39.6f, 296.0f, 63.6f, 296.0f)
                curveToRelative(9.9f, 0.0f, 15.6f, -27.6f, 15.6f, -35.4f)
                curveToRelative(0.0f, -9.3f, -23.7f, -29.1f, -23.7f, -67.8f)
                curveToRelative(0.0f, -80.4f, 61.2f, -137.4f, 140.4f, -137.4f)
                curveToRelative(68.1f, 0.0f, 118.5f, 38.7f, 118.5f, 109.8f)
                curveToRelative(0.0f, 53.1f, -21.3f, 152.7f, -90.3f, 152.7f)
                curveToRelative(-24.9f, 0.0f, -46.2f, -18.0f, -46.2f, -43.8f)
                curveToRelative(0.0f, -37.8f, 26.4f, -74.4f, 26.4f, -113.4f)
                curveToRelative(0.0f, -66.2f, -93.9f, -54.2f, -93.9f, 25.8f)
                curveToRelative(0.0f, 16.8f, 2.1f, 35.4f, 9.6f, 50.7f)
                curveToRelative(-13.8f, 59.4f, -42.0f, 147.9f, -42.0f, 209.1f)
                curveToRelative(0.0f, 18.9f, 2.7f, 37.5f, 4.5f, 56.4f)
                curveToRelative(3.4f, 3.8f, 1.7f, 3.4f, 6.9f, 1.5f)
                curveToRelative(50.4f, -69.0f, 48.6f, -82.5f, 71.4f, -172.8f)
                curveToRelative(12.3f, 23.4f, 44.1f, 36.0f, 69.3f, 36.0f)
                curveToRelative(106.2f, 0.0f, 153.9f, -103.5f, 153.9f, -196.8f)
                curveTo(384.0f, 71.3f, 298.2f, 6.5f, 204.0f, 6.5f)
                close()
            }
        }
        .build()
        return _pinterestP!!
    }

private var _pinterestP: ImageVector? = null
