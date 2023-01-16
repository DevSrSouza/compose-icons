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

public val MaterialDesignIcons.TimerMusic: ImageVector
    get() {
        if (_timerMusic != null) {
            return _timerMusic!!
        }
        _timerMusic = Builder(name = "TimerMusic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 16.11f)
                verticalLineTo(11.0f)
                horizontalLineTo(20.77f)
                curveTo(20.46f, 9.66f, 19.86f, 8.43f, 19.03f, 7.39f)
                lineTo(20.45f, 5.97f)
                curveTo(20.0f, 5.46f, 19.55f, 5.0f, 19.04f, 4.56f)
                lineTo(17.62f, 6.0f)
                curveTo(16.07f, 4.74f, 14.12f, 4.0f, 12.0f, 4.0f)
                curveTo(7.03f, 4.0f, 3.0f, 8.03f, 3.0f, 13.0f)
                reflectiveCurveTo(7.03f, 22.0f, 12.0f, 22.0f)
                curveTo(12.42f, 22.0f, 12.83f, 21.96f, 13.24f, 21.91f)
                curveTo(13.09f, 21.46f, 13.0f, 21.0f, 13.0f, 20.5f)
                curveTo(13.0f, 18.36f, 14.5f, 16.57f, 16.5f, 16.11f)
                moveTo(13.0f, 14.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.0f)
                moveTo(15.0f, 3.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(3.0f)
                moveTo(22.0f, 13.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.5f)
                curveTo(20.0f, 21.88f, 18.88f, 23.0f, 17.5f, 23.0f)
                reflectiveCurveTo(15.0f, 21.88f, 15.0f, 20.5f)
                reflectiveCurveTo(16.12f, 18.0f, 17.5f, 18.0f)
                curveTo(17.86f, 18.0f, 18.19f, 18.07f, 18.5f, 18.21f)
                verticalLineTo(13.0f)
                horizontalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _timerMusic!!
    }

private var _timerMusic: ImageVector? = null
