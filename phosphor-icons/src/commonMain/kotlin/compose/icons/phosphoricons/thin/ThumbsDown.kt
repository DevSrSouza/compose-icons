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

public val ThinGroup.ThumbsDown: ImageVector
    get() {
        if (_thumbsDown != null) {
            return _thumbsDown!!
        }
        _thumbsDown = Builder(name = "ThumbsDown", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(233.7f, 157.5f)
                lineToRelative(-12.0f, -96.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 201.9f, 44.0f)
                lineTo(32.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 20.0f, 56.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(77.5f, 156.0f)
                lineToRelative(38.9f, 77.8f)
                arcTo(4.2f, 4.2f, 0.0f, false, false, 120.0f, 236.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, -36.0f)
                lineTo(156.0f, 180.0f)
                horizontalLineToRelative(57.9f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 19.8f, -22.5f)
                close()
                moveTo(76.0f, 148.0f)
                lineTo(32.0f, 148.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(28.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(76.0f, 52.0f)
                close()
                moveTo(222.9f, 167.9f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -9.0f, 4.1f)
                lineTo(152.0f, 172.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, true, -25.6f, 27.9f)
                lineTo(84.0f, 151.1f)
                lineTo(84.0f, 52.0f)
                lineTo(201.9f, 52.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, 11.9f, 10.5f)
                lineToRelative(12.0f, 96.0f)
                arcTo(12.2f, 12.2f, 0.0f, false, true, 222.9f, 167.9f)
                close()
            }
        }
        .build()
        return _thumbsDown!!
    }

private var _thumbsDown: ImageVector? = null
