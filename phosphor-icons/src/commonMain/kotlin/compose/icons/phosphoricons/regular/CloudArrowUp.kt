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

public val RegularGroup.CloudArrowUp: ImageVector
    get() {
        if (_cloudArrowUp != null) {
            return _cloudArrowUp!!
        }
        _cloudArrowUp = Builder(name = "CloudArrowUp", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 128.0f)
                arcToRelative(87.3f, 87.3f, 0.0f, false, true, -17.6f, 52.8f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 184.0f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, true, -4.8f, -1.6f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -1.6f, -11.2f)
                arcTo(72.0f, 72.0f, 0.0f, true, false, 88.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                arcToRelative(85.7f, 85.7f, 0.0f, false, true, 3.3f, -23.9f)
                lineTo(72.0f, 104.1f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 0.0f, 96.0f)
                lineTo(96.0f, 200.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(72.0f, 216.1f)
                arcTo(64.0f, 64.0f, 0.0f, false, true, 72.0f, 88.0f)
                arcToRelative(58.2f, 58.2f, 0.0f, false, true, 9.3f, 0.7f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 248.0f, 128.0f)
                close()
                moveTo(157.7f, 122.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -11.4f, 0.0f)
                lineToRelative(-33.9f, 34.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.3f, 11.3f)
                lineTo(144.0f, 147.3f)
                lineTo(144.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(160.0f, 147.3f)
                lineToRelative(20.3f, 20.3f)
                arcToRelative(7.6f, 7.6f, 0.0f, false, false, 5.6f, 2.3f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 5.7f, -2.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -11.3f)
                close()
            }
        }
        .build()
        return _cloudArrowUp!!
    }

private var _cloudArrowUp: ImageVector? = null
