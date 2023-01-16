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

public val MaterialDesignIcons.NotebookCheckOutline: ImageVector
    get() {
        if (_notebookCheckOutline != null) {
            return _notebookCheckOutline!!
        }
        _notebookCheckOutline = Builder(name = "NotebookCheckOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(17.0f, 4.0f)
                verticalLineTo(10.0f)
                lineTo(15.0f, 8.0f)
                lineTo(13.0f, 10.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(12.08f)
                curveTo(12.2f, 20.72f, 12.45f, 21.39f, 12.8f, 22.0f)
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
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(4.0f)
                curveTo(5.0f, 2.89f, 5.9f, 2.0f, 7.0f, 2.0f)
                horizontalLineTo(19.0f)
                curveTo(20.05f, 2.0f, 21.0f, 2.95f, 21.0f, 4.0f)
                verticalLineTo(13.8f)
                curveTo(20.39f, 13.45f, 19.72f, 13.2f, 19.0f, 13.08f)
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
                close()
            }
        }
        .build()
        return _notebookCheckOutline!!
    }

private var _notebookCheckOutline: ImageVector? = null
