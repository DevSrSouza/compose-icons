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

public val MaterialDesignIcons.ArrowExpandAll: ImageVector
    get() {
        if (_arrowExpandAll != null) {
            return _arrowExpandAll!!
        }
        _arrowExpandAll = Builder(name = "ArrowExpandAll", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 13.09f)
                lineTo(10.91f, 14.5f)
                lineTo(6.41f, 19.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(17.59f)
                lineTo(9.5f, 13.09f)
                moveTo(10.91f, 9.5f)
                lineTo(9.5f, 10.91f)
                lineTo(5.0f, 6.41f)
                verticalLineTo(10.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(6.41f)
                lineTo(10.91f, 9.5f)
                moveTo(14.5f, 13.09f)
                lineTo(19.0f, 17.59f)
                verticalLineTo(14.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(17.59f)
                lineTo(13.09f, 14.5f)
                lineTo(14.5f, 13.09f)
                moveTo(13.09f, 9.5f)
                lineTo(17.59f, 5.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(6.41f)
                lineTo(14.5f, 10.91f)
                lineTo(13.09f, 9.5f)
                close()
            }
        }
        .build()
        return _arrowExpandAll!!
    }

private var _arrowExpandAll: ImageVector? = null
