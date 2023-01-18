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

public val ThinGroup.FileArrowUp: ImageVector
    get() {
        if (_fileArrowUp != null) {
            return _fileArrowUp!!
        }
        _fileArrowUp = Builder(name = "FileArrowUp", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 88.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -1.2f, -2.9f)
                lineToRelative(-56.0f, -55.9f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-0.6f, -0.4f)
                lineTo(154.0f, 28.8f)
                lineToRelative(-0.5f, -0.3f)
                lineTo(56.0f, 28.5f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 44.0f, 40.0f)
                lineTo(44.0f, 216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(200.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(212.0f, 88.1f)
                close()
                moveTo(156.0f, 41.7f)
                lineTo(198.3f, 84.0f)
                lineTo(156.0f, 84.0f)
                close()
                moveTo(200.0f, 220.0f)
                lineTo(56.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(52.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(92.0f)
                lineTo(148.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(52.0f)
                lineTo(204.0f, 216.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 200.0f, 220.0f)
                close()
                moveTo(158.8f, 145.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, 5.6f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -5.6f, 0.0f)
                lineTo(132.0f, 129.7f)
                lineTo(132.0f, 184.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(124.0f, 129.7f)
                lineToRelative(-21.2f, 21.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.6f, -5.6f)
                lineToRelative(28.0f, -28.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(0.6f, -0.4f)
                lineToRelative(0.3f, -0.2f)
                lineToRelative(0.4f, -0.2f)
                horizontalLineToRelative(3.0f)
                lineToRelative(0.4f, 0.2f)
                lineToRelative(0.3f, 0.2f)
                lineToRelative(0.6f, 0.4f)
                horizontalLineToRelative(0.0f)
                close()
            }
        }
        .build()
        return _fileArrowUp!!
    }

private var _fileArrowUp: ImageVector? = null
