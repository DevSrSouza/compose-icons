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

public val MaterialDesignIcons.TumbleDryerAlert: ImageVector
    get() {
        if (_tumbleDryerAlert != null) {
            return _tumbleDryerAlert!!
        }
        _tumbleDryerAlert = Builder(name = "TumbleDryerAlert", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 2.0f)
                horizontalLineTo(16.0f)
                curveTo(17.11f, 2.0f, 18.0f, 2.9f, 18.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(18.0f, 21.11f, 17.11f, 22.0f, 16.0f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 22.0f, 2.0f, 21.11f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 2.9f, 2.9f, 2.0f, 4.0f, 2.0f)
                moveTo(5.0f, 4.0f)
                curveTo(4.45f, 4.0f, 4.0f, 4.45f, 4.0f, 5.0f)
                reflectiveCurveTo(4.45f, 6.0f, 5.0f, 6.0f)
                reflectiveCurveTo(6.0f, 5.55f, 6.0f, 5.0f)
                reflectiveCurveTo(5.55f, 4.0f, 5.0f, 4.0f)
                moveTo(8.0f, 4.0f)
                curveTo(7.45f, 4.0f, 7.0f, 4.45f, 7.0f, 5.0f)
                reflectiveCurveTo(7.45f, 6.0f, 8.0f, 6.0f)
                reflectiveCurveTo(9.0f, 5.55f, 9.0f, 5.0f)
                reflectiveCurveTo(8.55f, 4.0f, 8.0f, 4.0f)
                moveTo(10.0f, 8.0f)
                curveTo(6.69f, 8.0f, 4.0f, 10.69f, 4.0f, 14.0f)
                reflectiveCurveTo(6.69f, 20.0f, 10.0f, 20.0f)
                reflectiveCurveTo(16.0f, 17.31f, 16.0f, 14.0f)
                reflectiveCurveTo(13.31f, 8.0f, 10.0f, 8.0f)
                moveTo(6.11f, 10.5f)
                horizontalLineTo(8.0f)
                curveTo(7.76f, 11.88f, 8.0f, 12.67f, 8.58f, 13.29f)
                curveTo(9.68f, 14.36f, 10.16f, 15.71f, 9.89f, 17.5f)
                horizontalLineTo(8.0f)
                curveTo(8.24f, 16.12f, 8.0f, 15.33f, 7.42f, 14.71f)
                curveTo(6.32f, 13.64f, 5.85f, 12.29f, 6.11f, 10.5f)
                moveTo(10.11f, 10.5f)
                horizontalLineTo(12.0f)
                curveTo(11.76f, 11.88f, 12.0f, 12.67f, 12.58f, 13.29f)
                curveTo(13.68f, 14.36f, 14.16f, 15.71f, 13.89f, 17.5f)
                horizontalLineTo(12.0f)
                curveTo(12.24f, 16.12f, 12.0f, 15.33f, 11.42f, 14.71f)
                curveTo(10.32f, 13.64f, 9.85f, 12.29f, 10.11f, 10.5f)
                moveTo(20.0f, 15.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(15.0f)
                moveTo(20.0f, 7.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _tumbleDryerAlert!!
    }

private var _tumbleDryerAlert: ImageVector? = null
