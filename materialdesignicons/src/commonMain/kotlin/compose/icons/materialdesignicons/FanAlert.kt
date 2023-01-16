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

public val MaterialDesignIcons.FanAlert: ImageVector
    get() {
        if (_fanAlert != null) {
            return _fanAlert!!
        }
        _fanAlert = Builder(name = "FanAlert", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 11.0f)
                curveTo(9.43f, 11.0f, 9.0f, 11.45f, 9.0f, 12.0f)
                reflectiveCurveTo(9.43f, 13.0f, 10.0f, 13.0f)
                curveTo(10.54f, 13.0f, 11.0f, 12.55f, 11.0f, 12.0f)
                reflectiveCurveTo(10.54f, 11.0f, 10.0f, 11.0f)
                moveTo(10.5f, 2.0f)
                curveTo(15.0f, 2.0f, 15.09f, 5.57f, 12.73f, 6.75f)
                curveTo(11.74f, 7.24f, 11.3f, 8.29f, 11.11f, 9.22f)
                curveTo(11.59f, 9.42f, 12.0f, 9.73f, 12.33f, 10.13f)
                curveTo(16.03f, 8.13f, 20.0f, 8.92f, 20.0f, 12.5f)
                curveTo(20.0f, 17.0f, 16.43f, 17.1f, 15.26f, 14.73f)
                curveTo(14.76f, 13.74f, 13.7f, 13.3f, 12.77f, 13.11f)
                curveTo(12.57f, 13.59f, 12.26f, 14.0f, 11.86f, 14.34f)
                curveTo(13.85f, 18.03f, 13.06f, 22.0f, 9.5f, 22.0f)
                curveTo(5.0f, 22.0f, 4.9f, 18.42f, 7.26f, 17.24f)
                curveTo(8.24f, 16.75f, 8.68f, 15.71f, 8.88f, 14.79f)
                curveTo(8.39f, 14.59f, 7.96f, 14.27f, 7.64f, 13.87f)
                curveTo(3.95f, 15.85f, 0.0f, 15.07f, 0.0f, 11.5f)
                curveTo(0.0f, 7.0f, 3.56f, 6.89f, 4.73f, 9.26f)
                curveTo(5.23f, 10.25f, 6.28f, 10.68f, 7.21f, 10.87f)
                curveTo(7.4f, 10.39f, 7.72f, 9.97f, 8.13f, 9.65f)
                curveTo(6.14f, 5.96f, 6.93f, 2.0f, 10.5f, 2.0f)
                moveTo(22.0f, 13.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(22.0f)
                moveTo(22.0f, 17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _fanAlert!!
    }

private var _fanAlert: ImageVector? = null
