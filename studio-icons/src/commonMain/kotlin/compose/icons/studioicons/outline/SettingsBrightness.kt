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

public val OutlineGroup.SettingsBrightness: ImageVector
    get() {
        if (_settingsBrightness != null) {
            return _settingsBrightness!!
        }
        _settingsBrightness = Builder(name = "SettingsBrightness", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                lineTo(3.0f, 3.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(23.0f, 5.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(21.0f, 19.01f)
                lineTo(3.0f, 19.01f)
                lineTo(3.0f, 4.99f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(14.02f)
                close()
                moveTo(8.0f, 16.0f)
                horizontalLineToRelative(2.5f)
                lineToRelative(1.5f, 1.5f)
                lineToRelative(1.5f, -1.5f)
                lineTo(16.0f, 16.0f)
                verticalLineToRelative(-2.5f)
                lineToRelative(1.5f, -1.5f)
                lineToRelative(-1.5f, -1.5f)
                lineTo(16.0f, 8.0f)
                horizontalLineToRelative(-2.5f)
                lineTo(12.0f, 6.5f)
                lineTo(10.5f, 8.0f)
                lineTo(8.0f, 8.0f)
                verticalLineToRelative(2.5f)
                lineTo(6.5f, 12.0f)
                lineTo(8.0f, 13.5f)
                lineTo(8.0f, 16.0f)
                close()
                moveTo(12.0f, 9.0f)
                curveToRelative(1.66f, 0.0f, 3.0f, 1.34f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.34f, 3.0f, -3.0f, 3.0f)
                lineTo(12.0f, 9.0f)
                close()
            }
        }
        .build()
        return _settingsBrightness!!
    }

private var _settingsBrightness: ImageVector? = null
