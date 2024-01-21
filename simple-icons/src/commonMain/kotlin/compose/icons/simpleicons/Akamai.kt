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

public val SimpleIcons.Akamai: ImageVector
    get() {
        if (_akamai != null) {
            return _akamai!!
        }
        _akamai = Builder(name = "Akamai", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0548f, 0.0f)
                curveTo(6.384f, 0.0f, 0.961f, 5.3802f, 0.961f, 12.0078f)
                curveTo(0.961f, 18.6354f, 6.3698f, 24.0f, 13.0548f, 24.0f)
                curveToRelative(0.6168f, 0.0f, 0.6454f, -0.3572f, 0.0859f, -0.5293f)
                curveToRelative(-4.9349f, -1.5063f, -8.5352f, -6.069f, -8.5352f, -11.4629f)
                curveToRelative(0.0f, -5.4656f, 3.6725f, -10.0706f, 8.6934f, -11.5195f)
                curveTo(13.8153f, 0.3448f, 13.6716f, 0.0f, 13.0548f, 0.0f)
                close()
                moveTo(15.379f, 1.8223f)
                curveToRelative(-5.2648f, 0.0f, -9.5254f, 4.2606f, -9.5254f, 9.5254f)
                curveToRelative(0.0f, 1.2193f, 0.2285f, 2.3818f, 0.6445f, 3.4433f)
                curveToRelative(0.1722f, 0.459f, 0.4454f, 0.4584f, 0.4024f, 0.0137f)
                curveToRelative(-0.0287f, -0.3156f, -0.0567f, -0.6447f, -0.0567f, -0.9746f)
                curveToRelative(0.0f, -5.2648f, 4.2606f, -9.5254f, 9.5254f, -9.5254f)
                curveToRelative(4.9779f, 0.0f, 6.4698f, 2.2235f, 6.6563f, 2.08f)
                curveToRelative(0.2008f, -0.1577f, -1.808f, -4.5624f, -7.6465f, -4.5624f)
                close()
                moveTo(15.8477f, 5.8926f)
                curveToRelative(-1.8622f, 0.0592f, -3.651f, 0.7168f, -5.1035f, 1.8554f)
                curveToRelative(-0.2582f, 0.2009f, -0.1567f, 0.3284f, 0.1445f, 0.1993f)
                curveToRelative(2.4675f, -1.076f, 5.5812f, -1.1046f, 8.6368f, -0.043f)
                curveToRelative(2.0514f, 0.7173f, 3.2413f, 1.7364f, 3.3418f, 1.6934f)
                curveToRelative(0.1578f, -0.0718f, -1.1915f, -2.2226f, -3.6446f, -3.1407f)
                curveToRelative(-1.1135f, -0.4196f, -2.2576f, -0.6f, -3.375f, -0.5644f)
                close()
            }
        }
        .build()
        return _akamai!!
    }

private var _akamai: ImageVector? = null
