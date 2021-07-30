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

public val LineAwesomeIcons.Deskpro: ImageVector
    get() {
        if (_deskpro != null) {
            return _deskpro!!
        }
        _deskpro = Builder(name = "Deskpro", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.6992f, 5.0f)
                curveTo(6.4512f, 5.01f, 6.0059f, 5.0392f, 6.0059f, 5.7832f)
                lineTo(6.0059f, 15.7031f)
                curveTo(5.8269f, 19.7601f, 9.7946f, 21.0f, 10.9746f, 21.0f)
                lineTo(15.2109f, 21.0f)
                curveTo(14.3879f, 20.206f, 14.0729f, 19.2457f, 14.0039f, 18.5117f)
                curveTo(13.9439f, 17.8867f, 14.8865f, 17.8088f, 14.9355f, 18.4238f)
                curveTo(14.9455f, 18.5328f, 15.1909f, 21.0f, 17.6309f, 21.0f)
                lineTo(17.9297f, 21.0f)
                lineTo(19.4473f, 18.4219f)
                lineTo(19.6934f, 18.0f)
                lineTo(23.0f, 18.0f)
                lineTo(23.0f, 10.5957f)
                curveTo(23.0f, 8.7007f, 22.1662f, 4.9898f, 17.1172f, 5.0098f)
                lineTo(13.0684f, 5.0098f)
                curveTo(13.5444f, 5.5158f, 13.9336f, 6.157f, 13.9336f, 7.0f)
                curveTo(13.9326f, 7.625f, 13.0f, 7.625f, 13.0f, 7.0f)
                curveTo(13.0f, 4.877f, 10.7371f, 4.9898f, 10.5391f, 5.0098f)
                curveTo(10.5291f, 5.0098f, 10.5198f, 5.0f, 10.5098f, 5.0f)
                lineTo(6.6992f, 5.0f)
                close()
                moveTo(18.5137f, 12.0039f)
                curveTo(19.4409f, 12.0637f, 20.2838f, 13.0121f, 19.9082f, 14.3027f)
                lineTo(17.0f, 12.9746f)
                curveTo(17.3709f, 12.2512f, 17.9573f, 11.968f, 18.5137f, 12.0039f)
                close()
                moveTo(20.4453f, 19.0f)
                lineTo(19.3535f, 21.0f)
                lineTo(24.0f, 21.0f)
                curveTo(25.794f, 21.0f, 28.0f, 20.0f, 29.0f, 19.0f)
                lineTo(20.4453f, 19.0f)
                close()
                moveTo(19.0f, 22.0f)
                curveTo(20.0f, 23.0f, 20.5928f, 23.5519f, 20.5938f, 23.7969f)
                curveTo(20.6038f, 23.8889f, 20.6226f, 25.7956f, 18.7656f, 26.6836f)
                curveTo(18.2446f, 26.9286f, 18.0722f, 26.99f, 17.4902f, 27.0f)
                lineTo(16.0f, 29.0f)
                curveTo(17.0f, 29.0f, 17.541f, 29.0002f, 17.959f, 28.9492f)
                curveTo(20.408f, 28.6322f, 22.0608f, 26.7541f, 22.5098f, 25.6211f)
                curveTo(22.6428f, 25.2851f, 22.99f, 24.398f, 23.0f, 22.0f)
                lineTo(19.0f, 22.0f)
                close()
            }
        }
        .build()
        return _deskpro!!
    }

private var _deskpro: ImageVector? = null
