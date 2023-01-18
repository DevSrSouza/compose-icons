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

public val RegularGroup.DataFunnel: ImageVector
    get() {
        if (_dataFunnel != null) {
            return _dataFunnel!!
        }
        _dataFunnel = Builder(name = "DataFunnel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.002f, 4.7519f)
                curveTo(22.002f, 6.2717f, 20.77f, 7.5037f, 19.2501f, 7.5037f)
                lineTo(4.7516f, 7.5037f)
                curveTo(3.2318f, 7.5037f, 1.9997f, 6.2717f, 1.9997f, 4.7519f)
                curveTo(1.9997f, 3.232f, 3.2318f, 2.0f, 4.7516f, 2.0f)
                lineTo(19.2501f, 2.0f)
                curveTo(20.77f, 2.0f, 22.002f, 3.232f, 22.002f, 4.7519f)
                close()
                moveTo(20.002f, 11.7519f)
                curveTo(20.002f, 13.2717f, 18.77f, 14.5037f, 17.2501f, 14.5037f)
                lineTo(6.7516f, 14.5037f)
                curveTo(5.2318f, 14.5037f, 3.9997f, 13.2717f, 3.9997f, 11.7519f)
                curveTo(3.9997f, 10.2321f, 5.2318f, 9.0f, 6.7516f, 9.0f)
                horizontalLineTo(17.2501f)
                curveTo(18.77f, 9.0f, 20.002f, 10.2321f, 20.002f, 11.7519f)
                close()
                moveTo(17.002f, 18.7519f)
                curveTo(17.002f, 20.2717f, 15.77f, 21.5037f, 14.2501f, 21.5037f)
                horizontalLineTo(9.7516f)
                curveTo(8.2318f, 21.5037f, 6.9997f, 20.2717f, 6.9997f, 18.7519f)
                curveTo(6.9997f, 17.2321f, 8.2318f, 16.0f, 9.7516f, 16.0f)
                horizontalLineTo(14.2501f)
                curveTo(15.77f, 16.0f, 17.002f, 17.2321f, 17.002f, 18.7519f)
                close()
                moveTo(20.502f, 4.7519f)
                curveTo(20.502f, 4.0605f, 19.9415f, 3.5f, 19.2501f, 3.5f)
                lineTo(4.7516f, 3.5f)
                curveTo(4.0602f, 3.5f, 3.4997f, 4.0605f, 3.4997f, 4.7519f)
                curveTo(3.4997f, 5.4433f, 4.0602f, 6.0037f, 4.7516f, 6.0037f)
                lineTo(19.2501f, 6.0037f)
                curveTo(19.9415f, 6.0037f, 20.502f, 5.4433f, 20.502f, 4.7519f)
                close()
                moveTo(18.502f, 11.7519f)
                curveTo(18.502f, 11.0605f, 17.9415f, 10.5f, 17.2501f, 10.5f)
                lineTo(6.7516f, 10.5f)
                curveTo(6.0602f, 10.5f, 5.4997f, 11.0605f, 5.4997f, 11.7519f)
                curveTo(5.4997f, 12.4433f, 6.0602f, 13.0037f, 6.7516f, 13.0037f)
                lineTo(17.2501f, 13.0037f)
                curveTo(17.9415f, 13.0037f, 18.502f, 12.4433f, 18.502f, 11.7519f)
                close()
                moveTo(15.502f, 18.7519f)
                curveTo(15.502f, 18.0605f, 14.9415f, 17.5f, 14.2501f, 17.5f)
                horizontalLineTo(9.7516f)
                curveTo(9.0602f, 17.5f, 8.4997f, 18.0605f, 8.4997f, 18.7519f)
                curveTo(8.4997f, 19.4433f, 9.0602f, 20.0037f, 9.7516f, 20.0037f)
                horizontalLineTo(14.2501f)
                curveTo(14.9415f, 20.0037f, 15.502f, 19.4433f, 15.502f, 18.7519f)
                close()
            }
        }
        .build()
        return _dataFunnel!!
    }

private var _dataFunnel: ImageVector? = null
