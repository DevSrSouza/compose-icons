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

public val SimpleIcons.Cookiecutter: ImageVector
    get() {
        if (_cookiecutter != null) {
            return _cookiecutter!!
        }
        _cookiecutter = Builder(name = "Cookiecutter", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.806f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -4.512f, 0.885f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 0.858f, 12.978f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 9.303f, 10.724f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 13.021f, -5.656f)
                lineTo(12.817f, 12.0f)
                lineToRelative(9.244f, -7.65f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.806f, 0.0f)
                close()
                moveTo(9.218f, 2.143f)
                curveToRelative(0.34f, -0.003f, 0.701f, 0.123f, 1.193f, 0.378f)
                curveToRelative(0.847f, 0.437f, 1.013f, 1.027f, 0.36f, 1.277f)
                curveToRelative(-0.487f, 0.187f, -2.457f, 0.177f, -2.932f, -0.015f)
                curveToRelative(-0.526f, -0.212f, -0.38f, -0.781f, 0.32f, -1.24f)
                curveToRelative(0.402f, -0.263f, 0.72f, -0.396f, 1.059f, -0.4f)
                close()
                moveTo(13.295f, 6.195f)
                arcToRelative(1.292f, 1.292f, 0.0f, false, true, 0.022f, 0.0f)
                arcToRelative(1.292f, 1.292f, 0.0f, false, true, 1.292f, 1.291f)
                arcToRelative(1.292f, 1.292f, 0.0f, false, true, -1.292f, 1.292f)
                arcToRelative(1.292f, 1.292f, 0.0f, false, true, -1.292f, -1.292f)
                arcToRelative(1.292f, 1.292f, 0.0f, false, true, 1.27f, -1.291f)
                close()
                moveTo(7.036f, 9.995f)
                curveToRelative(1.033f, 0.0f, 1.788f, 0.434f, 1.788f, 1.028f)
                curveToRelative(0.0f, 0.694f, -1.961f, 2.384f, -2.766f, 2.384f)
                curveToRelative(-0.365f, 0.0f, -0.727f, -0.166f, -0.804f, -0.368f)
                curveToRelative(-0.078f, -0.203f, 0.117f, -0.97f, 0.434f, -1.706f)
                curveToRelative(0.505f, -1.176f, 0.67f, -1.338f, 1.348f, -1.338f)
                close()
                moveTo(15.673f, 19.182f)
                curveToRelative(0.372f, 0.0f, 1.362f, 2.316f, 1.186f, 2.775f)
                curveToRelative(-0.201f, 0.524f, -1.046f, 0.467f, -1.564f, -0.105f)
                curveToRelative(-0.676f, -0.747f, -0.404f, -2.67f, 0.378f, -2.67f)
                close()
            }
        }
        .build()
        return _cookiecutter!!
    }

private var _cookiecutter: ImageVector? = null
