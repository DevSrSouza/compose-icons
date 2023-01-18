package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.ThumbsDown: ImageVector
    get() {
        if (_thumbsDown != null) {
            return _thumbsDown!!
        }
        _thumbsDown = Builder(name = "ThumbsDown", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.7f, 157.3f)
                lineToRelative(-12.0f, -96.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, false, 201.9f, 42.0f)
                lineTo(32.0f, 42.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 18.0f, 56.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(76.3f, 158.0f)
                lineToRelative(38.3f, 76.7f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 120.0f, 238.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 38.0f, -38.0f)
                lineTo(158.0f, 182.0f)
                horizontalLineToRelative(55.9f)
                arcToRelative(22.1f, 22.1f, 0.0f, false, false, 16.5f, -7.4f)
                arcTo(22.4f, 22.4f, 0.0f, false, false, 235.7f, 157.3f)
                close()
                moveTo(74.0f, 146.0f)
                lineTo(32.0f, 146.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(30.0f, 56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(74.0f, 54.0f)
                close()
                moveTo(221.4f, 166.6f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -7.5f, 3.4f)
                lineTo(152.0f, 170.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(26.2f, 26.2f, 0.0f, false, true, -22.4f, 25.8f)
                lineTo(86.0f, 150.6f)
                lineTo(86.0f, 54.0f)
                lineTo(201.9f, 54.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 9.9f, 8.8f)
                lineToRelative(12.0f, 96.0f)
                arcTo(9.8f, 9.8f, 0.0f, false, true, 221.4f, 166.6f)
                close()
            }
        }
        .build()
        return _thumbsDown!!
    }

private var _thumbsDown: ImageVector? = null
