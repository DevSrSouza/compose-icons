package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.SettingsBluetooth: ImageVector
    get() {
        if (_settingsBluetooth != null) {
            return _settingsBluetooth!!
        }
        _settingsBluetooth = Builder(name = "SettingsBluetooth", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 24.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(7.0f, 24.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                lineTo(7.0f, 22.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(15.0f, 24.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(17.71f, 5.71f)
                lineTo(12.0f, 0.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(7.59f)
                lineTo(6.41f, 3.0f)
                lineTo(5.0f, 4.41f)
                lineTo(10.59f, 10.0f)
                lineTo(5.0f, 15.59f)
                lineTo(6.41f, 17.0f)
                lineTo(11.0f, 12.41f)
                lineTo(11.0f, 20.0f)
                horizontalLineToRelative(1.0f)
                lineToRelative(5.71f, -5.71f)
                lineToRelative(-4.3f, -4.29f)
                lineToRelative(4.3f, -4.29f)
                close()
                moveTo(13.0f, 3.83f)
                lineToRelative(1.88f, 1.88f)
                lineTo(13.0f, 7.59f)
                lineTo(13.0f, 3.83f)
                close()
                moveTo(14.88f, 14.29f)
                lineTo(13.0f, 16.17f)
                verticalLineToRelative(-3.76f)
                lineToRelative(1.88f, 1.88f)
                close()
            }
        }
        .build()
        return _settingsBluetooth!!
    }

private var _settingsBluetooth: ImageVector? = null
