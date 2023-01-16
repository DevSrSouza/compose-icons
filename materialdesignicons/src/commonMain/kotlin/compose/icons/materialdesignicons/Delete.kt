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

public val MaterialDesignIcons.Delete: ImageVector
    get() {
        if (_delete != null) {
            return _delete!!
        }
        _delete = Builder(name = "Delete", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 4.0f)
                horizontalLineTo(15.5f)
                lineTo(14.5f, 3.0f)
                horizontalLineTo(9.5f)
                lineTo(8.5f, 4.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(19.0f)
                moveTo(6.0f, 19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 8.0f, 21.0f)
                horizontalLineTo(16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 18.0f, 19.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _delete!!
    }

private var _delete: ImageVector? = null
