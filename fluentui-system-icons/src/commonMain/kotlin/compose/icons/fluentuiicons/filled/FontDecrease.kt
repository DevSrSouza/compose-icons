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

public val FilledGroup.FontDecrease: ImageVector
    get() {
        if (_fontDecrease != null) {
            return _fontDecrease!!
        }
        _fontDecrease = Builder(name = "FontDecrease", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.6248f, 2.2192f)
                curveTo(16.1936f, 1.8742f, 15.5643f, 1.9441f, 15.2193f, 2.3753f)
                curveTo(14.8743f, 2.8066f, 14.9442f, 3.4359f, 15.3755f, 3.7809f)
                lineTo(17.8754f, 5.7808f)
                curveTo(18.2406f, 6.073f, 18.7595f, 6.073f, 19.1248f, 5.7808f)
                lineTo(21.6247f, 3.7809f)
                curveTo(22.0559f, 3.4359f, 22.1258f, 2.8066f, 21.7808f, 2.3753f)
                curveTo(21.4358f, 1.9441f, 20.8066f, 1.8742f, 20.3753f, 2.2192f)
                lineTo(18.5001f, 3.7194f)
                lineTo(16.6248f, 2.2192f)
                close()
                moveTo(12.0f, 4.0f)
                curveTo(12.4f, 4.0f, 12.7616f, 4.2384f, 12.9191f, 4.6061f)
                lineTo(18.9189f, 18.6058f)
                curveTo(19.1365f, 19.1135f, 18.9013f, 19.7013f, 18.3937f, 19.9189f)
                curveTo(17.8861f, 20.1364f, 17.2983f, 19.9013f, 17.0807f, 19.3937f)
                lineTo(15.1977f, 14.9998f)
                horizontalLineTo(8.8024f)
                lineTo(6.9193f, 19.3937f)
                curveTo(6.7018f, 19.9013f, 6.1139f, 20.1364f, 5.6063f, 19.9189f)
                curveTo(5.0987f, 19.7013f, 4.8636f, 19.1135f, 5.0811f, 18.6058f)
                lineTo(11.0809f, 4.6061f)
                curveTo(11.2385f, 4.2384f, 11.6f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(12.0f, 7.5385f)
                lineTo(9.6595f, 12.9999f)
                horizontalLineTo(14.3406f)
                lineTo(12.0f, 7.5385f)
                close()
            }
        }
        .build()
        return _fontDecrease!!
    }

private var _fontDecrease: ImageVector? = null
