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

public val MaterialDesignIcons.TimerRemoveOutline: ImageVector
    get() {
        if (_timerRemoveOutline != null) {
            return _timerRemoveOutline!!
        }
        _timerRemoveOutline = Builder(name = "TimerRemoveOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.08f, 19.91f)
                curveTo(13.18f, 20.6f, 13.4f, 21.25f, 13.71f, 21.83f)
                curveTo(13.16f, 21.94f, 12.59f, 22.0f, 12.0f, 22.0f)
                curveTo(7.03f, 22.0f, 3.0f, 17.97f, 3.0f, 13.0f)
                reflectiveCurveTo(7.03f, 4.0f, 12.0f, 4.0f)
                curveTo(14.12f, 4.0f, 16.07f, 4.74f, 17.62f, 6.0f)
                lineTo(19.04f, 4.56f)
                curveTo(19.55f, 5.0f, 20.0f, 5.46f, 20.45f, 5.97f)
                lineTo(19.03f, 7.39f)
                curveTo(20.26f, 8.93f, 21.0f, 10.88f, 21.0f, 13.0f)
                curveTo(21.0f, 13.12f, 21.0f, 13.23f, 21.0f, 13.35f)
                curveTo(20.36f, 13.13f, 19.7f, 13.0f, 19.0f, 13.0f)
                curveTo(19.0f, 9.13f, 15.87f, 6.0f, 12.0f, 6.0f)
                reflectiveCurveTo(5.0f, 9.13f, 5.0f, 13.0f)
                reflectiveCurveTo(8.13f, 20.0f, 12.0f, 20.0f)
                curveTo(12.37f, 20.0f, 12.72f, 19.96f, 13.08f, 19.91f)
                moveTo(11.0f, 14.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(14.0f)
                moveTo(15.0f, 1.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(1.0f)
                moveTo(22.54f, 16.88f)
                lineTo(21.12f, 15.47f)
                lineTo(19.0f, 17.59f)
                lineTo(16.88f, 15.47f)
                lineTo(15.47f, 16.88f)
                lineTo(17.59f, 19.0f)
                lineTo(15.47f, 21.12f)
                lineTo(16.88f, 22.54f)
                lineTo(19.0f, 20.41f)
                lineTo(21.12f, 22.54f)
                lineTo(22.54f, 21.12f)
                lineTo(20.41f, 19.0f)
                lineTo(22.54f, 16.88f)
                close()
            }
        }
        .build()
        return _timerRemoveOutline!!
    }

private var _timerRemoveOutline: ImageVector? = null
