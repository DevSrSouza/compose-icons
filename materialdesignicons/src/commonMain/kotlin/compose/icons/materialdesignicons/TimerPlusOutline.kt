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

public val MaterialDesignIcons.TimerPlusOutline: ImageVector
    get() {
        if (_timerPlusOutline != null) {
            return _timerPlusOutline!!
        }
        _timerPlusOutline = Builder(name = "TimerPlusOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                reflectiveCurveTo(19.0f, 9.13f, 19.0f, 13.0f)
                curveTo(19.7f, 13.0f, 20.36f, 13.13f, 21.0f, 13.35f)
                curveTo(21.0f, 13.23f, 21.0f, 13.12f, 21.0f, 13.0f)
                curveTo(21.0f, 10.88f, 20.26f, 8.93f, 19.03f, 7.39f)
                lineTo(20.45f, 5.97f)
                curveTo(20.0f, 5.46f, 19.55f, 5.0f, 19.04f, 4.56f)
                lineTo(17.62f, 6.0f)
                curveTo(16.07f, 4.74f, 14.12f, 4.0f, 12.0f, 4.0f)
                curveTo(7.03f, 4.0f, 3.0f, 8.03f, 3.0f, 13.0f)
                reflectiveCurveTo(7.03f, 22.0f, 12.0f, 22.0f)
                curveTo(12.59f, 22.0f, 13.16f, 21.94f, 13.71f, 21.83f)
                curveTo(13.4f, 21.25f, 13.18f, 20.6f, 13.08f, 19.91f)
                curveTo(12.72f, 19.96f, 12.37f, 20.0f, 12.0f, 20.0f)
                moveTo(20.0f, 18.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _timerPlusOutline!!
    }

private var _timerPlusOutline: ImageVector? = null
