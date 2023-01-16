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

public val MaterialDesignIcons.LightbulbMultiple: ImageVector
    get() {
        if (_lightbulbMultiple != null) {
            return _lightbulbMultiple!!
        }
        _lightbulbMultiple = Builder(name = "LightbulbMultiple", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 16.0f)
                verticalLineTo(18.0f)
                curveTo(17.0f, 18.55f, 16.53f, 19.0f, 16.0f, 19.0f)
                horizontalLineTo(12.0f)
                curveTo(11.42f, 19.0f, 11.0f, 18.55f, 11.0f, 18.0f)
                verticalLineTo(16.0f)
                curveTo(8.77f, 14.34f, 8.32f, 11.21f, 10.0f, 9.0f)
                reflectiveCurveTo(14.77f, 6.34f, 17.0f, 8.0f)
                reflectiveCurveTo(19.63f, 12.79f, 18.0f, 15.0f)
                curveTo(17.69f, 15.38f, 17.35f, 15.72f, 17.0f, 16.0f)
                moveTo(16.0f, 20.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(21.0f)
                curveTo(12.0f, 21.55f, 12.42f, 22.0f, 13.0f, 22.0f)
                horizontalLineTo(15.0f)
                curveTo(15.53f, 22.0f, 16.0f, 21.55f, 16.0f, 21.0f)
                moveTo(7.66f, 15.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(16.0f)
                curveTo(7.0f, 16.55f, 7.42f, 17.0f, 8.0f, 17.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(16.88f)
                curveTo(8.44f, 16.33f, 8.0f, 15.7f, 7.66f, 15.0f)
                moveTo(13.58f, 5.0f)
                curveTo(12.46f, 2.47f, 9.5f, 1.33f, 7.0f, 2.45f)
                reflectiveCurveTo(3.31f, 6.5f, 4.43f, 9.04f)
                curveTo(4.77f, 9.81f, 5.3f, 10.5f, 6.0f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(6.0f, 13.55f, 6.42f, 14.0f, 7.0f, 14.0f)
                horizontalLineTo(7.28f)
                curveTo(7.07f, 13.35f, 6.97f, 12.68f, 7.0f, 12.0f)
                curveTo(6.97f, 8.29f, 9.87f, 5.21f, 13.58f, 5.0f)
                close()
            }
        }
        .build()
        return _lightbulbMultiple!!
    }

private var _lightbulbMultiple: ImageVector? = null
