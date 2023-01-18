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

public val BoldGroup.Eraser: ImageVector
    get() {
        if (_eraser != null) {
            return _eraser!!
        }
        _eraser = Builder(name = "Eraser", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 203.8f)
                horizontalLineTo(140.0f)
                lineToRelative(27.9f, -27.9f)
                horizontalLineToRelative(0.0f)
                lineToRelative(56.6f, -56.6f)
                arcToRelative(27.9f, 27.9f, 0.0f, false, false, 0.0f, -39.5f)
                lineTo(179.2f, 34.5f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, -39.6f, 0.0f)
                lineTo(83.1f, 91.1f)
                horizontalLineToRelative(0.0f)
                lineTo(26.5f, 147.6f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, 0.0f, 39.6f)
                lineToRelative(37.1f, 37.1f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, 8.5f, 3.5f)
                horizontalLineTo(216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(156.6f, 51.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.7f, 0.0f)
                lineToRelative(45.2f, 45.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.7f)
                lineToRelative(-48.1f, 48.1f)
                lineToRelative(-50.9f, -51.0f)
                close()
                moveTo(106.1f, 203.8f)
                horizontalLineTo(77.0f)
                lineTo(43.5f, 170.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.7f)
                lineToRelative(48.1f, -48.1f)
                lineToRelative(50.9f, 50.9f)
                close()
            }
        }
        .build()
        return _eraser!!
    }

private var _eraser: ImageVector? = null
