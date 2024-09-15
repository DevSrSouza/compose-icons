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

public val LineAwesomeIcons.PinterestP: ImageVector
    get() {
        if (_pinterestP != null) {
            return _pinterestP!!
        }
        _pinterestP = Builder(name = "PinterestP", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.094f, 4.0f)
                curveTo(11.017f, 4.0f, 6.0f, 7.383f, 6.0f, 12.861f)
                curveTo(6.0f, 16.344f, 7.958f, 18.324f, 9.146f, 18.324f)
                curveTo(9.636f, 18.324f, 9.92f, 16.958f, 9.92f, 16.572f)
                curveTo(9.92f, 16.112f, 8.746f, 15.132f, 8.746f, 13.217f)
                curveTo(8.746f, 9.239f, 11.774f, 6.42f, 15.693f, 6.42f)
                curveTo(19.063f, 6.42f, 21.557f, 8.334f, 21.557f, 11.852f)
                curveTo(21.557f, 14.479f, 20.502f, 19.406f, 17.088f, 19.406f)
                curveTo(15.856f, 19.406f, 14.803f, 18.516f, 14.803f, 17.24f)
                curveTo(14.803f, 15.37f, 16.0f, 13.559f, 16.0f, 11.629f)
                curveTo(16.0f, 8.353f, 11.463f, 8.947f, 11.463f, 12.906f)
                curveTo(11.463f, 13.737f, 11.566f, 14.657f, 11.938f, 15.414f)
                curveTo(11.255f, 18.353f, 10.0f, 23.037f, 10.0f, 26.066f)
                curveTo(10.0f, 27.001f, 10.134f, 27.921f, 10.223f, 28.857f)
                curveTo(10.391f, 29.045f, 10.307f, 29.026f, 10.564f, 28.932f)
                curveTo(13.058f, 25.518f, 12.827f, 24.544f, 13.955f, 20.076f)
                curveTo(14.564f, 21.234f, 16.138f, 21.857f, 17.385f, 21.857f)
                curveTo(22.64f, 21.857f, 25.0f, 16.736f, 25.0f, 12.119f)
                curveTo(25.0f, 7.206f, 20.755f, 4.0f, 16.094f, 4.0f)
                close()
            }
        }
        .build()
        return _pinterestP!!
    }

private var _pinterestP: ImageVector? = null
