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

public val SimpleIcons.Veepee: ImageVector
    get() {
        if (_veepee != null) {
            return _veepee!!
        }
        _veepee = Builder(name = "Veepee", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.808f, 9.941f)
                arcToRelative(11.55f, 11.55f, 0.0f, false, false, -0.872f, -3.51f)
                curveToRelative(0.784f, -1.634f, 1.59f, -2.239f, 1.59f, -2.239f)
                reflectiveCurveToRelative(1.658f, 4.244f, 0.203f, 8.605f)
                curveToRelative(-0.9f, 2.698f, -1.977f, 4.328f, -2.554f, 5.028f)
                curveToRelative(-0.129f, 0.156f, -0.243f, 0.205f, -0.172f, 0.11f)
                curveToRelative(1.36f, -1.834f, 2.109f, -4.749f, 1.805f, -7.994f)
                moveToRelative(1.317f, 5.143f)
                curveToRelative(-0.672f, 0.809f, -1.35f, 1.594f, -2.1f, 2.195f)
                curveToRelative(-0.108f, 0.086f, -0.176f, 0.08f, -0.093f, -0.011f)
                curveToRelative(2.653f, -2.896f, 5.536f, -9.314f, 1.8f, -15.64f)
                curveToRelative(0.0f, 0.0f, -1.477f, 1.02f, -2.69f, 3.134f)
                curveTo(15.846f, 2.922f, 14.106f, 1.379f, 11.94f, 0.0f)
                curveToRelative(0.0f, 0.0f, -5.479f, 6.107f, -3.056f, 14.954f)
                curveToRelative(-6.99f, 0.964f, -4.452f, 6.361f, -3.344f, 7.137f)
                curveToRelative(0.052f, 0.037f, 0.096f, 0.018f, 0.025f, -0.091f)
                curveToRelative(-0.393f, -0.603f, -1.491f, -2.71f, 0.773f, -4.732f)
                curveToRelative(1.215f, -1.084f, 3.761f, -1.367f, 3.761f, -1.367f)
                curveToRelative(-0.579f, -4.248f, -0.538f, -8.086f, 2.364f, -12.333f)
                curveToRelative(0.371f, 0.246f, 4.616f, 2.112f, 4.776f, 8.396f)
                curveToRelative(0.355f, 3.941f, -1.691f, 7.096f, -3.677f, 8.324f)
                curveToRelative(-3.519f, 1.888f, -7.468f, 2.814f, -10.901f, 3.619f)
                curveToRelative(-0.291f, 0.069f, -0.178f, 0.1f, 0.016f, 0.092f)
                curveToRelative(8.156f, -0.343f, 15.407f, -4.011f, 18.195f, -7.512f)
                curveToRelative(0.537f, -0.673f, 0.777f, -1.414f, 0.415f, -1.824f)
                curveToRelative(-0.361f, -0.411f, -1.016f, 0.244f, -1.162f, 0.421f)
            }
        }
        .build()
        return _veepee!!
    }

private var _veepee: ImageVector? = null
