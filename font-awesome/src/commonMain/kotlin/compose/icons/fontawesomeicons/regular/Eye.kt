package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.Eye: ImageVector
    get() {
        if (_eye != null) {
            return _eye!!
        }
        _eye = Builder(name = "Eye", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 256.0f)
                curveTo(160.0f, 185.3f, 217.3f, 128.0f, 288.0f, 128.0f)
                curveTo(358.7f, 128.0f, 416.0f, 185.3f, 416.0f, 256.0f)
                curveTo(416.0f, 326.7f, 358.7f, 384.0f, 288.0f, 384.0f)
                curveTo(217.3f, 384.0f, 160.0f, 326.7f, 160.0f, 256.0f)
                close()
                moveTo(288.0f, 336.0f)
                curveTo(332.2f, 336.0f, 368.0f, 300.2f, 368.0f, 256.0f)
                curveTo(368.0f, 211.8f, 332.2f, 176.0f, 288.0f, 176.0f)
                curveTo(287.3f, 176.0f, 286.7f, 176.0f, 285.1f, 176.0f)
                curveTo(287.3f, 181.1f, 288.0f, 186.5f, 288.0f, 192.0f)
                curveTo(288.0f, 227.3f, 259.3f, 256.0f, 224.0f, 256.0f)
                curveTo(218.5f, 256.0f, 213.1f, 255.3f, 208.0f, 253.1f)
                curveTo(208.0f, 254.7f, 208.0f, 255.3f, 208.0f, 255.1f)
                curveTo(208.0f, 300.2f, 243.8f, 336.0f, 288.0f, 336.0f)
                lineTo(288.0f, 336.0f)
                close()
                moveTo(95.42f, 112.6f)
                curveTo(142.5f, 68.84f, 207.2f, 32.0f, 288.0f, 32.0f)
                curveTo(368.8f, 32.0f, 433.5f, 68.84f, 480.6f, 112.6f)
                curveTo(527.4f, 156.0f, 558.7f, 207.1f, 573.5f, 243.7f)
                curveTo(576.8f, 251.6f, 576.8f, 260.4f, 573.5f, 268.3f)
                curveTo(558.7f, 304.0f, 527.4f, 355.1f, 480.6f, 399.4f)
                curveTo(433.5f, 443.2f, 368.8f, 480.0f, 288.0f, 480.0f)
                curveTo(207.2f, 480.0f, 142.5f, 443.2f, 95.42f, 399.4f)
                curveTo(48.62f, 355.1f, 17.34f, 304.0f, 2.461f, 268.3f)
                curveTo(-0.821f, 260.4f, -0.821f, 251.6f, 2.461f, 243.7f)
                curveTo(17.34f, 207.1f, 48.62f, 156.0f, 95.42f, 112.6f)
                verticalLineTo(112.6f)
                close()
                moveTo(288.0f, 80.0f)
                curveTo(222.8f, 80.0f, 169.2f, 109.6f, 128.1f, 147.7f)
                curveTo(89.6f, 183.5f, 63.02f, 225.1f, 49.44f, 256.0f)
                curveTo(63.02f, 286.0f, 89.6f, 328.5f, 128.1f, 364.3f)
                curveTo(169.2f, 402.4f, 222.8f, 432.0f, 288.0f, 432.0f)
                curveTo(353.2f, 432.0f, 406.8f, 402.4f, 447.9f, 364.3f)
                curveTo(486.4f, 328.5f, 512.1f, 286.0f, 526.6f, 256.0f)
                curveTo(512.1f, 225.1f, 486.4f, 183.5f, 447.9f, 147.7f)
                curveTo(406.8f, 109.6f, 353.2f, 80.0f, 288.0f, 80.0f)
                verticalLineTo(80.0f)
                close()
            }
        }
        .build()
        return _eye!!
    }

private var _eye: ImageVector? = null
