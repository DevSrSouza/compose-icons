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

public val FillGroup.Scroll: ImageVector
    get() {
        if (_scroll != null) {
            return _scroll!!
        }
        _scroll = Builder(name = "Scroll", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(223.8f, 170.7f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, -5.9f, -2.7f)
                lineTo(208.0f, 168.0f)
                lineTo(208.0f, 64.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, false, -32.0f, -32.0f)
                lineTo(40.0f, 32.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, false, 8.0f, 64.0f)
                arcToRelative(31.5f, 31.5f, 0.0f, false, false, 8.2f, 21.3f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 11.2f, 0.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.7f, -11.3f)
                arcTo(16.0f, 16.0f, 0.0f, true, true, 56.0f, 64.0f)
                lineTo(56.0f, 192.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, false, 32.0f, 32.0f)
                lineTo(200.0f, 224.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, false, 32.0f, -32.0f)
                arcTo(31.5f, 31.5f, 0.0f, false, false, 223.8f, 170.7f)
                close()
                moveTo(104.0f, 96.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(104.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                close()
                moveTo(96.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(104.0f, 144.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 96.0f, 136.0f)
                close()
                moveTo(200.0f, 208.0f)
                lineTo(115.7f, 208.0f)
                arcToRelative(32.2f, 32.2f, 0.0f, false, false, 4.3f, -16.0f)
                arcToRelative(30.8f, 30.8f, 0.0f, false, false, -1.0f, -8.0f)
                horizontalLineToRelative(94.9f)
                arcTo(16.1f, 16.1f, 0.0f, false, true, 200.0f, 208.0f)
                close()
            }
        }
        .build()
        return _scroll!!
    }

private var _scroll: ImageVector? = null
