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

public val FillGroup.Basketball: ImageVector
    get() {
        if (_basketball != null) {
            return _basketball!!
        }
        _basketball = Builder(name = "Basketball", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(63.6f, 46.4f)
                arcToRelative(104.3f, 104.3f, 0.0f, false, true, 52.0f, -21.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.4f, 4.0f)
                lineTo(120.0f, 120.0f)
                lineTo(95.7f, 120.0f)
                arcTo(104.1f, 104.1f, 0.0f, false, false, 63.4f, 52.4f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 63.6f, 46.4f)
                close()
                moveTo(46.0f, 64.1f)
                arcToRelative(104.8f, 104.8f, 0.0f, false, false, -21.3f, 51.4f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 4.0f, 4.5f)
                lineTo(79.6f, 120.0f)
                arcTo(88.0f, 88.0f, 0.0f, false, false, 51.9f, 63.6f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 46.0f, 64.1f)
                close()
                moveTo(192.4f, 46.4f)
                arcToRelative(104.3f, 104.3f, 0.0f, false, false, -52.0f, -21.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.4f, 4.0f)
                lineTo(136.0f, 120.0f)
                horizontalLineToRelative(24.3f)
                arcToRelative(104.1f, 104.1f, 0.0f, false, true, 32.3f, -67.6f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 192.4f, 46.4f)
                close()
                moveTo(231.3f, 115.5f)
                arcTo(104.8f, 104.8f, 0.0f, false, false, 210.0f, 64.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.9f, -0.5f)
                arcTo(88.0f, 88.0f, 0.0f, false, false, 176.4f, 120.0f)
                horizontalLineToRelative(50.9f)
                arcTo(4.1f, 4.1f, 0.0f, false, false, 231.3f, 115.5f)
                close()
                moveTo(24.7f, 140.5f)
                arcTo(104.8f, 104.8f, 0.0f, false, false, 46.0f, 191.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.9f, 0.5f)
                arcTo(88.0f, 88.0f, 0.0f, false, false, 79.6f, 136.0f)
                lineTo(28.7f, 136.0f)
                arcTo(4.1f, 4.1f, 0.0f, false, false, 24.7f, 140.5f)
                close()
                moveTo(210.0f, 191.9f)
                arcToRelative(104.8f, 104.8f, 0.0f, false, false, 21.3f, -51.4f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -4.0f, -4.5f)
                lineTo(176.4f, 136.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, 27.7f, 56.4f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 210.0f, 191.9f)
                close()
                moveTo(63.6f, 209.6f)
                arcToRelative(104.3f, 104.3f, 0.0f, false, false, 52.0f, 21.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.4f, -4.0f)
                lineTo(120.0f, 136.0f)
                lineTo(95.7f, 136.0f)
                arcToRelative(104.1f, 104.1f, 0.0f, false, true, -32.3f, 67.6f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 63.6f, 209.6f)
                close()
                moveTo(160.3f, 136.0f)
                lineTo(136.0f, 136.0f)
                verticalLineToRelative(91.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.4f, 4.0f)
                arcToRelative(104.3f, 104.3f, 0.0f, false, false, 52.0f, -21.7f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.2f, -6.0f)
                arcTo(104.1f, 104.1f, 0.0f, false, true, 160.3f, 136.0f)
                close()
            }
        }
        .build()
        return _basketball!!
    }

private var _basketball: ImageVector? = null
