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

public val FillGroup.CellSignalMedium: ImageVector
    get() {
        if (_cellSignalMedium != null) {
            return _cellSignalMedium!!
        }
        _cellSignalMedium = Builder(name = "CellSignalMedium", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(198.1f, 28.5f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 180.7f, 32.0f)
                lineTo(114.4f, 98.3f)
                horizontalLineToRelative(-0.1f)
                lineTo(16.0f, 196.7f)
                arcToRelative(15.7f, 15.7f, 0.0f, false, false, -4.7f, 11.6f)
                arcToRelative(4.9f, 4.9f, 0.0f, false, false, 0.1f, 1.2f)
                arcToRelative(14.7f, 14.7f, 0.0f, false, false, 1.1f, 4.6f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 6.9f, 7.8f)
                lineToRelative(1.0f, 0.5f)
                arcToRelative(10.2f, 10.2f, 0.0f, false, false, 2.2f, 0.9f)
                arcToRelative(18.4f, 18.4f, 0.0f, false, false, 4.7f, 0.7f)
                horizontalLineTo(192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(43.3f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 198.1f, 28.5f)
                close()
                moveTo(192.0f, 208.0f)
                horizontalLineTo(128.0f)
                verticalLineTo(107.3f)
                lineToRelative(64.0f, -64.0f)
                close()
            }
        }
        .build()
        return _cellSignalMedium!!
    }

private var _cellSignalMedium: ImageVector? = null
