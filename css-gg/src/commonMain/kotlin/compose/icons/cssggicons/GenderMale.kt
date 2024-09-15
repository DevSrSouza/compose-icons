package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.GenderMale: ImageVector
    get() {
        if (_genderMale != null) {
            return _genderMale!!
        }
        _genderMale = Builder(name = "GenderMale", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.189f, 7.0f)
                lineTo(12.191f, 5.0f)
                lineTo(19.191f, 5.007f)
                lineTo(19.183f, 12.007f)
                lineTo(17.183f, 12.005f)
                lineTo(17.187f, 8.417f)
                lineTo(14.143f, 11.461f)
                curveTo(15.461f, 13.406f, 15.259f, 16.074f, 13.535f, 17.798f)
                curveTo(11.583f, 19.75f, 8.417f, 19.75f, 6.464f, 17.798f)
                curveTo(4.512f, 15.845f, 4.512f, 12.679f, 6.464f, 10.726f)
                curveTo(8.162f, 9.029f, 10.777f, 8.807f, 12.714f, 10.061f)
                lineTo(15.772f, 7.004f)
                lineTo(12.189f, 7.0f)
                close()
                moveTo(7.879f, 12.141f)
                curveTo(9.05f, 10.969f, 10.95f, 10.969f, 12.121f, 12.141f)
                curveTo(13.293f, 13.312f, 13.293f, 15.212f, 12.121f, 16.383f)
                curveTo(10.95f, 17.555f, 9.05f, 17.555f, 7.879f, 16.383f)
                curveTo(6.707f, 15.212f, 6.707f, 13.312f, 7.879f, 12.141f)
                close()
            }
        }
        .build()
        return _genderMale!!
    }

private var _genderMale: ImageVector? = null
