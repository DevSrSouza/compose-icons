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

public val ThinGroup.Shuffle: ImageVector
    get() {
        if (_shuffle != null) {
            return _shuffle!!
        }
        _shuffle = Builder(name = "Shuffle", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.8f, 181.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, 5.6f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -5.6f, 0.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, -5.6f)
                lineTo(222.3f, 188.0f)
                lineTo(200.9f, 188.0f)
                arcToRelative(67.9f, 67.9f, 0.0f, false, true, -55.3f, -28.5f)
                lineToRelative(-41.7f, -58.4f)
                arcTo(60.1f, 60.1f, 0.0f, false, false, 55.1f, 76.0f)
                lineTo(32.0f, 76.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(55.1f, 68.0f)
                arcToRelative(67.9f, 67.9f, 0.0f, false, true, 55.3f, 28.5f)
                lineToRelative(41.7f, 58.4f)
                arcTo(60.1f, 60.1f, 0.0f, false, false, 200.9f, 180.0f)
                horizontalLineToRelative(21.4f)
                lineToRelative(-17.1f, -17.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.6f, -5.6f)
                close()
                moveTo(145.3f, 103.7f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, 2.4f, 0.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.2f, -1.7f)
                lineToRelative(1.2f, -1.7f)
                arcTo(60.1f, 60.1f, 0.0f, false, true, 200.9f, 76.0f)
                horizontalLineToRelative(21.4f)
                lineTo(205.2f, 93.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.0f, 5.6f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 5.6f, 0.0f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.0f, -5.6f)
                lineToRelative(-24.0f, -24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.6f, 5.6f)
                lineTo(222.3f, 68.0f)
                lineTo(200.9f, 68.0f)
                arcToRelative(67.9f, 67.9f, 0.0f, false, false, -55.3f, 28.5f)
                lineToRelative(-1.2f, 1.6f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 145.3f, 103.7f)
                close()
                moveTo(110.7f, 152.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.6f, 0.9f)
                lineToRelative(-1.2f, 1.7f)
                arcTo(60.1f, 60.1f, 0.0f, false, true, 55.1f, 180.0f)
                lineTo(32.0f, 180.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(55.1f, 188.0f)
                arcToRelative(67.9f, 67.9f, 0.0f, false, false, 55.3f, -28.5f)
                lineToRelative(1.2f, -1.6f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 110.7f, 152.3f)
                close()
            }
        }
        .build()
        return _shuffle!!
    }

private var _shuffle: ImageVector? = null
