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

public val MaterialDesignIcons.SpoonSugar: ImageVector
    get() {
        if (_spoonSugar != null) {
            return _spoonSugar!!
        }
        _spoonSugar = Builder(name = "SpoonSugar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 13.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(13.0f)
                moveTo(10.0f, 10.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(10.0f)
                moveTo(8.0f, 6.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(6.0f)
                moveTo(18.0f, 12.0f)
                curveTo(14.25f, 12.0f, 12.28f, 13.25f, 11.0f, 14.0f)
                horizontalLineTo(2.0f)
                curveTo(2.0f, 16.21f, 3.79f, 18.0f, 6.0f, 18.0f)
                horizontalLineTo(7.0f)
                curveTo(8.0f, 18.0f, 8.92f, 17.63f, 9.62f, 17.0f)
                curveTo(11.06f, 15.78f, 12.68f, 14.74f, 14.55f, 14.36f)
                curveTo(15.61f, 14.15f, 16.78f, 14.0f, 18.0f, 14.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _spoonSugar!!
    }

private var _spoonSugar: ImageVector? = null
