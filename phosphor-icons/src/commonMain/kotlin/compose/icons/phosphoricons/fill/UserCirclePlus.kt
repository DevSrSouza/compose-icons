package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.UserCirclePlus: ImageVector
    get() {
        if (_userCirclePlus != null) {
            return _userCirclePlus!!
        }
        _userCirclePlus = Builder(name = "UserCirclePlus", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 76.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, true, -44.0f, 44.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, true, 128.0f, 76.0f)
                close()
                moveTo(176.0f, 64.0f)
                horizontalLineToRelative(16.0f)
                lineTo(192.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(208.0f, 64.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(208.0f, 48.0f)
                lineTo(208.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(192.0f, 48.0f)
                lineTo(176.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                close()
                moveTo(221.6f, 105.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -6.7f, 9.1f)
                arcTo(92.0f, 92.0f, 0.0f, false, true, 216.0f, 128.0f)
                arcToRelative(87.6f, 87.6f, 0.0f, false, true, -22.2f, 58.4f)
                arcToRelative(81.3f, 81.3f, 0.0f, false, false, -24.5f, -23.0f)
                arcToRelative(59.7f, 59.7f, 0.0f, false, true, -82.6f, 0.0f)
                arcToRelative(81.3f, 81.3f, 0.0f, false, false, -24.5f, 23.0f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 128.0f, 40.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, true, 13.9f, 1.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.5f, -15.8f)
                arcTo(99.8f, 99.8f, 0.0f, false, false, 128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 57.8f, 204.7f)
                lineToRelative(1.3f, 1.2f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, false, 137.8f, 0.0f)
                lineToRelative(1.3f, -1.2f)
                arcTo(103.7f, 103.7f, 0.0f, false, false, 232.0f, 128.0f)
                arcToRelative(99.8f, 99.8f, 0.0f, false, false, -1.3f, -16.4f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 221.6f, 105.0f)
                close()
            }
        }
        .build()
        return _userCirclePlus!!
    }

private var _userCirclePlus: ImageVector? = null
