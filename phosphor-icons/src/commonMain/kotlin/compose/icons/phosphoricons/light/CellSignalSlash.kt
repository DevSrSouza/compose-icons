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

public val LightGroup.CellSignalSlash: ImageVector
    get() {
        if (_cellSignalSlash != null) {
            return _cellSignalSlash!!
        }
        _cellSignalSlash = Builder(name = "CellSignalSlash", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(131.2f, 92.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 0.0f, -8.5f)
                lineToRelative(50.9f, -50.9f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 206.0f, 43.3f)
                verticalLineTo(159.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -12.0f, 0.0f)
                verticalLineTo(43.3f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.2f, -1.8f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, -2.2f, 0.4f)
                lineTo(139.7f, 92.8f)
                arcTo(5.9f, 5.9f, 0.0f, false, true, 131.2f, 92.8f)
                close()
                moveTo(214.0f, 216.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                horizontalLineTo(27.3f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -9.9f, -23.9f)
                lineTo(104.5f, 111.0f)
                lineTo(43.6f, 44.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 8.8f, -8.0f)
                lineToRelative(160.0f, 176.0f)
                horizontalLineToRelative(0.0f)
                arcTo(5.8f, 5.8f, 0.0f, false, true, 214.0f, 216.0f)
                close()
                moveTo(27.3f, 210.0f)
                horizontalLineTo(194.4f)
                lineToRelative(-81.9f, -90.1f)
                lineTo(25.9f, 206.6f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, -0.4f, 2.2f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 27.3f, 210.0f)
                close()
            }
        }
        .build()
        return _cellSignalSlash!!
    }

private var _cellSignalSlash: ImageVector? = null
