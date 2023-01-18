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

public val RegularGroup.CloudSlash: ImageVector
    get() {
        if (_cloudSlash != null) {
            return _cloudSlash!!
        }
        _cloudSlash = Builder(name = "CloudSlash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(199.8f, 195.1f)
                horizontalLineToRelative(0.0f)
                lineTo(97.0f, 82.0f)
                horizontalLineToRelative(0.0f)
                lineTo(53.9f, 34.6f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 42.1f, 45.4f)
                lineTo(81.3f, 88.5f)
                verticalLineToRelative(0.2f)
                arcTo(58.2f, 58.2f, 0.0f, false, false, 72.0f, 88.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 0.0f, 128.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(87.9f, 87.9f, 0.0f, false, false, 31.8f, -5.9f)
                lineToRelative(10.3f, 11.3f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 208.0f, 224.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 5.4f, -2.1f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 0.5f, -11.3f)
                close()
                moveTo(160.0f, 200.0f)
                lineTo(72.0f, 200.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 0.0f, -96.0f)
                horizontalLineToRelative(3.3f)
                arcTo(87.8f, 87.8f, 0.0f, false, false, 72.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                arcToRelative(70.6f, 70.6f, 0.0f, false, true, 5.1f, -26.5f)
                lineToRelative(87.0f, 95.7f)
                arcTo(75.0f, 75.0f, 0.0f, false, true, 160.0f, 200.0f)
                close()
                moveTo(248.0f, 128.0f)
                arcToRelative(87.3f, 87.3f, 0.0f, false, true, -22.4f, 58.6f)
                arcToRelative(7.6f, 7.6f, 0.0f, false, true, -5.9f, 2.7f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, true, -5.3f, -2.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.7f, -11.3f)
                arcTo(72.0f, 72.0f, 0.0f, false, false, 160.0f, 56.0f)
                arcToRelative(70.9f, 70.9f, 0.0f, false, false, -42.6f, 14.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -11.2f, -1.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 1.7f, -11.2f)
                arcTo(87.2f, 87.2f, 0.0f, false, true, 160.0f, 40.0f)
                arcTo(88.1f, 88.1f, 0.0f, false, true, 248.0f, 128.0f)
                close()
            }
        }
        .build()
        return _cloudSlash!!
    }

private var _cloudSlash: ImageVector? = null
