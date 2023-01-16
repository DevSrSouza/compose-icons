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

public val MaterialDesignIcons.TimerRefreshOutline: ImageVector
    get() {
        if (_timerRefreshOutline != null) {
            return _timerRefreshOutline!!
        }
        _timerRefreshOutline = Builder(name = "TimerRefreshOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 8.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(8.0f)
                moveTo(15.0f, 1.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(1.0f)
                moveTo(12.0f, 20.0f)
                curveTo(8.13f, 20.0f, 5.0f, 16.87f, 5.0f, 13.0f)
                reflectiveCurveTo(8.13f, 6.0f, 12.0f, 6.0f)
                curveTo(15.54f, 6.0f, 18.45f, 8.62f, 18.93f, 12.03f)
                curveTo(19.65f, 12.08f, 20.34f, 12.23f, 21.0f, 12.5f)
                curveTo(20.87f, 10.57f, 20.16f, 8.81f, 19.03f, 7.39f)
                lineTo(20.45f, 5.97f)
                curveTo(20.0f, 5.46f, 19.55f, 5.0f, 19.04f, 4.56f)
                lineTo(17.62f, 6.0f)
                curveTo(16.07f, 4.74f, 14.12f, 4.0f, 12.0f, 4.0f)
                curveTo(7.03f, 4.0f, 3.0f, 8.03f, 3.0f, 13.0f)
                reflectiveCurveTo(7.03f, 22.0f, 12.0f, 22.0f)
                curveTo(12.34f, 22.0f, 12.67f, 22.0f, 13.0f, 21.94f)
                curveTo(12.63f, 21.35f, 12.35f, 20.69f, 12.18f, 20.0f)
                curveTo(12.12f, 20.0f, 12.06f, 20.0f, 12.0f, 20.0f)
                moveTo(22.0f, 18.5f)
                verticalLineTo(14.5f)
                lineTo(20.83f, 15.67f)
                curveTo(20.11f, 14.95f, 19.11f, 14.5f, 18.0f, 14.5f)
                curveTo(15.79f, 14.5f, 14.0f, 16.29f, 14.0f, 18.5f)
                reflectiveCurveTo(15.79f, 22.5f, 18.0f, 22.5f)
                curveTo(19.68f, 22.5f, 21.12f, 21.47f, 21.71f, 20.0f)
                horizontalLineTo(20.0f)
                curveTo(19.54f, 20.61f, 18.82f, 21.0f, 18.0f, 21.0f)
                curveTo(16.62f, 21.0f, 15.5f, 19.88f, 15.5f, 18.5f)
                reflectiveCurveTo(16.62f, 16.0f, 18.0f, 16.0f)
                curveTo(18.69f, 16.0f, 19.32f, 16.28f, 19.77f, 16.73f)
                lineTo(18.0f, 18.5f)
                horizontalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _timerRefreshOutline!!
    }

private var _timerRefreshOutline: ImageVector? = null
