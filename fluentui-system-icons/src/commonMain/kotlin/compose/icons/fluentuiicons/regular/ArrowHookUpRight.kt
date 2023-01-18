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

public val RegularGroup.ArrowHookUpRight: ImageVector
    get() {
        if (_arrowHookUpRight != null) {
            return _arrowHookUpRight!!
        }
        _arrowHookUpRight = Builder(name = "ArrowHookUpRight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 18.5f)
                horizontalLineTo(16.25f)
                curveTo(16.6642f, 18.5f, 17.0f, 18.8358f, 17.0f, 19.25f)
                curveTo(17.0f, 19.6642f, 16.6642f, 20.0f, 16.25f, 20.0f)
                horizontalLineTo(10.5f)
                curveTo(6.9102f, 20.0f, 4.0f, 17.0899f, 4.0f, 13.5f)
                curveTo(4.0f, 9.9101f, 6.9102f, 7.0f, 10.5f, 7.0f)
                horizontalLineTo(16.4503f)
                lineTo(13.8336f, 4.3832f)
                curveTo(13.5407f, 4.0903f, 13.5407f, 3.6155f, 13.8336f, 3.3226f)
                curveTo(14.1264f, 3.0297f, 14.6013f, 3.0297f, 14.8942f, 3.3226f)
                lineTo(18.7765f, 7.2049f)
                curveTo(18.8762f, 7.3045f, 18.9419f, 7.4252f, 18.9738f, 7.5527f)
                curveTo(18.9909f, 7.6155f, 19.0f, 7.6817f, 19.0f, 7.75f)
                curveTo(19.0f, 7.9629f, 18.9113f, 8.1551f, 18.7688f, 8.2916f)
                lineTo(14.8887f, 12.1717f)
                curveTo(14.5958f, 12.4646f, 14.121f, 12.4646f, 13.8281f, 12.1717f)
                curveTo(13.5352f, 11.8788f, 13.5352f, 11.4039f, 13.8281f, 11.111f)
                lineTo(16.4391f, 8.5f)
                horizontalLineTo(10.5f)
                curveTo(7.7386f, 8.5f, 5.5f, 10.7386f, 5.5f, 13.5f)
                curveTo(5.5f, 16.2614f, 7.7386f, 18.5f, 10.5f, 18.5f)
                close()
            }
        }
        .build()
        return _arrowHookUpRight!!
    }

private var _arrowHookUpRight: ImageVector? = null
