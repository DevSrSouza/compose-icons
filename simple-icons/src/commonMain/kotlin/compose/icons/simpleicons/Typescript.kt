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

public val SimpleIcons.Typescript: VectorAsset
    get() {
        if (_typescript != null) {
            return _typescript!!
        }
        _typescript = VectorAssetBuilder(name = "Typescript", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 12.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                close()
                moveTo(19.341f, 11.044f)
                curveToRelative(0.61f, 0.152f, 1.074f, 0.423f, 1.501f, 0.865f)
                curveToRelative(0.221f, 0.236f, 0.549f, 0.666f, 0.575f, 0.77f)
                curveToRelative(0.008f, 0.03f, -1.036f, 0.73f, -1.668f, 1.123f)
                curveToRelative(-0.023f, 0.015f, -0.115f, -0.084f, -0.217f, -0.236f)
                curveToRelative(-0.31f, -0.45f, -0.633f, -0.644f, -1.128f, -0.678f)
                curveToRelative(-0.728f, -0.05f, -1.196f, 0.331f, -1.192f, 0.967f)
                arcToRelative(0.88f, 0.88f, 0.0f, false, false, 0.102f, 0.45f)
                curveToRelative(0.16f, 0.331f, 0.458f, 0.53f, 1.39f, 0.933f)
                curveToRelative(1.719f, 0.74f, 2.454f, 1.227f, 2.911f, 1.92f)
                curveToRelative(0.51f, 0.773f, 0.625f, 2.008f, 0.278f, 2.926f)
                curveToRelative(-0.38f, 0.998f, -1.325f, 1.676f, -2.655f, 1.9f)
                curveToRelative(-0.411f, 0.073f, -1.386f, 0.062f, -1.828f, -0.018f)
                curveToRelative(-0.964f, -0.172f, -1.878f, -0.648f, -2.442f, -1.273f)
                curveToRelative(-0.221f, -0.243f, -0.652f, -0.88f, -0.625f, -0.925f)
                curveToRelative(0.011f, -0.016f, 0.11f, -0.077f, 0.22f, -0.141f)
                curveToRelative(0.108f, -0.061f, 0.511f, -0.294f, 0.892f, -0.515f)
                lineToRelative(0.69f, -0.4f)
                lineToRelative(0.145f, 0.214f)
                curveToRelative(0.202f, 0.308f, 0.643f, 0.731f, 0.91f, 0.872f)
                curveToRelative(0.766f, 0.404f, 1.817f, 0.347f, 2.335f, -0.118f)
                arcToRelative(0.883f, 0.883f, 0.0f, false, false, 0.313f, -0.72f)
                curveToRelative(0.0f, -0.278f, -0.035f, -0.4f, -0.18f, -0.61f)
                curveToRelative(-0.186f, -0.266f, -0.567f, -0.49f, -1.649f, -0.96f)
                curveToRelative(-1.238f, -0.533f, -1.771f, -0.864f, -2.259f, -1.39f)
                arcToRelative(3.165f, 3.165f, 0.0f, false, true, -0.659f, -1.2f)
                curveToRelative(-0.091f, -0.339f, -0.114f, -1.189f, -0.042f, -1.531f)
                curveToRelative(0.255f, -1.197f, 1.158f, -2.03f, 2.461f, -2.278f)
                curveToRelative(0.423f, -0.08f, 1.406f, -0.05f, 1.821f, 0.053f)
                close()
                moveTo(13.707f, 12.046f)
                lineToRelative(0.008f, 0.983f)
                lineTo(10.59f, 13.029f)
                verticalLineToRelative(8.876f)
                lineTo(8.38f, 21.905f)
                verticalLineToRelative(-8.876f)
                lineTo(5.258f, 13.029f)
                verticalLineToRelative(-0.964f)
                curveToRelative(0.0f, -0.534f, 0.011f, -0.98f, 0.026f, -0.99f)
                curveToRelative(0.012f, -0.016f, 1.913f, -0.024f, 4.217f, -0.02f)
                lineToRelative(4.195f, 0.012f)
                close()
            }
        }
        .build()
        return _typescript!!
    }

private var _typescript: VectorAsset? = null
