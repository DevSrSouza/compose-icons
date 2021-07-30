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

public val SimpleIcons.Peloton: ImageVector
    get() {
        if (_peloton != null) {
            return _peloton!!
        }
        _peloton = Builder(name = "Peloton", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.7283f, 5.7642f)
                lineToRelative(1.7307f, -3.0066f)
                curveToRelative(0.5045f, -0.8803f, 0.2077f, -2.0077f, -0.6725f, -2.5121f)
                curveToRelative(-0.8802f, -0.5044f, -2.0077f, -0.2077f, -2.5121f, 0.6725f)
                lineToRelative(-1.7407f, 3.0066f)
                curveToRelative(-3.699f, -1.167f, -7.843f, 0.3462f, -9.8606f, 3.8473f)
                curveToRelative(-1.2857f, 2.2253f, -1.444f, 4.7869f, -0.6626f, 7.032f)
                lineToRelative(3.2044f, -5.5583f)
                curveToRelative(0.732f, -1.2759f, 1.9286f, -2.1858f, 3.3528f, -2.5715f)
                curveToRelative(1.4242f, -0.3857f, 2.9078f, -0.188f, 4.1836f, 0.5539f)
                curveToRelative(2.6308f, 1.523f, 3.5407f, 4.9055f, 2.0176f, 7.5363f)
                curveToRelative(-1.523f, 2.6308f, -4.8957f, 3.5407f, -7.5364f, 2.0176f)
                lineToRelative(1.8396f, -3.1846f)
                curveToRelative(0.8803f, 0.5044f, 2.0077f, 0.2077f, 2.5122f, -0.6726f)
                curveToRelative(0.5044f, -0.8802f, 0.2076f, -2.0077f, -0.6726f, -2.512f)
                curveToRelative(-0.8802f, -0.5045f, -2.0077f, -0.2078f, -2.5121f, 0.6725f)
                lineToRelative(-5.855f, 10.1572f)
                curveToRelative(-0.5044f, 0.8803f, -0.2077f, 2.0077f, 0.6725f, 2.5121f)
                curveToRelative(0.8802f, 0.5044f, 2.0077f, 0.2077f, 2.5121f, -0.6725f)
                lineTo(9.47f, 20.0754f)
                curveToRelative(3.699f, 1.167f, 7.843f, -0.3462f, 9.8606f, -3.8473f)
                curveToRelative(2.0176f, -3.4913f, 1.256f, -7.833f, -1.6022f, -10.4639f)
                close()
            }
        }
        .build()
        return _peloton!!
    }

private var _peloton: ImageVector? = null
