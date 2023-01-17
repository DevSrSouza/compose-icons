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

public val BrandsGroup.Edge: ImageVector
    get() {
        if (_edge != null) {
            return _edge!!
        }
        _edge = Builder(name = "Edge", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.1f, 37.44f)
                curveTo(161.1f, 12.23f, 207.7f, -0.775f, 255.0f, 0.002f)
                curveTo(423.0f, 0.002f, 512.0f, 123.8f, 512.0f, 219.5f)
                curveTo(511.9f, 252.2f, 499.0f, 283.4f, 476.1f, 306.7f)
                curveTo(453.2f, 329.9f, 422.1f, 343.2f, 389.4f, 343.7f)
                curveTo(314.2f, 343.7f, 297.9f, 320.6f, 297.9f, 311.7f)
                curveTo(297.9f, 307.9f, 299.1f, 305.5f, 302.7f, 302.3f)
                lineTo(303.7f, 301.1f)
                lineTo(304.1f, 299.5f)
                curveTo(314.6f, 288.0f, 320.0f, 273.3f, 320.0f, 257.9f)
                curveTo(320.0f, 179.2f, 237.8f, 115.2f, 136.0f, 115.2f)
                curveTo(98.46f, 114.9f, 61.46f, 124.1f, 28.48f, 142.1f)
                curveTo(55.48f, 84.58f, 111.2f, 44.5f, 119.8f, 38.28f)
                curveTo(120.6f, 37.73f, 120.1f, 37.44f, 120.1f, 37.44f)
                verticalLineTo(37.44f)
                close()
                moveTo(135.7f, 355.5f)
                curveTo(134.3f, 385.5f, 140.3f, 415.5f, 152.1f, 442.7f)
                curveTo(165.7f, 469.1f, 184.8f, 493.7f, 208.6f, 512.0f)
                curveTo(149.1f, 500.5f, 97.11f, 468.1f, 59.2f, 422.7f)
                curveTo(21.12f, 376.3f, 0.0f, 318.4f, 0.0f, 257.9f)
                curveTo(0.0f, 206.7f, 62.4f, 163.5f, 136.0f, 163.5f)
                curveTo(172.6f, 162.9f, 208.4f, 174.4f, 237.8f, 196.2f)
                lineTo(234.2f, 197.4f)
                curveTo(182.7f, 215.0f, 135.7f, 288.1f, 135.7f, 355.5f)
                verticalLineTo(355.5f)
                close()
                moveTo(469.8f, 400.0f)
                lineTo(469.1f, 400.1f)
                curveTo(457.3f, 418.9f, 443.2f, 435.2f, 426.9f, 449.6f)
                curveTo(396.1f, 477.6f, 358.8f, 495.1f, 318.1f, 499.5f)
                curveTo(299.5f, 499.8f, 281.3f, 496.3f, 264.3f, 488.1f)
                curveTo(238.7f, 477.8f, 217.2f, 458.1f, 202.7f, 435.1f)
                curveTo(188.3f, 411.2f, 181.6f, 383.4f, 183.7f, 355.5f)
                curveTo(183.1f, 335.4f, 189.1f, 315.2f, 198.7f, 297.3f)
                curveTo(212.6f, 330.4f, 236.2f, 358.6f, 266.3f, 378.1f)
                curveTo(296.4f, 397.6f, 331.8f, 407.6f, 367.7f, 406.7f)
                curveTo(398.7f, 407.0f, 429.8f, 400.0f, 457.9f, 386.2f)
                lineTo(459.8f, 385.3f)
                curveTo(463.7f, 383.0f, 467.5f, 381.4f, 471.4f, 385.3f)
                curveTo(475.9f, 390.2f, 473.2f, 394.5f, 470.2f, 399.3f)
                curveTo(470.0f, 399.5f, 469.9f, 399.8f, 469.8f, 400.0f)
                verticalLineTo(400.0f)
                close()
            }
        }
        .build()
        return _edge!!
    }

private var _edge: ImageVector? = null
