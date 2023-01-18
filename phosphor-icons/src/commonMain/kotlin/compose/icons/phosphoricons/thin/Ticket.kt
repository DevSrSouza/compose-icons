package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.Ticket: ImageVector
    get() {
        if (_ticket != null) {
            return _ticket!!
        }
        _ticket = Builder(name = "Ticket", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(226.4f, 100.6f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 236.0f, 88.8f)
                lineTo(236.0f, 64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(32.0f, 52.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 20.0f, 64.0f)
                lineTo(20.0f, 88.8f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 9.6f, 11.8f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 0.0f, 54.8f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 20.0f, 167.2f)
                lineTo(20.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(224.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(236.0f, 167.2f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, -9.6f, -11.8f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 0.0f, -54.8f)
                close()
                moveTo(28.0f, 192.0f)
                lineTo(28.0f, 167.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.2f, -3.9f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 0.0f, -70.6f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 28.0f, 88.8f)
                lineTo(28.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(92.0f, 60.0f)
                lineTo(92.0f, 196.0f)
                lineTo(32.0f, 196.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 28.0f, 192.0f)
                close()
                moveTo(196.0f, 128.0f)
                arcToRelative(36.1f, 36.1f, 0.0f, false, false, 28.8f, 35.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.2f, 3.9f)
                lineTo(228.0f, 192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(100.0f, 196.0f)
                lineTo(100.0f, 60.0f)
                lineTo(224.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                lineTo(228.0f, 88.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.2f, 3.9f)
                arcTo(36.1f, 36.1f, 0.0f, false, false, 196.0f, 128.0f)
                close()
            }
        }
        .build()
        return _ticket!!
    }

private var _ticket: ImageVector? = null
