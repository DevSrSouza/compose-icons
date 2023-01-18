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

public val DuotoneGroup.FileArrowUp: ImageVector
    get() {
        if (_fileArrowUp != null) {
            return _fileArrowUp!!
        }
        _fileArrowUp = Builder(name = "FileArrowUp", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(208.0f, 88.0f)
                horizontalLineTo(152.0f)
                verticalLineTo(32.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 88.0f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, false, -2.4f, -5.7f)
                lineToRelative(-55.9f, -56.0f)
                lineToRelative(-0.6f, -0.5f)
                horizontalLineToRelative(-0.2f)
                lineToRelative(-0.5f, -0.3f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-0.5f, -0.4f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-0.6f, -0.3f)
                lineTo(155.0f, 24.8f)
                lineToRelative(-0.7f, -0.3f)
                lineTo(56.0f, 24.5f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 40.0f)
                lineTo(40.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(200.0f, 232.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(216.0f, 88.0f)
                close()
                moveTo(160.0f, 51.3f)
                lineTo(188.7f, 80.0f)
                lineTo(160.0f, 80.0f)
                close()
                moveTo(200.0f, 216.0f)
                lineTo(56.0f, 216.0f)
                lineTo(56.0f, 40.0f)
                horizontalLineToRelative(88.0f)
                lineTo(144.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(48.0f)
                lineTo(200.0f, 216.0f)
                close()
                moveTo(161.7f, 142.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 0.0f, 11.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -11.4f, 0.0f)
                lineTo(136.0f, 139.3f)
                lineTo(136.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(120.0f, 139.3f)
                lineToRelative(-14.3f, 14.4f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -11.4f, -11.4f)
                lineToRelative(28.0f, -28.0f)
                lineToRelative(0.6f, -0.5f)
                lineToRelative(0.3f, -0.2f)
                lineToRelative(0.4f, -0.3f)
                lineToRelative(0.3f, -0.2f)
                lineToRelative(0.3f, -0.2f)
                horizontalLineToRelative(0.4f)
                lineToRelative(0.3f, -0.2f)
                horizontalLineToRelative(0.4f)
                lineToRelative(0.4f, -0.2f)
                horizontalLineToRelative(4.6f)
                lineToRelative(0.4f, 0.2f)
                horizontalLineToRelative(0.4f)
                lineToRelative(0.3f, 0.2f)
                horizontalLineToRelative(0.4f)
                lineToRelative(0.3f, 0.2f)
                lineToRelative(0.3f, 0.2f)
                lineToRelative(0.4f, 0.3f)
                lineToRelative(0.3f, 0.2f)
                lineToRelative(0.6f, 0.5f)
                close()
            }
        }
        .build()
        return _fileArrowUp!!
    }

private var _fileArrowUp: ImageVector? = null
