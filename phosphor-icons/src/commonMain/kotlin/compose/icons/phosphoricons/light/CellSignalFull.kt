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

public val LightGroup.CellSignalFull: ImageVector
    get() {
        if (_cellSignalFull != null) {
            return _cellSignalFull!!
        }
        _cellSignalFull = Builder(name = "CellSignalFull", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(197.4f, 30.4f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -15.3f, 3.0f)
                lineTo(115.8f, 99.7f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-40.0f, 39.9f)
                horizontalLineToRelative(0.0f)
                lineTo(17.4f, 198.1f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 27.3f, 222.0f)
                lineTo(192.0f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(206.0f, 43.3f)
                arcTo(13.9f, 13.9f, 0.0f, false, false, 197.4f, 30.4f)
                close()
                moveTo(126.0f, 106.5f)
                lineToRelative(28.0f, -28.0f)
                lineTo(154.0f, 210.0f)
                lineTo(126.0f, 210.0f)
                close()
                moveTo(114.0f, 210.0f)
                lineTo(86.0f, 210.0f)
                lineTo(86.0f, 146.5f)
                lineToRelative(28.0f, -28.0f)
                close()
                moveTo(25.5f, 208.8f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 0.4f, -2.2f)
                lineTo(74.0f, 158.5f)
                lineTo(74.0f, 210.0f)
                lineTo(27.3f, 210.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 25.5f, 208.8f)
                close()
                moveTo(194.0f, 208.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(166.0f, 210.0f)
                lineTo(166.0f, 66.5f)
                lineToRelative(24.6f, -24.6f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, 1.4f, -0.6f)
                lineToRelative(0.8f, 0.2f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, 1.2f, 1.8f)
                close()
            }
        }
        .build()
        return _cellSignalFull!!
    }

private var _cellSignalFull: ImageVector? = null
