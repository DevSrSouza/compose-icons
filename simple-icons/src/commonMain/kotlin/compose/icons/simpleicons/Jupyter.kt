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

public val SimpleIcons.Jupyter: ImageVector
    get() {
        if (_jupyter != null) {
            return _jupyter!!
        }
        _jupyter = Builder(name = "Jupyter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.157f, 22.201f)
                arcTo(1.784f, 1.799f, 0.0f, false, true, 5.374f, 24.0f)
                arcToRelative(1.784f, 1.799f, 0.0f, false, true, -1.784f, -1.799f)
                arcToRelative(1.784f, 1.799f, 0.0f, false, true, 1.784f, -1.799f)
                arcToRelative(1.784f, 1.799f, 0.0f, false, true, 1.783f, 1.799f)
                close()
                moveTo(20.582f, 1.427f)
                arcToRelative(1.415f, 1.427f, 0.0f, false, true, -1.415f, 1.428f)
                arcToRelative(1.415f, 1.427f, 0.0f, false, true, -1.416f, -1.428f)
                arcTo(1.415f, 1.427f, 0.0f, false, true, 19.167f, 0.0f)
                arcToRelative(1.415f, 1.427f, 0.0f, false, true, 1.415f, 1.427f)
                close()
                moveTo(4.992f, 3.336f)
                arcTo(1.047f, 1.056f, 0.0f, false, true, 3.946f, 4.39f)
                arcToRelative(1.047f, 1.056f, 0.0f, false, true, -1.047f, -1.055f)
                arcTo(1.047f, 1.056f, 0.0f, false, true, 3.946f, 2.28f)
                arcToRelative(1.047f, 1.056f, 0.0f, false, true, 1.046f, 1.056f)
                close()
                moveTo(12.328f, 4.853f)
                curveToRelative(3.769f, 0.0f, 7.06f, 1.38f, 8.768f, 3.424f)
                arcToRelative(9.363f, 9.363f, 0.0f, false, false, -3.393f, -4.547f)
                arcToRelative(9.238f, 9.238f, 0.0f, false, false, -5.377f, -1.728f)
                arcTo(9.238f, 9.238f, 0.0f, false, false, 6.95f, 3.73f)
                arcToRelative(9.363f, 9.363f, 0.0f, false, false, -3.394f, 4.547f)
                curveToRelative(1.713f, -2.04f, 5.004f, -3.424f, 8.772f, -3.424f)
                close()
                moveTo(12.329f, 18.148f)
                curveToRelative(-3.768f, 0.0f, -7.06f, -1.381f, -8.768f, -3.425f)
                arcToRelative(9.363f, 9.363f, 0.0f, false, false, 3.394f, 4.547f)
                arcTo(9.238f, 9.238f, 0.0f, false, false, 12.33f, 21.0f)
                arcToRelative(9.238f, 9.238f, 0.0f, false, false, 5.377f, -1.729f)
                arcToRelative(9.363f, 9.363f, 0.0f, false, false, 3.393f, -4.547f)
                curveToRelative(-1.712f, 2.044f, -5.003f, 3.425f, -8.772f, 3.425f)
                close()
            }
        }
        .build()
        return _jupyter!!
    }

private var _jupyter: ImageVector? = null
