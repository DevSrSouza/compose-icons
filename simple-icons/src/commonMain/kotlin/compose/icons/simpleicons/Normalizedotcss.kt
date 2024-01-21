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

public val SimpleIcons.Normalizedotcss: ImageVector
    get() {
        if (_normalizedotcss != null) {
            return _normalizedotcss!!
        }
        _normalizedotcss = Builder(name = "Normalizedotcss", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.427f, 6.361f)
                verticalLineToRelative(5.064f)
                lineToRelative(-5.381f, 0.705f)
                lineToRelative(7.058f, 0.924f)
                verticalLineToRelative(-1.915f)
                lineToRelative(5.469f, 6.5f)
                verticalLineToRelative(-5.064f)
                lineToRelative(5.382f, -0.705f)
                lineToRelative(-7.059f, -0.924f)
                verticalLineToRelative(1.914f)
                close()
                moveTo(12.0f, 0.0f)
                lineToRelative(12.0f, 12.0f)
                lineToRelative(-12.0f, 12.0f)
                lineTo(0.0f, 12.0f)
                close()
            }
        }
        .build()
        return _normalizedotcss!!
    }

private var _normalizedotcss: ImageVector? = null
