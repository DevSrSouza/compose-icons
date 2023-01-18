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

public val ThinGroup.Bird: ImageVector
    get() {
        if (_bird != null) {
            return _bird!!
        }
        _bird = Builder(name = "Bird", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.0f, 68.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 172.0f, 68.0f)
                close()
                moveTo(116.9f, 133.4f)
                lineTo(76.9f, 181.4f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 0.5f, 5.7f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, 2.6f, 0.9f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, 3.1f, -1.4f)
                lineToRelative(40.0f, -48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.2f, -5.2f)
                close()
                moveTo(236.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.8f, 3.3f)
                lineTo(212.0f, 98.1f)
                lineTo(212.0f, 120.0f)
                arcTo(100.2f, 100.2f, 0.0f, false, true, 112.0f, 220.0f)
                lineTo(8.0f, 220.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -3.6f, -2.3f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, 0.5f, -4.2f)
                lineTo(100.0f, 94.6f)
                lineTo(100.0f, 76.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 209.8f, 60.4f)
                lineToRelative(24.4f, 16.3f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 236.0f, 80.0f)
                close()
                moveTo(224.8f, 80.0f)
                lineTo(204.1f, 66.2f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -1.6f, -2.3f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 108.0f, 76.0f)
                lineTo(108.0f, 96.0f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -0.9f, 2.5f)
                lineTo(16.3f, 212.0f)
                lineTo(112.0f, 212.0f)
                arcToRelative(92.1f, 92.1f, 0.0f, false, false, 92.0f, -92.0f)
                lineTo(204.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.8f, -3.3f)
                close()
            }
        }
        .build()
        return _bird!!
    }

private var _bird: ImageVector? = null
