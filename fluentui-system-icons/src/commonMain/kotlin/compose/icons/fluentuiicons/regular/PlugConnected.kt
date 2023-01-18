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

public val RegularGroup.PlugConnected: ImageVector
    get() {
        if (_plugConnected != null) {
            return _plugConnected!!
        }
        _plugConnected = Builder(name = "PlugConnected", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.4898f, 5.5708f)
                curveTo(20.2796f, 6.5868f, 20.7499f, 7.8635f, 20.7499f, 9.25f)
                curveTo(20.7499f, 11.5333f, 19.4745f, 13.5187f, 17.5972f, 14.5327f)
                curveTo(16.9481f, 14.8833f, 16.1671f, 14.6672f, 15.6454f, 14.1455f)
                lineTo(9.8544f, 8.3545f)
                curveTo(9.3327f, 7.8328f, 9.1166f, 7.0518f, 9.4672f, 6.4026f)
                curveTo(10.4812f, 4.5254f, 12.4666f, 3.25f, 14.7499f, 3.25f)
                curveTo(16.1364f, 3.25f, 17.4132f, 3.7203f, 18.4292f, 4.5102f)
                lineTo(20.7197f, 2.2197f)
                curveTo(21.0126f, 1.9268f, 21.4874f, 1.9268f, 21.7803f, 2.2197f)
                curveTo(22.0732f, 2.5126f, 22.0732f, 2.9874f, 21.7803f, 3.2803f)
                lineTo(19.4898f, 5.5708f)
                close()
                moveTo(17.4732f, 12.8331f)
                curveTo(18.5534f, 12.0106f, 19.2499f, 10.7106f, 19.2499f, 9.25f)
                curveTo(19.2499f, 6.7647f, 17.2352f, 4.75f, 14.7499f, 4.75f)
                curveTo(13.2893f, 4.75f, 11.9893f, 5.4465f, 11.1668f, 6.5267f)
                curveTo(10.9008f, 6.8759f, 10.9812f, 7.36f, 11.2916f, 7.6704f)
                lineTo(16.3295f, 12.7083f)
                curveTo(16.6399f, 13.0187f, 17.124f, 13.0991f, 17.4732f, 12.8331f)
                close()
                moveTo(3.2803f, 21.7803f)
                lineTo(5.5707f, 19.4899f)
                curveTo(6.5867f, 20.2797f, 7.8634f, 20.75f, 9.2499f, 20.75f)
                curveTo(11.5332f, 20.75f, 13.5186f, 19.4746f, 14.5325f, 17.5973f)
                curveTo(14.8832f, 16.9482f, 14.6671f, 16.1672f, 14.1454f, 15.6455f)
                lineTo(8.3544f, 9.8545f)
                curveTo(7.8327f, 9.3328f, 7.0517f, 9.1167f, 6.4025f, 9.4673f)
                curveTo(4.5253f, 10.4813f, 3.2499f, 12.4667f, 3.2499f, 14.75f)
                curveTo(3.2499f, 16.1366f, 3.7202f, 17.4133f, 4.51f, 18.4293f)
                lineTo(2.2197f, 20.7197f)
                curveTo(1.9268f, 21.0126f, 1.9268f, 21.4874f, 2.2197f, 21.7803f)
                curveTo(2.5126f, 22.0732f, 2.9874f, 22.0732f, 3.2803f, 21.7803f)
                close()
                moveTo(7.6702f, 11.2917f)
                lineTo(12.7082f, 16.3296f)
                curveTo(13.0186f, 16.64f, 13.0989f, 17.1241f, 12.833f, 17.4733f)
                curveTo(12.0105f, 18.5535f, 10.7105f, 19.25f, 9.2499f, 19.25f)
                curveTo(6.7646f, 19.25f, 4.7499f, 17.2353f, 4.7499f, 14.75f)
                curveTo(4.7499f, 13.2894f, 5.4464f, 11.9894f, 6.5266f, 11.1669f)
                curveTo(6.8758f, 10.9009f, 7.3598f, 10.9813f, 7.6702f, 11.2917f)
                close()
            }
        }
        .build()
        return _plugConnected!!
    }

private var _plugConnected: ImageVector? = null
