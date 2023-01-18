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

public val LightGroup.CellSignalNone: ImageVector
    get() {
        if (_cellSignalNone != null) {
            return _cellSignalNone!!
        }
        _cellSignalNone = Builder(name = "CellSignalNone", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 222.0f)
                lineTo(27.3f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -9.9f, -23.9f)
                lineTo(182.1f, 33.4f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 206.0f, 43.3f)
                lineTo(206.0f, 208.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 192.0f, 222.0f)
                close()
                moveTo(192.0f, 41.3f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, -1.4f, 0.6f)
                lineTo(25.9f, 206.6f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, -0.4f, 2.2f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.8f, 1.2f)
                lineTo(192.0f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(194.0f, 43.3f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, -1.2f, -1.8f)
                close()
            }
        }
        .build()
        return _cellSignalNone!!
    }

private var _cellSignalNone: ImageVector? = null
