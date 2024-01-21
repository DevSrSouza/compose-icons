package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Dailydotdev: ImageVector
    get() {
        if (_dailydotdev != null) {
            return _dailydotdev!!
        }
        _dailydotdev = Builder(name = "Dailydotdev", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.29f, 5.706f)
                arcToRelative(1.405f, 1.405f, 0.0f, false, false, -1.987f, 0.0f)
                lineTo(4.716f, 17.296f)
                lineToRelative(1.324f, -2.65f)
                lineToRelative(-2.65f, -2.649f)
                lineToRelative(3.312f, -3.311f)
                lineToRelative(2.65f, 2.65f)
                lineToRelative(1.986f, -1.988f)
                lineToRelative(-3.642f, -3.642f)
                arcToRelative(1.405f, 1.405f, 0.0f, false, false, -1.987f, 0.0f)
                lineTo(0.411f, 11.004f)
                arcToRelative(1.404f, 1.404f, 0.0f, false, false, 0.0f, 1.987f)
                lineToRelative(4.305f, 4.304f)
                lineToRelative(0.993f, 0.993f)
                arcToRelative(1.405f, 1.405f, 0.0f, false, false, 1.987f, 0.0f)
                lineTo(19.285f, 6.7f)
                lineToRelative(-0.993f, -0.994f)
                close()
                moveTo(17.958f, 9.353f)
                lineTo(20.608f, 12.003f)
                lineTo(16.302f, 16.308f)
                arcToRelative(1.404f, 1.404f, 0.0f, true, false, 1.986f, 1.986f)
                lineToRelative(5.299f, -5.298f)
                arcToRelative(1.404f, 1.404f, 0.0f, false, false, 0.0f, -1.987f)
                lineToRelative(-4.305f, -4.304f)
                lineToRelative(-1.324f, 2.648f)
                close()
            }
        }
        .build()
        return _dailydotdev!!
    }

private var _dailydotdev: ImageVector? = null
