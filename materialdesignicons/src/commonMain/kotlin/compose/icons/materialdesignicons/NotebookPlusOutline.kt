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

public val MaterialDesignIcons.NotebookPlusOutline: ImageVector
    get() {
        if (_notebookPlusOutline != null) {
            return _notebookPlusOutline!!
        }
        _notebookPlusOutline = Builder(name = "NotebookPlusOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 4.0f)
                verticalLineTo(10.0f)
                lineTo(15.0f, 8.0f)
                lineTo(13.0f, 10.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(12.1f)
                curveTo(12.2f, 20.7f, 12.5f, 21.4f, 12.8f, 22.0f)
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
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(4.0f)
                curveTo(5.0f, 2.9f, 5.9f, 2.0f, 7.0f, 2.0f)
                horizontalLineTo(19.0f)
                curveTo(20.0f, 2.0f, 21.0f, 3.0f, 21.0f, 4.0f)
                verticalLineTo(13.8f)
                curveTo(20.4f, 13.4f, 19.7f, 13.2f, 19.0f, 13.1f)
                verticalLineTo(4.0f)
                horizontalLineTo(17.0f)
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
                moveTo(5.0f, 7.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(7.0f)
                moveTo(17.0f, 15.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _notebookPlusOutline!!
    }

private var _notebookPlusOutline: ImageVector? = null
