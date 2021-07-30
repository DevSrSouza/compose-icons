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

public val SimpleIcons.Hey: ImageVector
    get() {
        if (_hey != null) {
            return _hey!!
        }
        _hey = Builder(name = "Hey", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.57f, 6.698f)
                arcToRelative(5.724f, 5.724f, 0.0f, false, false, -2.644f, 1.572f)
                curveToRelative(-0.84f, -2.952f, -2.65f, -7.42f, -4.415f, -8.15f)
                arcToRelative(1.283f, 1.283f, 0.0f, false, false, -1.181f, 0.05f)
                curveToRelative(-1.104f, 0.643f, -1.823f, 2.709f, -1.194f, 6.624f)
                curveTo(7.71f, 2.353f, 6.863f, 2.36f, 6.472f, 2.353f)
                arcToRelative(0.956f, 0.956f, 0.0f, false, false, -0.873f, 0.597f)
                curveToRelative(-0.263f, 0.584f, -0.79f, 2.406f, 0.494f, 6.327f)
                curveTo(4.547f, 7.16f, 4.072f, 6.89f, 3.526f, 6.917f)
                arcToRelative(0.969f, 0.969f, 0.0f, false, false, -0.821f, 0.557f)
                curveToRelative(-0.463f, 0.873f, -0.41f, 3.068f, 1.027f, 6.34f)
                arcToRelative(2.946f, 2.946f, 0.0f, false, false, -1.773f, -0.73f)
                arcToRelative(1.06f, 1.06f, 0.0f, false, false, -0.853f, 0.544f)
                curveToRelative(-0.584f, 1.073f, 0.642f, 4.083f, 2.157f, 6.124f)
                curveTo(4.49f, 21.427f, 6.947f, 24.0f, 10.515f, 24.0f)
                arcToRelative(8.047f, 8.047f, 0.0f, false, false, 1.489f, -0.141f)
                arcToRelative(0.654f, 0.654f, 0.0f, false, false, -0.25f, -1.284f)
                curveToRelative(-2.965f, 0.578f, -5.2f, -1.052f, -6.553f, -2.515f)
                curveToRelative(-2.021f, -2.19f, -2.908f, -4.82f, -2.959f, -5.622f)
                curveToRelative(0.424f, 0.173f, 1.644f, 0.892f, 4.018f, 3.934f)
                arcToRelative(0.65f, 0.65f, 0.0f, false, false, 1.059f, -0.757f)
                curveToRelative(-3.337f, -5.066f, -3.664f, -8.132f, -3.555f, -9.166f)
                curveToRelative(0.982f, 1.0f, 3.433f, 4.671f, 5.28f, 7.445f)
                arcToRelative(0.642f, 0.642f, 0.0f, false, false, 0.88f, 0.199f)
                arcToRelative(0.642f, 0.642f, 0.0f, false, false, 0.238f, -0.873f)
                curveTo(6.312f, 8.16f, 6.446f, 4.952f, 6.67f, 3.874f)
                curveToRelative(0.577f, 0.584f, 2.11f, 2.618f, 5.34f, 9.626f)
                arcToRelative(0.642f, 0.642f, 0.0f, false, false, 0.84f, 0.327f)
                arcToRelative(0.642f, 0.642f, 0.0f, false, false, 0.366f, -0.827f)
                curveToRelative(-3.132f, -8.504f, -1.772f, -11.385f, -1.252f, -11.712f)
                curveToRelative(0.674f, 0.0f, 2.567f, 3.247f, 3.748f, 7.502f)
                curveToRelative(0.07f, 0.263f, 0.141f, 0.52f, 0.205f, 0.77f)
                arcToRelative(4.094f, 4.094f, 0.0f, false, false, -0.385f, 0.924f)
                curveToRelative(-0.64f, 2.355f, -1.283f, 7.7f, -0.045f, 9.17f)
                arcToRelative(1.194f, 1.194f, 0.0f, false, false, 1.04f, 0.444f)
                arcToRelative(1.688f, 1.688f, 0.0f, false, false, 1.232f, -0.757f)
                curveToRelative(1.15f, -1.675f, 0.475f, -5.879f, -0.443f, -9.557f)
                arcToRelative(4.832f, 4.832f, 0.0f, false, true, 2.567f, -1.84f)
                arcToRelative(1.283f, 1.283f, 0.0f, false, true, 1.284f, 0.307f)
                curveToRelative(0.526f, 0.59f, 1.445f, 2.798f, -1.34f, 10.583f)
                arcToRelative(0.654f, 0.654f, 0.0f, false, false, 1.231f, 0.436f)
                curveToRelative(2.22f, -6.206f, 2.568f, -10.204f, 1.084f, -11.886f)
                arcTo(2.528f, 2.528f, 0.0f, false, false, 19.57f, 6.7f)
                close()
                moveTo(16.682f, 18.616f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, true, -0.218f, 0.186f)
                curveToRelative(-0.48f, -0.571f, -0.48f, -3.953f, 0.045f, -6.727f)
                curveToRelative(0.995f, 4.795f, 0.417f, 6.2f, 0.173f, 6.54f)
                close()
            }
        }
        .build()
        return _hey!!
    }

private var _hey: ImageVector? = null
