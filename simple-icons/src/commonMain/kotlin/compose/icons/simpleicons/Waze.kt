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

public val SimpleIcons.Waze: VectorAsset
    get() {
        if (_waze != null) {
            return _waze!!
        }
        _waze = VectorAssetBuilder(name = "Waze", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.314f, 1.59f)
                curveToRelative(-0.225f, 0.003f, -0.45f, 0.013f, -0.675f, 0.03f)
                curveToRelative(-2.165f, 0.155f, -4.295f, 0.924f, -6.069f, 2.327f)
                curveToRelative(-2.194f, 1.732f, -3.296f, 4.325f, -3.496f, 7.05f)
                horizontalLineToRelative(0.002f)
                curveToRelative(-0.093f, 1.22f, -0.23f, 2.15f, -0.469f, 2.63f)
                curveToRelative(-0.238f, 0.479f, -0.42f, 0.638f, -1.24f, 0.639f)
                curveTo(0.27f, 14.259f, -0.4f, 15.612f, 0.266f, 16.482f)
                curveToRelative(1.248f, 1.657f, 2.902f, 2.705f, 4.72f, 3.364f)
                arcToRelative(2.198f, 2.198f, 0.0f, false, false, -0.033f, 0.367f)
                arcToRelative(2.198f, 2.198f, 0.0f, false, false, 2.2f, 2.197f)
                arcToRelative(2.198f, 2.198f, 0.0f, false, false, 2.128f, -1.668f)
                curveToRelative(1.307f, 0.12f, 2.607f, 0.14f, 3.824f, 0.1f)
                curveToRelative(0.364f, -0.012f, 0.73f, -0.045f, 1.094f, -0.092f)
                arcToRelative(2.198f, 2.198f, 0.0f, false, false, 2.127f, 1.66f)
                arcToRelative(2.198f, 2.198f, 0.0f, false, false, 2.2f, -2.197f)
                arcToRelative(2.198f, 2.198f, 0.0f, false, false, -0.151f, -0.797f)
                arcToRelative(12.155f, 12.155f, 0.0f, false, false, 2.303f, -1.549f)
                curveToRelative(2.094f, -1.807f, 3.511f, -4.399f, 3.302f, -7.404f)
                curveToRelative(-0.112f, -1.723f, -0.761f, -3.298f, -1.748f, -4.608f)
                curveToRelative(-2.143f, -2.86f, -5.53f, -4.309f, -8.918f, -4.265f)
                close()
                moveTo(13.68f, 3.13f)
                curveToRelative(0.312f, 0.008f, 0.623f, 0.027f, 0.933f, 0.063f)
                curveToRelative(2.48f, 0.288f, 4.842f, 1.496f, 6.4f, 3.577f)
                verticalLineToRelative(0.001f)
                curveToRelative(0.829f, 1.1f, 1.355f, 2.386f, 1.446f, 3.792f)
                verticalLineToRelative(0.003f)
                curveToRelative(0.173f, 2.477f, -0.965f, 4.583f, -2.777f, 6.147f)
                arcToRelative(10.66f, 10.66f, 0.0f, false, true, -2.375f, 1.535f)
                arcToRelative(2.198f, 2.198f, 0.0f, false, false, -0.98f, -0.234f)
                arcToRelative(2.198f, 2.198f, 0.0f, false, false, -1.934f, 1.158f)
                arcToRelative(9.894f, 9.894f, 0.0f, false, true, -1.338f, 0.146f)
                arcToRelative(27.323f, 27.323f, 0.0f, false, true, -3.971f, -0.148f)
                arcToRelative(2.198f, 2.198f, 0.0f, false, false, -1.932f, -1.156f)
                arcToRelative(2.198f, 2.198f, 0.0f, false, false, -1.347f, 0.463f)
                curveToRelative(-1.626f, -0.553f, -3.078f, -1.422f, -4.155f, -2.762f)
                curveToRelative(1.052f, -0.096f, 1.916f, -0.6f, 2.319f, -1.408f)
                curveToRelative(0.443f, -0.889f, 0.53f, -1.947f, 0.625f, -3.198f)
                verticalLineToRelative(-0.002f)
                curveToRelative(0.175f, -2.391f, 1.11f, -4.536f, 2.92f, -5.964f)
                horizontalLineToRelative(0.002f)
                curveToRelative(1.77f, -1.402f, 3.978f, -2.061f, 6.164f, -2.012f)
                close()
                moveTo(10.523f, 7.768f)
                curveToRelative(-0.688f, 0.0f, -1.252f, 0.579f, -1.252f, 1.298f)
                curveToRelative(0.0f, 0.72f, 0.564f, 1.297f, 1.252f, 1.297f)
                curveToRelative(0.689f, 0.0f, 1.252f, -0.577f, 1.252f, -1.297f)
                curveToRelative(0.0f, -0.711f, -0.563f, -1.298f, -1.252f, -1.298f)
                close()
                moveTo(16.037f, 7.768f)
                curveToRelative(-0.688f, 0.0f, -1.25f, 0.579f, -1.25f, 1.298f)
                curveToRelative(-0.008f, 0.72f, 0.554f, 1.297f, 1.25f, 1.297f)
                curveToRelative(0.688f, 0.0f, 1.252f, -0.577f, 1.252f, -1.297f)
                curveToRelative(0.0f, -0.711f, -0.564f, -1.298f, -1.252f, -1.298f)
                close()
                moveTo(9.641f, 11.78f)
                arcToRelative(0.72f, 0.72f, 0.0f, false, false, -0.588f, 0.32f)
                arcToRelative(0.692f, 0.692f, 0.0f, false, false, -0.11f, 0.54f)
                curveToRelative(0.345f, 1.783f, 2.175f, 3.129f, 4.264f, 3.129f)
                horizontalLineToRelative(0.125f)
                curveToRelative(1.056f, -0.032f, 2.026f, -0.343f, 2.816f, -0.922f)
                curveToRelative(0.767f, -0.556f, 1.29f, -1.316f, 1.477f, -2.137f)
                arcToRelative(0.746f, 0.746f, 0.0f, false, false, -0.094f, -0.547f)
                arcToRelative(0.69f, 0.69f, 0.0f, false, false, -0.445f, -0.32f)
                arcToRelative(0.714f, 0.714f, 0.0f, false, false, -0.867f, 0.539f)
                curveToRelative(-0.22f, 0.93f, -1.299f, 1.9f, -2.934f, 1.94f)
                curveToRelative(-1.572f, 0.046f, -2.738f, -0.986f, -2.926f, -1.956f)
                arcToRelative(0.72f, 0.72f, 0.0f, false, false, -0.718f, -0.586f)
                close()
            }
        }
        .build()
        return _waze!!
    }

private var _waze: VectorAsset? = null
