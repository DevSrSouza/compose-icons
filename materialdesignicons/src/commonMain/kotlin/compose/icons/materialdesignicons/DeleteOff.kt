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

public val MaterialDesignIcons.DeleteOff: ImageVector
    get() {
        if (_deleteOff != null) {
            return _deleteOff!!
        }
        _deleteOff = Builder(name = "DeleteOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 5.27f)
                lineTo(3.28f, 4.0f)
                lineTo(5.0f, 5.72f)
                lineTo(5.28f, 6.0f)
                lineTo(6.28f, 7.0f)
                lineTo(18.0f, 18.72f)
                lineTo(20.0f, 20.72f)
                lineTo(18.73f, 22.0f)
                lineTo(17.27f, 20.54f)
                curveTo(16.93f, 20.83f, 16.5f, 21.0f, 16.0f, 21.0f)
                horizontalLineTo(8.0f)
                curveTo(6.9f, 21.0f, 6.0f, 20.1f, 6.0f, 19.0f)
                verticalLineTo(9.27f)
                lineTo(2.0f, 5.27f)
                moveTo(19.0f, 4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(7.82f)
                lineTo(5.82f, 4.0f)
                horizontalLineTo(8.5f)
                lineTo(9.5f, 3.0f)
                horizontalLineTo(14.5f)
                lineTo(15.5f, 4.0f)
                horizontalLineTo(19.0f)
                moveTo(18.0f, 7.0f)
                verticalLineTo(16.18f)
                lineTo(8.82f, 7.0f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _deleteOff!!
    }

private var _deleteOff: ImageVector? = null
