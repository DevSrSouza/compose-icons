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

public val RemixIcons.SettingsLine: ImageVector
    get() {
        if (_settingsLine != null) {
            return _settingsLine!!
        }
        _settingsLine = Builder(name = "SettingsLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                lineToRelative(9.5f, 5.5f)
                verticalLineToRelative(11.0f)
                lineTo(12.0f, 23.0f)
                lineToRelative(-9.5f, -5.5f)
                verticalLineToRelative(-11.0f)
                lineTo(12.0f, 1.0f)
                close()
                moveTo(12.0f, 3.311f)
                lineTo(4.5f, 7.653f)
                verticalLineToRelative(8.694f)
                lineToRelative(7.5f, 4.342f)
                lineToRelative(7.5f, -4.342f)
                lineTo(19.5f, 7.653f)
                lineTo(12.0f, 3.311f)
                close()
                moveTo(12.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 0.0f, -8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                close()
                moveTo(12.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                close()
            }
        }
        .build()
        return _settingsLine!!
    }

private var _settingsLine: ImageVector? = null
