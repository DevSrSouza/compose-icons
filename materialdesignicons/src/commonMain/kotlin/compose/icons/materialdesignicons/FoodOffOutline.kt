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

public val MaterialDesignIcons.FoodOffOutline: ImageVector
    get() {
        if (_foodOffOutline != null) {
            return _foodOffOutline!!
        }
        _foodOffOutline = Builder(name = "FoodOffOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 21.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(22.0f)
                curveTo(16.0f, 22.54f, 15.56f, 23.0f, 15.0f, 23.0f)
                horizontalLineTo(2.0f)
                curveTo(1.45f, 23.0f, 1.0f, 22.54f, 1.0f, 22.0f)
                verticalLineTo(21.0f)
                moveTo(20.5f, 23.31f)
                lineTo(16.0f, 18.83f)
                verticalLineTo(19.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(14.17f)
                lineTo(12.17f, 15.0f)
                horizontalLineTo(1.0f)
                curveTo(1.0f, 11.76f, 3.46f, 9.83f, 6.38f, 9.21f)
                lineTo(0.68f, 3.5f)
                lineTo(2.1f, 2.1f)
                lineTo(13.0f, 13.0f)
                lineTo(15.0f, 15.0f)
                lineTo(21.9f, 21.9f)
                lineTo(20.5f, 23.31f)
                moveTo(10.17f, 13.0f)
                lineTo(8.17f, 11.0f)
                curveTo(6.75f, 11.06f, 4.65f, 11.56f, 3.62f, 13.0f)
                horizontalLineTo(10.17f)
                moveTo(23.0f, 5.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(11.0f)
                lineTo(11.23f, 7.0f)
                horizontalLineTo(20.79f)
                lineTo(19.79f, 16.97f)
                lineTo(21.62f, 18.8f)
                lineTo(23.0f, 5.0f)
                close()
            }
        }
        .build()
        return _foodOffOutline!!
    }

private var _foodOffOutline: ImageVector? = null
