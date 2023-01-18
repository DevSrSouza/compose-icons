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

public val LightGroup.UserCirclePlus: ImageVector
    get() {
        if (_userCirclePlus != null) {
            return _userCirclePlus!!
        }
        _userCirclePlus = Builder(name = "UserCirclePlus", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(170.0f, 56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(18.0f)
                lineTo(194.0f, 32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                lineTo(206.0f, 50.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(206.0f, 62.0f)
                lineTo(206.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(194.0f, 62.0f)
                lineTo(176.0f, 62.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 170.0f, 56.0f)
                close()
                moveTo(228.7f, 111.9f)
                arcTo(96.3f, 96.3f, 0.0f, false, true, 230.0f, 128.0f)
                arcToRelative(101.8f, 101.8f, 0.0f, false, true, -33.2f, 75.3f)
                lineToRelative(-1.2f, 1.0f)
                arcToRelative(101.8f, 101.8f, 0.0f, false, true, -135.2f, 0.0f)
                lineToRelative(-1.2f, -1.0f)
                arcTo(102.0f, 102.0f, 0.0f, false, true, 128.0f, 26.0f)
                arcToRelative(96.3f, 96.3f, 0.0f, false, true, 16.1f, 1.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -1.9f, 11.8f)
                arcTo(96.0f, 96.0f, 0.0f, false, false, 128.0f, 38.0f)
                arcTo(89.9f, 89.9f, 0.0f, false, false, 62.5f, 189.6f)
                arcToRelative(77.7f, 77.7f, 0.0f, false, true, 40.0f, -31.3f)
                arcToRelative(46.0f, 46.0f, 0.0f, true, true, 51.0f, 0.0f)
                arcToRelative(77.7f, 77.7f, 0.0f, false, true, 40.0f, 31.3f)
                arcTo(89.5f, 89.5f, 0.0f, false, false, 218.0f, 128.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, false, -1.1f, -14.2f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, 5.0f, -6.9f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 228.7f, 111.9f)
                close()
                moveTo(128.0f, 154.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, false, -34.0f, -34.0f)
                arcTo(34.1f, 34.1f, 0.0f, false, false, 128.0f, 154.0f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(89.9f, 89.9f, 0.0f, false, false, 56.6f, -20.0f)
                arcToRelative(66.1f, 66.1f, 0.0f, false, false, -113.2f, 0.0f)
                arcTo(89.9f, 89.9f, 0.0f, false, false, 128.0f, 218.0f)
                close()
            }
        }
        .build()
        return _userCirclePlus!!
    }

private var _userCirclePlus: ImageVector? = null
