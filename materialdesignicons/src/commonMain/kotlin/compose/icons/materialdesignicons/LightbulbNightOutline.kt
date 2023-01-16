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

public val MaterialDesignIcons.LightbulbNightOutline: ImageVector
    get() {
        if (_lightbulbNightOutline != null) {
            return _lightbulbNightOutline!!
        }
        _lightbulbNightOutline = Builder(name = "LightbulbNightOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 20.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(21.0f)
                curveTo(12.0f, 21.55f, 11.55f, 22.0f, 11.0f, 22.0f)
                horizontalLineTo(7.0f)
                curveTo(6.45f, 22.0f, 6.0f, 21.55f, 6.0f, 21.0f)
                verticalLineTo(20.0f)
                moveTo(11.0f, 14.89f)
                verticalLineTo(16.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(13.58f)
                curveTo(5.23f, 12.81f, 4.0f, 11.05f, 4.0f, 9.0f)
                curveTo(4.0f, 6.24f, 6.24f, 4.0f, 9.0f, 4.0f)
                curveTo(9.9f, 4.0f, 10.73f, 4.26f, 11.46f, 4.67f)
                curveTo(12.0f, 4.2f, 12.66f, 3.81f, 13.35f, 3.5f)
                curveTo(12.16f, 2.57f, 10.65f, 2.0f, 9.0f, 2.0f)
                curveTo(5.13f, 2.0f, 2.0f, 5.13f, 2.0f, 9.0f)
                curveTo(2.0f, 11.38f, 3.19f, 13.47f, 5.0f, 14.74f)
                verticalLineTo(17.0f)
                curveTo(5.0f, 17.55f, 5.45f, 18.0f, 6.0f, 18.0f)
                horizontalLineTo(12.0f)
                curveTo(12.55f, 18.0f, 13.0f, 17.55f, 13.0f, 17.0f)
                verticalLineTo(16.32f)
                curveTo(12.25f, 15.96f, 11.57f, 15.5f, 11.0f, 14.89f)
                moveTo(20.92f, 9.94f)
                lineTo(20.42f, 8.3f)
                lineTo(21.72f, 7.22f)
                lineTo(20.04f, 7.18f)
                lineTo(19.41f, 5.6f)
                lineTo(18.85f, 7.21f)
                lineTo(17.17f, 7.32f)
                lineTo(18.5f, 8.35f)
                lineTo(18.1f, 10.0f)
                lineTo(19.5f, 9.03f)
                lineTo(20.92f, 9.94f)
                moveTo(19.12f, 12.25f)
                curveTo(17.79f, 12.03f, 16.58f, 11.24f, 15.85f, 9.97f)
                curveTo(15.12f, 8.71f, 15.05f, 7.25f, 15.5f, 5.97f)
                curveTo(15.64f, 5.63f, 15.34f, 5.29f, 15.0f, 5.34f)
                curveTo(11.56f, 6.0f, 10.0f, 10.13f, 12.22f, 12.95f)
                curveTo(14.03f, 15.19f, 17.5f, 15.27f, 19.39f, 13.0f)
                curveTo(19.62f, 12.74f, 19.47f, 12.3f, 19.12f, 12.25f)
                close()
            }
        }
        .build()
        return _lightbulbNightOutline!!
    }

private var _lightbulbNightOutline: ImageVector? = null
