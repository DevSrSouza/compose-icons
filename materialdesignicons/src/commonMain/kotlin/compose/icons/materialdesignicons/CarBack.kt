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

public val MaterialDesignIcons.CarBack: ImageVector
    get() {
        if (_carBack != null) {
            return _carBack!!
        }
        _carBack = Builder(name = "CarBack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 11.0f)
                lineTo(7.0f, 7.0f)
                horizontalLineTo(17.0f)
                lineTo(18.0f, 11.0f)
                moveTo(18.92f, 6.0f)
                curveTo(18.71f, 5.4f, 18.14f, 5.0f, 17.5f, 5.0f)
                horizontalLineTo(6.5f)
                curveTo(5.86f, 5.0f, 5.29f, 5.4f, 5.08f, 6.0f)
                lineTo(3.0f, 12.0f)
                verticalLineTo(20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.0f, 21.0f)
                horizontalLineTo(5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 20.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 21.0f)
                horizontalLineTo(20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.0f, 20.0f)
                verticalLineTo(12.0f)
                lineTo(18.92f, 6.0f)
                moveTo(7.0f, 16.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(16.0f)
                moveTo(19.0f, 16.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(16.0f)
                moveTo(14.0f, 16.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _carBack!!
    }

private var _carBack: ImageVector? = null
