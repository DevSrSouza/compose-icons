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

public val MaterialDesignIcons.BellOutline: ImageVector
    get() {
        if (_bellOutline != null) {
            return _bellOutline!!
        }
        _bellOutline = Builder(name = "BellOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 21.0f)
                horizontalLineTo(14.0f)
                curveTo(14.0f, 22.1f, 13.1f, 23.0f, 12.0f, 23.0f)
                reflectiveCurveTo(10.0f, 22.1f, 10.0f, 21.0f)
                moveTo(21.0f, 19.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(19.0f)
                lineTo(5.0f, 17.0f)
                verticalLineTo(11.0f)
                curveTo(5.0f, 7.9f, 7.0f, 5.2f, 10.0f, 4.3f)
                verticalLineTo(4.0f)
                curveTo(10.0f, 2.9f, 10.9f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(14.0f, 2.9f, 14.0f, 4.0f)
                verticalLineTo(4.3f)
                curveTo(17.0f, 5.2f, 19.0f, 7.9f, 19.0f, 11.0f)
                verticalLineTo(17.0f)
                lineTo(21.0f, 19.0f)
                moveTo(17.0f, 11.0f)
                curveTo(17.0f, 8.2f, 14.8f, 6.0f, 12.0f, 6.0f)
                reflectiveCurveTo(7.0f, 8.2f, 7.0f, 11.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _bellOutline!!
    }

private var _bellOutline: ImageVector? = null
