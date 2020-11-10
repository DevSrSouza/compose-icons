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

public val SimpleIcons.Spring: VectorAsset
    get() {
        if (_spring != null) {
            return _spring!!
        }
        _spring = VectorAssetBuilder(name = "Spring", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.822f, 1.248f)
                curveToRelative(-0.338f, 0.806f, -0.766f, 1.57f, -1.281f, 2.272f)
                arcTo(12.045f, 12.045f, 0.0f, false, false, 12.03f, 0.0f)
                curveTo(5.431f, 0.0f, 0.0f, 5.43f, 0.0f, 12.031f)
                curveToRelative(0.0f, 3.293f, 1.35f, 6.445f, 3.737f, 8.717f)
                lineToRelative(0.444f, 0.393f)
                arcToRelative(12.041f, 12.041f, 0.0f, false, false, 7.75f, 2.83f)
                curveToRelative(6.275f, 0.0f, 11.55f, -4.911f, 11.997f, -11.172f)
                curveToRelative(0.328f, -3.065f, -0.572f, -6.941f, -2.106f, -11.55f)
                close()
                moveTo(5.447f, 20.817f)
                curveToRelative(-0.194f, 0.24f, -0.49f, 0.38f, -0.8f, 0.38f)
                arcToRelative(1.033f, 1.033f, 0.0f, false, true, -1.028f, -1.03f)
                curveToRelative(0.0f, -0.564f, 0.465f, -1.03f, 1.028f, -1.03f)
                arcToRelative(1.032f, 1.032f, 0.0f, false, true, 0.8f, 1.68f)
                close()
                moveTo(21.772f, 17.215f)
                curveToRelative(-2.969f, 3.954f, -9.31f, 2.622f, -13.375f, 2.812f)
                curveToRelative(0.0f, 0.0f, -0.722f, 0.044f, -1.447f, 0.162f)
                curveToRelative(0.0f, 0.0f, 0.272f, -0.115f, 0.625f, -0.25f)
                curveToRelative(2.853f, -0.992f, 4.203f, -1.185f, 5.937f, -2.075f)
                curveToRelative(3.266f, -1.66f, 6.494f, -5.293f, 7.166f, -9.072f)
                curveToRelative(-1.244f, 3.636f, -5.012f, 6.76f, -8.447f, 8.03f)
                curveToRelative(-2.353f, 0.867f, -6.603f, 1.71f, -6.603f, 1.71f)
                lineToRelative(-0.172f, -0.09f)
                curveToRelative(-2.894f, -1.408f, -2.981f, -7.672f, 2.278f, -9.694f)
                curveToRelative(2.303f, -0.886f, 4.507f, -0.4f, 6.994f, -0.992f)
                curveToRelative(2.656f, -0.63f, 5.728f, -2.622f, 6.978f, -5.219f)
                curveToRelative(1.4f, 4.154f, 3.085f, 10.658f, 0.066f, 14.678f)
                close()
            }
        }
        .build()
        return _spring!!
    }

private var _spring: VectorAsset? = null
