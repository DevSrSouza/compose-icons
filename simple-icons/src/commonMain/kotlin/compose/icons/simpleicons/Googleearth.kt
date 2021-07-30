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

public val SimpleIcons.Googleearth: ImageVector
    get() {
        if (_googleearth != null) {
            return _googleearth!!
        }
        _googleearth = Builder(name = "Googleearth", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveToRelative(-1.326f, 0.0f, -2.597f, 0.22f, -3.787f, 0.613f)
                curveToRelative(4.94f, -1.243f, 8.575f, 1.72f, 11.096f, 5.606f)
                curveToRelative(1.725f, 2.695f, 2.813f, 2.83f, 4.207f, 2.412f)
                arcTo(11.956f, 11.956f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(7.658f, 2.156f)
                curveToRelative(-1.644f, 0.019f, -3.295f, 0.775f, -4.931f, 2.207f)
                arcTo(11.967f, 11.967f, 0.0f, false, false, 0.0f, 12.0f)
                curveToRelative(0.184f, -2.823f, 2.163f, -5.128f, 4.87f, -5.07f)
                curveToRelative(2.104f, 0.044f, 4.648f, 1.518f, 7.13f, 5.289f)
                curveToRelative(4.87f, 7.468f, 10.917f, 5.483f, 11.863f, 1.51f)
                curveToRelative(0.081f, -0.566f, 0.137f, -1.14f, 0.137f, -1.729f)
                curveToRelative(0.0f, -0.176f, -0.02f, -0.347f, -0.027f, -0.521f)
                curveToRelative(-1.645f, 1.725f, -4.899f, 2.35f, -8.264f, -2.97f)
                curveToRelative(-2.59f, -4.363f, -5.31f, -6.383f, -8.05f, -6.353f)
                close()
                moveTo(3.33f, 13.236f)
                curveToRelative(-1.675f, 0.13f, -2.657f, 1.804f, -2.242f, 3.756f)
                arcTo(11.955f, 11.955f, 0.0f, false, false, 12.0f, 24.0f)
                curveToRelative(4.215f, 0.0f, 7.898f, -2.149f, 10.037f, -5.412f)
                verticalLineToRelative(-0.043f)
                curveToRelative(-2.836f, 3.49f, -8.946f, 4.255f, -13.855f, -2.182f)
                curveToRelative(-1.814f, -2.386f, -3.544f, -3.228f, -4.852f, -3.127f)
                close()
            }
        }
        .build()
        return _googleearth!!
    }

private var _googleearth: ImageVector? = null
