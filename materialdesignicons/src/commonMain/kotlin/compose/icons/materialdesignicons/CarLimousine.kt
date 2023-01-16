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

public val MaterialDesignIcons.CarLimousine: ImageVector
    get() {
        if (_carLimousine != null) {
            return _carLimousine!!
        }
        _carLimousine = Builder(name = "CarLimousine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 6.0f)
                lineTo(2.5f, 7.5f)
                lineTo(1.0f, 9.0f)
                lineTo(2.5f, 10.5f)
                lineTo(1.0f, 12.0f)
                lineTo(2.5f, 13.5f)
                lineTo(1.0f, 15.0f)
                horizontalLineTo(15.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 18.0f, 18.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 21.0f, 15.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(12.0f)
                curveTo(23.0f, 10.89f, 22.11f, 10.0f, 21.0f, 10.0f)
                horizontalLineTo(19.0f)
                lineTo(16.0f, 6.0f)
                horizontalLineTo(1.0f)
                moveTo(4.62f, 7.5f)
                horizontalLineTo(10.5f)
                verticalLineTo(10.0f)
                horizontalLineTo(4.12f)
                lineTo(3.12f, 9.0f)
                lineTo(4.62f, 7.5f)
                moveTo(12.0f, 7.5f)
                horizontalLineTo(15.5f)
                lineTo(17.46f, 10.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(7.5f)
                moveTo(18.0f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 19.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.0f, 16.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.0f, 13.5f)
                close()
            }
        }
        .build()
        return _carLimousine!!
    }

private var _carLimousine: ImageVector? = null
