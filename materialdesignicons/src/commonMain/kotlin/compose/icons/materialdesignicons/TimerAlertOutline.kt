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

public val MaterialDesignIcons.TimerAlertOutline: ImageVector
    get() {
        if (_timerAlertOutline != null) {
            return _timerAlertOutline!!
        }
        _timerAlertOutline = Builder(name = "TimerAlertOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 8.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(8.0f)
                moveTo(13.0f, 1.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(1.0f)
                moveTo(17.03f, 7.39f)
                curveTo(18.26f, 8.93f, 19.0f, 10.88f, 19.0f, 13.0f)
                curveTo(19.0f, 17.97f, 15.0f, 22.0f, 10.0f, 22.0f)
                curveTo(5.03f, 22.0f, 1.0f, 17.97f, 1.0f, 13.0f)
                reflectiveCurveTo(5.03f, 4.0f, 10.0f, 4.0f)
                curveTo(12.12f, 4.0f, 14.07f, 4.74f, 15.62f, 6.0f)
                lineTo(17.04f, 4.56f)
                curveTo(17.55f, 5.0f, 18.0f, 5.46f, 18.45f, 5.97f)
                lineTo(17.03f, 7.39f)
                moveTo(17.0f, 13.0f)
                curveTo(17.0f, 9.13f, 13.87f, 6.0f, 10.0f, 6.0f)
                reflectiveCurveTo(3.0f, 9.13f, 3.0f, 13.0f)
                reflectiveCurveTo(6.13f, 20.0f, 10.0f, 20.0f)
                reflectiveCurveTo(17.0f, 16.87f, 17.0f, 13.0f)
                moveTo(21.0f, 7.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(21.0f)
                moveTo(21.0f, 17.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _timerAlertOutline!!
    }

private var _timerAlertOutline: ImageVector? = null
