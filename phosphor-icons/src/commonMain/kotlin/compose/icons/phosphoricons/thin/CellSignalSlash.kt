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

public val ThinGroup.CellSignalSlash: ImageVector
    get() {
        if (_cellSignalSlash != null) {
            return _cellSignalSlash!!
        }
        _cellSignalSlash = Builder(name = "CellSignalSlash", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(132.6f, 91.4f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, -5.6f)
                lineToRelative(50.9f, -51.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 204.0f, 43.3f)
                verticalLineTo(159.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -8.0f, 0.0f)
                verticalLineTo(43.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.5f, -3.7f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -4.3f, 0.9f)
                lineToRelative(-51.0f, 50.9f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 132.6f, 91.4f)
                close()
                moveTo(212.0f, 216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineTo(27.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -8.5f, -20.5f)
                lineToRelative(88.4f, -88.4f)
                lineTo(45.0f, 42.7f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 0.3f, -5.7f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, 5.7f, 0.3f)
                lineToRelative(160.0f, 176.0f)
                horizontalLineToRelative(-0.1f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 212.0f, 216.0f)
                close()
                moveTo(27.3f, 212.0f)
                horizontalLineTo(199.0f)
                lineToRelative(-86.4f, -95.0f)
                lineTo(24.5f, 205.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -0.9f, 4.3f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 27.3f, 212.0f)
                close()
            }
        }
        .build()
        return _cellSignalSlash!!
    }

private var _cellSignalSlash: ImageVector? = null
