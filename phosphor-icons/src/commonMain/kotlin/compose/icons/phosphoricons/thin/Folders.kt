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

public val ThinGroup.Folders: ImageVector
    get() {
        if (_folders != null) {
            return _folders!!
        }
        _folders = Builder(name = "Folders", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 68.0f)
                lineTo(154.7f, 68.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -2.4f, -0.8f)
                lineTo(124.5f, 46.4f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, -7.2f, -2.4f)
                lineTo(72.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 60.0f, 56.0f)
                lineTo(60.0f, 76.0f)
                lineTo(40.0f, 76.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 88.0f)
                lineTo(28.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(192.9f, 212.0f)
                arcTo(11.1f, 11.1f, 0.0f, false, false, 204.0f, 200.9f)
                lineTo(204.0f, 180.0f)
                horizontalLineToRelative(20.9f)
                arcTo(11.1f, 11.1f, 0.0f, false, false, 236.0f, 168.9f)
                lineTo(236.0f, 80.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 224.0f, 68.0f)
                close()
                moveTo(196.0f, 200.9f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, true, -3.1f, 3.1f)
                lineTo(40.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(36.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(85.3f, 84.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 2.4f, 0.8f)
                lineToRelative(27.8f, 20.8f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 7.2f, 2.4f)
                lineTo(192.0f, 108.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
                moveTo(228.0f, 168.9f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, true, -3.1f, 3.1f)
                lineTo(204.0f, 172.0f)
                lineTo(204.0f, 112.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(122.7f, 100.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -2.4f, -0.8f)
                lineTo(92.5f, 78.4f)
                arcTo(12.2f, 12.2f, 0.0f, false, false, 85.3f, 76.0f)
                lineTo(68.0f, 76.0f)
                lineTo(68.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(45.3f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 2.4f, 0.8f)
                lineToRelative(27.8f, 20.8f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 7.2f, 2.4f)
                lineTo(224.0f, 76.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _folders!!
    }

private var _folders: ImageVector? = null
