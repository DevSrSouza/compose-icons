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

public val LineAwesomeIcons.Etsy: ImageVector
    get() {
        if (_etsy != null) {
            return _etsy!!
        }
        _etsy = Builder(name = "Etsy", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.9688f, 5.0f)
                curveTo(18.7108f, 5.604f, 9.7706f, 5.2996f, 6.1426f, 5.1836f)
                lineTo(6.1426f, 6.4355f)
                curveTo(8.5426f, 6.8895f, 9.0887f, 6.8051f, 9.1387f, 8.2031f)
                curveTo(9.3117f, 12.0261f, 9.2267f, 20.4656f, 9.1387f, 24.0176f)
                curveTo(9.1207f, 25.3546f, 8.3746f, 25.309f, 6.1426f, 25.748f)
                lineTo(6.1426f, 27.0f)
                curveTo(13.4406f, 26.767f, 18.4493f, 26.789f, 24.2383f, 27.0f)
                curveTo(24.3123f, 26.075f, 24.7536f, 22.379f, 24.9336f, 21.0f)
                lineTo(23.7012f, 21.0f)
                curveTo(22.3092f, 24.293f, 22.0406f, 25.416f, 19.0586f, 25.416f)
                lineTo(14.6758f, 25.416f)
                curveTo(13.2028f, 25.416f, 12.502f, 24.8131f, 12.502f, 23.5371f)
                lineTo(12.502f, 16.7129f)
                curveTo(15.768f, 16.7129f, 16.8223f, 16.8105f, 16.8223f, 16.8105f)
                curveTo(18.3173f, 16.8335f, 18.55f, 18.031f, 19.0f, 20.0f)
                lineTo(20.0f, 20.0f)
                curveTo(19.894f, 15.167f, 19.784f, 16.977f, 20.0f, 12.0f)
                lineTo(19.0f, 12.0f)
                curveTo(18.352f, 14.787f, 18.3097f, 15.1171f, 16.8477f, 15.1641f)
                curveTo(16.8477f, 15.1641f, 15.35f, 15.3111f, 12.502f, 15.2871f)
                lineTo(12.502f, 7.2461f)
                curveTo(12.502f, 6.9391f, 12.5263f, 6.7676f, 13.0293f, 6.7676f)
                lineTo(19.7578f, 6.7676f)
                curveTo(21.4658f, 6.7676f, 21.8785f, 8.954f, 22.3945f, 11.0f)
                lineTo(23.5996f, 11.0f)
                curveTo(23.6436f, 10.113f, 23.8197f, 6.632f, 23.9688f, 5.0f)
                close()
            }
        }
        .build()
        return _etsy!!
    }

private var _etsy: ImageVector? = null
