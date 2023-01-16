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

public val MaterialDesignIcons.WatchVibrateOff: ImageVector
    get() {
        if (_watchVibrateOff != null) {
            return _watchVibrateOff!!
        }
        _watchVibrateOff = Builder(name = "WatchVibrateOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 9.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(9.0f)
                moveTo(12.0f, 7.5f)
                curveTo(14.47f, 7.5f, 16.47f, 9.53f, 16.46f, 12.0f)
                curveTo(16.45f, 12.38f, 16.4f, 12.76f, 16.3f, 13.13f)
                lineTo(17.5f, 14.31f)
                curveTo(17.81f, 13.58f, 18.0f, 12.8f, 18.0f, 12.0f)
                curveTo(18.0f, 10.17f, 17.16f, 8.44f, 15.72f, 7.31f)
                lineTo(15.0f, 3.0f)
                horizontalLineTo(9.0f)
                lineTo(8.59f, 5.39f)
                lineTo(10.86f, 7.66f)
                curveTo(11.23f, 7.55f, 11.61f, 7.5f, 12.0f, 7.5f)
                moveTo(21.0f, 17.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.8f)
                lineTo(20.2f, 17.0f)
                horizontalLineTo(21.0f)
                moveTo(16.5f, 15.86f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(15.55f, 17.44f)
                lineTo(15.0f, 21.0f)
                horizontalLineTo(9.0f)
                lineTo(8.27f, 16.72f)
                curveTo(5.85f, 14.82f, 5.27f, 11.4f, 6.91f, 8.8f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(8.09f, 7.44f)
                lineTo(9.17f, 8.5f)
                lineTo(15.44f, 14.79f)
                lineTo(16.5f, 15.86f)
                moveTo(14.05f, 15.94f)
                lineTo(8.05f, 9.94f)
                curveTo(7.7f, 10.57f, 7.5f, 11.28f, 7.5f, 12.0f)
                curveTo(7.5f, 14.47f, 9.53f, 16.47f, 12.0f, 16.46f)
                curveTo(12.72f, 16.46f, 13.42f, 16.28f, 14.05f, 15.94f)
                moveTo(22.0f, 9.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(22.0f)
                moveTo(3.0f, 17.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _watchVibrateOff!!
    }

private var _watchVibrateOff: ImageVector? = null
