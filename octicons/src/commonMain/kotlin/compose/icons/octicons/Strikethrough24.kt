package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Strikethrough24: ImageVector
    get() {
        if (_strikethrough24 != null) {
            return _strikethrough24!!
        }
        _strikethrough24 = Builder(name = "Strikethrough24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.533f, 12.5f)
                lineToRelative(0.054f, 0.043f)
                curveToRelative(0.93f, 0.75f, 1.538f, 1.77f, 1.538f, 3.066f)
                arcToRelative(4.13f, 4.13f, 0.0f, false, true, -1.479f, 3.177f)
                curveToRelative(-1.058f, 0.904f, -2.679f, 1.464f, -4.974f, 1.464f)
                curveToRelative(-2.35f, 0.0f, -4.252f, -0.837f, -5.318f, -1.865f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.042f, -1.08f)
                curveToRelative(0.747f, 0.722f, 2.258f, 1.445f, 4.276f, 1.445f)
                curveToRelative(2.065f, 0.0f, 3.296f, -0.504f, 3.999f, -1.105f)
                arcToRelative(2.63f, 2.63f, 0.0f, false, false, 0.954f, -2.036f)
                curveToRelative(0.0f, -0.764f, -0.337f, -1.38f, -0.979f, -1.898f)
                curveToRelative(-0.649f, -0.523f, -1.598f, -0.931f, -2.76f, -1.211f)
                horizontalLineTo(3.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(16.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                close()
                moveTo(12.36f, 5.0f)
                curveTo(9.37f, 5.0f, 8.105f, 6.613f, 8.105f, 7.848f)
                curveToRelative(0.0f, 0.411f, 0.072f, 0.744f, 0.193f, 1.02f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.373f, 0.603f)
                arcToRelative(3.988f, 3.988f, 0.0f, false, true, -0.32f, -1.623f)
                curveToRelative(0.0f, -2.363f, 2.271f, -4.348f, 5.755f, -4.348f)
                curveToRelative(1.931f, 0.0f, 3.722f, 0.794f, 4.814f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -0.814f, 1.26f)
                curveToRelative(-0.94f, -0.607f, -2.448f, -1.26f, -4.0f, -1.26f)
                close()
            }
        }
        .build()
        return _strikethrough24!!
    }

private var _strikethrough24: ImageVector? = null
