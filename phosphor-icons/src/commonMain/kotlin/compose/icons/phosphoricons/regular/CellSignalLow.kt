package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.CellSignalLow: ImageVector
    get() {
        if (_cellSignalLow != null) {
            return _cellSignalLow!!
        }
        _cellSignalLow = Builder(name = "CellSignalLow", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(198.1f, 28.5f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 180.7f, 32.0f)
                lineTo(74.4f, 138.3f)
                horizontalLineToRelative(-0.1f)
                lineTo(16.0f, 196.7f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 27.3f, 224.0f)
                horizontalLineTo(192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(43.3f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 198.1f, 28.5f)
                close()
                moveTo(72.0f, 163.3f)
                verticalLineTo(208.0f)
                horizontalLineTo(27.3f)
                close()
                moveTo(192.0f, 208.0f)
                horizontalLineTo(88.0f)
                verticalLineTo(147.3f)
                lineToRelative(104.0f, -104.0f)
                close()
            }
        }
        .build()
        return _cellSignalLow!!
    }

private var _cellSignalLow: ImageVector? = null
