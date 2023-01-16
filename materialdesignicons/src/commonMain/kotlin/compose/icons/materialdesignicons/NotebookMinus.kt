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

public val MaterialDesignIcons.NotebookMinus: ImageVector
    get() {
        if (_notebookMinus != null) {
            return _notebookMinus!!
        }
        _notebookMinus = Builder(name = "NotebookMinus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 7.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(4.0f)
                curveTo(5.0f, 2.9f, 5.9f, 2.0f, 7.0f, 2.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                lineTo(15.5f, 7.5f)
                lineTo(18.0f, 9.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(19.0f)
                curveTo(20.0f, 2.0f, 21.0f, 3.0f, 21.0f, 4.0f)
                verticalLineTo(13.8f)
                curveTo(20.1f, 13.3f, 19.1f, 13.0f, 18.0f, 13.0f)
                curveTo(14.7f, 13.0f, 12.0f, 15.7f, 12.0f, 19.0f)
                curveTo(12.0f, 20.1f, 12.3f, 21.1f, 12.8f, 22.0f)
                horizontalLineTo(7.0f)
                curveTo(5.9f, 22.0f, 5.0f, 21.0f, 5.0f, 20.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(3.0f)
                moveTo(5.0f, 5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                moveTo(5.0f, 19.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                moveTo(5.0f, 13.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(13.0f)
                moveTo(14.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _notebookMinus!!
    }

private var _notebookMinus: ImageVector? = null
