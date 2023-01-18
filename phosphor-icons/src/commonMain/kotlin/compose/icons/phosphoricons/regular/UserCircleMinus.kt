package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.UserCircleMinus: ImageVector
    get() {
        if (_userCircleMinus != null) {
            return _userCircleMinus!!
        }
        _userCircleMinus = Builder(name = "UserCircleMinus", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(176.0f, 64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 56.0f)
                close()
                moveTo(226.1f, 93.3f)
                arcToRelative(104.2f, 104.2f, 0.0f, false, true, -27.9f, 111.4f)
                lineToRelative(-1.3f, 1.2f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, true, -137.8f, 0.0f)
                lineToRelative(-1.3f, -1.2f)
                arcTo(104.0f, 104.0f, 0.0f, false, true, 128.0f, 24.0f)
                arcToRelative(99.8f, 99.8f, 0.0f, false, true, 16.4f, 1.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.5f, 15.8f)
                arcTo(92.0f, 92.0f, 0.0f, false, false, 128.0f, 40.0f)
                arcTo(88.0f, 88.0f, 0.0f, false, false, 62.2f, 186.4f)
                arcToRelative(79.2f, 79.2f, 0.0f, false, true, 36.1f, -28.7f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 59.4f, 0.0f)
                arcToRelative(79.2f, 79.2f, 0.0f, false, true, 36.1f, 28.7f)
                arcTo(88.0f, 88.0f, 0.0f, false, false, 211.0f, 98.7f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 4.9f, -10.2f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 226.1f, 93.3f)
                close()
                moveTo(128.0f, 152.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -32.0f, -32.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, false, 128.0f, 152.0f)
                close()
                moveTo(128.0f, 216.0f)
                arcToRelative(87.4f, 87.4f, 0.0f, false, false, 53.9f, -18.5f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, -107.8f, 0.0f)
                arcTo(87.4f, 87.4f, 0.0f, false, false, 128.0f, 216.0f)
                close()
            }
        }
        .build()
        return _userCircleMinus!!
    }

private var _userCircleMinus: ImageVector? = null
