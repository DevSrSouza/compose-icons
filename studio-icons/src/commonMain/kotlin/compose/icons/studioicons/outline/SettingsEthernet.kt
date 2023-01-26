package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.SettingsEthernet: ImageVector
    get() {
        if (_settingsEthernet != null) {
            return _settingsEthernet!!
        }
        _settingsEthernet = Builder(name = "SettingsEthernet", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.77f, 6.76f)
                lineTo(6.23f, 5.48f)
                lineTo(0.82f, 12.0f)
                lineToRelative(5.41f, 6.52f)
                lineToRelative(1.54f, -1.28f)
                lineTo(3.42f, 12.0f)
                lineToRelative(4.35f, -5.24f)
                close()
                moveTo(7.0f, 13.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                lineTo(7.0f, 11.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(17.0f, 11.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(11.0f, 13.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(17.77f, 5.48f)
                lineToRelative(-1.54f, 1.28f)
                lineTo(20.58f, 12.0f)
                lineToRelative(-4.35f, 5.24f)
                lineToRelative(1.54f, 1.28f)
                lineTo(23.18f, 12.0f)
                lineToRelative(-5.41f, -6.52f)
                close()
            }
        }
        .build()
        return _settingsEthernet!!
    }

private var _settingsEthernet: ImageVector? = null
