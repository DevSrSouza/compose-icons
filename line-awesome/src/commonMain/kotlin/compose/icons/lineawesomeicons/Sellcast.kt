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

public val LineAwesomeIcons.Sellcast: ImageVector
    get() {
        if (_sellcast != null) {
            return _sellcast!!
        }
        _sellcast = Builder(name = "Sellcast", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(20.0664f, 9.0605f)
                curveTo(19.6872f, 8.9925f, 19.2742f, 9.1244f, 19.0195f, 9.5605f)
                lineTo(18.791f, 9.9512f)
                curveTo(16.49f, 8.6582f, 13.536f, 9.4385f, 12.207f, 11.6895f)
                curveTo(10.882f, 13.9445f, 11.6786f, 16.8524f, 13.9746f, 18.1504f)
                curveTo(14.8606f, 18.6554f, 13.9695f, 18.1464f, 14.8555f, 18.6504f)
                curveTo(16.0465f, 19.3224f, 17.0568f, 17.5634f, 15.8848f, 16.9004f)
                curveTo(15.8798f, 16.9004f, 14.998f, 16.4043f, 14.998f, 16.4043f)
                curveTo(13.683f, 15.6573f, 13.2194f, 13.9863f, 13.9824f, 12.6973f)
                curveTo(14.7454f, 11.4083f, 16.4506f, 10.9611f, 17.7656f, 11.7031f)
                curveTo(18.6516f, 12.2081f, 17.7605f, 11.6991f, 18.6465f, 12.2031f)
                curveTo(19.1315f, 12.4411f, 19.5982f, 12.3392f, 19.9082f, 12.0352f)
                curveTo(20.0362f, 11.9092f, 20.0045f, 11.9415f, 20.8145f, 10.5645f)
                curveTo(21.2401f, 9.8407f, 20.6985f, 9.174f, 20.0664f, 9.0605f)
                close()
                moveTo(16.6875f, 13.2012f)
                curveTo(15.7123f, 13.0969f, 15.0682f, 14.5175f, 16.0938f, 15.0977f)
                curveTo(16.9508f, 15.5737f, 16.1305f, 15.1178f, 16.9785f, 15.5938f)
                curveTo(18.2935f, 16.3407f, 18.7511f, 18.0118f, 17.9941f, 19.3008f)
                curveTo(17.2311f, 20.5898f, 15.5259f, 21.0369f, 14.2109f, 20.2949f)
                curveTo(13.3249f, 19.7899f, 14.2161f, 20.2989f, 13.3301f, 19.7949f)
                curveTo(12.8401f, 19.5149f, 12.2068f, 19.6831f, 11.9258f, 20.1641f)
                lineTo(11.1777f, 21.4336f)
                curveTo(10.5777f, 22.4516f, 12.1004f, 23.9088f, 13.1914f, 22.0508f)
                curveTo(15.4924f, 23.3438f, 18.4464f, 22.5635f, 19.7754f, 20.3125f)
                curveTo(21.1044f, 18.0615f, 20.3099f, 15.1537f, 18.0039f, 13.8477f)
                curveTo(17.1179f, 13.3427f, 18.0071f, 13.8517f, 17.1211f, 13.3477f)
                curveTo(16.9722f, 13.2637f, 16.8268f, 13.2161f, 16.6875f, 13.2012f)
                close()
            }
        }
        .build()
        return _sellcast!!
    }

private var _sellcast: ImageVector? = null
