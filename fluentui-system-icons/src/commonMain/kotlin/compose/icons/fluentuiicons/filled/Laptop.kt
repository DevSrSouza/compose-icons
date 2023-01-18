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

public val FilledGroup.Laptop: ImageVector
    get() {
        if (_laptop != null) {
            return _laptop!!
        }
        _laptop = Builder(name = "Laptop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.7506f, 16.4995f)
                horizontalLineTo(21.2494f)
                curveTo(21.6636f, 16.4995f, 21.9994f, 16.8353f, 21.9994f, 17.2495f)
                curveTo(21.9994f, 17.6292f, 21.7172f, 17.943f, 21.3511f, 17.9927f)
                lineTo(21.2494f, 17.9995f)
                horizontalLineTo(2.7506f)
                curveTo(2.3364f, 17.9995f, 2.0006f, 17.6637f, 2.0006f, 17.2495f)
                curveTo(2.0006f, 16.8698f, 2.2828f, 16.556f, 2.6488f, 16.5063f)
                lineTo(2.7506f, 16.4995f)
                horizontalLineTo(21.2494f)
                horizontalLineTo(2.7506f)
                close()
                moveTo(18.25f, 5.0f)
                curveTo(19.2165f, 5.0f, 20.0f, 5.7835f, 20.0f, 6.75f)
                verticalLineTo(14.2503f)
                curveTo(20.0f, 15.2168f, 19.2165f, 16.0003f, 18.25f, 16.0003f)
                horizontalLineTo(5.75f)
                curveTo(4.7835f, 16.0003f, 4.0f, 15.2168f, 4.0f, 14.2503f)
                verticalLineTo(6.75f)
                curveTo(4.0f, 5.7835f, 4.7835f, 5.0f, 5.75f, 5.0f)
                horizontalLineTo(18.25f)
                close()
            }
        }
        .build()
        return _laptop!!
    }

private var _laptop: ImageVector? = null
