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

public val BrandsGroup.Chrome: ImageVector
    get() {
        if (_chrome != null) {
            return _chrome!!
        }
        _chrome = Builder(name = "Chrome", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 256.0f)
                curveTo(0.0f, 209.4f, 12.47f, 165.6f, 34.27f, 127.1f)
                lineTo(144.1f, 318.3f)
                curveTo(166.0f, 357.5f, 207.9f, 384.0f, 256.0f, 384.0f)
                curveTo(270.3f, 384.0f, 283.1f, 381.7f, 296.8f, 377.4f)
                lineTo(220.5f, 509.6f)
                curveTo(95.9f, 492.3f, 0.0f, 385.3f, 0.0f, 256.0f)
                close()
                moveTo(365.1f, 321.6f)
                curveTo(377.4f, 302.4f, 384.0f, 279.1f, 384.0f, 256.0f)
                curveTo(384.0f, 217.8f, 367.2f, 183.5f, 340.7f, 160.0f)
                horizontalLineTo(493.4f)
                curveTo(505.4f, 189.6f, 512.0f, 222.1f, 512.0f, 256.0f)
                curveTo(512.0f, 397.4f, 397.4f, 511.1f, 256.0f, 512.0f)
                lineTo(365.1f, 321.6f)
                close()
                moveTo(477.8f, 128.0f)
                horizontalLineTo(256.0f)
                curveTo(193.1f, 128.0f, 142.3f, 172.1f, 130.5f, 230.7f)
                lineTo(54.19f, 98.47f)
                curveTo(101.0f, 38.53f, 174.0f, 0.0f, 256.0f, 0.0f)
                curveTo(350.8f, 0.0f, 433.5f, 51.48f, 477.8f, 128.0f)
                verticalLineTo(128.0f)
                close()
                moveTo(168.0f, 256.0f)
                curveTo(168.0f, 207.4f, 207.4f, 168.0f, 256.0f, 168.0f)
                curveTo(304.6f, 168.0f, 344.0f, 207.4f, 344.0f, 256.0f)
                curveTo(344.0f, 304.6f, 304.6f, 344.0f, 256.0f, 344.0f)
                curveTo(207.4f, 344.0f, 168.0f, 304.6f, 168.0f, 256.0f)
                close()
            }
        }
        .build()
        return _chrome!!
    }

private var _chrome: ImageVector? = null
