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

public val MaterialDesignIcons.LightbulbGroupOff: ImageVector
    get() {
        if (_lightbulbGroupOff != null) {
            return _lightbulbGroupOff!!
        }
        _lightbulbGroupOff = Builder(name = "LightbulbGroupOff", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.84f, 22.73f)
                lineTo(18.09f, 20.0f)
                curveTo(18.06f, 20.0f, 18.03f, 20.0f, 18.0f, 20.0f)
                horizontalLineTo(16.83f)
                curveTo(16.94f, 19.68f, 17.0f, 19.34f, 17.0f, 19.0f)
                verticalLineTo(18.89f)
                lineTo(14.75f, 16.64f)
                curveTo(14.57f, 16.86f, 14.31f, 17.0f, 14.0f, 17.0f)
                horizontalLineTo(10.0f)
                curveTo(9.45f, 17.0f, 9.0f, 16.55f, 9.0f, 16.0f)
                verticalLineTo(14.0f)
                curveTo(7.4f, 12.8f, 6.74f, 10.84f, 7.12f, 9.0f)
                lineTo(5.5f, 7.4f)
                curveTo(5.18f, 8.23f, 5.0f, 9.11f, 5.0f, 10.0f)
                curveTo(5.0f, 11.83f, 5.72f, 13.58f, 7.0f, 14.88f)
                verticalLineTo(17.0f)
                horizontalLineTo(5.0f)
                curveTo(4.45f, 17.0f, 4.0f, 16.55f, 4.0f, 16.0f)
                verticalLineTo(14.45f)
                curveTo(2.86f, 13.79f, 2.12f, 12.62f, 2.0f, 11.31f)
                curveTo(1.85f, 9.27f, 3.25f, 7.5f, 5.2f, 7.09f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                moveTo(15.0f, 6.0f)
                curveTo(13.22f, 4.67f, 10.86f, 4.72f, 9.13f, 5.93f)
                lineTo(16.08f, 12.88f)
                curveTo(17.63f, 10.67f, 17.17f, 7.63f, 15.0f, 6.0f)
                moveTo(19.79f, 16.59f)
                curveTo(19.91f, 16.42f, 20.0f, 16.22f, 20.0f, 16.0f)
                verticalLineTo(14.45f)
                curveTo(21.91f, 13.34f, 22.57f, 10.9f, 21.46f, 9.0f)
                curveTo(20.8f, 7.85f, 19.63f, 7.11f, 18.32f, 7.0f)
                curveTo(18.77f, 7.94f, 19.0f, 8.96f, 19.0f, 10.0f)
                curveTo(19.0f, 11.57f, 18.47f, 13.09f, 17.5f, 14.31f)
                lineTo(19.79f, 16.59f)
                moveTo(10.0f, 19.0f)
                curveTo(10.0f, 19.55f, 10.45f, 20.0f, 11.0f, 20.0f)
                horizontalLineTo(13.0f)
                curveTo(13.55f, 20.0f, 14.0f, 19.55f, 14.0f, 19.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(19.0f)
                moveTo(7.0f, 18.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                curveTo(5.0f, 19.55f, 5.45f, 20.0f, 6.0f, 20.0f)
                horizontalLineTo(7.17f)
                curveTo(7.06f, 19.68f, 7.0f, 19.34f, 7.0f, 19.0f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _lightbulbGroupOff!!
    }

private var _lightbulbGroupOff: ImageVector? = null
