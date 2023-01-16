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

public val MaterialDesignIcons.ViewDayOutline: ImageVector
    get() {
        if (_viewDayOutline != null) {
            return _viewDayOutline!!
        }
        _viewDayOutline = Builder(name = "ViewDayOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 18.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(18.0f)
                moveTo(19.0f, 10.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(19.0f)
                moveTo(20.0f, 8.0f)
                horizontalLineTo(3.0f)
                curveTo(2.45f, 8.0f, 2.0f, 8.45f, 2.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(2.0f, 15.55f, 2.45f, 16.0f, 3.0f, 16.0f)
                horizontalLineTo(20.0f)
                curveTo(20.55f, 16.0f, 21.0f, 15.55f, 21.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(21.0f, 8.45f, 20.55f, 8.0f, 20.0f, 8.0f)
                moveTo(21.0f, 4.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _viewDayOutline!!
    }

private var _viewDayOutline: ImageVector? = null
