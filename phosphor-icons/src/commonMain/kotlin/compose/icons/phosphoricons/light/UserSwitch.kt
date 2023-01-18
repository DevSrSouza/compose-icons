package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.UserSwitch: ImageVector
    get() {
        if (_userSwitch != null) {
            return _userSwitch!!
        }
        _userSwitch = Builder(name = "UserSwitch", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(252.2f, 132.2f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, -8.4f, 0.0f)
                lineToRelative(-24.0f, -24.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 8.4f, -8.4f)
                lineTo(218.0f, 137.5f)
                lineTo(218.0f, 128.0f)
                arcTo(90.0f, 90.0f, 0.0f, false, false, 52.4f, 79.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.3f, 1.7f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -1.8f, -8.2f)
                arcTo(102.0f, 102.0f, 0.0f, false, true, 230.0f, 128.0f)
                verticalLineToRelative(9.5f)
                lineToRelative(13.8f, -13.7f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 8.4f, 8.4f)
                close()
                moveTo(213.7f, 183.3f)
                arcTo(102.0f, 102.0f, 0.0f, false, true, 26.0f, 128.0f)
                verticalLineToRelative(-9.5f)
                lineTo(12.2f, 132.2f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, -8.4f, 0.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, 0.0f, -8.4f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, 8.4f, 0.0f)
                lineToRelative(24.0f, 24.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, true, true, -8.4f, 8.4f)
                lineTo(38.0f, 118.5f)
                lineTo(38.0f, 128.0f)
                arcToRelative(89.5f, 89.5f, 0.0f, false, false, 24.5f, 61.6f)
                arcToRelative(77.7f, 77.7f, 0.0f, false, true, 40.0f, -31.3f)
                arcToRelative(46.0f, 46.0f, 0.0f, true, true, 51.0f, 0.0f)
                arcToRelative(77.0f, 77.0f, 0.0f, false, true, 40.0f, 31.4f)
                arcToRelative(85.9f, 85.9f, 0.0f, false, false, 10.1f, -12.9f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.3f, -1.7f)
                arcTo(5.9f, 5.9f, 0.0f, false, true, 213.7f, 183.3f)
                close()
                moveTo(128.0f, 154.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, false, -34.0f, -34.0f)
                arcTo(34.1f, 34.1f, 0.0f, false, false, 128.0f, 154.0f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(89.6f, 89.6f, 0.0f, false, false, 56.6f, -20.0f)
                arcToRelative(66.1f, 66.1f, 0.0f, false, false, -113.2f, 0.0f)
                arcTo(89.9f, 89.9f, 0.0f, false, false, 128.0f, 218.0f)
                close()
            }
        }
        .build()
        return _userSwitch!!
    }

private var _userSwitch: ImageVector? = null
