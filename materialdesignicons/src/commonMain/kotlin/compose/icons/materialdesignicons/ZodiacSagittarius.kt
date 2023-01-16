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

public val MaterialDesignIcons.ZodiacSagittarius: ImageVector
    get() {
        if (_zodiacSagittarius != null) {
            return _zodiacSagittarius!!
        }
        _zodiacSagittarius = Builder(name = "ZodiacSagittarius", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 2.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.41f)
                lineTo(10.41f, 15.0f)
                lineTo(12.71f, 17.29f)
                lineTo(11.29f, 18.71f)
                lineTo(9.0f, 16.41f)
                lineTo(3.71f, 21.71f)
                lineTo(2.29f, 20.29f)
                lineTo(7.59f, 15.0f)
                lineTo(5.29f, 12.71f)
                lineTo(6.71f, 11.29f)
                lineTo(9.0f, 13.59f)
                lineTo(18.59f, 4.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _zodiacSagittarius!!
    }

private var _zodiacSagittarius: ImageVector? = null
