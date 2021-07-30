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

public val SimpleIcons.Swiper: ImageVector
    get() {
        if (_swiper != null) {
            return _swiper!!
        }
        _swiper = Builder(name = "Swiper", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.373f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.373f, 12.0f, -12.0f)
                reflectiveCurveTo(18.627f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(16.884f, 17.908f)
                arcToRelative(4.328f, 4.328f, 0.0f, false, true, -1.092f, 1.488f)
                arcToRelative(4.817f, 4.817f, 0.0f, false, true, -1.644f, 0.936f)
                curveToRelative(-0.632f, 0.216f, -1.308f, 0.324f, -2.028f, 0.324f)
                reflectiveCurveToRelative(-1.368f, -0.1f, -1.944f, -0.3f)
                curveToRelative(-0.576f, -0.2f, -1.088f, -0.464f, -1.536f, -0.792f)
                reflectiveCurveToRelative(-0.832f, -0.704f, -1.152f, -1.128f)
                arcToRelative(6.563f, 6.563f, 0.0f, false, true, -0.768f, -1.284f)
                lineToRelative(1.68f, -1.008f)
                curveToRelative(0.144f, 0.336f, 0.332f, 0.66f, 0.564f, 0.972f)
                curveToRelative(0.232f, 0.312f, 0.5f, 0.588f, 0.804f, 0.828f)
                arcToRelative(3.697f, 3.697f, 0.0f, false, false, 2.328f, 0.792f)
                curveToRelative(0.4f, 0.0f, 0.788f, -0.056f, 1.164f, -0.168f)
                curveToRelative(0.376f, -0.112f, 0.708f, -0.28f, 0.996f, -0.504f)
                curveToRelative(0.288f, -0.224f, 0.52f, -0.5f, 0.696f, -0.828f)
                curveToRelative(0.176f, -0.328f, 0.264f, -0.716f, 0.264f, -1.164f)
                curveToRelative(0.0f, -0.432f, -0.084f, -0.804f, -0.252f, -1.116f)
                arcToRelative(2.955f, 2.955f, 0.0f, false, false, -0.684f, -0.84f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -1.032f, -0.672f)
                curveToRelative(-0.4f, -0.2f, -0.832f, -0.412f, -1.296f, -0.636f)
                arcToRelative(44.725f, 44.725f, 0.0f, false, true, -1.644f, -0.816f)
                arcToRelative(7.592f, 7.592f, 0.0f, false, true, -1.488f, -1.008f)
                arcToRelative(4.752f, 4.752f, 0.0f, false, true, -1.068f, -1.332f)
                curveToRelative(-0.272f, -0.504f, -0.408f, -1.092f, -0.408f, -1.764f)
                curveToRelative(0.0f, -0.56f, 0.104f, -1.116f, 0.312f, -1.668f)
                arcToRelative(4.474f, 4.474f, 0.0f, false, true, 0.912f, -1.476f)
                curveToRelative(0.4f, -0.432f, 0.9f, -0.784f, 1.5f, -1.056f)
                reflectiveCurveToRelative(1.3f, -0.408f, 2.1f, -0.408f)
                curveToRelative(0.592f, 0.0f, 1.14f, 0.076f, 1.644f, 0.228f)
                arcToRelative(5.98f, 5.98f, 0.0f, false, true, 2.412f, 1.38f)
                curveToRelative(0.304f, 0.288f, 0.552f, 0.568f, 0.744f, 0.84f)
                lineToRelative(-1.512f, 1.224f)
                arcToRelative(4.172f, 4.172f, 0.0f, false, false, -1.284f, -1.188f)
                arcToRelative(4.204f, 4.204f, 0.0f, false, false, -0.924f, -0.408f)
                arcToRelative(3.634f, 3.634f, 0.0f, false, false, -1.08f, -0.156f)
                curveToRelative(-0.464f, 0.0f, -0.868f, 0.072f, -1.212f, 0.216f)
                arcToRelative(2.692f, 2.692f, 0.0f, false, false, -0.876f, 0.576f)
                curveToRelative(-0.24f, 0.24f, -0.42f, 0.516f, -0.54f, 0.828f)
                curveToRelative(-0.12f, 0.312f, -0.18f, 0.628f, -0.18f, 0.948f)
                curveToRelative(0.0f, 0.4f, 0.088f, 0.748f, 0.264f, 1.044f)
                curveToRelative(0.176f, 0.296f, 0.424f, 0.572f, 0.744f, 0.828f)
                reflectiveCurveToRelative(0.712f, 0.504f, 1.176f, 0.744f)
                curveToRelative(0.464f, 0.24f, 0.984f, 0.488f, 1.56f, 0.744f)
                curveToRelative(0.64f, 0.288f, 1.22f, 0.588f, 1.74f, 0.9f)
                curveToRelative(0.52f, 0.312f, 0.96f, 0.652f, 1.32f, 1.02f)
                curveToRelative(0.36f, 0.368f, 0.636f, 0.784f, 0.828f, 1.248f)
                curveToRelative(0.192f, 0.464f, 0.288f, 1.008f, 0.288f, 1.632f)
                curveToRelative(0.0f, 0.736f, -0.132f, 1.396f, -0.396f, 1.98f)
                close()
            }
        }
        .build()
        return _swiper!!
    }

private var _swiper: ImageVector? = null
