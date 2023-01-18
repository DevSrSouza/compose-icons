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

public val ThinGroup.Broadcast: ImageVector
    get() {
        if (_broadcast != null) {
            return _broadcast!!
        }
        _broadcast = Builder(name = "Broadcast", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 92.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 36.0f, 36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 128.0f, 92.0f)
                close()
                moveTo(128.0f, 156.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, -28.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, true, 128.0f, 156.0f)
                close()
                moveTo(65.3f, 101.5f)
                arcToRelative(68.9f, 68.9f, 0.0f, false, false, 0.0f, 53.0f)
                arcToRelative(70.4f, 70.4f, 0.0f, false, false, 14.6f, 21.6f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, 5.6f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -2.8f, 1.2f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -2.8f, -1.2f)
                arcTo(75.9f, 75.9f, 0.0f, false, true, 58.0f, 98.4f)
                arcTo(74.4f, 74.4f, 0.0f, false, true, 74.3f, 74.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.6f, 5.6f)
                arcTo(70.4f, 70.4f, 0.0f, false, false, 65.3f, 101.5f)
                close()
                moveTo(204.0f, 128.0f)
                arcToRelative(75.6f, 75.6f, 0.0f, false, true, -22.3f, 53.7f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -2.8f, 1.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -2.8f, -1.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, -5.6f)
                arcToRelative(70.4f, 70.4f, 0.0f, false, false, 14.6f, -21.6f)
                arcToRelative(68.9f, 68.9f, 0.0f, false, false, 0.0f, -53.0f)
                arcToRelative(70.4f, 70.4f, 0.0f, false, false, -14.6f, -21.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.6f, -5.6f)
                arcTo(75.6f, 75.6f, 0.0f, false, true, 204.0f, 128.0f)
                close()
                moveTo(51.6f, 204.4f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, 5.6f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -2.8f, 1.2f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 46.0f, 210.0f)
                arcTo(115.6f, 115.6f, 0.0f, false, true, 46.0f, 46.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.6f, 5.6f)
                arcToRelative(108.2f, 108.2f, 0.0f, false, false, 0.0f, 152.8f)
                close()
                moveTo(244.0f, 128.0f)
                arcToRelative(115.0f, 115.0f, 0.0f, false, true, -34.0f, 82.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -2.8f, 1.2f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -2.8f, -1.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, -5.6f)
                arcToRelative(108.2f, 108.2f, 0.0f, false, false, 0.0f, -152.8f)
                arcTo(4.0f, 4.0f, 0.0f, true, true, 210.0f, 46.0f)
                arcToRelative(115.0f, 115.0f, 0.0f, false, true, 34.0f, 82.0f)
                close()
            }
        }
        .build()
        return _broadcast!!
    }

private var _broadcast: ImageVector? = null
