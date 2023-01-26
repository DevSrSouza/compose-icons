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

public val RoundGroup.SettingsBrightness: ImageVector
    get() {
        if (_settingsBrightness != null) {
            return _settingsBrightness!!
        }
        _settingsBrightness = Builder(name = "SettingsBrightness", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
                moveTo(17.15f, 12.35f)
                lineTo(16.0f, 13.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(-1.15f, 1.15f)
                curveToRelative(-0.2f, 0.2f, -0.51f, 0.2f, -0.71f, 0.0f)
                lineTo(10.5f, 16.0f)
                horizontalLineToRelative(-2.0f)
                curveTo(8.22f, 16.0f, 8.0f, 15.78f, 8.0f, 15.5f)
                verticalLineToRelative(-2.0f)
                lineToRelative(-1.15f, -1.15f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0.0f, -0.71f)
                lineTo(8.0f, 10.5f)
                verticalLineToRelative(-2.0f)
                curveTo(8.0f, 8.22f, 8.22f, 8.0f, 8.5f, 8.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(1.15f, -1.15f)
                curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0.0f)
                lineTo(13.5f, 8.0f)
                horizontalLineToRelative(2.0f)
                curveTo(15.78f, 8.0f, 16.0f, 8.22f, 16.0f, 8.5f)
                verticalLineToRelative(2.0f)
                lineToRelative(1.15f, 1.15f)
                curveTo(17.34f, 11.84f, 17.34f, 12.16f, 17.15f, 12.35f)
                close()
                moveTo(12.0f, 9.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f)
                curveTo(15.0f, 10.34f, 13.66f, 9.0f, 12.0f, 9.0f)
                close()
            }
        }
        .build()
        return _settingsBrightness!!
    }

private var _settingsBrightness: ImageVector? = null
