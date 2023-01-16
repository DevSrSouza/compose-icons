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

public val MaterialDesignIcons.NotebookMultiple: ImageVector
    get() {
        if (_notebookMultiple != null) {
            return _notebookMultiple!!
        }
        _notebookMultiple = Builder(name = "NotebookMultiple", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.05f, 9.0f)
                horizontalLineTo(7.06f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.05f)
                verticalLineTo(4.03f)
                horizontalLineTo(7.06f)
                verticalLineTo(3.03f)
                curveTo(7.06f, 1.92f, 7.95f, 1.04f, 9.05f, 1.04f)
                horizontalLineTo(15.03f)
                verticalLineTo(8.0f)
                lineTo(17.5f, 6.5f)
                lineTo(20.0f, 8.0f)
                verticalLineTo(1.04f)
                horizontalLineTo(21.0f)
                curveTo(22.05f, 1.04f, 23.0f, 2.0f, 23.0f, 3.03f)
                verticalLineTo(17.0f)
                curveTo(23.0f, 18.03f, 22.05f, 19.0f, 21.0f, 19.0f)
                horizontalLineTo(9.05f)
                curveTo(8.0f, 19.0f, 7.06f, 18.05f, 7.06f, 17.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(9.05f)
                verticalLineTo(14.0f)
                horizontalLineTo(7.06f)
                verticalLineTo(11.0f)
                horizontalLineTo(9.05f)
                verticalLineTo(9.0f)
                moveTo(1.0f, 18.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.0f, 21.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _notebookMultiple!!
    }

private var _notebookMultiple: ImageVector? = null
