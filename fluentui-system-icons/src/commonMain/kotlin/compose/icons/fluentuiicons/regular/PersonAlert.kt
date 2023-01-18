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

public val RegularGroup.PersonAlert: ImageVector
    get() {
        if (_personAlert != null) {
            return _personAlert!!
        }
        _personAlert = Builder(name = "PersonAlert", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.7561f, 13.9992f)
                curveTo(18.9981f, 13.9992f, 20.005f, 15.0061f, 20.005f, 16.2481f)
                verticalLineTo(16.8235f)
                curveTo(20.005f, 17.7178f, 19.6854f, 18.5826f, 19.1039f, 19.262f)
                curveTo(17.5345f, 21.0955f, 15.1473f, 22.0004f, 12.002f, 22.0004f)
                curveTo(11.839f, 22.0004f, 11.6782f, 21.9979f, 11.5193f, 21.9931f)
                lineTo(11.5266f, 21.9927f)
                curveTo(11.6426f, 21.9866f, 11.8947f, 21.9723f, 12.139f, 21.8576f)
                curveTo(12.6932f, 21.5971f, 13.0142f, 21.0407f, 13.001f, 20.4648f)
                curveTo(15.2251f, 20.3008f, 16.8663f, 19.5695f, 17.9643f, 18.2866f)
                curveTo(18.3132f, 17.879f, 18.505f, 17.3601f, 18.505f, 16.8235f)
                verticalLineTo(16.2481f)
                curveTo(18.505f, 15.8345f, 18.1697f, 15.4992f, 17.7561f, 15.4992f)
                horizontalLineTo(11.4742f)
                curveTo(11.4216f, 14.9706f, 11.2867f, 14.4663f, 11.0826f, 13.9992f)
                horizontalLineTo(17.7561f)
                close()
                moveTo(12.002f, 2.0039f)
                curveTo(14.7634f, 2.0039f, 17.002f, 4.2425f, 17.002f, 7.0039f)
                curveTo(17.002f, 9.7653f, 14.7634f, 12.0039f, 12.002f, 12.0039f)
                curveTo(9.2405f, 12.0039f, 7.0019f, 9.7653f, 7.0019f, 7.0039f)
                curveTo(7.0019f, 4.2425f, 9.2405f, 2.0039f, 12.002f, 2.0039f)
                close()
                moveTo(12.002f, 3.5039f)
                curveTo(10.069f, 3.5039f, 8.502f, 5.0709f, 8.502f, 7.0039f)
                curveTo(8.502f, 8.9369f, 10.069f, 10.5039f, 12.002f, 10.5039f)
                curveTo(13.9349f, 10.5039f, 15.502f, 8.9369f, 15.502f, 7.0039f)
                curveTo(15.502f, 5.0709f, 13.9349f, 3.5039f, 12.002f, 3.5039f)
                close()
                moveTo(6.5025f, 12.0f)
                curveTo(4.2934f, 12.0f, 2.5025f, 13.7909f, 2.5025f, 16.0f)
                lineTo(2.5023f, 19.0f)
                lineTo(1.5539f, 19.8004f)
                curveTo(1.2462f, 20.06f, 1.0923f, 20.1899f, 1.0457f, 20.2913f)
                curveTo(0.9312f, 20.5407f, 1.0391f, 20.8358f, 1.2875f, 20.9525f)
                curveTo(1.3885f, 21.0f, 1.5898f, 21.0f, 1.9925f, 21.0f)
                horizontalLineTo(11.0121f)
                curveTo(11.4148f, 21.0f, 11.6162f, 21.0f, 11.7172f, 20.9525f)
                curveTo(11.9656f, 20.8358f, 12.0735f, 20.5407f, 11.9589f, 20.2913f)
                curveTo(11.9123f, 20.1899f, 11.7584f, 20.06f, 11.4507f, 19.8003f)
                lineTo(10.5025f, 19.0f)
                verticalLineTo(16.0f)
                curveTo(10.5025f, 13.7909f, 8.7116f, 12.0f, 6.5025f, 12.0f)
                close()
                moveTo(8.0025f, 22.0f)
                curveTo(7.7842f, 22.5826f, 7.195f, 23.0f, 6.5025f, 23.0f)
                curveTo(5.81f, 23.0f, 5.2208f, 22.5826f, 5.0025f, 22.0f)
                horizontalLineTo(8.0025f)
                close()
            }
        }
        .build()
        return _personAlert!!
    }

private var _personAlert: ImageVector? = null
