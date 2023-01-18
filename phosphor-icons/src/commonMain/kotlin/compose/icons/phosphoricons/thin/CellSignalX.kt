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

public val ThinGroup.CellSignalX: ImageVector
    get() {
        if (_cellSignalX != null) {
            return _cellSignalX!!
        }
        _cellSignalX = Builder(name = "CellSignalX", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(226.8f, 149.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, 5.6f)
                arcTo(3.8f, 3.8f, 0.0f, false, true, 224.0f, 156.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -2.8f, -1.2f)
                lineTo(200.0f, 133.7f)
                lineToRelative(-21.2f, 21.1f)
                arcTo(3.8f, 3.8f, 0.0f, false, true, 176.0f, 156.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -2.8f, -1.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, -5.6f)
                lineTo(194.3f, 128.0f)
                lineToRelative(-21.1f, -21.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.6f, -5.6f)
                lineTo(200.0f, 122.3f)
                lineToRelative(21.2f, -21.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.6f, 5.6f)
                lineTo(205.7f, 128.0f)
                close()
                moveTo(200.0f, 169.3f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineTo(208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineTo(27.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.7f, -2.5f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.9f, -4.3f)
                lineTo(189.2f, 40.5f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 4.3f, -0.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.5f, 3.7f)
                verticalLineTo(82.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(43.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -20.5f, -8.5f)
                lineTo(18.8f, 199.5f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 27.3f, 220.0f)
                horizontalLineTo(192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineTo(173.3f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 200.0f, 169.3f)
                close()
            }
        }
        .build()
        return _cellSignalX!!
    }

private var _cellSignalX: ImageVector? = null
