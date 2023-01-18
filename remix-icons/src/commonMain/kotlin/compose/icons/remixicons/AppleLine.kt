package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.AppleLine: ImageVector
    get() {
        if (_appleLine != null) {
            return _appleLine!!
        }
        _appleLine = Builder(name = "AppleLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.729f, 8.208f)
                curveToRelative(-0.473f, -0.037f, -0.981f, 0.076f, -1.759f, 0.373f)
                curveToRelative(0.066f, -0.025f, -0.742f, 0.29f, -0.968f, 0.37f)
                curveToRelative(-0.502f, 0.175f, -0.915f, 0.271f, -1.378f, 0.271f)
                curveToRelative(-0.458f, 0.0f, -0.88f, -0.092f, -1.366f, -0.255f)
                curveToRelative(-0.155f, -0.053f, -0.311f, -0.11f, -0.505f, -0.186f)
                curveToRelative(-0.082f, -0.032f, -0.382f, -0.152f, -0.448f, -0.177f)
                curveToRelative(-0.648f, -0.254f, -1.013f, -0.35f, -1.316f, -0.342f)
                curveToRelative(-1.152f, 0.015f, -2.243f, 0.68f, -2.876f, 1.782f)
                curveToRelative(-1.292f, 2.244f, -0.577f, 6.299f, 1.312f, 9.031f)
                curveToRelative(1.006f, 1.444f, 1.556f, 1.96f, 1.778f, 1.953f)
                curveToRelative(0.222f, -0.01f, 0.385f, -0.057f, 0.783f, -0.225f)
                lineToRelative(0.167f, -0.071f)
                curveToRelative(1.005f, -0.429f, 1.71f, -0.618f, 2.771f, -0.618f)
                curveToRelative(1.021f, 0.0f, 1.703f, 0.186f, 2.668f, 0.602f)
                lineToRelative(0.168f, 0.072f)
                curveToRelative(0.398f, 0.17f, 0.542f, 0.208f, 0.792f, 0.202f)
                curveToRelative(0.358f, -0.005f, 0.799f, -0.417f, 1.778f, -1.854f)
                curveToRelative(0.268f, -0.391f, 0.505f, -0.803f, 0.71f, -1.22f)
                arcToRelative(7.354f, 7.354f, 0.0f, false, true, -0.392f, -0.347f)
                curveToRelative(-1.289f, -1.228f, -2.086f, -2.884f, -2.108f, -4.93f)
                arcToRelative(6.625f, 6.625f, 0.0f, false, true, 1.41f, -4.181f)
                arcToRelative(4.124f, 4.124f, 0.0f, false, false, -1.221f, -0.25f)
                close()
                moveTo(15.884f, 6.214f)
                curveToRelative(0.708f, 0.048f, 2.736f, 0.264f, 4.056f, 2.196f)
                curveToRelative(-0.108f, 0.06f, -2.424f, 1.404f, -2.4f, 4.212f)
                curveToRelative(0.036f, 3.36f, 2.94f, 4.476f, 2.976f, 4.488f)
                curveToRelative(-0.024f, 0.084f, -0.468f, 1.596f, -1.536f, 3.156f)
                curveToRelative(-0.924f, 1.356f, -1.884f, 2.7f, -3.396f, 2.724f)
                curveToRelative(-1.488f, 0.036f, -1.968f, -0.876f, -3.66f, -0.876f)
                curveToRelative(-1.704f, 0.0f, -2.232f, 0.852f, -3.636f, 0.912f)
                curveToRelative(-1.464f, 0.048f, -2.568f, -1.464f, -3.504f, -2.808f)
                curveToRelative(-1.908f, -2.76f, -3.36f, -7.776f, -1.404f, -11.172f)
                curveToRelative(0.972f, -1.692f, 2.7f, -2.76f, 4.584f, -2.784f)
                curveToRelative(1.428f, -0.036f, 2.784f, 0.96f, 3.66f, 0.96f)
                curveToRelative(0.864f, 0.0f, 2.412f, -1.152f, 4.26f, -1.008f)
                close()
                moveTo(14.744f, 4.39f)
                curveToRelative(-0.78f, 0.936f, -2.052f, 1.668f, -3.288f, 1.572f)
                curveToRelative(-0.168f, -1.272f, 0.456f, -2.604f, 1.176f, -3.432f)
                curveToRelative(0.804f, -0.936f, 2.148f, -1.632f, 3.264f, -1.68f)
                curveToRelative(0.144f, 1.296f, -0.372f, 2.604f, -1.152f, 3.54f)
                close()
            }
        }
        .build()
        return _appleLine!!
    }

private var _appleLine: ImageVector? = null
