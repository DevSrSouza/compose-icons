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

public val BrandsGroup.Padlet: ImageVector
    get() {
        if (_padlet != null) {
            return _padlet!!
        }
        _padlet = Builder(name = "Padlet", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(297.9f, 0.0f)
                lineTo(298.0f, 0.001f)
                curveTo(305.6f, 0.108f, 312.4f, 4.72f, 315.5f, 11.78f)
                lineTo(447.5f, 320.3f)
                lineTo(447.8f, 320.2f)
                lineTo(448.0f, 320.6f)
                lineTo(445.2f, 330.6f)
                lineTo(402.3f, 488.6f)
                curveTo(398.6f, 504.8f, 382.6f, 514.9f, 366.5f, 511.2f)
                lineTo(298.1f, 495.6f)
                lineTo(229.6f, 511.2f)
                curveTo(213.5f, 514.9f, 197.5f, 504.8f, 193.8f, 488.6f)
                lineTo(150.9f, 330.6f)
                lineTo(148.2f, 320.6f)
                lineTo(148.3f, 320.2f)
                lineTo(280.4f, 11.78f)
                curveTo(283.4f, 4.797f, 290.3f, 0.184f, 297.9f, 0.001f)
                lineTo(297.9f, 0.0f)
                close()
                moveTo(160.1f, 322.1f)
                lineTo(291.1f, 361.2f)
                lineTo(298.0f, 483.7f)
                lineTo(305.9f, 362.2f)
                lineTo(436.5f, 322.9f)
                lineTo(436.7f, 322.8f)
                lineTo(305.7f, 347.9f)
                lineTo(297.1f, 27.72f)
                lineTo(291.9f, 347.9f)
                lineTo(160.1f, 322.1f)
                close()
                moveTo(426.0f, 222.6f)
                lineTo(520.4f, 181.6f)
                horizontalLineTo(594.2f)
                lineTo(437.2f, 429.2f)
                lineTo(468.8f, 320.2f)
                lineTo(426.0f, 222.6f)
                close()
                moveTo(597.5f, 181.4f)
                lineTo(638.9f, 257.6f)
                curveTo(642.9f, 265.1f, 635.0f, 273.5f, 627.3f, 269.8f)
                lineTo(579.7f, 247.1f)
                lineTo(597.5f, 181.4f)
                close()
                moveTo(127.3f, 318.5f)
                lineTo(158.7f, 430.0f)
                lineTo(1.61f, 154.5f)
                curveTo(-4.292f, 144.1f, 7.128f, 132.5f, 17.55f, 138.3f)
                lineTo(169.4f, 222.5f)
                lineTo(127.3f, 318.5f)
                close()
            }
        }
        .build()
        return _padlet!!
    }

private var _padlet: ImageVector? = null
