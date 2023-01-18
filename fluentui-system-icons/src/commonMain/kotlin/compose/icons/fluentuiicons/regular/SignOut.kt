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

public val RegularGroup.SignOut: ImageVector
    get() {
        if (_signOut != null) {
            return _signOut!!
        }
        _signOut = Builder(name = "SignOut", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5021f, 11.4995f)
                curveTo(9.0556f, 11.4995f, 9.5043f, 11.9482f, 9.5043f, 12.5017f)
                curveTo(9.5043f, 13.0552f, 9.0556f, 13.5038f, 8.5021f, 13.5038f)
                curveTo(7.9487f, 13.5038f, 7.5f, 13.0552f, 7.5f, 12.5017f)
                curveTo(7.5f, 11.9482f, 7.9487f, 11.4995f, 8.5021f, 11.4995f)
                close()
                moveTo(12.0f, 4.3537f)
                verticalLineTo(10.4995f)
                lineTo(12.0005f, 11.0045f)
                lineTo(19.442f, 11.0035f)
                lineTo(17.7196f, 9.2798f)
                curveTo(17.4534f, 9.0135f, 17.4292f, 8.5968f, 17.6471f, 8.3032f)
                lineTo(17.7198f, 8.2191f)
                curveTo(17.9861f, 7.9529f, 18.4027f, 7.9288f, 18.6963f, 8.1467f)
                lineTo(18.7804f, 8.2193f)
                lineTo(21.777f, 11.2169f)
                curveTo(22.043f, 11.483f, 22.0674f, 11.8992f, 21.85f, 12.1928f)
                lineTo(21.7775f, 12.2769f)
                lineTo(18.7809f, 15.2803f)
                curveTo(18.4884f, 15.5736f, 18.0135f, 15.5741f, 17.7203f, 15.2816f)
                curveTo(17.4537f, 15.0156f, 17.429f, 14.599f, 17.6465f, 14.3051f)
                lineTo(17.7191f, 14.2209f)
                lineTo(19.432f, 12.5035f)
                lineTo(12.0005f, 12.5045f)
                lineTo(12.0f, 19.2495f)
                curveTo(12.0f, 19.7159f, 11.5788f, 20.0692f, 11.1196f, 19.9881f)
                lineTo(2.6195f, 18.4868f)
                curveTo(2.2612f, 18.4235f, 2.0f, 18.1121f, 2.0f, 17.7482f)
                verticalLineTo(5.7495f)
                curveTo(2.0f, 5.3822f, 2.266f, 5.069f, 2.6285f, 5.0094f)
                lineTo(11.1285f, 3.6136f)
                curveTo(11.5851f, 3.5386f, 12.0f, 3.891f, 12.0f, 4.3537f)
                close()
                moveTo(10.5f, 5.2369f)
                lineTo(3.5f, 6.3864f)
                verticalLineTo(17.1191f)
                lineTo(10.5f, 18.3555f)
                verticalLineTo(5.2369f)
                close()
                moveTo(13.0f, 18.5008f)
                lineTo(13.7652f, 18.501f)
                lineTo(13.867f, 18.4941f)
                curveTo(14.2335f, 18.4443f, 14.5158f, 18.1299f, 14.5152f, 17.7497f)
                lineTo(14.508f, 13.4995f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.5008f)
                close()
                moveTo(13.002f, 9.9995f)
                lineTo(13.0f, 8.7249f)
                verticalLineTo(4.9995f)
                lineTo(13.7453f, 4.9995f)
                curveTo(14.1245f, 4.9995f, 14.4381f, 5.2811f, 14.4883f, 5.6466f)
                lineTo(14.4953f, 5.7483f)
                lineTo(14.502f, 9.9995f)
                horizontalLineTo(13.002f)
                close()
            }
        }
        .build()
        return _signOut!!
    }

private var _signOut: ImageVector? = null
