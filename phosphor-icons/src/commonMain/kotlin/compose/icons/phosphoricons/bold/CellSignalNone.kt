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

public val BoldGroup.CellSignalNone: ImageVector
    get() {
        if (_cellSignalNone != null) {
            return _cellSignalNone!!
        }
        _cellSignalNone = Builder(name = "CellSignalNone", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 228.0f)
                horizontalLineTo(27.3f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -14.1f, -34.2f)
                lineTo(177.9f, 29.2f)
                arcTo(19.9f, 19.9f, 0.0f, false, true, 212.0f, 43.3f)
                verticalLineTo(208.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 192.0f, 228.0f)
                close()
                moveTo(37.0f, 204.0f)
                horizontalLineTo(188.0f)
                verticalLineTo(53.0f)
                close()
            }
        }
        .build()
        return _cellSignalNone!!
    }

private var _cellSignalNone: ImageVector? = null
