package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.CellSignalSlash: ImageVector
    get() {
        if (_cellSignalSlash != null) {
            return _cellSignalSlash!!
        }
        _cellSignalSlash = Builder(name = "CellSignalSlash", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(129.5f, 94.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.3f, -11.1f)
                lineTo(180.7f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 208.0f, 43.3f)
                lineTo(208.0f, 159.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.1f, 7.5f)
                arcToRelative(7.4f, 7.4f, 0.0f, false, true, -2.9f, 0.5f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -5.9f, -2.6f)
                close()
                moveTo(213.9f, 210.6f)
                lineTo(53.9f, 34.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.3f, -0.5f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -0.5f, 11.3f)
                lineTo(101.7f, 111.0f)
                lineTo(16.0f, 196.7f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 27.3f, 224.0f)
                lineTo(208.0f, 224.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 5.4f, -2.1f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 213.9f, 210.6f)
                close()
            }
        }
        .build()
        return _cellSignalSlash!!
    }

private var _cellSignalSlash: ImageVector? = null
