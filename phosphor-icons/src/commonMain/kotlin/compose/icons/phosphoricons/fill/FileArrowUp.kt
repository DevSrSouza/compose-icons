package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.FileArrowUp: ImageVector
    get() {
        if (_fileArrowUp != null) {
            return _fileArrowUp!!
        }
        _fileArrowUp = Builder(name = "FileArrowUp", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.6f, 82.3f)
                lineToRelative(-55.9f, -56.0f)
                lineToRelative(-0.3f, -0.2f)
                lineToRelative(-0.3f, -0.3f)
                lineToRelative(-0.3f, -0.2f)
                lineToRelative(-0.3f, -0.2f)
                curveToRelative(-0.1f, -0.1f, -0.2f, -0.1f, -0.2f, -0.2f)
                lineToRelative(-0.5f, -0.3f)
                horizontalLineToRelative(-0.2f)
                lineToRelative(-0.5f, -0.3f)
                lineTo(155.0f, 24.6f)
                lineToRelative(-0.7f, -0.3f)
                lineTo(56.0f, 24.3f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 40.0f)
                lineTo(40.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(200.0f, 232.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(216.0f, 88.0f)
                arcTo(7.8f, 7.8f, 0.0f, false, false, 213.6f, 82.3f)
                close()
                moveTo(161.7f, 153.7f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -11.4f, 0.0f)
                lineTo(136.0f, 139.3f)
                lineTo(136.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(120.0f, 139.3f)
                lineToRelative(-14.3f, 14.4f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -11.4f, -11.4f)
                lineToRelative(28.0f, -28.0f)
                horizontalLineToRelative(0.1f)
                lineToRelative(0.5f, -0.5f)
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
                lineToRelative(0.5f, 0.5f)
                horizontalLineToRelative(0.1f)
                lineToRelative(28.0f, 28.0f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 161.7f, 153.7f)
                close()
                moveTo(152.0f, 88.0f)
                lineTo(152.0f, 43.3f)
                lineTo(196.7f, 88.0f)
                close()
            }
        }
        .build()
        return _fileArrowUp!!
    }

private var _fileArrowUp: ImageVector? = null
