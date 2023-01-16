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

public val MaterialDesignIcons.ViewModuleOutline: ImageVector
    get() {
        if (_viewModuleOutline != null) {
            return _viewModuleOutline!!
        }
        _viewModuleOutline = Builder(name = "ViewModuleOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 5.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                moveTo(14.0f, 7.0f)
                verticalLineTo(10.5f)
                horizontalLineTo(11.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(14.0f)
                moveTo(6.0f, 7.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(10.5f)
                horizontalLineTo(6.0f)
                verticalLineTo(7.0f)
                moveTo(6.0f, 16.0f)
                verticalLineTo(12.5f)
                horizontalLineTo(9.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(6.0f)
                moveTo(11.0f, 16.0f)
                verticalLineTo(12.5f)
                horizontalLineTo(14.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(11.0f)
                moveTo(19.0f, 16.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(12.5f)
                horizontalLineTo(19.0f)
                verticalLineTo(16.0f)
                moveTo(16.0f, 10.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(10.5f)
                horizontalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _viewModuleOutline!!
    }

private var _viewModuleOutline: ImageVector? = null
