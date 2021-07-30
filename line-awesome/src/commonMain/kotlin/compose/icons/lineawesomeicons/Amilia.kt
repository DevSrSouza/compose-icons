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

public val LineAwesomeIcons.Amilia: ImageVector
    get() {
        if (_amilia != null) {
            return _amilia!!
        }
        _amilia = Builder(name = "Amilia", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.4297f, 6.0f)
                curveTo(13.6667f, 6.0f, 10.6967f, 6.281f, 8.3438f, 8.0f)
                curveTo(8.1158f, 8.138f, 7.9375f, 8.4102f, 8.0215f, 8.8652f)
                curveTo(8.0705f, 9.0932f, 8.2496f, 10.0898f, 8.4766f, 10.6348f)
                curveTo(8.6596f, 11.0898f, 9.1108f, 11.0892f, 9.3828f, 10.9063f)
                curveTo(10.8348f, 9.9113f, 13.9035f, 9.0f, 16.3945f, 9.0f)
                curveTo(18.9795f, 9.0f, 19.0234f, 10.5187f, 19.0234f, 12.5137f)
                lineTo(19.0234f, 14.2324f)
                curveTo(15.1214f, 14.7364f, 8.7732f, 15.7762f, 7.3672f, 16.3652f)
                curveTo(5.7822f, 17.0932f, 6.0117f, 20.1986f, 6.0117f, 21.0156f)
                curveTo(6.0117f, 22.2816f, 6.6909f, 26.0f, 11.5879f, 26.0f)
                curveTo(13.7219f, 26.0f, 17.4381f, 25.0761f, 19.2051f, 24.1211f)
                lineTo(19.2051f, 25.5039f)
                curveTo(19.2051f, 25.6379f, 19.3005f, 25.8682f, 19.4785f, 25.9082f)
                curveTo(19.6165f, 25.9532f, 21.3917f, 25.998f, 21.8027f, 25.998f)
                curveTo(22.2137f, 25.998f, 24.5925f, 26.0108f, 24.7715f, 25.9668f)
                curveTo(24.9545f, 25.9218f, 25.0f, 25.6945f, 25.0f, 25.5605f)
                lineTo(25.0f, 12.0703f)
                curveTo(24.996f, 8.4863f, 22.4157f, 6.0f, 16.4297f, 6.0f)
                close()
                moveTo(19.0195f, 16.7715f)
                lineTo(19.0195f, 21.8691f)
                curveTo(18.0645f, 22.4581f, 16.2984f, 22.957f, 14.9414f, 22.957f)
                curveTo(12.5844f, 22.957f, 11.963f, 21.1289f, 11.959f, 20.6289f)
                curveTo(11.959f, 20.0839f, 11.8244f, 18.7236f, 12.7754f, 18.2676f)
                curveTo(13.8604f, 17.6786f, 17.0235f, 16.9545f, 19.0195f, 16.7715f)
                close()
            }
        }
        .build()
        return _amilia!!
    }

private var _amilia: ImageVector? = null
