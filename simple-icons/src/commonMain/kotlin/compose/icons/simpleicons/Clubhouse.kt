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

public val SimpleIcons.Clubhouse: ImageVector
    get() {
        if (_clubhouse != null) {
            return _clubhouse!!
        }
        _clubhouse = Builder(name = "Clubhouse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 9.543f)
                curveToRelative(0.0f, 0.32f, -0.23f, 0.763f, -0.337f, 0.976f)
                curveToRelative(-0.39f, 0.833f, -1.03f, 2.112f, -1.03f, 3.585f)
                curveToRelative(0.0f, 3.213f, -1.135f, 4.811f, -2.023f, 5.628f)
                arcToRelative(5.706f, 5.706f, 0.0f, false, true, -3.852f, 1.527f)
                arcToRelative(6.144f, 6.144f, 0.0f, false, true, -3.32f, -0.976f)
                curveToRelative(-1.366f, -0.905f, -2.219f, -2.326f, -3.088f, -3.745f)
                curveToRelative(-0.692f, -1.153f, -1.171f, -2.06f, -1.918f, -3.816f)
                curveToRelative(-0.421f, -1.018f, -0.813f, -2.012f, -1.15f, -3.094f)
                curveToRelative(-0.16f, -0.514f, -0.142f, -0.905f, 0.053f, -1.153f)
                curveToRelative(0.195f, -0.23f, 0.462f, -0.337f, 0.78f, -0.355f)
                curveToRelative(0.55f, -0.018f, 0.764f, 0.373f, 1.083f, 1.384f)
                curveToRelative(0.195f, 0.639f, 0.586f, 1.563f, 0.816f, 2.077f)
                curveToRelative(0.302f, 0.621f, 0.728f, 1.455f, 0.923f, 1.74f)
                curveToRelative(0.16f, 0.25f, 0.302f, 0.32f, 0.461f, 0.32f)
                curveToRelative(0.284f, 0.0f, 0.497f, -0.16f, 0.497f, -0.443f)
                curveToRelative(0.0f, -0.16f, -0.16f, -0.426f, -0.248f, -0.586f)
                curveToRelative(-0.16f, -0.302f, -0.497f, -0.905f, -0.728f, -1.42f)
                arcToRelative(32.775f, 32.775f, 0.0f, false, true, -0.763f, -1.917f)
                curveToRelative(-0.142f, -0.373f, -0.301f, -0.905f, -0.461f, -1.437f)
                curveToRelative(-0.248f, -0.816f, -0.373f, -1.313f, -0.373f, -1.687f)
                curveToRelative(0.0f, -0.568f, 0.426f, -0.94f, 1.065f, -0.94f)
                curveToRelative(0.461f, 0.0f, 0.763f, 0.23f, 0.958f, 1.064f)
                curveToRelative(0.16f, 0.763f, 0.444f, 2.006f, 0.852f, 2.982f)
                curveToRelative(0.266f, 0.639f, 0.656f, 1.492f, 0.887f, 1.918f)
                curveToRelative(0.142f, 0.248f, 0.301f, 0.461f, 0.301f, 0.55f)
                curveToRelative(0.0f, 0.124f, -0.23f, 0.32f, -0.426f, 0.585f)
                curveToRelative(-0.124f, 0.16f, -0.177f, 0.267f, -0.177f, 0.39f)
                curveToRelative(0.0f, 0.107f, 0.071f, 0.214f, 0.177f, 0.356f)
                curveToRelative(0.107f, 0.142f, 0.213f, 0.284f, 0.338f, 0.284f)
                curveToRelative(0.088f, 0.0f, 0.142f, -0.036f, 0.195f, -0.107f)
                arcToRelative(6.12f, 6.12f, 0.0f, false, true, 1.847f, -1.563f)
                curveToRelative(0.816f, -0.461f, 1.651f, -0.692f, 2.308f, -0.834f)
                curveToRelative(0.319f, -0.07f, 0.408f, -0.142f, 0.408f, -0.32f)
                curveToRelative(0.0f, -0.212f, -0.16f, -0.336f, -0.373f, -0.354f)
                curveToRelative(-0.16f, -0.018f, -0.301f, 0.0f, -0.55f, 0.018f)
                curveToRelative(-0.177f, 0.018f, -0.266f, -0.071f, -0.372f, -0.302f)
                curveToRelative(-0.32f, -0.674f, -0.94f, -1.811f, -1.313f, -3.266f)
                arcToRelative(13.95f, 13.95f, 0.0f, false, true, -0.39f, -2.13f)
                curveToRelative(-0.054f, -0.391f, 0.017f, -0.533f, 0.212f, -0.71f)
                curveToRelative(0.249f, -0.213f, 0.692f, -0.302f, 1.03f, -0.213f)
                curveToRelative(0.407f, 0.106f, 0.62f, 0.426f, 0.833f, 1.67f)
                curveToRelative(0.107f, 0.585f, 0.284f, 1.33f, 0.497f, 1.97f)
                curveToRelative(0.266f, 0.816f, 0.603f, 1.492f, 1.118f, 2.397f)
                curveToRelative(0.284f, 0.497f, 0.638f, 1.011f, 1.011f, 1.51f)
                curveToRelative(-0.071f, 0.213f, -0.195f, 0.354f, -0.603f, 0.692f)
                curveToRelative(-0.408f, 0.337f, -0.816f, 0.692f, -1.189f, 1.348f)
                curveToRelative(-0.266f, 0.479f, -0.39f, 1.011f, -0.39f, 1.366f)
                curveToRelative(0.0f, 0.337f, 0.07f, 0.408f, 0.284f, 0.408f)
                curveToRelative(0.372f, 0.0f, 0.674f, -0.07f, 0.692f, -0.23f)
                curveToRelative(0.088f, -0.64f, 0.195f, -1.047f, 0.55f, -1.528f)
                curveToRelative(0.212f, -0.266f, 0.585f, -0.603f, 0.887f, -0.87f)
                curveToRelative(0.567f, -0.46f, 0.763f, -0.727f, 0.958f, -1.383f)
                curveToRelative(0.088f, -0.302f, 0.195f, -0.586f, 0.337f, -0.852f)
                curveToRelative(0.337f, -0.62f, 0.94f, -1.33f, 1.882f, -1.33f)
                curveToRelative(0.302f, 0.0f, 0.55f, 0.088f, 0.71f, 0.337f)
                arcToRelative(0.966f, 0.966f, 0.0f, false, true, 0.124f, 0.479f)
                close()
                moveTo(12.608f, 7.265f)
                curveToRelative(0.16f, 0.658f, 0.355f, 1.226f, 0.55f, 1.723f)
                curveToRelative(0.23f, 0.605f, 0.497f, 1.12f, 0.87f, 1.811f)
                curveToRelative(0.177f, 0.337f, 0.265f, 0.337f, 0.691f, 0.107f)
                arcToRelative(9.14f, 9.14f, 0.0f, false, true, 1.207f, -0.515f)
                curveToRelative(-0.639f, -1.384f, -1.171f, -2.539f, -1.437f, -3.514f)
                arcToRelative(29.883f, 29.883f, 0.0f, false, true, -0.39f, -1.918f)
                curveToRelative(-0.054f, -0.497f, -0.107f, -0.923f, -0.231f, -1.384f)
                curveToRelative(-0.142f, -0.568f, -0.338f, -0.834f, -0.888f, -0.834f)
                curveToRelative(-0.514f, 0.0f, -1.135f, 0.266f, -1.135f, 0.94f)
                curveToRelative(0.0f, 0.444f, 0.124f, 1.1f, 0.248f, 1.631f)
                curveToRelative(0.213f, 0.516f, 0.249f, 0.835f, 0.515f, 1.953f)
                close()
                moveTo(5.124f, 14.412f)
                curveToRelative(-0.43f, 0.116f, -2.276f, 0.784f, -2.721f, 0.957f)
                curveToRelative(-0.503f, 0.195f, -0.857f, 0.372f, -0.605f, 1.122f)
                curveToRelative(0.205f, 0.607f, 0.553f, 0.636f, 0.874f, 0.516f)
                curveToRelative(0.45f, -0.166f, 2.442f, -1.21f, 2.818f, -1.442f)
                curveToRelative(0.34f, -0.21f, 0.45f, -0.37f, 0.29f, -0.769f)
                curveToRelative(-0.145f, -0.363f, -0.354f, -0.465f, -0.656f, -0.384f)
                close()
                moveTo(3.848f, 11.338f)
                curveToRelative(0.252f, -0.008f, 0.448f, -0.09f, 0.508f, -0.526f)
                curveToRelative(0.047f, -0.335f, -0.006f, -0.51f, -0.39f, -0.629f)
                curveToRelative(-0.371f, -0.114f, -2.702f, -0.494f, -3.205f, -0.542f)
                curveToRelative(-0.434f, -0.042f, -0.702f, 0.0f, -0.753f, 0.687f)
                curveToRelative(-0.049f, 0.64f, 0.13f, 0.836f, 0.572f, 0.88f)
                curveToRelative(0.508f, 0.05f, 2.733f, 0.144f, 3.268f, 0.13f)
                close()
                moveTo(1.218f, 5.256f)
                curveToRelative(0.474f, 0.283f, 2.293f, 1.385f, 2.906f, 1.579f)
                curveToRelative(0.306f, 0.096f, 0.468f, 0.01f, 0.64f, -0.331f)
                reflectiveCurveToRelative(0.218f, -0.477f, -0.111f, -0.742f)
                curveToRelative(-0.34f, -0.274f, -2.123f, -1.661f, -2.628f, -1.924f)
                curveToRelative(-0.435f, -0.226f, -0.729f, -0.139f, -0.993f, 0.361f)
                curveToRelative(-0.299f, 0.566f, -0.244f, 0.798f, 0.185f, 1.057f)
                close()
            }
        }
        .build()
        return _clubhouse!!
    }

private var _clubhouse: ImageVector? = null
