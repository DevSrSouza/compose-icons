package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Gumtree: VectorAsset
    get() {
        if (_gumtree != null) {
            return _gumtree!!
        }
        _gumtree = VectorAssetBuilder(name = "Gumtree", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.829f, 6.52f)
                curveToRelative(-0.189f, -0.127f, -0.315f, -0.315f, -0.315f, -0.57f)
                curveTo(18.198f, 2.596f, 15.412f, 0.0f, 11.994f, 0.0f)
                reflectiveCurveToRelative(-6.203f, 2.594f, -6.52f, 5.949f)
                curveToRelative(0.0f, 0.255f, -0.126f, 0.442f, -0.314f, 0.57f)
                curveToRelative(-1.711f, 1.202f, -2.785f, 3.165f, -2.785f, 5.378f)
                curveToRelative(0.0f, 3.038f, 2.087f, 5.573f, 4.872f, 6.331f)
                curveToRelative(0.507f, 0.127f, 0.95f, 0.189f, 1.14f, 0.061f)
                curveToRelative(0.379f, -0.188f, 0.76f, -1.832f, 0.57f, -2.213f)
                curveToRelative(-0.128f, -0.189f, -0.57f, -0.379f, -1.014f, -0.506f)
                curveToRelative(-1.646f, -0.443f, -2.848f, -1.961f, -2.848f, -3.732f)
                curveToRelative(0.0f, -1.015f, 0.379f, -1.9f, 1.014f, -2.6f)
                curveToRelative(0.252f, -0.315f, 0.63f, -0.567f, 0.948f, -0.757f)
                curveToRelative(0.696f, -0.38f, 1.14f, -1.142f, 1.14f, -1.964f)
                curveToRelative(0.0f, -0.45f, 0.063f, -0.826f, 0.189f, -1.201f)
                curveToRelative(0.506f, -1.532f, 1.961f, -2.659f, 3.67f, -2.659f)
                curveToRelative(1.711f, 0.0f, 3.166f, 1.127f, 3.672f, 2.659f)
                curveToRelative(0.126f, 0.375f, 0.189f, 0.751f, 0.189f, 1.201f)
                curveToRelative(0.0f, 0.812f, 0.381f, 1.578f, 1.142f, 1.953f)
                curveToRelative(0.379f, 0.18f, 0.694f, 0.436f, 0.946f, 0.752f)
                curveToRelative(0.634f, 0.69f, 1.014f, 1.576f, 1.014f, 2.598f)
                curveToRelative(0.0f, 2.148f, -1.709f, 3.861f, -3.86f, 3.861f)
                curveToRelative(-2.468f, 0.0f, -4.431f, 2.013f, -4.431f, 4.416f)
                verticalLineToRelative(2.523f)
                curveToRelative(0.0f, 0.496f, 0.064f, 1.006f, 0.19f, 1.142f)
                curveToRelative(0.315f, 0.316f, 1.962f, 0.316f, 2.278f, 0.0f)
                curveToRelative(0.136f, -0.136f, 0.195f, -0.631f, 0.195f, -1.142f)
                verticalLineToRelative(-2.583f)
                curveToRelative(0.0f, -0.946f, 0.766f, -1.713f, 1.713f, -1.713f)
                curveToRelative(3.605f, 0.0f, 6.52f, -2.915f, 6.52f, -6.52f)
                curveToRelative(0.0f, -2.163f, -1.066f, -4.116f, -2.78f, -5.317f)
                lineToRelative(-0.015f, 0.033f)
                close()
            }
        }
        .build()
        return _gumtree!!
    }

private var _gumtree: VectorAsset? = null
