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

public val SimpleIcons.Instatus: ImageVector
    get() {
        if (_instatus != null) {
            return _instatus!!
        }
        _instatus = Builder(name = "Instatus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.994f, 21.028f)
                curveToRelative(3.5843f, -1.91f, 5.471f, -5.759f, 5.0561f, -9.5637f)
                curveToRelative(-1.3206f, 1.0851f, -2.6237f, 2.3203f, -3.8709f, 3.6906f)
                curveToRelative(-2.0656f, 2.2694f, -3.7476f, 4.6559f, -4.9953f, 6.9817f)
                curveToRelative(1.2946f, -0.0971f, 2.5907f, -0.4587f, 3.8101f, -1.1086f)
                close()
                moveTo(3.6f, 18.4654f)
                curveToRelative(-1.3408f, 1.8191f, -2.3771f, 4.4991f, -1.3032f, 5.3066f)
                curveToRelative(1.5151f, 1.1394f, 8.404f, -2.0133f, 13.908f, -8.8051f)
                curveToRelative(5.504f, -6.7918f, 7.3265f, -13.796f, 4.879f, -14.873f)
                curveToRelative(-1.1283f, -0.4964f, -3.486f, 1.083f, -4.8394f, 2.3943f)
                lineToRelative(0.5841f, 0.3142f)
                curveToRelative(1.332f, -0.8528f, 3.5528f, -1.7338f, 1.4995f, 1.9758f)
                curveToRelative(-0.0097f, 0.0177f, -0.0196f, 0.0354f, -0.0295f, 0.0532f)
                curveToRelative(-2.9067f, -2.2075f, -6.9471f, -2.662f, -10.379f, -0.8328f)
                curveToRelative(-4.7026f, 2.506f, -6.4831f, 8.3499f, -3.9771f, 13.052f)
                curveToRelative(0.5898f, 1.1067f, 1.3644f, 2.0516f, 2.2655f, 2.8168f)
                curveToRelative(-3.5586f, 2.7493f, -2.6905f, 0.3596f, -2.1925f, -0.8162f)
                close()
            }
        }
        .build()
        return _instatus!!
    }

private var _instatus: ImageVector? = null
