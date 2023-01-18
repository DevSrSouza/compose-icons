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

public val RegularGroup.Train: ImageVector
    get() {
        if (_train != null) {
            return _train!!
        }
        _train = Builder(name = "Train", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.0f, 24.0f)
                lineTo(68.0f, 24.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, false, 36.0f, 56.0f)
                lineTo(36.0f, 184.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, false, 32.0f, 32.0f)
                lineTo(80.0f, 216.0f)
                lineTo(65.6f, 235.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.6f, 11.2f)
                arcTo(7.7f, 7.7f, 0.0f, false, false, 72.0f, 248.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.4f, -3.2f)
                lineTo(100.0f, 216.0f)
                horizontalLineToRelative(56.0f)
                lineToRelative(21.6f, 28.8f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 184.0f, 248.0f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, false, 4.8f, -1.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.6f, -11.2f)
                lineTo(176.0f, 216.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, false, 32.0f, -32.0f)
                lineTo(220.0f, 56.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, false, 188.0f, 24.0f)
                close()
                moveTo(52.0f, 120.0f)
                lineTo(52.0f, 80.0f)
                horizontalLineToRelative(68.0f)
                verticalLineToRelative(40.0f)
                close()
                moveTo(136.0f, 80.0f)
                horizontalLineToRelative(68.0f)
                verticalLineToRelative(40.0f)
                lineTo(136.0f, 120.0f)
                close()
                moveTo(68.0f, 40.0f)
                lineTo(188.0f, 40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                verticalLineToRelative(8.0f)
                lineTo(52.0f, 64.0f)
                lineTo(52.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 68.0f, 40.0f)
                close()
                moveTo(188.0f, 200.0f)
                lineTo(68.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(52.0f, 136.0f)
                lineTo(204.0f, 136.0f)
                verticalLineToRelative(48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 188.0f, 200.0f)
                close()
                moveTo(96.0f, 172.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 96.0f, 172.0f)
                close()
                moveTo(184.0f, 172.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 184.0f, 172.0f)
                close()
            }
        }
        .build()
        return _train!!
    }

private var _train: ImageVector? = null
