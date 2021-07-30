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

public val BrandsGroup.TencentWeibo: ImageVector
    get() {
        if (_tencentWeibo != null) {
            return _tencentWeibo!!
        }
        _tencentWeibo = Builder(name = "TencentWeibo", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(72.3f, 495.8f)
                curveToRelative(1.4f, 19.9f, -27.6f, 22.2f, -29.7f, 2.9f)
                curveTo(31.0f, 368.8f, 73.7f, 259.2f, 144.0f, 185.5f)
                curveToRelative(-15.6f, -34.0f, 9.2f, -77.1f, 50.6f, -77.1f)
                curveToRelative(30.3f, 0.0f, 55.1f, 24.6f, 55.1f, 55.1f)
                curveToRelative(0.0f, 44.0f, -49.5f, 70.8f, -86.9f, 45.1f)
                curveToRelative(-65.7f, 71.3f, -101.4f, 169.8f, -90.5f, 287.2f)
                close()
                moveTo(192.0f, 0.1f)
                curveTo(66.1f, 0.1f, -12.3f, 134.3f, 43.7f, 242.4f)
                curveTo(52.4f, 259.8f, 79.0f, 246.9f, 70.0f, 229.0f)
                curveTo(23.7f, 136.4f, 91.0f, 29.8f, 192.0f, 29.8f)
                curveToRelative(75.4f, 0.0f, 136.9f, 61.4f, 136.9f, 136.9f)
                curveToRelative(0.0f, 90.8f, -86.9f, 153.9f, -167.7f, 133.1f)
                curveToRelative(-19.1f, -4.1f, -25.6f, 24.4f, -6.6f, 29.1f)
                curveToRelative(110.7f, 23.2f, 204.0f, -60.0f, 204.0f, -162.3f)
                curveTo(358.6f, 74.7f, 284.0f, 0.1f, 192.0f, 0.1f)
                close()
            }
        }
        .build()
        return _tencentWeibo!!
    }

private var _tencentWeibo: ImageVector? = null
