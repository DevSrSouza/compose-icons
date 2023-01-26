package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.SettingsBluetooth: ImageVector
    get() {
        if (_settingsBluetooth != null) {
            return _settingsBluetooth!!
        }
        _settingsBluetooth = Builder(name = "SettingsBluetooth", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 23.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 23.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 23.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.41f, 10.0f)
                lineTo(17.0f, 6.42f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.42f)
                lineToRelative(-4.79f, -4.79f)
                curveTo(12.07f, 0.07f, 11.89f, 0.0f, 11.71f, 0.0f)
                curveTo(11.32f, 0.0f, 11.0f, 0.32f, 11.0f, 0.71f)
                verticalLineToRelative(6.88f)
                lineTo(7.11f, 3.71f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineTo(10.59f, 10.0f)
                lineToRelative(-4.89f, 4.89f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                lineTo(11.0f, 12.41f)
                verticalLineToRelative(6.88f)
                curveToRelative(0.0f, 0.39f, 0.32f, 0.71f, 0.71f, 0.71f)
                curveToRelative(0.19f, 0.0f, 0.37f, -0.07f, 0.5f, -0.21f)
                lineTo(17.0f, 15.0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.42f)
                lineTo(13.41f, 10.0f)
                close()
                moveTo(13.0f, 3.83f)
                lineToRelative(1.88f, 1.88f)
                lineTo(13.0f, 7.59f)
                verticalLineTo(3.83f)
                close()
                moveTo(13.0f, 16.17f)
                verticalLineToRelative(-3.76f)
                lineToRelative(1.88f, 1.88f)
                lineTo(13.0f, 16.17f)
                close()
            }
        }
        .build()
        return _settingsBluetooth!!
    }

private var _settingsBluetooth: ImageVector? = null
