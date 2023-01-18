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

public val FilledGroup.FontIncrease: ImageVector
    get() {
        if (_fontIncrease != null) {
            return _fontIncrease!!
        }
        _fontIncrease = Builder(name = "FontIncrease", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.6247f, 5.7808f)
                curveTo(16.1934f, 6.1258f, 15.5641f, 6.0559f, 15.2191f, 5.6246f)
                curveTo(14.8741f, 5.1934f, 14.9441f, 4.5641f, 15.3753f, 4.2191f)
                lineTo(17.8753f, 2.2191f)
                curveTo(18.2405f, 1.927f, 18.7595f, 1.927f, 19.1247f, 2.2191f)
                lineTo(21.6247f, 4.2191f)
                curveTo(22.0559f, 4.5641f, 22.1258f, 5.1934f, 21.7808f, 5.6246f)
                curveTo(21.4358f, 6.0559f, 20.8065f, 6.1258f, 20.3753f, 5.7808f)
                lineTo(18.5f, 4.2806f)
                lineTo(16.6247f, 5.7808f)
                close()
                moveTo(12.9193f, 4.6063f)
                curveTo(12.7618f, 4.2386f, 12.4002f, 4.0002f, 12.0002f, 4.0002f)
                curveTo(11.6002f, 4.0002f, 11.2387f, 4.2386f, 11.0811f, 4.6063f)
                lineTo(5.0811f, 18.6058f)
                curveTo(4.8636f, 19.1135f, 5.0987f, 19.7013f, 5.6063f, 19.9189f)
                curveTo(6.1139f, 20.1364f, 6.7018f, 19.9013f, 6.9194f, 19.3937f)
                lineTo(8.8025f, 14.9998f)
                horizontalLineTo(15.1979f)
                lineTo(17.081f, 19.3937f)
                curveTo(17.2986f, 19.9013f, 17.8865f, 20.1364f, 18.3941f, 19.9189f)
                curveTo(18.9017f, 19.7013f, 19.1369f, 19.1135f, 18.9193f, 18.6058f)
                lineTo(12.9193f, 4.6063f)
                close()
                moveTo(12.0002f, 7.5387f)
                lineTo(14.3407f, 12.9999f)
                horizontalLineTo(9.6597f)
                lineTo(12.0002f, 7.5387f)
                close()
            }
        }
        .build()
        return _fontIncrease!!
    }

private var _fontIncrease: ImageVector? = null
