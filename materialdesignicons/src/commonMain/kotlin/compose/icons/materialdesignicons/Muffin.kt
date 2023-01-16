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

public val MaterialDesignIcons.Muffin: ImageVector
    get() {
        if (_muffin != null) {
            return _muffin!!
        }
        _muffin = Builder(name = "Muffin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 5.0f)
                curveTo(16.0f, 5.0f, 15.0f, 2.0f, 12.0f, 2.0f)
                curveTo(9.0f, 2.0f, 8.0f, 5.0f, 8.0f, 5.0f)
                curveTo(6.0f, 5.0f, 4.0f, 7.0f, 4.0f, 9.0f)
                curveTo(1.3f, 9.0f, 1.3f, 13.0f, 4.0f, 13.0f)
                horizontalLineTo(20.0f)
                curveTo(22.7f, 13.0f, 22.7f, 9.0f, 20.0f, 9.0f)
                curveTo(20.0f, 7.0f, 18.0f, 5.0f, 16.0f, 5.0f)
                moveTo(5.0f, 15.0f)
                lineTo(7.0f, 22.0f)
                horizontalLineTo(9.0f)
                lineTo(8.0f, 15.0f)
                horizontalLineTo(5.0f)
                moveTo(10.0f, 15.0f)
                lineTo(11.0f, 22.0f)
                horizontalLineTo(13.0f)
                lineTo(14.0f, 15.0f)
                horizontalLineTo(10.0f)
                moveTo(16.0f, 15.0f)
                lineTo(15.0f, 22.0f)
                horizontalLineTo(17.0f)
                lineTo(19.0f, 15.0f)
                horizontalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _muffin!!
    }

private var _muffin: ImageVector? = null
