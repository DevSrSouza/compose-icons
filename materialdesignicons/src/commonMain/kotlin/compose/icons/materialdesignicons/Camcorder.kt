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

public val MaterialDesignIcons.Camcorder: ImageVector
    get() {
        if (_camcorder != null) {
            return _camcorder!!
        }
        _camcorder = Builder(name = "Camcorder", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 2.0f)
                curveTo(4.24f, 2.0f, 2.0f, 4.24f, 2.0f, 7.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 21.1f, 2.9f, 22.0f, 4.0f, 22.0f)
                horizontalLineTo(10.0f)
                curveTo(11.1f, 22.0f, 12.0f, 21.1f, 12.0f, 20.0f)
                verticalLineTo(7.0f)
                curveTo(12.0f, 4.24f, 9.76f, 2.0f, 7.0f, 2.0f)
                moveTo(5.0f, 20.0f)
                curveTo(4.45f, 20.0f, 4.0f, 19.55f, 4.0f, 19.0f)
                reflectiveCurveTo(4.45f, 18.0f, 5.0f, 18.0f)
                reflectiveCurveTo(6.0f, 18.45f, 6.0f, 19.0f)
                reflectiveCurveTo(5.55f, 20.0f, 5.0f, 20.0f)
                moveTo(7.0f, 10.0f)
                curveTo(5.34f, 10.0f, 4.0f, 8.66f, 4.0f, 7.0f)
                reflectiveCurveTo(5.34f, 4.0f, 7.0f, 4.0f)
                reflectiveCurveTo(10.0f, 5.34f, 10.0f, 7.0f)
                reflectiveCurveTo(8.66f, 10.0f, 7.0f, 10.0f)
                moveTo(22.0f, 9.0f)
                verticalLineTo(14.0f)
                curveTo(22.0f, 15.1f, 21.1f, 16.0f, 20.0f, 16.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1f, 7.0f, 22.0f, 7.9f, 22.0f, 9.0f)
                close()
            }
        }
        .build()
        return _camcorder!!
    }

private var _camcorder: ImageVector? = null
