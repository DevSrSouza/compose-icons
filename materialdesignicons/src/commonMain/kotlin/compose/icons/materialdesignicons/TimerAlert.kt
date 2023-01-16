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

public val MaterialDesignIcons.TimerAlert: ImageVector
    get() {
        if (_timerAlert != null) {
            return _timerAlert!!
        }
        _timerAlert = Builder(name = "TimerAlert", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.45f, 5.97f)
                curveTo(18.0f, 5.46f, 17.55f, 5.0f, 17.04f, 4.56f)
                lineTo(15.62f, 6.0f)
                curveTo(14.07f, 4.74f, 12.12f, 4.0f, 10.0f, 4.0f)
                curveTo(5.03f, 4.0f, 1.0f, 8.03f, 1.0f, 13.0f)
                reflectiveCurveTo(5.03f, 22.0f, 10.0f, 22.0f)
                curveTo(15.0f, 22.0f, 19.0f, 17.97f, 19.0f, 13.0f)
                curveTo(19.0f, 10.88f, 18.26f, 8.93f, 17.03f, 7.39f)
                lineTo(18.45f, 5.97f)
                moveTo(11.0f, 14.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(14.0f)
                moveTo(13.0f, 3.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(3.0f)
                moveTo(23.0f, 7.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(23.0f)
                moveTo(21.0f, 15.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _timerAlert!!
    }

private var _timerAlert: ImageVector? = null
