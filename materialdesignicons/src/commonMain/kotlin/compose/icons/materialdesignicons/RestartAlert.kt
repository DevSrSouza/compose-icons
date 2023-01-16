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

public val MaterialDesignIcons.RestartAlert: ImageVector
    get() {
        if (_restartAlert != null) {
            return _restartAlert!!
        }
        _restartAlert = Builder(name = "RestartAlert", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 4.03f)
                verticalLineTo(0.633f)
                lineTo(5.0f, 5.63f)
                lineTo(10.0f, 10.63f)
                verticalLineTo(6.03f)
                curveTo(11.5f, 6.03f, 13.11f, 6.63f, 14.21f, 7.73f)
                curveTo(16.5f, 10.13f, 16.5f, 13.93f, 14.21f, 16.23f)
                curveTo(12.91f, 17.53f, 11.11f, 18.13f, 9.4f, 17.93f)
                lineTo(8.9f, 19.93f)
                curveTo(11.31f, 20.23f, 13.81f, 19.53f, 15.61f, 17.63f)
                curveTo(18.7f, 14.53f, 18.7f, 9.43f, 15.61f, 6.33f)
                curveTo(14.11f, 4.83f, 12.11f, 4.03f, 10.0f, 4.03f)
                moveTo(4.31f, 17.63f)
                curveTo(5.11f, 18.43f, 6.0f, 19.03f, 7.0f, 19.43f)
                lineTo(7.61f, 17.43f)
                curveTo(6.91f, 17.13f, 6.31f, 16.73f, 5.81f, 16.23f)
                curveTo(3.91f, 14.43f, 3.5f, 11.63f, 4.61f, 9.43f)
                lineTo(3.11f, 7.93f)
                curveTo(1.31f, 11.03f, 1.71f, 15.03f, 4.31f, 17.63f)
                moveTo(20.0f, 13.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(13.0f)
                moveTo(20.0f, 17.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _restartAlert!!
    }

private var _restartAlert: ImageVector? = null
