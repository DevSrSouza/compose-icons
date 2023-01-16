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

public val MaterialDesignIcons.FoodOutline: ImageVector
    get() {
        if (_foodOutline != null) {
            return _foodOutline!!
        }
        _foodOutline = Builder(name = "FoodOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 22.0f)
                curveTo(1.0f, 22.54f, 1.45f, 23.0f, 2.0f, 23.0f)
                horizontalLineTo(15.0f)
                curveTo(15.56f, 23.0f, 16.0f, 22.54f, 16.0f, 22.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(22.0f)
                moveTo(8.5f, 9.0f)
                curveTo(4.75f, 9.0f, 1.0f, 11.0f, 1.0f, 15.0f)
                horizontalLineTo(16.0f)
                curveTo(16.0f, 11.0f, 12.25f, 9.0f, 8.5f, 9.0f)
                moveTo(3.62f, 13.0f)
                curveTo(4.73f, 11.45f, 7.09f, 11.0f, 8.5f, 11.0f)
                reflectiveCurveTo(12.27f, 11.45f, 13.38f, 13.0f)
                horizontalLineTo(3.62f)
                moveTo(1.0f, 17.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(17.0f)
                moveTo(18.0f, 5.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(11.0f)
                lineTo(11.23f, 7.0f)
                horizontalLineTo(20.79f)
                lineTo(19.39f, 21.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(19.72f)
                curveTo(20.56f, 23.0f, 21.25f, 22.35f, 21.35f, 21.53f)
                lineTo(23.0f, 5.0f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _foodOutline!!
    }

private var _foodOutline: ImageVector? = null
