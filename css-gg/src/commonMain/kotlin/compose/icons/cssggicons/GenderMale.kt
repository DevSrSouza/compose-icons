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
                moveTo(12.1888f, 7.0f)
                lineTo(12.1909f, 5.0f)
                lineTo(19.1909f, 5.0075f)
                lineTo(19.1834f, 12.0075f)
                lineTo(17.1834f, 12.0053f)
                lineTo(17.1873f, 8.4168f)
                lineTo(14.143f, 11.4611f)
                curveTo(15.4612f, 13.4063f, 15.2587f, 16.0743f, 13.5355f, 17.7975f)
                curveTo(11.5829f, 19.7501f, 8.4171f, 19.7501f, 6.4645f, 17.7975f)
                curveTo(4.5118f, 15.8449f, 4.5118f, 12.6791f, 6.4645f, 10.7264f)
                curveTo(8.1622f, 9.0287f, 10.777f, 8.8071f, 12.7141f, 10.0615f)
                lineTo(15.7718f, 7.0038f)
                lineTo(12.1888f, 7.0f)
                close()
                moveTo(7.8787f, 12.1406f)
                curveTo(9.0503f, 10.9691f, 10.9497f, 10.9691f, 12.1213f, 12.1406f)
                curveTo(13.2929f, 13.3122f, 13.2929f, 15.2117f, 12.1213f, 16.3833f)
                curveTo(10.9497f, 17.5549f, 9.0503f, 17.5549f, 7.8787f, 16.3833f)
                curveTo(6.7071f, 15.2117f, 6.7071f, 13.3122f, 7.8787f, 12.1406f)
                close()
            }
        }
        .build()
        return _genderMale!!
    }

private var _genderMale: ImageVector? = null
