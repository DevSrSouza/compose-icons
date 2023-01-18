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

public val FillGroup.ArrowSquareUp: ImageVector
    get() {
        if (_arrowSquareUp != null) {
            return _arrowSquareUp!!
        }
        _arrowSquareUp = Builder(name = "ArrowSquareUp", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 208.0f)
                lineTo(224.0f, 48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(48.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.0f)
                lineTo(32.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(208.0f, 224.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 224.0f, 208.0f)
                close()
                moveTo(167.6f, 127.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.3f, 0.0f)
                lineTo(136.0f, 107.3f)
                lineTo(136.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(120.0f, 107.3f)
                lineTo(99.7f, 127.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.3f, -11.3f)
                lineToRelative(33.9f, -33.9f)
                arcToRelative(8.7f, 8.7f, 0.0f, false, true, 2.6f, -1.8f)
                arcTo(8.5f, 8.5f, 0.0f, false, true, 128.0f, 80.0f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, true, 3.0f, 0.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.7f, 1.8f)
                lineToRelative(33.9f, 33.9f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 167.6f, 127.6f)
                close()
            }
        }
        .build()
        return _arrowSquareUp!!
    }

private var _arrowSquareUp: ImageVector? = null
