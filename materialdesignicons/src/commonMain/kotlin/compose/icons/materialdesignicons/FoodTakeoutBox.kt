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

public val MaterialDesignIcons.FoodTakeoutBox: ImageVector
    get() {
        if (_foodTakeoutBox != null) {
            return _foodTakeoutBox!!
        }
        _foodTakeoutBox = Builder(name = "FoodTakeoutBox", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.26f, 11.0f)
                horizontalLineTo(18.74f)
                lineTo(18.07f, 20.0f)
                horizontalLineTo(5.93f)
                lineTo(5.26f, 11.0f)
                moveTo(9.0f, 4.0f)
                horizontalLineTo(14.97f)
                lineTo(19.0f, 7.38f)
                lineTo(20.59f, 5.79f)
                lineTo(22.0f, 7.21f)
                lineTo(19.21f, 10.0f)
                horizontalLineTo(4.79f)
                lineTo(2.0f, 7.21f)
                lineTo(3.41f, 5.8f)
                lineTo(5.0f, 7.38f)
                lineTo(9.0f, 4.0f)
                close()
            }
        }
        .build()
        return _foodTakeoutBox!!
    }

private var _foodTakeoutBox: ImageVector? = null
