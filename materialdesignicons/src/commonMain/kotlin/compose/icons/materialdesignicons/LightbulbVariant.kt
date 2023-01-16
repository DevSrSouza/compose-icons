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

public val MaterialDesignIcons.LightbulbVariant: ImageVector
    get() {
        if (_lightbulbVariant != null) {
            return _lightbulbVariant!!
        }
        _lightbulbVariant = Builder(name = "LightbulbVariant", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 20.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(21.0f)
                curveTo(15.0f, 21.55f, 14.55f, 22.0f, 14.0f, 22.0f)
                horizontalLineTo(10.0f)
                curveTo(9.45f, 22.0f, 9.0f, 21.55f, 9.0f, 21.0f)
                verticalLineTo(20.0f)
                moveTo(19.0f, 9.0f)
                curveTo(19.0f, 11.38f, 17.81f, 13.47f, 16.0f, 14.74f)
                verticalLineTo(17.0f)
                curveTo(16.0f, 17.55f, 15.55f, 18.0f, 15.0f, 18.0f)
                horizontalLineTo(9.0f)
                curveTo(8.45f, 18.0f, 8.0f, 17.55f, 8.0f, 17.0f)
                verticalLineTo(14.74f)
                curveTo(6.19f, 13.47f, 5.0f, 11.38f, 5.0f, 9.0f)
                curveTo(5.0f, 5.13f, 8.13f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(19.0f, 5.13f, 19.0f, 9.0f)
                moveTo(14.71f, 8.29f)
                curveTo(14.32f, 7.9f, 13.68f, 7.9f, 13.29f, 8.29f)
                lineTo(12.0f, 9.59f)
                lineTo(10.71f, 8.29f)
                curveTo(10.32f, 7.9f, 9.68f, 7.9f, 9.29f, 8.29f)
                curveTo(8.9f, 8.68f, 8.9f, 9.32f, 9.29f, 9.71f)
                lineTo(11.0f, 11.41f)
                verticalLineTo(16.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.41f)
                lineTo(14.71f, 9.71f)
                curveTo(15.1f, 9.32f, 15.1f, 8.68f, 14.71f, 8.29f)
                close()
            }
        }
        .build()
        return _lightbulbVariant!!
    }

private var _lightbulbVariant: ImageVector? = null
