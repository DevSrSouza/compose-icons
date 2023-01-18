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

public val ThinGroup.Hash: ImageVector
    get() {
        if (_hash != null) {
            return _hash!!
        }
        _hash = Builder(name = "Hash", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 92.0f)
                lineTo(170.6f, 92.0f)
                lineToRelative(9.3f, -51.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -7.8f, -1.4f)
                lineTo(162.5f, 92.0f)
                lineTo(106.6f, 92.0f)
                lineToRelative(9.3f, -51.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -7.8f, -1.4f)
                lineTo(98.5f, 92.0f)
                lineTo(43.6f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, 8.0f)
                lineTo(97.0f, 100.0f)
                lineTo(86.8f, 156.0f)
                lineTo(32.0f, 156.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(85.4f, 164.0f)
                lineToRelative(-9.3f, 51.3f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 3.2f, 4.6f)
                lineTo(80.0f, 219.9f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 3.9f, -3.3f)
                lineTo(93.5f, 164.0f)
                horizontalLineToRelative(55.9f)
                lineToRelative(-9.3f, 51.3f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 3.2f, 4.6f)
                horizontalLineToRelative(0.7f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 3.9f, -3.3f)
                lineToRelative(9.6f, -52.7f)
                horizontalLineToRelative(54.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(159.0f, 155.9f)
                lineToRelative(10.2f, -56.0f)
                lineTo(224.0f, 99.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(150.8f, 156.0f)
                lineTo(95.0f, 156.0f)
                lineToRelative(10.2f, -56.0f)
                lineTo(161.0f, 100.0f)
                close()
            }
        }
        .build()
        return _hash!!
    }

private var _hash: ImageVector? = null
