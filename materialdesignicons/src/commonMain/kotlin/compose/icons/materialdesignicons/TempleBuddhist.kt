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

public val MaterialDesignIcons.TempleBuddhist: ImageVector
    get() {
        if (_templeBuddhist != null) {
            return _templeBuddhist!!
        }
        _templeBuddhist = Builder(name = "TempleBuddhist", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 9.0f)
                curveTo(21.0f, 10.1f, 20.1f, 11.0f, 19.0f, 11.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 11.0f, 3.0f, 10.1f, 3.0f, 9.0f)
                horizontalLineTo(1.0f)
                curveTo(1.0f, 10.9f, 2.3f, 12.4f, 4.0f, 12.8f)
                verticalLineTo(22.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(19.0f)
                curveTo(10.0f, 17.9f, 10.9f, 17.0f, 12.0f, 17.0f)
                reflectiveCurveTo(14.0f, 17.9f, 14.0f, 19.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(12.9f)
                curveTo(20.5f, 12.8f, 23.0f, 11.9f, 23.0f, 9.0f)
                horizontalLineTo(21.0f)
                moveTo(6.0f, 8.9f)
                verticalLineTo(10.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(8.9f)
                curveTo(18.5f, 8.8f, 21.0f, 7.9f, 21.0f, 5.0f)
                horizontalLineTo(19.0f)
                curveTo(19.0f, 6.1f, 18.1f, 7.0f, 17.0f, 7.0f)
                horizontalLineTo(7.0f)
                curveTo(5.9f, 7.0f, 5.0f, 6.1f, 5.0f, 5.0f)
                horizontalLineTo(3.0f)
                curveTo(3.0f, 6.9f, 4.3f, 8.4f, 6.0f, 8.9f)
                moveTo(12.0f, 1.0f)
                lineTo(8.2f, 6.0f)
                horizontalLineTo(15.7f)
                lineTo(12.0f, 1.0f)
                close()
            }
        }
        .build()
        return _templeBuddhist!!
    }

private var _templeBuddhist: ImageVector? = null
