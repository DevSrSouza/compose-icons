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

public val FilledGroup.DataFunnel: ImageVector
    get() {
        if (_dataFunnel != null) {
            return _dataFunnel!!
        }
        _dataFunnel = Builder(name = "DataFunnel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.2481f, 7.5037f)
                curveTo(20.768f, 7.5037f, 22.0f, 6.2717f, 22.0f, 4.7519f)
                curveTo(22.0f, 3.232f, 20.768f, 2.0f, 19.2481f, 2.0f)
                horizontalLineTo(4.7496f)
                curveTo(3.2298f, 2.0f, 1.9977f, 3.232f, 1.9977f, 4.7519f)
                curveTo(1.9977f, 6.2717f, 3.2298f, 7.5037f, 4.7496f, 7.5037f)
                horizontalLineTo(19.2481f)
                close()
                moveTo(17.2481f, 14.5037f)
                curveTo(18.768f, 14.5037f, 20.0f, 13.2717f, 20.0f, 11.7519f)
                curveTo(20.0f, 10.2321f, 18.768f, 9.0f, 17.2481f, 9.0f)
                horizontalLineTo(6.7496f)
                curveTo(5.2298f, 9.0f, 3.9977f, 10.2321f, 3.9977f, 11.7519f)
                curveTo(3.9977f, 13.2717f, 5.2298f, 14.5037f, 6.7496f, 14.5037f)
                horizontalLineTo(17.2481f)
                close()
                moveTo(17.0f, 18.7519f)
                curveTo(17.0f, 17.2321f, 15.768f, 16.0f, 14.2481f, 16.0f)
                horizontalLineTo(9.7496f)
                curveTo(8.2298f, 16.0f, 6.9977f, 17.2321f, 6.9977f, 18.7519f)
                curveTo(6.9977f, 20.2717f, 8.2298f, 21.5037f, 9.7496f, 21.5037f)
                horizontalLineTo(14.2481f)
                curveTo(15.768f, 21.5037f, 17.0f, 20.2717f, 17.0f, 18.7519f)
                close()
            }
        }
        .build()
        return _dataFunnel!!
    }

private var _dataFunnel: ImageVector? = null
