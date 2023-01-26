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

public val RoundGroup.SettingsOverscan: ImageVector
    get() {
        if (_settingsOverscan != null) {
            return _settingsOverscan!!
        }
        _settingsOverscan = Builder(name = "SettingsOverscan", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.01f, 7.0f)
                lineTo(10.0f, 9.0f)
                horizontalLineToRelative(4.0f)
                lineTo(12.01f, 7.0f)
                close()
                moveTo(17.0f, 10.0f)
                verticalLineToRelative(4.0f)
                lineToRelative(2.0f, -1.99f)
                lineTo(17.0f, 10.0f)
                close()
                moveTo(7.0f, 10.0f)
                lineToRelative(-2.0f, 2.01f)
                lineTo(7.0f, 14.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(14.0f, 15.0f)
                horizontalLineToRelative(-4.0f)
                lineToRelative(2.01f, 2.0f)
                lineTo(14.0f, 15.0f)
                close()
                moveTo(20.0f, 4.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(6.0f)
                curveTo(22.0f, 4.9f, 21.1f, 4.0f, 20.0f, 4.0f)
                close()
                moveTo(20.0f, 18.01f)
                horizontalLineTo(4.0f)
                verticalLineTo(5.99f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(18.01f)
                close()
            }
        }
        .build()
        return _settingsOverscan!!
    }

private var _settingsOverscan: ImageVector? = null
