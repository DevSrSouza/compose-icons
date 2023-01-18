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

public val ThinGroup.Spinner: ImageVector
    get() {
        if (_spinner != null) {
            return _spinner!!
        }
        _spinner = Builder(name = "Spinner", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(132.0f, 32.0f)
                lineTo(132.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(124.0f, 32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(173.3f, 86.7f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 2.8f, -1.1f)
                lineToRelative(22.6f, -22.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.6f, -5.6f)
                lineTo(170.4f, 79.9f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 0.0f, 5.7f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 173.3f, 86.7f)
                close()
                moveTo(224.0f, 124.0f)
                lineTo(192.0f, 124.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(176.1f, 170.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.7f, 5.7f)
                lineToRelative(22.7f, 22.6f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 2.8f, 1.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 2.8f, -1.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.0f, -5.6f)
                close()
                moveTo(128.0f, 188.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(132.0f, 192.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 128.0f, 188.0f)
                close()
                moveTo(79.9f, 170.4f)
                lineTo(57.3f, 193.1f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.0f, 5.6f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 2.8f, 1.2f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 2.8f, -1.2f)
                lineToRelative(22.7f, -22.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.7f, -5.7f)
                close()
                moveTo(68.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(32.0f, 124.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(64.0f, 132.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 68.0f, 128.0f)
                close()
                moveTo(62.9f, 57.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.6f, 5.6f)
                lineTo(79.9f, 85.6f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 2.8f, 1.1f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 2.9f, -1.1f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 0.0f, -5.7f)
                close()
            }
        }
        .build()
        return _spinner!!
    }

private var _spinner: ImageVector? = null
