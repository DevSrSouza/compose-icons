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

public val MaterialDesignIcons.BusStop: ImageVector
    get() {
        if (_busStop != null) {
            return _busStop!!
        }
        _busStop = Builder(name = "BusStop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 7.0f)
                verticalLineTo(16.0f)
                curveTo(22.0f, 16.71f, 21.62f, 17.36f, 21.0f, 17.72f)
                verticalLineTo(19.25f)
                curveTo(21.0f, 19.66f, 20.66f, 20.0f, 20.25f, 20.0f)
                horizontalLineTo(19.75f)
                curveTo(19.34f, 20.0f, 19.0f, 19.66f, 19.0f, 19.25f)
                verticalLineTo(18.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(19.25f)
                curveTo(12.0f, 19.66f, 11.66f, 20.0f, 11.25f, 20.0f)
                horizontalLineTo(10.75f)
                curveTo(10.34f, 20.0f, 10.0f, 19.66f, 10.0f, 19.25f)
                verticalLineTo(17.72f)
                curveTo(9.39f, 17.36f, 9.0f, 16.71f, 9.0f, 16.0f)
                verticalLineTo(7.0f)
                curveTo(9.0f, 4.0f, 12.0f, 4.0f, 15.5f, 4.0f)
                reflectiveCurveTo(22.0f, 4.0f, 22.0f, 7.0f)
                moveTo(13.0f, 15.0f)
                curveTo(13.0f, 14.45f, 12.55f, 14.0f, 12.0f, 14.0f)
                reflectiveCurveTo(11.0f, 14.45f, 11.0f, 15.0f)
                reflectiveCurveTo(11.45f, 16.0f, 12.0f, 16.0f)
                reflectiveCurveTo(13.0f, 15.55f, 13.0f, 15.0f)
                moveTo(20.0f, 15.0f)
                curveTo(20.0f, 14.45f, 19.55f, 14.0f, 19.0f, 14.0f)
                reflectiveCurveTo(18.0f, 14.45f, 18.0f, 15.0f)
                reflectiveCurveTo(18.45f, 16.0f, 19.0f, 16.0f)
                reflectiveCurveTo(20.0f, 15.55f, 20.0f, 15.0f)
                moveTo(20.0f, 7.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(7.0f)
                moveTo(7.0f, 9.5f)
                curveTo(6.97f, 8.12f, 5.83f, 7.0f, 4.45f, 7.05f)
                curveTo(3.07f, 7.08f, 1.97f, 8.22f, 2.0f, 9.6f)
                curveTo(2.03f, 10.77f, 2.86f, 11.77f, 4.0f, 12.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(12.0f)
                curveTo(6.18f, 11.76f, 7.0f, 10.71f, 7.0f, 9.5f)
                close()
            }
        }
        .build()
        return _busStop!!
    }

private var _busStop: ImageVector? = null
