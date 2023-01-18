package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.CellSignalNone: ImageVector
    get() {
        if (_cellSignalNone != null) {
            return _cellSignalNone!!
        }
        _cellSignalNone = Builder(name = "CellSignalNone", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 224.0f)
                horizontalLineTo(27.3f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 16.0f, 196.7f)
                lineTo(180.7f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 208.0f, 43.3f)
                verticalLineTo(208.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 192.0f, 224.0f)
                close()
                moveTo(27.3f, 208.0f)
                horizontalLineTo(192.0f)
                verticalLineTo(43.3f)
                lineTo(27.3f, 208.0f)
                close()
            }
        }
        .build()
        return _cellSignalNone!!
    }

private var _cellSignalNone: ImageVector? = null
