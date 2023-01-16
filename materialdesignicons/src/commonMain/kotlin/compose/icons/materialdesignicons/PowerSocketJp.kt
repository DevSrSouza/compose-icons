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

public val MaterialDesignIcons.PowerSocketJp: ImageVector
    get() {
        if (_powerSocketJp != null) {
            return _powerSocketJp!!
        }
        _powerSocketJp = Builder(name = "PowerSocketJp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 9.5f)
                verticalLineTo(14.5f)
                horizontalLineTo(8.0f)
                verticalLineTo(9.5f)
                moveTo(19.78f, 2.0f)
                curveTo(21.0f, 2.0f, 22.0f, 3.0f, 22.0f, 4.22f)
                verticalLineTo(19.78f)
                curveTo(22.0f, 21.0f, 21.0f, 22.0f, 19.78f, 22.0f)
                horizontalLineTo(4.22f)
                curveTo(3.0f, 22.0f, 2.0f, 21.0f, 2.0f, 19.78f)
                verticalLineTo(4.22f)
                curveTo(2.0f, 3.0f, 3.0f, 2.0f, 4.22f, 2.0f)
                moveTo(12.0f, 4.0f)
                curveTo(7.58f, 4.0f, 4.0f, 7.58f, 4.0f, 12.0f)
                curveTo(4.0f, 16.42f, 7.58f, 20.0f, 12.0f, 20.0f)
                curveTo(16.42f, 20.0f, 20.0f, 16.42f, 20.0f, 12.0f)
                curveTo(20.0f, 7.58f, 16.42f, 4.0f, 12.0f, 4.0f)
                moveTo(16.0f, 9.5f)
                verticalLineTo(14.5f)
                horizontalLineTo(14.0f)
                verticalLineTo(9.5f)
                close()
            }
        }
        .build()
        return _powerSocketJp!!
    }

private var _powerSocketJp: ImageVector? = null
