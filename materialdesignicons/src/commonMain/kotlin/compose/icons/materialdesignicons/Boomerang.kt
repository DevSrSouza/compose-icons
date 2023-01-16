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

public val MaterialDesignIcons.Boomerang: ImageVector
    get() {
        if (_boomerang != null) {
            return _boomerang!!
        }
        _boomerang = Builder(name = "Boomerang", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 2.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f)
                reflectiveCurveTo(2.9f, 6.0f, 4.0f, 6.0f)
                horizontalLineTo(8.0f)
                lineTo(10.0f, 2.0f)
                moveTo(18.0f, 2.0f)
                curveTo(20.2f, 2.0f, 22.0f, 3.8f, 22.0f, 6.0f)
                verticalLineTo(12.0f)
                lineTo(18.0f, 14.0f)
                curveTo(18.0f, 9.6f, 14.4f, 6.0f, 10.0f, 6.0f)
                lineTo(12.0f, 2.0f)
                horizontalLineTo(18.0f)
                moveTo(18.0f, 20.0f)
                verticalLineTo(16.0f)
                lineTo(22.0f, 14.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 21.1f, 21.1f, 22.0f, 20.0f, 22.0f)
                reflectiveCurveTo(18.0f, 21.1f, 18.0f, 20.0f)
                close()
            }
        }
        .build()
        return _boomerang!!
    }

private var _boomerang: ImageVector? = null
