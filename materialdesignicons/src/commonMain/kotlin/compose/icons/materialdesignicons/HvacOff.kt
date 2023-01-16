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

public val MaterialDesignIcons.HvacOff: ImageVector
    get() {
        if (_hvacOff != null) {
            return _hvacOff!!
        }
        _hvacOff = Builder(name = "HvacOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(3.0f, 4.89f)
                verticalLineTo(21.0f)
                horizontalLineTo(19.11f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(12.0f, 18.0f)
                curveTo(8.67f, 18.0f, 6.0f, 15.33f, 6.0f, 12.0f)
                curveTo(6.0f, 10.82f, 6.34f, 9.73f, 6.92f, 8.81f)
                lineTo(8.43f, 10.32f)
                curveTo(8.24f, 10.69f, 8.1f, 11.09f, 8.06f, 11.5f)
                horizontalLineTo(9.61f)
                lineTo(10.61f, 12.5f)
                horizontalLineTo(8.06f)
                curveTo(8.11f, 13.03f, 8.3f, 13.55f, 8.58f, 14.0f)
                horizontalLineTo(12.11f)
                lineTo(13.11f, 15.0f)
                horizontalLineTo(9.38f)
                curveTo(10.08f, 15.61f, 10.97f, 16.0f, 12.0f, 16.0f)
                curveTo(12.63f, 16.0f, 13.19f, 15.84f, 13.7f, 15.59f)
                lineTo(15.19f, 17.08f)
                curveTo(14.27f, 17.66f, 13.18f, 18.0f, 12.0f, 18.0f)
                moveTo(12.0f, 8.0f)
                curveTo(13.03f, 8.0f, 13.92f, 8.39f, 14.63f, 9.0f)
                horizontalLineTo(12.2f)
                lineTo(11.27f, 8.07f)
                curveTo(11.5f, 8.03f, 11.75f, 8.0f, 12.0f, 8.0f)
                moveTo(9.67f, 6.47f)
                lineTo(6.2f, 3.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(17.8f)
                lineTo(17.53f, 14.33f)
                curveTo(17.83f, 13.62f, 18.0f, 12.83f, 18.0f, 12.0f)
                curveTo(18.0f, 8.67f, 15.33f, 6.0f, 12.0f, 6.0f)
                curveTo(11.17f, 6.0f, 10.38f, 6.17f, 9.67f, 6.47f)
                moveTo(15.94f, 11.5f)
                horizontalLineTo(14.7f)
                lineTo(13.2f, 10.0f)
                horizontalLineTo(15.42f)
                curveTo(15.7f, 10.45f, 15.89f, 10.97f, 15.94f, 11.5f)
                close()
            }
        }
        .build()
        return _hvacOff!!
    }

private var _hvacOff: ImageVector? = null
