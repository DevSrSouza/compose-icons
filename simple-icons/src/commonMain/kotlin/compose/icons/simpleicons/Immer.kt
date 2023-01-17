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

public val SimpleIcons.Immer: ImageVector
    get() {
        if (_immer != null) {
            return _immer!!
        }
        _immer = Builder(name = "Immer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.2706f, 14.3327f)
                curveTo(1.0174f, 14.3327f, 0.0f, 13.3149f, 0.0f, 12.0612f)
                reflectiveCurveToRelative(1.0174f, -2.2714f, 2.2706f, -2.2714f)
                reflectiveCurveToRelative(2.2706f, 1.0178f, 2.2706f, 2.2714f)
                reflectiveCurveToRelative(-1.0175f, 2.2715f, -2.2706f, 2.2715f)
                close()
                moveTo(21.73f, 15.1914f)
                arcToRelative(3.1215f, 3.1215f, 0.0f, false, true, -1.8217f, -0.5845f)
                curveToRelative(-0.7428f, 0.8369f, -1.0466f, 1.047f, -2.0669f, 1.047f)
                curveToRelative(-1.5417f, 0.0f, -3.1201f, -2.3208f, -4.5579f, -4.3146f)
                curveToRelative(1.4966f, -2.3358f, 2.8703f, -3.8786f, 4.3307f, -3.8786f)
                curveToRelative(1.1153f, 0.0f, 2.1849f, 0.4937f, 2.7865f, 1.7668f)
                arcToRelative(3.1155f, 3.1155f, 0.0f, false, true, 1.3291f, -0.2958f)
                arcToRelative(3.1051f, 3.1051f, 0.0f, false, true, 1.1697f, 0.2262f)
                curveToRelative(-0.88f, -2.5989f, -2.9964f, -3.9134f, -5.1127f, -3.9134f)
                curveToRelative(-2.3344f, 0.0f, -4.0593f, 2.16f, -5.5753f, 4.6292f)
                curveToRelative(-1.7833f, -2.4318f, -3.4838f, -4.6292f, -5.9239f, -4.6292f)
                curveToRelative(-2.0769f, 0.0f, -4.154f, 1.2863f, -5.0431f, 3.8295f)
                arcToRelative(3.1179f, 3.1179f, 0.0f, false, true, 0.9355f, -0.1423f)
                arcToRelative(3.113f, 3.113f, 0.0f, false, true, 1.7177f, 0.5139f)
                curveToRelative(0.546f, -0.7723f, 1.2454f, -1.2347f, 2.0074f, -1.2095f)
                curveToRelative(1.5368f, 0.0516f, 2.9282f, 1.8499f, 4.6866f, 4.3248f)
                curveToRelative(-1.2802f, 1.9587f, -2.9227f, 3.8683f, -4.3102f, 3.8683f)
                curveToRelative(-1.0566f, 0.0f, -2.0739f, -0.4443f, -2.6895f, -1.5742f)
                arcToRelative(3.1139f, 3.1139f, 0.0f, false, true, -1.412f, 0.3362f)
                curveToRelative(-0.371f, 0.0066f, -0.7336f, -0.0773f, -1.085f, -0.1857f)
                curveToRelative(0.9316f, 2.417f, 2.9722f, 3.6396f, 5.0129f, 3.6396f)
                curveToRelative(2.326f, 0.0f, 3.9314f, -2.0555f, 5.5251f, -4.6143f)
                curveToRelative(1.7485f, 2.4637f, 3.4992f, 4.7244f, 5.9921f, 4.7244f)
                curveToRelative(2.0245f, 0.0f, 4.2973f, -1.3328f, 5.2229f, -3.7499f)
                curveToRelative(-0.3583f, 0.0875f, -0.7236f, 0.1989f, -1.118f, 0.1861f)
                close()
                moveTo(21.7294f, 9.7898f)
                curveToRelative(-1.2531f, 0.0f, -2.2705f, 1.0178f, -2.2705f, 2.2714f)
                reflectiveCurveToRelative(1.0174f, 2.2715f, 2.2705f, 2.2715f)
                curveToRelative(1.2532f, 0.0f, 2.2706f, -1.0178f, 2.2706f, -2.2715f)
                reflectiveCurveToRelative(-1.0174f, -2.2714f, -2.2706f, -2.2714f)
                close()
            }
        }
        .build()
        return _immer!!
    }

private var _immer: ImageVector? = null
