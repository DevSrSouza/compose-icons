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

public val SimpleIcons.Octave: VectorAsset
    get() {
        if (_octave != null) {
            return _octave!!
        }
        _octave = VectorAssetBuilder(name = "Octave", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.492f, 0.008f)
                curveTo(8.08f, -0.082f, 5.837f, 0.723f, 4.21f, 2.492f)
                curveToRelative(-1.3f, 1.413f, -2.024f, 3.255f, -2.225f, 5.274f)
                horizontalLineToRelative(-0.42f)
                curveTo(0.702f, 7.766f, 0.0f, 8.468f, 0.0f, 9.33f)
                verticalLineToRelative(4.74f)
                curveToRelative(0.0f, 0.862f, 0.702f, 1.565f, 1.564f, 1.565f)
                horizontalLineToRelative(2.09f)
                arcToRelative(16.887f, 16.887f, 0.0f, false, false, 2.567f, 3.685f)
                curveToRelative(4.458f, 4.845f, 10.69f, 6.032f, 14.552f, 3.014f)
                horizontalLineToRelative(2.1f)
                curveToRelative(0.577f, 0.0f, 1.05f, -0.473f, 1.05f, -1.05f)
                lineTo(23.923f, 18.42f)
                arcToRelative(1.03f, 1.03f, 0.0f, false, false, -0.257f, -0.668f)
                curveToRelative(0.857f, -3.431f, -0.045f, -7.637f, -2.518f, -11.211f)
                curveToRelative(0.002f, -0.017f, 0.01f, -0.032f, 0.01f, -0.049f)
                lineTo(21.158f, 4.48f)
                arcToRelative(0.821f, 0.821f, 0.0f, false, false, -0.816f, -0.818f)
                lineTo(18.64f, 3.662f)
                curveTo(16.13f, 1.372f, 13.208f, 0.11f, 10.492f, 0.008f)
                close()
                moveTo(12.24f, 2.186f)
                curveToRelative(1.78f, -0.009f, 3.688f, 0.621f, 5.422f, 1.85f)
                arcToRelative(0.796f, 0.796f, 0.0f, false, false, -0.15f, 0.444f)
                verticalLineToRelative(2.012f)
                curveToRelative(0.0f, 0.448f, 0.368f, 0.819f, 0.816f, 0.819f)
                horizontalLineToRelative(2.014f)
                arcToRelative(0.787f, 0.787f, 0.0f, false, false, 0.392f, -0.116f)
                curveToRelative(2.246f, 3.3f, 2.733f, 7.317f, 1.239f, 10.174f)
                lineTo(20.01f, 17.369f)
                curveToRelative(-0.578f, 0.0f, -1.051f, 0.474f, -1.051f, 1.05f)
                verticalLineToRelative(1.792f)
                curveToRelative(-2.989f, 1.3f, -7.0f, 0.222f, -9.957f, -2.99f)
                arcToRelative(12.734f, 12.734f, 0.0f, false, true, -1.549f, -2.096f)
                curveToRelative(0.256f, -0.279f, 0.416f, -0.647f, 0.416f, -1.055f)
                lineTo(7.869f, 9.33f)
                curveToRelative(0.0f, -0.862f, -0.702f, -1.564f, -1.564f, -1.564f)
                horizontalLineToRelative(-0.409f)
                curveToRelative(0.237f, -1.363f, 0.78f, -2.61f, 1.686f, -3.594f)
                curveToRelative(1.224f, -1.33f, 2.878f, -1.978f, 4.658f, -1.986f)
                close()
                moveTo(18.328f, 4.196f)
                horizontalLineToRelative(2.014f)
                curveToRelative(0.162f, 0.0f, 0.283f, 0.122f, 0.283f, 0.284f)
                verticalLineToRelative(2.012f)
                curveToRelative(0.0f, 0.163f, -0.12f, 0.285f, -0.283f, 0.285f)
                horizontalLineToRelative(-2.014f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, -0.285f, -0.285f)
                lineTo(18.043f, 4.48f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, 0.285f, -0.285f)
                close()
                moveTo(1.564f, 8.298f)
                horizontalLineToRelative(4.74f)
                curveToRelative(0.577f, 0.0f, 1.032f, 0.455f, 1.032f, 1.031f)
                verticalLineToRelative(4.74f)
                curveToRelative(0.0f, 0.576f, -0.455f, 1.032f, -1.031f, 1.032f)
                horizontalLineToRelative(-4.74f)
                arcTo(1.023f, 1.023f, 0.0f, false, true, 0.532f, 14.07f)
                lineTo(0.532f, 9.33f)
                curveToRelative(0.0f, -0.576f, 0.455f, -1.031f, 1.031f, -1.031f)
                close()
                moveTo(20.01f, 17.901f)
                horizontalLineToRelative(2.863f)
                curveToRelative(0.291f, 0.0f, 0.52f, 0.226f, 0.52f, 0.518f)
                verticalLineToRelative(2.863f)
                arcToRelative(0.512f, 0.512f, 0.0f, false, true, -0.52f, 0.518f)
                lineTo(20.01f, 21.8f)
                arcToRelative(0.51f, 0.51f, 0.0f, false, true, -0.518f, -0.518f)
                lineTo(19.492f, 18.42f)
                arcToRelative(0.51f, 0.51f, 0.0f, false, true, 0.518f, -0.518f)
                close()
            }
        }
        .build()
        return _octave!!
    }

private var _octave: VectorAsset? = null
