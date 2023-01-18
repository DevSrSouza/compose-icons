package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.ThumbsDown: ImageVector
    get() {
        if (_thumbsDown != null) {
            return _thumbsDown!!
        }
        _thumbsDown = Builder(name = "ThumbsDown", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(32.0f, 48.0f)
                horizontalLineTo(80.0f)
                arcToRelative(0.0f, 0.0f, 0.0f, false, true, 0.0f, 0.0f)
                verticalLineTo(152.0f)
                arcToRelative(0.0f, 0.0f, 0.0f, false, true, 0.0f, 0.0f)
                horizontalLineTo(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.7f, 157.0f)
                lineToRelative(-12.0f, -96.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, false, -23.8f, -21.0f)
                lineTo(32.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 16.0f, 56.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(75.0f, 160.0f)
                lineToRelative(37.8f, 75.6f)
                arcTo(8.2f, 8.2f, 0.0f, false, false, 120.0f, 240.0f)
                arcToRelative(40.1f, 40.1f, 0.0f, false, false, 40.0f, -40.0f)
                lineTo(160.0f, 184.0f)
                horizontalLineToRelative(53.9f)
                arcToRelative(23.9f, 23.9f, 0.0f, false, false, 23.8f, -27.0f)
                close()
                moveTo(72.0f, 144.0f)
                lineTo(32.0f, 144.0f)
                lineTo(32.0f, 56.0f)
                lineTo(72.0f, 56.0f)
                close()
                moveTo(219.9f, 165.3f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -6.0f, 2.7f)
                lineTo(152.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -19.3f, 23.5f)
                lineTo(88.0f, 150.1f)
                lineTo(88.0f, 56.0f)
                lineTo(201.9f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.9f, 7.0f)
                lineToRelative(12.0f, 96.0f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 219.9f, 165.3f)
                close()
            }
        }
        .build()
        return _thumbsDown!!
    }

private var _thumbsDown: ImageVector? = null
