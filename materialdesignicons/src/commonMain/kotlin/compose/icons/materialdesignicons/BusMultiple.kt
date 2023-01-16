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

public val MaterialDesignIcons.BusMultiple: ImageVector
    get() {
        if (_busMultiple != null) {
            return _busMultiple!!
        }
        _busMultiple = Builder(name = "BusMultiple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 5.0f)
                curveTo(5.58f, 5.0f, 2.0f, 5.5f, 2.0f, 9.0f)
                verticalLineTo(19.0f)
                curveTo(2.0f, 19.85f, 2.37f, 20.66f, 3.0f, 21.22f)
                verticalLineTo(23.0f)
                curveTo(3.0f, 23.55f, 3.45f, 24.0f, 4.0f, 24.0f)
                horizontalLineTo(5.0f)
                curveTo(5.55f, 24.0f, 6.0f, 23.55f, 6.0f, 23.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(23.0f)
                curveTo(14.0f, 23.55f, 14.45f, 24.0f, 15.0f, 24.0f)
                horizontalLineTo(16.0f)
                curveTo(16.55f, 24.0f, 17.0f, 23.55f, 17.0f, 23.0f)
                verticalLineTo(21.22f)
                curveTo(17.63f, 20.66f, 18.0f, 19.85f, 18.0f, 19.0f)
                verticalLineTo(9.0f)
                curveTo(18.0f, 5.5f, 14.42f, 5.0f, 10.0f, 5.0f)
                moveTo(5.5f, 20.0f)
                curveTo(4.67f, 20.0f, 4.0f, 19.33f, 4.0f, 18.5f)
                reflectiveCurveTo(4.67f, 17.0f, 5.5f, 17.0f)
                reflectiveCurveTo(7.0f, 17.67f, 7.0f, 18.5f)
                reflectiveCurveTo(6.33f, 20.0f, 5.5f, 20.0f)
                moveTo(14.5f, 20.0f)
                curveTo(13.67f, 20.0f, 13.0f, 19.33f, 13.0f, 18.5f)
                reflectiveCurveTo(13.67f, 17.0f, 14.5f, 17.0f)
                reflectiveCurveTo(16.0f, 17.67f, 16.0f, 18.5f)
                reflectiveCurveTo(15.33f, 20.0f, 14.5f, 20.0f)
                moveTo(16.0f, 14.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(14.0f)
                moveTo(22.0f, 5.0f)
                verticalLineTo(15.0f)
                curveTo(22.0f, 15.85f, 21.63f, 16.66f, 21.0f, 17.22f)
                verticalLineTo(19.0f)
                curveTo(21.0f, 19.55f, 20.55f, 20.0f, 20.0f, 20.0f)
                horizontalLineTo(19.88f)
                curveTo(19.95f, 19.68f, 20.0f, 19.35f, 20.0f, 19.0f)
                verticalLineTo(9.0f)
                curveTo(20.0f, 3.0f, 13.0f, 3.0f, 10.0f, 3.0f)
                curveTo(9.09f, 3.0f, 7.8f, 3.0f, 6.46f, 3.17f)
                curveTo(7.55f, 1.32f, 10.5f, 1.0f, 14.0f, 1.0f)
                curveTo(18.42f, 1.0f, 22.0f, 1.5f, 22.0f, 5.0f)
                close()
            }
        }
        .build()
        return _busMultiple!!
    }

private var _busMultiple: ImageVector? = null
