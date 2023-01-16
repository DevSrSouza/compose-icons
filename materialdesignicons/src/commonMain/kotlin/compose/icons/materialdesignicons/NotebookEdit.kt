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

public val MaterialDesignIcons.NotebookEdit: ImageVector
    get() {
        if (_notebookEdit != null) {
            return _notebookEdit!!
        }
        _notebookEdit = Builder(name = "NotebookEdit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.04f, 13.13f)
                curveTo(21.18f, 13.13f, 21.31f, 13.19f, 21.42f, 13.3f)
                lineTo(22.7f, 14.58f)
                curveTo(22.92f, 14.79f, 22.92f, 15.14f, 22.7f, 15.35f)
                lineTo(21.7f, 16.35f)
                lineTo(19.65f, 14.3f)
                lineTo(20.65f, 13.3f)
                curveTo(20.76f, 13.19f, 20.9f, 13.13f, 21.04f, 13.13f)
                moveTo(19.07f, 14.88f)
                lineTo(21.12f, 16.93f)
                lineTo(15.06f, 23.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(20.94f)
                lineTo(19.07f, 14.88f)
                moveTo(3.0f, 7.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(4.0f)
                curveTo(5.0f, 2.89f, 5.9f, 2.0f, 7.0f, 2.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                lineTo(15.5f, 7.5f)
                lineTo(18.0f, 9.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(19.0f)
                curveTo(20.05f, 2.0f, 21.0f, 2.95f, 21.0f, 4.0f)
                verticalLineTo(10.0f)
                lineTo(11.0f, 20.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.0f)
                curveTo(5.95f, 22.0f, 5.0f, 21.05f, 5.0f, 20.0f)
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
                moveTo(5.0f, 7.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(7.0f)
                moveTo(5.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(5.0f)
                moveTo(5.0f, 17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _notebookEdit!!
    }

private var _notebookEdit: ImageVector? = null
