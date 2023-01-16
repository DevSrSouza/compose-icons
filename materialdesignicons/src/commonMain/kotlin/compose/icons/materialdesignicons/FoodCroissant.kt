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

public val MaterialDesignIcons.FoodCroissant: ImageVector
    get() {
        if (_foodCroissant != null) {
            return _foodCroissant!!
        }
        _foodCroissant = Builder(name = "FoodCroissant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 19.0f)
                lineTo(19.0f, 17.0f)
                lineTo(22.0f, 15.0f)
                verticalLineTo(19.0f)
                moveTo(15.0f, 15.0f)
                lineTo(19.0f, 9.0f)
                lineTo(22.0f, 13.0f)
                lineTo(18.0f, 16.0f)
                lineTo(15.0f, 15.0f)
                moveTo(5.0f, 17.0f)
                lineTo(2.0f, 19.0f)
                verticalLineTo(15.0f)
                lineTo(5.0f, 17.0f)
                moveTo(9.0f, 15.0f)
                lineTo(6.0f, 16.0f)
                lineTo(2.0f, 13.0f)
                lineTo(5.0f, 9.0f)
                lineTo(9.0f, 15.0f)
                moveTo(14.0f, 6.0f)
                lineTo(18.0f, 8.0f)
                lineTo(13.0f, 15.0f)
                horizontalLineTo(11.0f)
                lineTo(6.0f, 8.0f)
                lineTo(10.0f, 6.0f)
                horizontalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _foodCroissant!!
    }

private var _foodCroissant: ImageVector? = null