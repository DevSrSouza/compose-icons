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

public val MaterialDesignIcons.NotebookCheck: ImageVector
    get() {
        if (_notebookCheck != null) {
            return _notebookCheck!!
        }
        _notebookCheck = Builder(name = "NotebookCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.75f, 22.16f)
                lineTo(14.0f, 19.16f)
                lineTo(15.16f, 18.0f)
                lineTo(16.75f, 19.59f)
                lineTo(20.34f, 16.0f)
                lineTo(21.5f, 17.41f)
                lineTo(16.75f, 22.16f)
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
                verticalLineTo(13.8f)
                curveTo(20.12f, 13.29f, 19.09f, 13.0f, 18.0f, 13.0f)
                curveTo(14.69f, 13.0f, 12.0f, 15.69f, 12.0f, 19.0f)
                curveTo(12.0f, 20.09f, 12.29f, 21.12f, 12.8f, 22.0f)
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
                close()
            }
        }
        .build()
        return _notebookCheck!!
    }

private var _notebookCheck: ImageVector? = null
