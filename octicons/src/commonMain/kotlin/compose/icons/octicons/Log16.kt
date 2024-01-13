package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Log16: ImageVector
    get() {
        if (_log16 != null) {
            return _log16!!
        }
        _log16 = Builder(name = "Log16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 8.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-4.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 5.0f, 8.25f)
                close()
                moveTo(4.0f, 10.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 4.0f, 12.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineTo(4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, -0.005f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.328f, 3.0f, 3.0f)
                curveToRelative(0.0f, 0.982f, -0.338f, 1.933f, -0.783f, 2.818f)
                curveToRelative(-0.443f, 0.879f, -1.028f, 1.758f, -1.582f, 2.588f)
                lineToRelative(-0.011f, 0.017f)
                curveToRelative(-0.568f, 0.853f, -1.104f, 1.659f, -1.501f, 2.446f)
                curveToRelative(-0.398f, 0.789f, -0.623f, 1.494f, -0.623f, 2.136f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 2.333f, -1.248f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.834f, -1.246f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 13.0f, 16.0f)
                lineTo(3.0f, 16.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                curveToRelative(0.0f, -1.582f, 0.891f, -3.135f, 1.777f, -4.506f)
                curveToRelative(0.209f, -0.322f, 0.418f, -0.637f, 0.623f, -0.946f)
                curveToRelative(0.473f, -0.709f, 0.923f, -1.386f, 1.287f, -2.048f)
                lineTo(2.51f, 5.5f)
                curveToRelative(-0.576f, 0.0f, -1.381f, -0.133f, -1.907f, -0.783f)
                arcTo(2.68f, 2.68f, 0.0f, false, true, 0.0f, 2.995f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                close()
                moveTo(13.0f, 1.495f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, 1.5f)
                curveToRelative(0.0f, 0.476f, 0.223f, 0.834f, 0.667f, 1.132f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 11.75f, 5.5f)
                lineTo(5.368f, 5.5f)
                curveToRelative(-0.467f, 1.003f, -1.141f, 2.015f, -1.773f, 2.963f)
                curveToRelative(-0.192f, 0.289f, -0.381f, 0.571f, -0.558f, 0.845f)
                curveTo(2.13f, 10.711f, 1.5f, 11.916f, 1.5f, 13.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 3.0f, 14.5f)
                horizontalLineToRelative(7.401f)
                arcTo(2.989f, 2.989f, 0.0f, false, true, 10.0f, 13.0f)
                curveToRelative(0.0f, -0.979f, 0.338f, -1.928f, 0.784f, -2.812f)
                curveToRelative(0.441f, -0.874f, 1.023f, -1.748f, 1.575f, -2.576f)
                lineToRelative(0.017f, -0.026f)
                curveToRelative(0.568f, -0.853f, 1.103f, -1.658f, 1.501f, -2.448f)
                curveToRelative(0.398f, -0.79f, 0.623f, -1.497f, 0.623f, -2.143f)
                curveToRelative(0.0f, -0.838f, -0.669f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(3.0f, 1.495f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, 1.5f)
                curveToRelative(0.0f, 0.321f, 0.1f, 0.569f, 0.27f, 0.778f)
                curveToRelative(0.097f, 0.12f, 0.325f, 0.227f, 0.74f, 0.227f)
                horizontalLineToRelative(7.674f)
                arcTo(2.737f, 2.737f, 0.0f, false, true, 10.0f, 2.995f)
                curveToRelative(0.0f, -0.546f, 0.146f, -1.059f, 0.401f, -1.5f)
                close()
            }
        }
        .build()
        return _log16!!
    }

private var _log16: ImageVector? = null
