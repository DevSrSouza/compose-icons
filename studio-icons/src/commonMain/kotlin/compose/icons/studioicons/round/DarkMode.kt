package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.DarkMode: ImageVector
    get() {
        if (_darkMode != null) {
            return _darkMode!!
        }
        _darkMode = Builder(name = "DarkMode", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.01f, 3.05f)
                curveTo(6.51f, 3.54f, 3.0f, 7.36f, 3.0f, 12.0f)
                curveToRelative(0.0f, 4.97f, 4.03f, 9.0f, 9.0f, 9.0f)
                curveToRelative(4.63f, 0.0f, 8.45f, -3.5f, 8.95f, -8.0f)
                curveToRelative(0.09f, -0.79f, -0.78f, -1.42f, -1.54f, -0.95f)
                curveToRelative(-0.84f, 0.54f, -1.84f, 0.85f, -2.91f, 0.85f)
                curveToRelative(-2.98f, 0.0f, -5.4f, -2.42f, -5.4f, -5.4f)
                curveToRelative(0.0f, -1.06f, 0.31f, -2.06f, 0.84f, -2.89f)
                curveTo(12.39f, 3.94f, 11.9f, 2.98f, 11.01f, 3.05f)
                close()
            }
        }
        .build()
        return _darkMode!!
    }

private var _darkMode: ImageVector? = null
