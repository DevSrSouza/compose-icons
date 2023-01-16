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

public val MaterialDesignIcons.CarTireAlert: ImageVector
    get() {
        if (_carTireAlert != null) {
            return _carTireAlert!!
        }
        _carTireAlert = Builder(name = "CarTireAlert", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                moveTo(11.0f, 5.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(5.0f)
                moveTo(17.0f, 4.76f)
                curveTo(18.86f, 6.19f, 20.0f, 8.61f, 20.0f, 11.0f)
                curveTo(20.0f, 14.0f, 18.33f, 16.64f, 15.86f, 18.0f)
                horizontalLineTo(8.14f)
                curveTo(5.67f, 16.64f, 4.0f, 14.0f, 4.0f, 11.0f)
                curveTo(4.0f, 8.61f, 5.09f, 6.17f, 7.0f, 4.76f)
                verticalLineTo(2.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(3.86f)
                curveTo(3.15f, 5.68f, 2.0f, 8.2f, 2.0f, 11.0f)
                curveTo(2.0f, 13.8f, 3.15f, 16.32f, 5.0f, 18.14f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(18.14f)
                curveTo(20.85f, 16.32f, 22.0f, 13.8f, 22.0f, 11.0f)
                curveTo(22.0f, 8.2f, 20.85f, 5.68f, 19.0f, 3.86f)
                verticalLineTo(2.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(4.76f)
                close()
            }
        }
        .build()
        return _carTireAlert!!
    }

private var _carTireAlert: ImageVector? = null
