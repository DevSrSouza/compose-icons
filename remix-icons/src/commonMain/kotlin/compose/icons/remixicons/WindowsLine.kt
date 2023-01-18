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

public val RemixIcons.WindowsLine: ImageVector
    get() {
        if (_windowsLine != null) {
            return _windowsLine!!
        }
        _windowsLine = Builder(name = "WindowsLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 2.5f)
                verticalLineToRelative(19.0f)
                lineToRelative(-18.0f, -2.0f)
                verticalLineToRelative(-15.0f)
                lineToRelative(18.0f, -2.0f)
                close()
                moveTo(19.0f, 12.999f)
                lineTo(12.0f, 13.0f)
                verticalLineToRelative(5.487f)
                lineToRelative(7.0f, 0.778f)
                lineTo(19.0f, 13.0f)
                close()
                moveTo(5.0f, 17.709f)
                lineToRelative(5.0f, 0.556f)
                lineTo(10.0f, 13.0f)
                lineToRelative(-5.0f, -0.001f)
                verticalLineToRelative(4.71f)
                close()
                moveTo(19.0f, 11.0f)
                lineTo(19.0f, 4.735f)
                lineToRelative(-7.0f, 0.777f)
                lineTo(12.0f, 11.0f)
                lineToRelative(7.0f, -0.001f)
                close()
                moveTo(10.0f, 5.735f)
                lineTo(5.0f, 6.29f)
                lineTo(5.0f, 11.0f)
                lineTo(10.0f, 11.0f)
                lineTo(10.0f, 5.734f)
                close()
            }
        }
        .build()
        return _windowsLine!!
    }

private var _windowsLine: ImageVector? = null
