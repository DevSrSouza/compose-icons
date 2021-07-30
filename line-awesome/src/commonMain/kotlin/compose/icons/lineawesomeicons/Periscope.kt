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

public val LineAwesomeIcons.Periscope: ImageVector
    get() {
        if (_periscope != null) {
            return _periscope!!
        }
        _periscope = Builder(name = "Periscope", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.1406f, 3.0f)
                curveTo(9.9484f, 3.0f, 5.0f, 7.9372f, 5.0f, 13.9043f)
                curveTo(5.0f, 17.1971f, 7.1112f, 20.7848f, 9.4395f, 23.6973f)
                curveTo(10.6036f, 25.1535f, 11.8363f, 26.4256f, 12.9609f, 27.3613f)
                curveTo(13.5232f, 27.8292f, 14.0565f, 28.2148f, 14.5664f, 28.5f)
                curveTo(15.0763f, 28.7852f, 15.5471f, 29.0f, 16.1406f, 29.0f)
                curveTo(16.7429f, 29.0f, 17.1671f, 28.7703f, 17.6465f, 28.4844f)
                curveTo(18.1259f, 28.1984f, 18.6339f, 27.8163f, 19.1738f, 27.3496f)
                curveTo(20.2536f, 26.4162f, 21.4569f, 25.146f, 22.6016f, 23.6914f)
                curveTo(24.8908f, 20.7822f, 27.0f, 17.1971f, 27.0f, 13.9043f)
                curveTo(27.0f, 7.9372f, 22.0786f, 3.0f, 16.1406f, 3.0f)
                close()
                moveTo(16.1406f, 5.0f)
                curveTo(20.9667f, 5.0f, 25.0f, 9.0394f, 25.0f, 13.9043f)
                curveTo(25.0f, 16.2695f, 23.1731f, 19.7308f, 21.0293f, 22.4551f)
                curveTo(19.9574f, 23.8172f, 18.8202f, 25.0104f, 17.8652f, 25.8359f)
                curveTo(17.3877f, 26.2487f, 16.9543f, 26.57f, 16.623f, 26.7676f)
                curveTo(16.2918f, 26.9652f, 16.0348f, 27.0f, 16.1406f, 27.0f)
                curveTo(16.1672f, 27.0f, 15.8977f, 26.9523f, 15.543f, 26.7539f)
                curveTo(15.1882f, 26.5555f, 14.733f, 26.2358f, 14.2383f, 25.8242f)
                curveTo(13.2488f, 25.001f, 12.0896f, 23.8097f, 11.002f, 22.4492f)
                curveTo(8.8267f, 19.7282f, 7.0f, 16.2695f, 7.0f, 13.9043f)
                curveTo(7.0f, 9.0394f, 11.0049f, 5.0f, 16.1406f, 5.0f)
                close()
                moveTo(16.0f, 10.0f)
                curveTo(15.939f, 10.0f, 15.8823f, 10.0146f, 15.8223f, 10.0176f)
                curveTo(15.9303f, 10.3266f, 16.0f, 10.654f, 16.0f, 11.0f)
                curveTo(16.0f, 12.657f, 14.657f, 14.0f, 13.0f, 14.0f)
                curveTo(12.654f, 14.0f, 12.3266f, 13.9303f, 12.0176f, 13.8223f)
                curveTo(12.0146f, 13.8823f, 12.0f, 13.939f, 12.0f, 14.0f)
                curveTo(12.0f, 16.209f, 13.791f, 18.0f, 16.0f, 18.0f)
                curveTo(18.209f, 18.0f, 20.0f, 16.209f, 20.0f, 14.0f)
                curveTo(20.0f, 11.791f, 18.209f, 10.0f, 16.0f, 10.0f)
                close()
            }
        }
        .build()
        return _periscope!!
    }

private var _periscope: ImageVector? = null
