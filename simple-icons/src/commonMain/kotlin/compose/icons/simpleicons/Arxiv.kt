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

public val SimpleIcons.Arxiv: ImageVector
    get() {
        if (_arxiv != null) {
            return _arxiv!!
        }
        _arxiv = Builder(name = "Arxiv", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.8423f, 0.0f)
                arcToRelative(1.0037f, 1.0037f, 0.0f, false, false, -0.922f, 0.6078f)
                curveToRelative(-0.1536f, 0.3687f, -0.0438f, 0.6275f, 0.2938f, 1.1113f)
                lineToRelative(6.9185f, 8.3597f)
                lineToRelative(-1.0223f, 1.1058f)
                arcToRelative(1.0393f, 1.0393f, 0.0f, false, false, 0.003f, 1.4229f)
                lineToRelative(1.2292f, 1.3135f)
                lineToRelative(-5.4391f, 6.4444f)
                curveToRelative(-0.2803f, 0.299f, -0.4538f, 0.823f, -0.2971f, 1.1986f)
                arcToRelative(1.0253f, 1.0253f, 0.0f, false, false, 0.9585f, 0.635f)
                arcToRelative(0.9133f, 0.9133f, 0.0f, false, false, 0.6891f, -0.3405f)
                lineToRelative(5.783f, -6.126f)
                lineToRelative(7.4902f, 8.0051f)
                arcToRelative(0.8527f, 0.8527f, 0.0f, false, false, 0.6835f, 0.2597f)
                arcToRelative(0.9575f, 0.9575f, 0.0f, false, false, 0.8777f, -0.6138f)
                curveToRelative(0.1577f, -0.377f, -0.017f, -0.7502f, -0.306f, -1.1407f)
                lineToRelative(-7.0518f, -8.3418f)
                lineToRelative(1.0632f, -1.13f)
                arcToRelative(0.9626f, 0.9626f, 0.0f, false, false, 0.0089f, -1.3165f)
                lineTo(4.6336f, 0.4639f)
                reflectiveCurveToRelative(-0.3733f, -0.4535f, -0.768f, -0.463f)
                close()
                moveTo(3.8423f, 0.272f)
                horizontalLineToRelative(0.0166f)
                curveToRelative(0.2179f, 0.0052f, 0.4874f, 0.2715f, 0.5644f, 0.3639f)
                lineToRelative(0.005f, 0.006f)
                lineToRelative(0.0052f, 0.0055f)
                lineToRelative(10.169f, 10.9905f)
                arcToRelative(0.6915f, 0.6915f, 0.0f, false, true, -0.0072f, 0.945f)
                lineToRelative(-1.0666f, 1.133f)
                lineToRelative(-1.4982f, -1.7724f)
                lineToRelative(-8.5994f, -10.39f)
                curveToRelative(-0.3286f, -0.472f, -0.352f, -0.6183f, -0.2592f, -0.841f)
                arcToRelative(0.7307f, 0.7307f, 0.0f, false, true, 0.6704f, -0.4401f)
                close()
                moveTo(18.1833f, 1.8421f)
                arcToRelative(0.877f, 0.877f, 0.0f, false, false, -0.6554f, 0.2418f)
                lineToRelative(-5.6962f, 6.1584f)
                lineToRelative(1.6944f, 1.8319f)
                lineToRelative(5.3089f, -6.5138f)
                curveToRelative(0.3251f, -0.4335f, 0.479f, -0.6603f, 0.3247f, -1.0292f)
                arcToRelative(1.1205f, 1.1205f, 0.0f, false, false, -0.9763f, -0.689f)
                close()
                moveTo(10.5276f, 14.1244f)
                lineTo(11.8462f, 15.5379f)
                lineTo(6.0598f, 21.6674f)
                arcToRelative(0.6494f, 0.6494f, 0.0f, false, true, -0.4959f, 0.26f)
                arcToRelative(0.7516f, 0.7516f, 0.0f, false, true, -0.706f, -0.4669f)
                curveToRelative(-0.1119f, -0.2682f, 0.0359f, -0.6864f, 0.2442f, -0.9083f)
                lineToRelative(0.0051f, -0.0055f)
                lineToRelative(0.0047f, -0.0055f)
                close()
            }
        }
        .build()
        return _arxiv!!
    }

private var _arxiv: ImageVector? = null
