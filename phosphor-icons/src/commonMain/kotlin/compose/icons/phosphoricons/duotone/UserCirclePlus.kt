package compose.icons.phosphoricons.duotone

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
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.UserCirclePlus: ImageVector
    get() {
        if (_userCirclePlus != null) {
            return _userCirclePlus!!
        }
        _userCirclePlus = Builder(name = "UserCirclePlus", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 32.0f)
                arcTo(96.0f, 96.0f, 0.0f, false, false, 63.8f, 199.4f)
                horizontalLineToRelative(0.0f)
                arcTo(72.0f, 72.0f, 0.0f, false, true, 128.0f, 160.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 40.0f, -40.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -40.0f, 40.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, true, 64.2f, 39.4f)
                arcTo(96.0f, 96.0f, 0.0f, false, false, 128.0f, 32.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(16.0f)
                lineTo(192.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                lineTo(208.0f, 48.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(208.0f, 64.0f)
                lineTo(208.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(192.0f, 64.0f)
                lineTo(176.0f, 64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 56.0f)
                close()
                moveTo(230.7f, 111.6f)
                arcTo(99.8f, 99.8f, 0.0f, false, true, 232.0f, 128.0f)
                arcToRelative(103.7f, 103.7f, 0.0f, false, true, -33.8f, 76.7f)
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
                arcTo(87.6f, 87.6f, 0.0f, false, false, 216.0f, 128.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, false, -1.1f, -13.9f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.8f, -2.5f)
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
        return _userCirclePlus!!
    }

private var _userCirclePlus: ImageVector? = null
