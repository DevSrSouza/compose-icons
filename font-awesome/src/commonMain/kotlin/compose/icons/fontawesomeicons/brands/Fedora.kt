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

public val BrandsGroup.Fedora: ImageVector
    get() {
        if (_fedora != null) {
            return _fedora!!
        }
        _fedora = Builder(name = "Fedora", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.041f, 255.8f)
                curveTo(0.122f, 132.2f, 100.3f, 32.0f, 224.0f, 32.0f)
                curveTo(347.7f, 32.0f, 448.0f, 132.3f, 448.0f, 256.0f)
                curveTo(448.0f, 379.7f, 347.8f, 479.9f, 224.1f, 480.0f)
                horizontalLineTo(50.93f)
                curveTo(22.84f, 480.0f, 0.083f, 457.3f, 0.042f, 429.2f)
                horizontalLineTo(0.0f)
                verticalLineTo(255.8f)
                horizontalLineTo(0.041f)
                close()
                moveTo(342.6f, 192.7f)
                curveTo(342.6f, 153.0f, 307.0f, 124.2f, 269.4f, 124.2f)
                curveTo(234.5f, 124.2f, 203.6f, 150.5f, 199.3f, 184.1f)
                curveTo(199.1f, 187.9f, 198.9f, 189.1f, 198.9f, 192.6f)
                curveTo(198.8f, 213.7f, 198.9f, 235.4f, 198.1f, 257.0f)
                curveTo(199.0f, 283.1f, 199.1f, 309.1f, 198.1f, 333.6f)
                curveTo(198.1f, 360.7f, 178.7f, 379.1f, 153.4f, 379.1f)
                curveTo(128.1f, 379.1f, 107.6f, 358.9f, 107.6f, 333.6f)
                curveTo(108.1f, 305.9f, 130.2f, 288.3f, 156.1f, 287.5f)
                horizontalLineTo(156.3f)
                lineTo(182.6f, 287.3f)
                verticalLineTo(250.0f)
                lineTo(156.3f, 250.2f)
                curveTo(109.2f, 249.8f, 71.72f, 286.7f, 70.36f, 333.6f)
                curveTo(70.36f, 379.2f, 107.9f, 416.5f, 153.4f, 416.5f)
                curveTo(196.4f, 416.5f, 232.1f, 382.9f, 236.0f, 340.9f)
                lineTo(236.2f, 287.4f)
                lineTo(268.8f, 287.1f)
                curveTo(294.1f, 287.3f, 293.8f, 249.3f, 268.6f, 249.8f)
                lineTo(236.2f, 250.1f)
                curveTo(236.2f, 243.7f, 236.3f, 237.3f, 236.3f, 230.9f)
                curveTo(236.4f, 218.2f, 236.4f, 205.5f, 236.2f, 192.7f)
                curveTo(236.3f, 176.2f, 252.0f, 161.5f, 269.4f, 161.5f)
                curveTo(286.9f, 161.5f, 305.3f, 170.2f, 305.3f, 192.7f)
                curveTo(305.3f, 195.9f, 305.2f, 197.8f, 305.0f, 199.0f)
                curveTo(303.1f, 209.5f, 310.2f, 219.4f, 320.7f, 220.9f)
                curveTo(331.3f, 222.4f, 340.9f, 214.8f, 341.9f, 204.3f)
                curveTo(342.5f, 200.1f, 342.6f, 196.4f, 342.6f, 192.7f)
                horizontalLineTo(342.6f)
                close()
            }
        }
        .build()
        return _fedora!!
    }

private var _fedora: ImageVector? = null
