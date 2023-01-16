package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.FileUndo: ImageVector
    get() {
        if (_fileUndo != null) {
            return _fileUndo!!
        }
        _fileUndo = Builder(name = "FileUndo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 9.0f)
                horizontalLineTo(18.5f)
                lineTo(13.0f, 3.5f)
                verticalLineTo(9.0f)
                moveTo(6.0f, 2.0f)
                horizontalLineTo(14.0f)
                lineTo(20.0f, 8.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.0f, 22.0f)
                horizontalLineTo(6.0f)
                curveTo(4.89f, 22.0f, 4.0f, 21.1f, 4.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(4.0f, 2.89f, 4.89f, 2.0f, 6.0f, 2.0f)
                moveTo(12.16f, 14.31f)
                curveTo(10.6f, 14.31f, 9.19f, 14.89f, 8.11f, 15.83f)
                lineTo(6.0f, 13.72f)
                verticalLineTo(19.0f)
                horizontalLineTo(11.28f)
                lineTo(9.15f, 16.88f)
                curveTo(9.97f, 16.2f, 11.0f, 15.78f, 12.16f, 15.78f)
                curveTo(14.23f, 15.78f, 16.0f, 17.13f, 16.61f, 19.0f)
                lineTo(18.0f, 18.54f)
                curveTo(17.19f, 16.09f, 14.88f, 14.31f, 12.16f, 14.31f)
                close()
            }
        }
        .build()
        return _fileUndo!!
    }

private var _fileUndo: ImageVector? = null
