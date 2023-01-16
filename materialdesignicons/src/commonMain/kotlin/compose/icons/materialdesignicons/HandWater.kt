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

public val MaterialDesignIcons.HandWater: ImageVector
    get() {
        if (_handWater != null) {
            return _handWater!!
        }
        _handWater = Builder(name = "HandWater", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.42f, 22.5f)
                horizontalLineTo(5.33f)
                curveTo(3.5f, 22.5f, 2.0f, 21.0f, 2.0f, 19.17f)
                verticalLineTo(13.08f)
                curveTo(2.0f, 12.18f, 2.36f, 11.33f, 3.0f, 10.71f)
                lineTo(8.63f, 5.17f)
                curveTo(8.63f, 5.17f, 9.66f, 6.22f, 9.67f, 6.25f)
                curveTo(9.83f, 6.43f, 9.92f, 6.66f, 9.92f, 6.91f)
                curveTo(9.92f, 7.09f, 9.87f, 7.26f, 9.78f, 7.41f)
                curveTo(9.77f, 7.44f, 8.0f, 10.0f, 8.0f, 10.0f)
                horizontalLineTo(18.67f)
                curveTo(19.36f, 10.0f, 19.92f, 10.56f, 19.92f, 11.25f)
                curveTo(19.92f, 11.94f, 19.36f, 12.5f, 18.67f, 12.5f)
                horizontalLineTo(12.83f)
                verticalLineTo(13.33f)
                horizontalLineTo(20.75f)
                curveTo(21.44f, 13.33f, 22.0f, 13.89f, 22.0f, 14.58f)
                curveTo(22.0f, 15.28f, 21.44f, 15.83f, 20.75f, 15.83f)
                horizontalLineTo(12.83f)
                verticalLineTo(16.67f)
                horizontalLineTo(19.92f)
                curveTo(20.61f, 16.67f, 21.17f, 17.22f, 21.17f, 17.92f)
                curveTo(21.17f, 18.61f, 20.61f, 19.17f, 19.92f, 19.17f)
                horizontalLineTo(12.83f)
                verticalLineTo(20.0f)
                horizontalLineTo(17.42f)
                curveTo(18.11f, 20.0f, 18.67f, 20.56f, 18.67f, 21.25f)
                curveTo(18.67f, 21.94f, 18.11f, 22.5f, 17.42f, 22.5f)
                moveTo(13.5f, 4.8f)
                curveTo(13.5f, 4.8f, 12.0f, 6.46f, 12.0f, 7.5f)
                curveTo(12.0f, 9.5f, 15.0f, 9.5f, 15.0f, 7.5f)
                curveTo(15.0f, 6.46f, 13.5f, 4.8f, 13.5f, 4.8f)
                moveTo(18.5f, 1.0f)
                curveTo(18.5f, 1.0f, 16.0f, 3.76f, 16.0f, 5.5f)
                curveTo(16.0f, 8.83f, 21.0f, 8.83f, 21.0f, 5.5f)
                curveTo(21.0f, 3.76f, 18.5f, 1.0f, 18.5f, 1.0f)
                close()
            }
        }
        .build()
        return _handWater!!
    }

private var _handWater: ImageVector? = null
