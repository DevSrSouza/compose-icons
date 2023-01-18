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

public val BoldGroup.FileArrowUp: ImageVector
    get() {
        if (_fileArrowUp != null) {
            return _fileArrowUp!!
        }
        _fileArrowUp = Builder(name = "FileArrowUp", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.0f, 92.0f)
                lineTo(220.0f, 88.0f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, false, -3.5f, -8.5f)
                lineToRelative(-56.0f, -56.0f)
                arcTo(12.3f, 12.3f, 0.0f, false, false, 152.0f, 20.0f)
                lineTo(56.0f, 20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 36.0f, 40.0f)
                lineTo(36.0f, 216.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(200.0f, 236.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(220.0f, 92.0f)
                close()
                moveTo(183.0f, 80.0f)
                lineTo(160.0f, 80.0f)
                lineTo(160.0f, 57.0f)
                close()
                moveTo(60.0f, 212.0f)
                lineTo(60.0f, 44.0f)
                horizontalLineToRelative(76.0f)
                lineTo(136.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(48.0f)
                lineTo(196.0f, 212.0f)
                close()
                moveTo(164.5f, 143.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -17.0f, 0.0f)
                lineTo(140.0f, 153.0f)
                verticalLineToRelative(31.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(116.0f, 153.0f)
                lineToRelative(-7.5f, 7.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineToRelative(28.0f, -28.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(0.9f, -0.8f)
                lineToRelative(0.4f, -0.3f)
                lineToRelative(0.5f, -0.4f)
                lineToRelative(0.6f, -0.3f)
                lineToRelative(0.4f, -0.3f)
                lineToRelative(0.6f, -0.2f)
                lineToRelative(0.5f, -0.3f)
                lineToRelative(0.6f, -0.2f)
                lineToRelative(0.5f, -0.2f)
                horizontalLineToRelative(0.6f)
                lineToRelative(0.6f, -0.2f)
                horizontalLineToRelative(4.6f)
                lineToRelative(0.6f, 0.2f)
                horizontalLineToRelative(0.6f)
                lineToRelative(0.5f, 0.2f)
                lineToRelative(0.6f, 0.2f)
                lineToRelative(0.5f, 0.3f)
                lineToRelative(0.6f, 0.2f)
                lineToRelative(0.4f, 0.3f)
                lineToRelative(0.6f, 0.3f)
                lineToRelative(0.5f, 0.4f)
                lineToRelative(0.4f, 0.3f)
                lineToRelative(0.9f, 0.8f)
                horizontalLineToRelative(0.0f)
                close()
            }
        }
        .build()
        return _fileArrowUp!!
    }

private var _fileArrowUp: ImageVector? = null
