package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.LockKeyOpen: ImageVector
    get() {
        if (_lockKeyOpen != null) {
            return _lockKeyOpen!!
        }
        _lockKeyOpen = Builder(name = "LockKeyOpen", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(116.0f, 173.7f)
                lineTo(116.0f, 180.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineToRelative(-6.3f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -24.0f, 0.0f)
                close()
                moveTo(128.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 128.0f, 136.0f)
                close()
                moveTo(208.0f, 76.0f)
                lineTo(104.0f, 76.0f)
                lineTo(104.0f, 52.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 47.9f, -2.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 23.8f, -2.6f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 80.0f, 52.0f)
                lineTo(80.0f, 76.0f)
                lineTo(48.0f, 76.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 28.0f, 96.0f)
                lineTo(28.0f, 208.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(208.0f, 228.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(228.0f, 96.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 208.0f, 76.0f)
                close()
                moveTo(204.0f, 204.0f)
                lineTo(52.0f, 204.0f)
                lineTo(52.0f, 100.0f)
                lineTo(204.0f, 100.0f)
                close()
            }
        }
        .build()
        return _lockKeyOpen!!
    }

private var _lockKeyOpen: ImageVector? = null
