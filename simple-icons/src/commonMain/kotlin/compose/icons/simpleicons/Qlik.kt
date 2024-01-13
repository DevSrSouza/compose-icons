package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Qlik: ImageVector
    get() {
        if (_qlik != null) {
            return _qlik!!
        }
        _qlik = Builder(name = "Qlik", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.7515f, 20.1367f)
                lineToRelative(-3.13f, -2.6326f)
                curveToRelative(1.0862f, -1.7307f, 1.7303f, -3.7745f, 1.7303f, -5.9655f)
                curveToRelative(0.0f, -6.1684f, -5.008f, -11.1764f, -11.176f, -11.1764f)
                reflectiveCurveTo(0.0f, 5.3702f, 0.0f, 11.5386f)
                curveToRelative(0.0f, 6.168f, 5.008f, 11.176f, 11.1759f, 11.176f)
                curveToRelative(2.3934f, 0.0f, 4.6216f, -0.7552f, 6.4443f, -2.0438f)
                lineToRelative(3.3324f, 2.7988f)
                reflectiveCurveToRelative(0.4974f, 0.4236f, 0.921f, -0.0738f)
                lineToRelative(1.9884f, -2.3568f)
                curveToRelative(-0.0186f, 0.0f, 0.3864f, -0.4968f, -0.1105f, -0.9023f)
                close()
                moveTo(18.0437f, 11.5387f)
                curveToRelative(0.0f, 3.7926f, -3.0747f, 6.8672f, -6.8678f, 6.8672f)
                curveToRelative(-3.7926f, 0.0f, -6.8678f, -3.0746f, -6.8678f, -6.8673f)
                curveToRelative(0.0f, -3.793f, 3.0752f, -6.8678f, 6.8678f, -6.8678f)
                curveToRelative(3.7931f, 0.0f, 6.8678f, 3.0747f, 6.8678f, 6.8678f)
                close()
                moveTo(6.7567f, 11.5387f)
                curveToRelative(0.0f, -2.4304f, 1.9702f, -4.4006f, 4.4006f, -4.4006f)
                curveToRelative(2.4303f, 0.0f, 4.4005f, 1.9702f, 4.4005f, 4.4005f)
                curveToRelative(0.0f, 2.4304f, -1.9702f, 4.4006f, -4.4005f, 4.4006f)
                curveToRelative(-2.4304f, 0.0f, -4.4005f, -1.9702f, -4.4005f, -4.4006f)
                close()
            }
        }
        .build()
        return _qlik!!
    }

private var _qlik: ImageVector? = null
