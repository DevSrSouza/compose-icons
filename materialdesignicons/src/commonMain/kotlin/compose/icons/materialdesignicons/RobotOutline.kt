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

public val MaterialDesignIcons.RobotOutline: ImageVector
    get() {
        if (_robotOutline != null) {
            return _robotOutline!!
        }
        _robotOutline = Builder(name = "RobotOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 15.5f)
                curveTo(17.5f, 16.61f, 16.61f, 17.5f, 15.5f, 17.5f)
                reflectiveCurveTo(13.5f, 16.61f, 13.5f, 15.5f)
                reflectiveCurveTo(14.4f, 13.5f, 15.5f, 13.5f)
                reflectiveCurveTo(17.5f, 14.4f, 17.5f, 15.5f)
                moveTo(8.5f, 13.5f)
                curveTo(7.4f, 13.5f, 6.5f, 14.4f, 6.5f, 15.5f)
                reflectiveCurveTo(7.4f, 17.5f, 8.5f, 17.5f)
                reflectiveCurveTo(10.5f, 16.61f, 10.5f, 15.5f)
                reflectiveCurveTo(9.61f, 13.5f, 8.5f, 13.5f)
                moveTo(23.0f, 15.0f)
                verticalLineTo(18.0f)
                curveTo(23.0f, 18.55f, 22.55f, 19.0f, 22.0f, 19.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(20.0f)
                curveTo(21.0f, 21.11f, 20.11f, 22.0f, 19.0f, 22.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 22.0f, 3.0f, 21.11f, 3.0f, 20.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(2.0f)
                curveTo(1.45f, 19.0f, 1.0f, 18.55f, 1.0f, 18.0f)
                verticalLineTo(15.0f)
                curveTo(1.0f, 14.45f, 1.45f, 14.0f, 2.0f, 14.0f)
                horizontalLineTo(3.0f)
                curveTo(3.0f, 10.13f, 6.13f, 7.0f, 10.0f, 7.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(5.73f)
                curveTo(10.4f, 5.39f, 10.0f, 4.74f, 10.0f, 4.0f)
                curveTo(10.0f, 2.9f, 10.9f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(14.0f, 2.9f, 14.0f, 4.0f)
                curveTo(14.0f, 4.74f, 13.6f, 5.39f, 13.0f, 5.73f)
                verticalLineTo(7.0f)
                horizontalLineTo(14.0f)
                curveTo(17.87f, 7.0f, 21.0f, 10.13f, 21.0f, 14.0f)
                horizontalLineTo(22.0f)
                curveTo(22.55f, 14.0f, 23.0f, 14.45f, 23.0f, 15.0f)
                moveTo(21.0f, 16.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(14.0f)
                curveTo(19.0f, 11.24f, 16.76f, 9.0f, 14.0f, 9.0f)
                horizontalLineTo(10.0f)
                curveTo(7.24f, 9.0f, 5.0f, 11.24f, 5.0f, 14.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _robotOutline!!
    }

private var _robotOutline: ImageVector? = null
