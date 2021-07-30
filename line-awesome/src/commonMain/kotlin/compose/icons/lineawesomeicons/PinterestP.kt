package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.PinterestP: ImageVector
    get() {
        if (_pinterestP != null) {
            return _pinterestP!!
        }
        _pinterestP = Builder(name = "PinterestP", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0938f, 4.0f)
                curveTo(11.0168f, 4.0f, 6.0f, 7.3833f, 6.0f, 12.8613f)
                curveTo(6.0f, 16.3443f, 7.9585f, 18.3242f, 9.1465f, 18.3242f)
                curveTo(9.6365f, 18.3242f, 9.9199f, 16.9583f, 9.9199f, 16.5723f)
                curveTo(9.9199f, 16.1123f, 8.7461f, 15.1318f, 8.7461f, 13.2168f)
                curveTo(8.7461f, 9.2388f, 11.7744f, 6.4199f, 15.6934f, 6.4199f)
                curveTo(19.0634f, 6.4199f, 21.5566f, 8.3336f, 21.5566f, 11.8516f)
                curveTo(21.5566f, 14.4786f, 20.5019f, 19.4063f, 17.0879f, 19.4063f)
                curveTo(15.8559f, 19.4063f, 14.8027f, 18.5162f, 14.8027f, 17.2402f)
                curveTo(14.8027f, 15.3702f, 16.0f, 13.5589f, 16.0f, 11.6289f)
                curveTo(16.0f, 8.3529f, 11.4629f, 8.9473f, 11.4629f, 12.9063f)
                curveTo(11.4629f, 13.7373f, 11.5665f, 14.6571f, 11.9375f, 15.4141f)
                curveTo(11.2555f, 18.3531f, 10.0f, 23.0374f, 10.0f, 26.0664f)
                curveTo(10.0f, 27.0014f, 10.1337f, 27.9214f, 10.2227f, 28.8574f)
                curveTo(10.3907f, 29.0454f, 10.3075f, 29.0256f, 10.5645f, 28.9316f)
                curveTo(13.0585f, 25.5176f, 12.8271f, 24.5442f, 13.9551f, 20.0762f)
                curveTo(14.5641f, 21.2342f, 16.1378f, 21.8574f, 17.3848f, 21.8574f)
                curveTo(22.6398f, 21.8574f, 25.0f, 16.7361f, 25.0f, 12.1191f)
                curveTo(25.0f, 7.2061f, 20.7547f, 4.0f, 16.0938f, 4.0f)
                close()
            }
        }
        .build()
        return _pinterestP!!
    }

private var _pinterestP: ImageVector? = null
