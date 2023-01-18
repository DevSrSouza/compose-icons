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

public val LightGroup.CellSignalHigh: ImageVector
    get() {
        if (_cellSignalHigh != null) {
            return _cellSignalHigh!!
        }
        _cellSignalHigh = Builder(name = "CellSignalHigh", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(197.4f, 30.4f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -15.3f, 3.0f)
                lineTo(17.4f, 198.1f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 27.3f, 222.0f)
                horizontalLineTo(192.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                verticalLineTo(43.3f)
                arcTo(13.9f, 13.9f, 0.0f, false, false, 197.4f, 30.4f)
                close()
                moveTo(25.5f, 208.8f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 0.4f, -2.2f)
                lineTo(154.0f, 78.5f)
                verticalLineTo(210.0f)
                horizontalLineTo(27.3f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 25.5f, 208.8f)
                close()
                moveTo(194.0f, 208.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineTo(166.0f)
                verticalLineTo(66.5f)
                lineToRelative(24.6f, -24.6f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, 1.4f, -0.6f)
                lineToRelative(0.8f, 0.2f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, 1.2f, 1.8f)
                close()
            }
        }
        .build()
        return _cellSignalHigh!!
    }

private var _cellSignalHigh: ImageVector? = null
