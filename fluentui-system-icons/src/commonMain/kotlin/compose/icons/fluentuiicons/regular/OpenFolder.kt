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

public val RegularGroup.OpenFolder: ImageVector
    get() {
        if (_openFolder != null) {
            return _openFolder!!
        }
        _openFolder = Builder(name = "OpenFolder", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.7472f, 3.0f)
                lineTo(17.2535f, 3.0017f)
                curveTo(19.2574f, 3.0026f, 20.8939f, 4.5747f, 20.9979f, 6.553f)
                lineTo(21.0032f, 6.7522f)
                verticalLineTo(11.2447f)
                curveTo(21.0032f, 11.6589f, 20.6674f, 11.9947f, 20.2532f, 11.9947f)
                curveTo(19.8735f, 11.9947f, 19.5597f, 11.7126f, 19.51f, 11.3465f)
                lineTo(19.5032f, 11.2447f)
                verticalLineTo(6.7524f)
                curveTo(19.5029f, 5.5615f, 18.5777f, 4.5866f, 17.4071f, 4.5069f)
                lineTo(17.2531f, 4.5017f)
                lineTo(6.7465f, 4.5f)
                curveTo(5.5688f, 4.4991f, 4.6022f, 5.404f, 4.5047f, 6.5569f)
                lineTo(4.4969f, 6.7156f)
                lineTo(4.4995f, 17.2517f)
                curveTo(4.5001f, 18.4426f, 5.4253f, 19.4173f, 6.596f, 19.4969f)
                lineTo(6.75f, 19.5021f)
                horizontalLineTo(11.2463f)
                curveTo(11.6605f, 19.5021f, 11.9963f, 19.8379f, 11.9963f, 20.2521f)
                curveTo(11.9963f, 20.6318f, 11.7142f, 20.9456f, 11.3481f, 20.9952f)
                lineTo(11.2463f, 21.0021f)
                horizontalLineTo(6.7498f)
                curveTo(4.7459f, 21.0015f, 3.1092f, 19.4296f, 3.0048f, 17.4514f)
                lineTo(2.9995f, 17.2522f)
                lineTo(2.9976f, 6.7526f)
                lineTo(3.0018f, 6.5492f)
                curveTo(3.1023f, 4.6365f, 4.6358f, 3.1037f, 6.5481f, 3.005f)
                lineTo(6.7472f, 3.0f)
                close()
                moveTo(9.7505f, 8.9996f)
                horizontalLineTo(16.2544f)
                curveTo(16.6686f, 8.9996f, 17.0044f, 9.3354f, 17.0044f, 9.7496f)
                curveTo(17.0044f, 10.1293f, 16.7222f, 10.4431f, 16.3562f, 10.4927f)
                lineTo(16.2544f, 10.4996f)
                lineTo(11.5596f, 10.499f)
                lineTo(18.7837f, 17.7196f)
                curveTo(19.05f, 17.9858f, 19.0743f, 18.4024f, 18.8566f, 18.6961f)
                lineTo(18.784f, 18.7802f)
                curveTo(18.5178f, 19.0466f, 18.1011f, 19.0709f, 17.8074f, 18.8531f)
                lineTo(17.7233f, 18.7805f)
                lineTo(10.4996f, 11.56f)
                lineTo(10.5005f, 16.2511f)
                curveTo(10.5005f, 16.6308f, 10.2183f, 16.9446f, 9.8523f, 16.9943f)
                lineTo(9.7505f, 17.0011f)
                curveTo(9.3708f, 17.0011f, 9.057f, 16.7189f, 9.0073f, 16.3529f)
                lineTo(9.0005f, 16.2511f)
                lineTo(9.0006f, 9.7344f)
                curveTo(8.9999f, 9.7089f, 9.0017f, 9.6835f, 9.0047f, 9.6583f)
                lineTo(9.0263f, 9.5499f)
                lineTo(9.061f, 9.4536f)
                lineTo(9.0662f, 9.4421f)
                curveTo(9.1014f, 9.361f, 9.1526f, 9.2855f, 9.2188f, 9.2194f)
                lineTo(9.2628f, 9.1786f)
                lineTo(9.3443f, 9.1181f)
                lineTo(9.4036f, 9.0838f)
                lineTo(9.499f, 9.0424f)
                lineTo(9.5658f, 9.0225f)
                lineTo(9.6277f, 9.0094f)
                lineTo(9.7208f, 9.0001f)
                lineTo(16.2544f, 8.9996f)
                horizontalLineTo(9.7505f)
                close()
            }
        }
        .build()
        return _openFolder!!
    }

private var _openFolder: ImageVector? = null
