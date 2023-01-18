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

public val FilledGroup.BowlChopsticks: ImageVector
    get() {
        if (_bowlChopsticks != null) {
            return _bowlChopsticks!!
        }
        _bowlChopsticks = Builder(name = "BowlChopsticks", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.3758f, 2.1f)
                curveTo(5.7347f, 1.8934f, 6.1933f, 2.0168f, 6.4f, 2.3758f)
                lineTo(11.3654f, 11.0f)
                horizontalLineTo(13.6346f)
                lineTo(9.1f, 3.1242f)
                curveTo(8.8934f, 2.7652f, 9.0168f, 2.3067f, 9.3758f, 2.1f)
                curveTo(9.7347f, 1.8934f, 10.1933f, 2.0168f, 10.4f, 2.3758f)
                lineTo(15.3654f, 11.0f)
                horizontalLineTo(21.2979f)
                curveTo(21.6856f, 11.0f, 22.0f, 11.3143f, 22.0f, 11.7021f)
                verticalLineTo(12.0f)
                curveTo(22.0f, 13.0452f, 21.8396f, 14.053f, 21.5422f, 15.0f)
                horizontalLineTo(2.4578f)
                curveTo(2.1604f, 14.053f, 2.0f, 13.0452f, 2.0f, 12.0f)
                verticalLineTo(11.7021f)
                curveTo(2.0f, 11.3143f, 2.3143f, 11.0f, 2.7021f, 11.0f)
                horizontalLineTo(9.6346f)
                lineTo(5.1f, 3.1242f)
                curveTo(4.8934f, 2.7652f, 5.0168f, 2.3067f, 5.3758f, 2.1f)
                close()
                moveTo(3.0673f, 16.5f)
                curveTo(4.7141f, 19.7626f, 8.0958f, 22.0f, 12.0f, 22.0f)
                curveTo(15.9042f, 22.0f, 19.2859f, 19.7626f, 20.9327f, 16.5f)
                horizontalLineTo(3.0673f)
                close()
            }
        }
        .build()
        return _bowlChopsticks!!
    }

private var _bowlChopsticks: ImageVector? = null
