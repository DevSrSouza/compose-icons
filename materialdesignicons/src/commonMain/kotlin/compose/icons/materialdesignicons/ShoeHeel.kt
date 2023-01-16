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

public val MaterialDesignIcons.ShoeHeel: ImageVector
    get() {
        if (_shoeHeel != null) {
            return _shoeHeel!!
        }
        _shoeHeel = Builder(name = "ShoeHeel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 18.0f)
                horizontalLineTo(11.7f)
                lineTo(17.0f, 14.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(14.0f)
                curveTo(20.0f, 14.0f, 21.0f, 12.0f, 21.0f, 10.0f)
                curveTo(21.0f, 8.0f, 20.5f, 6.0f, 20.5f, 6.0f)
                horizontalLineTo(18.5f)
                lineTo(18.0f, 7.0f)
                lineTo(10.0f, 14.0f)
                horizontalLineTo(8.0f)
                lineTo(3.0f, 16.0f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _shoeHeel!!
    }

private var _shoeHeel: ImageVector? = null
