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

public val MaterialDesignIcons.LightbulbMultipleOutline: ImageVector
    get() {
        if (_lightbulbMultipleOutline != null) {
            return _lightbulbMultipleOutline!!
        }
        _lightbulbMultipleOutline = Builder(name = "LightbulbMultipleOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 21.0f)
                curveTo(12.0f, 21.55f, 12.45f, 22.0f, 13.0f, 22.0f)
                horizontalLineTo(15.0f)
                curveTo(15.55f, 22.0f, 16.0f, 21.55f, 16.0f, 21.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(12.0f)
                moveTo(14.0f, 7.0f)
                curveTo(11.24f, 7.0f, 9.0f, 9.24f, 9.0f, 12.0f)
                curveTo(9.0f, 13.57f, 9.74f, 15.06f, 11.0f, 16.0f)
                verticalLineTo(18.0f)
                curveTo(11.0f, 18.55f, 11.45f, 19.0f, 12.0f, 19.0f)
                horizontalLineTo(16.0f)
                curveTo(16.55f, 19.0f, 17.0f, 18.55f, 17.0f, 18.0f)
                verticalLineTo(16.0f)
                curveTo(19.21f, 14.34f, 19.66f, 11.21f, 18.0f, 9.0f)
                curveTo(17.06f, 7.74f, 15.57f, 7.0f, 14.0f, 7.0f)
                moveTo(15.0f, 14.82f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.82f)
                curveTo(11.44f, 14.27f, 10.62f, 12.55f, 11.17f, 11.0f)
                curveTo(11.72f, 9.43f, 13.44f, 8.61f, 15.0f, 9.16f)
                curveTo(16.56f, 9.72f, 17.38f, 11.43f, 16.83f, 13.0f)
                curveTo(16.53f, 13.85f, 15.85f, 14.5f, 15.0f, 14.82f)
                moveTo(7.68f, 15.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(16.0f)
                curveTo(7.0f, 16.55f, 7.45f, 17.0f, 8.0f, 17.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(16.88f)
                curveTo(8.46f, 16.33f, 8.0f, 15.7f, 7.68f, 15.0f)
                moveTo(13.6f, 5.0f)
                curveTo(12.5f, 2.47f, 9.53f, 1.33f, 7.0f, 2.45f)
                reflectiveCurveTo(3.34f, 6.5f, 4.45f, 9.04f)
                curveTo(4.79f, 9.81f, 5.33f, 10.5f, 6.0f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(6.0f, 13.55f, 6.45f, 14.0f, 7.0f, 14.0f)
                horizontalLineTo(7.3f)
                curveTo(7.1f, 13.35f, 7.0f, 12.68f, 7.0f, 12.0f)
                curveTo(7.0f, 8.29f, 9.89f, 5.21f, 13.6f, 5.0f)
                close()
            }
        }
        .build()
        return _lightbulbMultipleOutline!!
    }

private var _lightbulbMultipleOutline: ImageVector? = null
