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

public val MaterialDesignIcons.LightbulbMultipleOff: ImageVector
    get() {
        if (_lightbulbMultipleOff != null) {
            return _lightbulbMultipleOff!!
        }
        _lightbulbMultipleOff = Builder(name = "LightbulbMultipleOff", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.84f, 22.73f)
                lineTo(16.74f, 18.63f)
                curveTo(16.55f, 18.85f, 16.29f, 19.0f, 16.0f, 19.0f)
                horizontalLineTo(12.0f)
                curveTo(11.42f, 19.0f, 11.0f, 18.55f, 11.0f, 18.0f)
                verticalLineTo(16.0f)
                curveTo(9.37f, 14.8f, 8.71f, 12.82f, 9.1f, 11.0f)
                lineTo(7.5f, 9.39f)
                curveTo(7.17f, 10.2f, 6.97f, 11.08f, 7.0f, 12.0f)
                curveTo(6.97f, 12.68f, 7.07f, 13.35f, 7.28f, 14.0f)
                horizontalLineTo(7.0f)
                curveTo(6.42f, 14.0f, 6.0f, 13.55f, 6.0f, 13.0f)
                verticalLineTo(11.0f)
                curveTo(5.3f, 10.5f, 4.77f, 9.81f, 4.43f, 9.04f)
                curveTo(4.0f, 8.05f, 3.91f, 7.0f, 4.12f, 6.0f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                moveTo(13.58f, 5.0f)
                curveTo(12.46f, 2.47f, 9.5f, 1.33f, 7.0f, 2.45f)
                curveTo(6.68f, 2.58f, 6.39f, 2.75f, 6.13f, 2.93f)
                lineTo(9.67f, 6.47f)
                curveTo(10.76f, 5.63f, 12.1f, 5.08f, 13.58f, 5.0f)
                moveTo(18.06f, 14.86f)
                curveTo(19.6f, 12.66f, 19.14f, 9.62f, 17.0f, 8.0f)
                curveTo(15.2f, 6.67f, 12.84f, 6.72f, 11.12f, 7.92f)
                lineTo(18.06f, 14.86f)
                moveTo(12.0f, 21.0f)
                curveTo(12.0f, 21.55f, 12.42f, 22.0f, 13.0f, 22.0f)
                horizontalLineTo(15.0f)
                curveTo(15.53f, 22.0f, 16.0f, 21.55f, 16.0f, 21.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(21.0f)
                moveTo(7.0f, 15.0f)
                verticalLineTo(16.0f)
                curveTo(7.0f, 16.55f, 7.42f, 17.0f, 8.0f, 17.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(16.88f)
                curveTo(8.43f, 16.33f, 8.0f, 15.7f, 7.66f, 15.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _lightbulbMultipleOff!!
    }

private var _lightbulbMultipleOff: ImageVector? = null
