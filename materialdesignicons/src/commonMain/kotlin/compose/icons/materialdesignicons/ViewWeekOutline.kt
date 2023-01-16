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

public val MaterialDesignIcons.ViewWeekOutline: ImageVector
    get() {
        if (_viewWeekOutline != null) {
            return _viewWeekOutline!!
        }
        _viewWeekOutline = Builder(name = "ViewWeekOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 4.0f)
                horizontalLineTo(3.0f)
                curveTo(2.45f, 4.0f, 2.0f, 4.45f, 2.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(2.0f, 19.55f, 2.45f, 20.0f, 3.0f, 20.0f)
                horizontalLineTo(21.0f)
                curveTo(21.55f, 20.0f, 22.0f, 19.55f, 22.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(22.0f, 4.45f, 21.55f, 4.0f, 21.0f, 4.0f)
                moveTo(8.0f, 18.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(18.0f)
                moveTo(14.0f, 18.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(18.0f)
                moveTo(20.0f, 18.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _viewWeekOutline!!
    }

private var _viewWeekOutline: ImageVector? = null
