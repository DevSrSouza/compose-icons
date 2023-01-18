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

public val RegularGroup.RepeatOnce: ImageVector
    get() {
        if (_repeatOnce != null) {
            return _repeatOnce!!
        }
        _repeatOnce = Builder(name = "RepeatOnce", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 128.0f)
                arcTo(72.1f, 72.1f, 0.0f, false, true, 96.0f, 56.0f)
                lineTo(204.7f, 56.0f)
                lineTo(194.3f, 45.7f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.4f, -11.4f)
                lineToRelative(24.0f, 24.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 0.0f, 11.4f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -11.4f, 0.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 0.0f, -11.4f)
                lineTo(204.7f, 72.0f)
                lineTo(96.0f, 72.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, -56.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                close()
                moveTo(224.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, -56.0f, 56.0f)
                lineTo(51.3f, 184.0f)
                lineToRelative(10.4f, -10.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -11.4f, -11.4f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, 11.4f)
                lineToRelative(24.0f, 24.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 11.4f, 0.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, -11.4f)
                lineTo(51.3f, 200.0f)
                lineTo(160.0f, 200.0f)
                arcToRelative(72.1f, 72.1f, 0.0f, false, false, 72.0f, -72.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 224.0f, 120.0f)
                close()
                moveTo(132.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(140.0f, 104.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -3.8f, -6.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.8f, -0.4f)
                lineToRelative(-16.0f, 8.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, -3.6f, 10.8f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 10.8f, 3.5f)
                lineToRelative(4.4f, -2.2f)
                lineTo(124.0f, 152.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 132.0f, 160.0f)
                close()
            }
        }
        .build()
        return _repeatOnce!!
    }

private var _repeatOnce: ImageVector? = null
