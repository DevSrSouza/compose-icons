package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.ArrowCircleDown: ImageVector
    get() {
        if (_arrowCircleDown != null) {
            return _arrowCircleDown!!
        }
        _arrowCircleDown = Builder(name = "ArrowCircleDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5297f, 11.7199f)
                lineTo(16.4456f, 11.6473f)
                curveTo(16.152f, 11.4294f, 15.7353f, 11.4536f, 15.4691f, 11.7199f)
                lineTo(12.7497f, 14.4392f)
                lineTo(12.7494f, 7.7495f)
                lineTo(12.7425f, 7.6477f)
                curveTo(12.6929f, 7.2817f, 12.3791f, 6.9995f, 11.9994f, 6.9995f)
                lineTo(11.8976f, 7.0064f)
                curveTo(11.5315f, 7.056f, 11.2494f, 7.3698f, 11.2494f, 7.7495f)
                lineTo(11.2497f, 14.4412f)
                lineTo(8.529f, 11.7193f)
                lineTo(8.4449f, 11.6466f)
                curveTo(8.1513f, 11.4287f, 7.7347f, 11.4529f, 7.4683f, 11.7191f)
                curveTo(7.1754f, 12.0119f, 7.1753f, 12.4868f, 7.4681f, 12.7797f)
                lineTo(11.4681f, 16.7813f)
                lineTo(11.5523f, 16.8539f)
                curveTo(11.8459f, 17.0718f, 12.2626f, 17.0477f, 12.5289f, 16.7814f)
                lineTo(16.5297f, 12.7805f)
                lineTo(16.6023f, 12.6964f)
                curveTo(16.8202f, 12.4028f, 16.796f, 11.9862f, 16.5297f, 11.7199f)
                close()
                moveTo(1.999f, 12.0f)
                curveTo(1.999f, 17.5228f, 6.4762f, 22.0f, 11.999f, 22.0f)
                curveTo(17.5219f, 22.0f, 21.999f, 17.5228f, 21.999f, 12.0f)
                curveTo(21.999f, 6.4771f, 17.5219f, 2.0f, 11.999f, 2.0f)
                curveTo(6.4762f, 2.0f, 1.999f, 6.4771f, 1.999f, 12.0f)
                close()
                moveTo(20.499f, 12.0f)
                curveTo(20.499f, 16.6944f, 16.6934f, 20.5f, 11.999f, 20.5f)
                curveTo(7.3046f, 20.5f, 3.499f, 16.6944f, 3.499f, 12.0f)
                curveTo(3.499f, 7.3056f, 7.3046f, 3.5f, 11.999f, 3.5f)
                curveTo(16.6934f, 3.5f, 20.499f, 7.3056f, 20.499f, 12.0f)
                close()
            }
        }
        .build()
        return _arrowCircleDown!!
    }

private var _arrowCircleDown: ImageVector? = null
