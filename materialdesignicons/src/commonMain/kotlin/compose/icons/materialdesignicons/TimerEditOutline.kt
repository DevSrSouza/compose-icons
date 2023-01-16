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

public val MaterialDesignIcons.TimerEditOutline: ImageVector
    get() {
        if (_timerEditOutline != null) {
            return _timerEditOutline!!
        }
        _timerEditOutline = Builder(name = "TimerEditOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 14.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.0f)
                moveTo(15.0f, 1.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(1.0f)
                moveTo(5.0f, 13.0f)
                curveTo(5.0f, 9.13f, 8.13f, 6.0f, 12.0f, 6.0f)
                curveTo(15.29f, 6.0f, 18.05f, 8.28f, 18.79f, 11.34f)
                lineTo(19.39f, 10.74f)
                curveTo(19.71f, 10.42f, 20.1f, 10.21f, 20.5f, 10.1f)
                curveTo(20.18f, 9.11f, 19.67f, 8.19f, 19.03f, 7.39f)
                lineTo(20.45f, 5.97f)
                curveTo(20.0f, 5.46f, 19.55f, 5.0f, 19.04f, 4.56f)
                lineTo(17.62f, 6.0f)
                curveTo(16.07f, 4.74f, 14.12f, 4.0f, 12.0f, 4.0f)
                curveTo(7.03f, 4.0f, 3.0f, 8.03f, 3.0f, 13.0f)
                curveTo(3.0f, 17.63f, 6.5f, 21.44f, 11.0f, 21.94f)
                verticalLineTo(19.92f)
                curveTo(7.61f, 19.43f, 5.0f, 16.53f, 5.0f, 13.0f)
                moveTo(13.0f, 19.96f)
                verticalLineTo(22.0f)
                horizontalLineTo(15.04f)
                lineTo(21.17f, 15.88f)
                lineTo(19.13f, 13.83f)
                lineTo(13.0f, 19.96f)
                moveTo(22.85f, 13.47f)
                lineTo(21.53f, 12.15f)
                curveTo(21.33f, 11.95f, 21.0f, 11.95f, 20.81f, 12.15f)
                lineTo(19.83f, 13.13f)
                lineTo(21.87f, 15.17f)
                lineTo(22.85f, 14.19f)
                curveTo(23.05f, 14.0f, 23.05f, 13.67f, 22.85f, 13.47f)
                close()
            }
        }
        .build()
        return _timerEditOutline!!
    }

private var _timerEditOutline: ImageVector? = null
