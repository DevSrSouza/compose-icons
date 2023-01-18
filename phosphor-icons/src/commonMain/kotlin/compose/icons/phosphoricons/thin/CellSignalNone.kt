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

public val ThinGroup.CellSignalNone: ImageVector
    get() {
        if (_cellSignalNone != null) {
            return _cellSignalNone!!
        }
        _cellSignalNone = Builder(name = "CellSignalNone", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 220.0f)
                lineTo(27.3f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -8.5f, -20.5f)
                lineTo(183.5f, 34.8f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 204.0f, 43.3f)
                lineTo(204.0f, 208.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 192.0f, 220.0f)
                close()
                moveTo(191.9f, 39.3f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, false, -2.7f, 1.2f)
                lineTo(24.5f, 205.2f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, -0.9f, 4.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.7f, 2.5f)
                lineTo(192.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(196.0f, 43.3f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, -2.5f, -3.7f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 191.9f, 39.3f)
                close()
            }
        }
        .build()
        return _cellSignalNone!!
    }

private var _cellSignalNone: ImageVector? = null
