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

public val MaterialDesignIcons.Pinwheel: ImageVector
    get() {
        if (_pinwheel != null) {
            return _pinwheel!!
        }
        _pinwheel = Builder(name = "Pinwheel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                curveTo(12.0f, 9.0f, 14.5f, 6.5f, 17.5f, 6.5f)
                curveTo(20.5f, 6.5f, 23.0f, 9.0f, 23.0f, 12.0f)
                horizontalLineTo(12.0f)
                moveTo(12.0f, 12.0f)
                curveTo(12.0f, 15.0f, 9.5f, 17.5f, 6.5f, 17.5f)
                curveTo(3.5f, 17.5f, 1.0f, 15.0f, 1.0f, 12.0f)
                horizontalLineTo(12.0f)
                moveTo(12.0f, 12.0f)
                curveTo(9.0f, 12.0f, 6.5f, 9.5f, 6.5f, 6.5f)
                curveTo(6.5f, 3.5f, 9.0f, 1.0f, 12.0f, 1.0f)
                verticalLineTo(12.0f)
                moveTo(12.0f, 12.0f)
                curveTo(15.0f, 12.0f, 17.5f, 14.5f, 17.5f, 17.5f)
                curveTo(17.5f, 20.5f, 15.0f, 23.0f, 12.0f, 23.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _pinwheel!!
    }

private var _pinwheel: ImageVector? = null
