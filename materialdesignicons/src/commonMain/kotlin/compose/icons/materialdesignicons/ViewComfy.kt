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

public val MaterialDesignIcons.ViewComfy: ImageVector
    get() {
        if (_viewComfy != null) {
            return _viewComfy!!
        }
        _viewComfy = Builder(name = "ViewComfy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 9.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(9.0f)
                moveTo(3.0f, 14.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(14.0f)
                moveTo(8.0f, 14.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(14.0f)
                moveTo(13.0f, 14.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.0f)
                moveTo(8.0f, 9.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(9.0f)
                moveTo(13.0f, 5.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(13.0f)
                moveTo(18.0f, 14.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(14.0f)
                moveTo(3.0f, 19.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(19.0f)
                moveTo(8.0f, 19.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(19.0f)
                moveTo(13.0f, 19.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.0f)
                moveTo(18.0f, 19.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(19.0f)
                moveTo(18.0f, 5.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _viewComfy!!
    }

private var _viewComfy: ImageVector? = null
