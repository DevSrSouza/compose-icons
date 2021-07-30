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

public val SimpleIcons.Pinterest: ImageVector
    get() {
        if (_pinterest != null) {
            return _pinterest!!
        }
        _pinterest = Builder(name = "Pinterest", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.017f, 0.0f)
                curveTo(5.396f, 0.0f, 0.029f, 5.367f, 0.029f, 11.987f)
                curveToRelative(0.0f, 5.079f, 3.158f, 9.417f, 7.618f, 11.162f)
                curveToRelative(-0.105f, -0.949f, -0.199f, -2.403f, 0.041f, -3.439f)
                curveToRelative(0.219f, -0.937f, 1.406f, -5.957f, 1.406f, -5.957f)
                reflectiveCurveToRelative(-0.359f, -0.72f, -0.359f, -1.781f)
                curveToRelative(0.0f, -1.663f, 0.967f, -2.911f, 2.168f, -2.911f)
                curveToRelative(1.024f, 0.0f, 1.518f, 0.769f, 1.518f, 1.688f)
                curveToRelative(0.0f, 1.029f, -0.653f, 2.567f, -0.992f, 3.992f)
                curveToRelative(-0.285f, 1.193f, 0.6f, 2.165f, 1.775f, 2.165f)
                curveToRelative(2.128f, 0.0f, 3.768f, -2.245f, 3.768f, -5.487f)
                curveToRelative(0.0f, -2.861f, -2.063f, -4.869f, -5.008f, -4.869f)
                curveToRelative(-3.41f, 0.0f, -5.409f, 2.562f, -5.409f, 5.199f)
                curveToRelative(0.0f, 1.033f, 0.394f, 2.143f, 0.889f, 2.741f)
                curveToRelative(0.099f, 0.12f, 0.112f, 0.225f, 0.085f, 0.345f)
                curveToRelative(-0.09f, 0.375f, -0.293f, 1.199f, -0.334f, 1.363f)
                curveToRelative(-0.053f, 0.225f, -0.172f, 0.271f, -0.401f, 0.165f)
                curveToRelative(-1.495f, -0.69f, -2.433f, -2.878f, -2.433f, -4.646f)
                curveToRelative(0.0f, -3.776f, 2.748f, -7.252f, 7.92f, -7.252f)
                curveToRelative(4.158f, 0.0f, 7.392f, 2.967f, 7.392f, 6.923f)
                curveToRelative(0.0f, 4.135f, -2.607f, 7.462f, -6.233f, 7.462f)
                curveToRelative(-1.214f, 0.0f, -2.354f, -0.629f, -2.758f, -1.379f)
                lineToRelative(-0.749f, 2.848f)
                curveToRelative(-0.269f, 1.045f, -1.004f, 2.352f, -1.498f, 3.146f)
                curveToRelative(1.123f, 0.345f, 2.306f, 0.535f, 3.55f, 0.535f)
                curveToRelative(6.607f, 0.0f, 11.985f, -5.365f, 11.985f, -11.987f)
                curveTo(23.97f, 5.39f, 18.592f, 0.026f, 11.985f, 0.026f)
                lineTo(12.017f, 0.0f)
                close()
            }
        }
        .build()
        return _pinterest!!
    }

private var _pinterest: ImageVector? = null
