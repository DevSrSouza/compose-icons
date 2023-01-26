package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.SettingsOverscan: ImageVector
    get() {
        if (_settingsOverscan != null) {
            return _settingsOverscan!!
        }
        _settingsOverscan = Builder(name = "SettingsOverscan", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.01f, 5.5f)
                lineTo(10.0f, 8.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(-1.99f, -2.5f)
                close()
                moveTo(18.0f, 10.0f)
                verticalLineToRelative(4.0f)
                lineToRelative(2.5f, -1.99f)
                lineTo(18.0f, 10.0f)
                close()
                moveTo(6.0f, 10.0f)
                lineToRelative(-2.5f, 2.01f)
                lineTo(6.0f, 14.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(14.0f, 16.0f)
                horizontalLineToRelative(-4.0f)
                lineToRelative(2.01f, 2.5f)
                lineTo(14.0f, 16.0f)
                close()
                moveTo(23.0f, 3.0f)
                lineTo(1.0f, 3.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(22.0f)
                lineTo(23.0f, 3.0f)
                close()
                moveTo(21.0f, 19.01f)
                lineTo(3.0f, 19.01f)
                lineTo(3.0f, 4.99f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(14.02f)
                close()
            }
        }
        .build()
        return _settingsOverscan!!
    }

private var _settingsOverscan: ImageVector? = null
