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

public val MaterialDesignIcons.NotebookHeartOutline: ImageVector
    get() {
        if (_notebookHeartOutline != null) {
            return _notebookHeartOutline!!
        }
        _notebookHeartOutline = Builder(name = "NotebookHeartOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 23.3f)
                lineTo(18.4f, 22.8f)
                curveTo(16.4f, 20.9f, 15.0f, 19.7f, 15.0f, 18.2f)
                curveTo(15.0f, 17.0f, 16.0f, 16.0f, 17.2f, 16.0f)
                curveTo(17.9f, 16.0f, 18.6f, 16.3f, 19.0f, 16.8f)
                curveTo(19.4f, 16.3f, 20.1f, 16.0f, 20.8f, 16.0f)
                curveTo(22.0f, 16.0f, 23.0f, 16.9f, 23.0f, 18.2f)
                curveTo(23.0f, 19.7f, 21.6f, 20.9f, 19.6f, 22.8f)
                lineTo(19.0f, 23.3f)
                moveTo(17.0f, 4.0f)
                verticalLineTo(10.0f)
                lineTo(15.0f, 8.0f)
                lineTo(13.0f, 10.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.08f)
                curveTo(13.2f, 20.72f, 13.45f, 21.39f, 13.8f, 22.0f)
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
                verticalLineTo(13.34f)
                curveTo(20.37f, 13.12f, 19.7f, 13.0f, 19.0f, 13.0f)
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
        return _notebookHeartOutline!!
    }

private var _notebookHeartOutline: ImageVector? = null
