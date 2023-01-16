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

public val MaterialDesignIcons.TimerEdit: ImageVector
    get() {
        if (_timerEdit != null) {
            return _timerEdit!!
        }
        _timerEdit = Builder(name = "TimerEdit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 3.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(3.0f)
                moveTo(19.39f, 10.74f)
                lineTo(11.0f, 19.13f)
                verticalLineTo(21.94f)
                curveTo(6.5f, 21.44f, 3.0f, 17.63f, 3.0f, 13.0f)
                curveTo(3.0f, 8.03f, 7.03f, 4.0f, 12.0f, 4.0f)
                curveTo(14.12f, 4.0f, 16.07f, 4.74f, 17.62f, 6.0f)
                lineTo(19.04f, 4.56f)
                curveTo(19.55f, 5.0f, 20.0f, 5.46f, 20.45f, 5.97f)
                lineTo(19.03f, 7.39f)
                curveTo(19.67f, 8.19f, 20.17f, 9.11f, 20.5f, 10.1f)
                curveTo(20.1f, 10.21f, 19.71f, 10.42f, 19.39f, 10.74f)
                moveTo(13.0f, 7.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.0f)
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
        return _timerEdit!!
    }

private var _timerEdit: ImageVector? = null
