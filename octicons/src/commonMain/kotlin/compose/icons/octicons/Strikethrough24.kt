package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
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
                    pathFillType = EvenOdd) {
                moveTo(12.36f, 5.0f)
                curveTo(9.37f, 5.0f, 8.105f, 6.613f, 8.105f, 7.848f)
                curveToRelative(0.0f, 0.411f, 0.072f, 0.744f, 0.193f, 1.02f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.373f, 0.603f)
                arcToRelative(3.993f, 3.993f, 0.0f, false, true, -0.32f, -1.623f)
                curveToRelative(0.0f, -2.363f, 2.271f, -4.348f, 5.755f, -4.348f)
                curveToRelative(1.931f, 0.0f, 3.722f, 0.794f, 4.814f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -0.814f, 1.26f)
                curveToRelative(-0.94f, -0.607f, -2.448f, -1.26f, -4.0f, -1.26f)
                close()
                moveTo(16.533f, 12.5f)
                horizontalLineToRelative(3.717f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(3.75f, 11.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(9.136f)
                curveToRelative(1.162f, 0.28f, 2.111f, 0.688f, 2.76f, 1.211f)
                curveToRelative(0.642f, 0.518f, 0.979f, 1.134f, 0.979f, 1.898f)
                arcToRelative(2.63f, 2.63f, 0.0f, false, true, -0.954f, 2.036f)
                curveToRelative(-0.703f, 0.601f, -1.934f, 1.105f, -3.999f, 1.105f)
                curveToRelative(-2.018f, 0.0f, -3.529f, -0.723f, -4.276f, -1.445f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.042f, 1.08f)
                curveToRelative(1.066f, 1.028f, 2.968f, 1.865f, 5.318f, 1.865f)
                curveToRelative(2.295f, 0.0f, 3.916f, -0.56f, 4.974f, -1.464f)
                arcToRelative(4.131f, 4.131f, 0.0f, false, false, 1.479f, -3.177f)
                curveToRelative(0.0f, -1.296f, -0.608f, -2.316f, -1.538f, -3.066f)
                arcToRelative(5.77f, 5.77f, 0.0f, false, false, -0.054f, -0.043f)
                close()
            }
        }
        .build()
        return _strikethrough24!!
    }

private var _strikethrough24: ImageVector? = null
