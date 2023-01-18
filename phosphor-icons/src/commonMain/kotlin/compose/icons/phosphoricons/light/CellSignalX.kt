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

public val LightGroup.CellSignalX: ImageVector
    get() {
        if (_cellSignalX != null) {
            return _cellSignalX!!
        }
        _cellSignalX = Builder(name = "CellSignalX", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.3f, 147.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 8.4f)
                arcTo(6.1f, 6.1f, 0.0f, false, true, 224.0f, 158.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, -4.2f, -1.8f)
                lineTo(200.0f, 136.5f)
                lineToRelative(-19.7f, 19.7f)
                arcTo(6.1f, 6.1f, 0.0f, false, true, 176.0f, 158.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.2f, -10.2f)
                lineTo(191.5f, 128.0f)
                lineToRelative(-19.7f, -19.8f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, 0.0f, -8.4f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 8.5f, 0.0f)
                lineTo(200.0f, 119.5f)
                lineToRelative(19.8f, -19.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.5f, 8.4f)
                lineTo(208.5f, 128.0f)
                close()
                moveTo(200.0f, 167.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineTo(208.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineTo(27.3f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.8f, -1.2f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 0.4f, -2.2f)
                lineTo(190.6f, 41.9f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 2.2f, -0.4f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.2f, 1.8f)
                verticalLineTo(82.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(43.3f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -23.9f, -9.9f)
                lineTo(17.4f, 198.1f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 27.3f, 222.0f)
                horizontalLineTo(192.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                verticalLineTo(173.3f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 200.0f, 167.3f)
                close()
            }
        }
        .build()
        return _cellSignalX!!
    }

private var _cellSignalX: ImageVector? = null
