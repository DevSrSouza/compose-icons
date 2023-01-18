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

public val RegularGroup.Intersect: ImageVector
    get() {
        if (_intersect != null) {
            return _intersect!!
        }
        _intersect = Builder(name = "Intersect", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(174.6f, 81.4f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, -93.2f, 93.2f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, 93.2f, -93.2f)
                close()
                moveTo(134.4f, 147.1f)
                lineTo(108.9f, 121.6f)
                arcToRelative(63.7f, 63.7f, 0.0f, false, true, 12.7f, -12.7f)
                lineToRelative(25.5f, 25.5f)
                arcTo(63.7f, 63.7f, 0.0f, false, true, 134.4f, 147.1f)
                close()
                moveTo(100.7f, 136.0f)
                lineTo(120.0f, 155.3f)
                arcTo(63.8f, 63.8f, 0.0f, false, true, 96.0f, 160.0f)
                arcTo(63.8f, 63.8f, 0.0f, false, true, 100.7f, 136.0f)
                close()
                moveTo(155.3f, 120.0f)
                lineTo(136.0f, 100.7f)
                arcTo(63.8f, 63.8f, 0.0f, false, true, 160.0f, 96.0f)
                arcTo(63.8f, 63.8f, 0.0f, false, true, 155.3f, 120.0f)
                close()
                moveTo(32.0f, 96.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, true, 158.0f, 80.1f)
                arcToRelative(79.8f, 79.8f, 0.0f, false, false, -39.0f, 11.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -1.3f, 0.9f)
                arcToRelative(79.3f, 79.3f, 0.0f, false, false, -25.5f, 25.4f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, false, -0.9f, 1.4f)
                arcToRelative(79.8f, 79.8f, 0.0f, false, false, -11.2f, 39.0f)
                arcTo(64.2f, 64.2f, 0.0f, false, true, 32.0f, 96.0f)
                close()
                moveTo(160.0f, 224.0f)
                arcToRelative(64.2f, 64.2f, 0.0f, false, true, -62.0f, -48.1f)
                arcToRelative(79.8f, 79.8f, 0.0f, false, false, 39.0f, -11.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 1.3f, -0.9f)
                arcToRelative(79.3f, 79.3f, 0.0f, false, false, 25.5f, -25.4f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, false, 0.9f, -1.4f)
                arcToRelative(79.8f, 79.8f, 0.0f, false, false, 11.2f, -39.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, true, 160.0f, 224.0f)
                close()
            }
        }
        .build()
        return _intersect!!
    }

private var _intersect: ImageVector? = null
