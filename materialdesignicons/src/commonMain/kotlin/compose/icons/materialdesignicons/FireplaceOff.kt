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

public val MaterialDesignIcons.FireplaceOff: ImageVector
    get() {
        if (_fireplaceOff != null) {
            return _fireplaceOff!!
        }
        _fireplaceOff = Builder(name = "FireplaceOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(22.0f)
                moveTo(22.0f, 6.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(6.0f)
                moveTo(20.0f, 7.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(11.0f)
                curveTo(17.0f, 11.0f, 14.5f, 10.0f, 12.0f, 10.0f)
                curveTo(9.5f, 10.0f, 7.0f, 11.0f, 7.0f, 11.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _fireplaceOff!!
    }

private var _fireplaceOff: ImageVector? = null
