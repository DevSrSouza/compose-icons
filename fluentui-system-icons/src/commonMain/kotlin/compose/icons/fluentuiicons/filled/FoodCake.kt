package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.FoodCake: ImageVector
    get() {
        if (_foodCake != null) {
            return _foodCake!!
        }
        _foodCake = Builder(name = "FoodCake", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 7.0f)
                curveTo(13.7143f, 7.0f, 14.0f, 5.6601f, 14.0f, 4.5556f)
                curveTo(14.0f, 3.451f, 13.2624f, 1.5f, 12.0f, 1.5f)
                curveTo(10.7376f, 1.5f, 10.0f, 3.451f, 10.0f, 4.5556f)
                curveTo(10.0f, 5.6601f, 10.2857f, 7.0f, 12.0f, 7.0f)
                close()
                moveTo(3.5f, 10.25f)
                curveTo(3.5f, 9.0074f, 4.5074f, 8.0f, 5.75f, 8.0f)
                horizontalLineTo(18.25f)
                curveTo(19.4926f, 8.0f, 20.5f, 9.0074f, 20.5f, 10.25f)
                verticalLineTo(11.125f)
                lineTo(16.8659f, 13.8506f)
                curveTo(16.4624f, 14.1532f, 15.9167f, 14.1837f, 15.4821f, 13.9281f)
                lineTo(13.4428f, 12.7285f)
                curveTo(12.5471f, 12.2016f, 11.4309f, 12.2246f, 10.5577f, 12.788f)
                lineTo(8.797f, 13.924f)
                curveTo(8.3863f, 14.1889f, 7.8588f, 14.1902f, 7.4468f, 13.9272f)
                lineTo(3.5f, 11.408f)
                verticalLineTo(10.25f)
                close()
                moveTo(3.5f, 13.1875f)
                verticalLineTo(18.5f)
                horizontalLineTo(2.75f)
                curveTo(2.3358f, 18.5f, 2.0f, 18.8358f, 2.0f, 19.25f)
                curveTo(2.0f, 19.6642f, 2.3358f, 20.0f, 2.75f, 20.0f)
                horizontalLineTo(21.25f)
                curveTo(21.6642f, 20.0f, 22.0f, 19.6642f, 22.0f, 19.25f)
                curveTo(22.0f, 18.8358f, 21.6642f, 18.5f, 21.25f, 18.5f)
                horizontalLineTo(20.5f)
                verticalLineTo(13.0f)
                lineTo(17.7659f, 15.0506f)
                curveTo(16.8783f, 15.7163f, 15.6778f, 15.7835f, 14.7216f, 15.221f)
                lineTo(12.6823f, 14.0214f)
                curveTo(12.2752f, 13.7819f, 11.7678f, 13.7924f, 11.3709f, 14.0485f)
                lineTo(9.6102f, 15.1844f)
                curveTo(8.7066f, 15.7674f, 7.5461f, 15.7702f, 6.6397f, 15.1916f)
                lineTo(3.5f, 13.1875f)
                close()
            }
        }
        .build()
        return _foodCake!!
    }

private var _foodCake: ImageVector? = null
