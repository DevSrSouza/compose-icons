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

public val MaterialDesignIcons.TimerCancelOutline: ImageVector
    get() {
        if (_timerCancelOutline != null) {
            return _timerCancelOutline!!
        }
        _timerCancelOutline = Builder(name = "TimerCancelOutline", defaultWidth = 24.0.dp,
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
                moveTo(23.0f, 18.5f)
                curveTo(23.0f, 21.0f, 21.0f, 23.0f, 18.5f, 23.0f)
                reflectiveCurveTo(14.0f, 21.0f, 14.0f, 18.5f)
                reflectiveCurveTo(16.0f, 14.0f, 18.5f, 14.0f)
                reflectiveCurveTo(23.0f, 16.0f, 23.0f, 18.5f)
                moveTo(20.0f, 21.08f)
                lineTo(15.92f, 17.0f)
                curveTo(15.65f, 17.42f, 15.5f, 17.94f, 15.5f, 18.5f)
                curveTo(15.5f, 20.16f, 16.84f, 21.5f, 18.5f, 21.5f)
                curveTo(19.06f, 21.5f, 19.58f, 21.35f, 20.0f, 21.08f)
                moveTo(21.5f, 18.5f)
                curveTo(21.5f, 16.84f, 20.16f, 15.5f, 18.5f, 15.5f)
                curveTo(17.94f, 15.5f, 17.42f, 15.65f, 17.0f, 15.92f)
                lineTo(21.08f, 20.0f)
                curveTo(21.35f, 19.58f, 21.5f, 19.06f, 21.5f, 18.5f)
                close()
            }
        }
        .build()
        return _timerCancelOutline!!
    }

private var _timerCancelOutline: ImageVector? = null
