package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.CloudSlash: ImageVector
    get() {
        if (_cloudSlash != null) {
            return _cloudSlash!!
        }
        _cloudSlash = Builder(name = "CloudSlash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(202.8f, 192.4f)
                horizontalLineToRelative(-0.1f)
                lineTo(100.0f, 79.4f)
                curveToRelative(0.0f, -0.1f, 0.0f, -0.1f, -0.1f, -0.1f)
                lineToRelative(-43.0f, -47.4f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 39.1f, 48.1f)
                lineTo(71.8f, 84.0f)
                arcTo(68.0f, 68.0f, 0.0f, false, false, 72.0f, 220.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(93.4f, 93.4f, 0.0f, false, false, 30.7f, -5.2f)
                lineToRelative(8.4f, 9.3f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 17.0f, 0.8f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 0.8f, -17.0f)
                close()
                moveTo(160.0f, 196.0f)
                lineTo(72.0f, 196.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, -1.8f, -88.0f)
                arcTo(96.5f, 96.5f, 0.0f, false, false, 68.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                arcToRelative(66.3f, 66.3f, 0.0f, false, true, 2.7f, -18.8f)
                lineToRelative(77.8f, 85.6f)
                arcTo(64.6f, 64.6f, 0.0f, false, true, 160.0f, 196.0f)
                close()
                moveTo(252.0f, 128.0f)
                arcToRelative(91.6f, 91.6f, 0.0f, false, true, -17.5f, 54.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -9.7f, 5.0f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, true, -7.1f, -2.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -2.6f, -16.8f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, -89.6f, -98.5f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -16.4f, -4.2f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, 4.2f, -16.5f)
                arcTo(92.0f, 92.0f, 0.0f, false, true, 252.0f, 128.0f)
                close()
            }
        }
        .build()
        return _cloudSlash!!
    }

private var _cloudSlash: ImageVector? = null
