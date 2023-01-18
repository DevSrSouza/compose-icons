package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.ArrowCircleDown: ImageVector
    get() {
        if (_arrowCircleDown != null) {
            return _arrowCircleDown!!
        }
        _arrowCircleDown = Builder(name = "ArrowCircleDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.999f, 12.0f)
                curveTo(1.999f, 17.5228f, 6.4762f, 22.0f, 11.999f, 22.0f)
                curveTo(17.5219f, 22.0f, 21.999f, 17.5228f, 21.999f, 12.0f)
                curveTo(21.999f, 6.4771f, 17.5219f, 2.0f, 11.999f, 2.0f)
                curveTo(6.4762f, 2.0f, 1.999f, 6.4771f, 1.999f, 12.0f)
                close()
                moveTo(16.5297f, 11.7199f)
                curveTo(16.796f, 11.9862f, 16.8202f, 12.4028f, 16.6023f, 12.6964f)
                lineTo(16.5297f, 12.7805f)
                lineTo(12.5289f, 16.7814f)
                curveTo(12.2626f, 17.0477f, 11.8459f, 17.0718f, 11.5523f, 16.8539f)
                lineTo(11.4681f, 16.7813f)
                lineTo(7.4681f, 12.7797f)
                curveTo(7.1753f, 12.4868f, 7.1754f, 12.0119f, 7.4683f, 11.7191f)
                curveTo(7.7347f, 11.4529f, 8.1513f, 11.4287f, 8.4449f, 11.6466f)
                lineTo(8.529f, 11.7193f)
                lineTo(11.2497f, 14.4412f)
                lineTo(11.2494f, 7.7495f)
                curveTo(11.2494f, 7.3698f, 11.5315f, 7.056f, 11.8976f, 7.0064f)
                lineTo(11.9994f, 6.9995f)
                curveTo(12.3791f, 6.9995f, 12.6929f, 7.2817f, 12.7425f, 7.6477f)
                lineTo(12.7494f, 7.7495f)
                lineTo(12.7497f, 14.4392f)
                lineTo(15.4691f, 11.7199f)
                curveTo(15.7353f, 11.4536f, 16.152f, 11.4294f, 16.4456f, 11.6473f)
                lineTo(16.5297f, 11.7199f)
                close()
            }
        }
        .build()
        return _arrowCircleDown!!
    }

private var _arrowCircleDown: ImageVector? = null
