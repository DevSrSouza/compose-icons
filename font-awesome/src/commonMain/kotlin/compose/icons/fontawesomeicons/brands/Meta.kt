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

public val BrandsGroup.Meta: ImageVector
    get() {
        if (_meta != null) {
            return _meta!!
        }
        _meta = Builder(name = "Meta", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(640.0f, 317.9f)
                curveTo(640.0f, 409.2f, 600.6f, 466.4f, 529.7f, 466.4f)
                curveTo(467.1f, 466.4f, 433.9f, 431.8f, 372.8f, 329.8f)
                lineTo(341.4f, 277.2f)
                curveTo(333.1f, 264.7f, 326.9f, 253.0f, 320.2f, 242.2f)
                curveTo(300.1f, 276.0f, 273.1f, 325.2f, 273.1f, 325.2f)
                curveTo(206.1f, 441.8f, 168.5f, 466.4f, 116.2f, 466.4f)
                curveTo(43.42f, 466.4f, 0.0f, 409.1f, 0.0f, 320.5f)
                curveTo(0.0f, 177.5f, 79.78f, 42.4f, 183.9f, 42.4f)
                curveTo(234.1f, 42.4f, 277.7f, 67.08f, 328.7f, 131.9f)
                curveTo(365.8f, 81.8f, 406.8f, 42.4f, 459.3f, 42.4f)
                curveTo(558.4f, 42.4f, 640.0f, 168.1f, 640.0f, 317.9f)
                horizontalLineTo(640.0f)
                close()
                moveTo(287.4f, 192.2f)
                curveTo(244.5f, 130.1f, 216.5f, 111.7f, 183.0f, 111.7f)
                curveTo(121.1f, 111.7f, 69.22f, 217.8f, 69.22f, 321.7f)
                curveTo(69.22f, 370.2f, 87.7f, 397.4f, 118.8f, 397.4f)
                curveTo(149.0f, 397.4f, 167.8f, 378.4f, 222.0f, 293.6f)
                curveTo(222.0f, 293.6f, 246.7f, 254.5f, 287.4f, 192.2f)
                verticalLineTo(192.2f)
                close()
                moveTo(531.2f, 397.4f)
                curveTo(563.4f, 397.4f, 578.1f, 369.9f, 578.1f, 322.5f)
                curveTo(578.1f, 198.3f, 523.8f, 97.08f, 454.9f, 97.08f)
                curveTo(421.7f, 97.08f, 393.8f, 123.0f, 360.0f, 175.1f)
                curveTo(369.4f, 188.9f, 379.1f, 204.1f, 389.3f, 220.5f)
                lineTo(426.8f, 282.9f)
                curveTo(485.5f, 377.0f, 500.3f, 397.4f, 531.2f, 397.4f)
                lineTo(531.2f, 397.4f)
                close()
            }
        }
        .build()
        return _meta!!
    }

private var _meta: ImageVector? = null
