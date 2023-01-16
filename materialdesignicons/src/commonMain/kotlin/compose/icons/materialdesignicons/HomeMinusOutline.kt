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

public val MaterialDesignIcons.HomeMinusOutline: ImageVector
    get() {
        if (_homeMinusOutline != null) {
            return _homeMinusOutline!!
        }
        _homeMinusOutline = Builder(name = "HomeMinusOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 17.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(17.0f)
                moveTo(5.0f, 20.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(2.0f)
                lineTo(12.0f, 3.0f)
                lineTo(22.0f, 12.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(10.19f)
                lineTo(12.0f, 5.69f)
                lineTo(7.0f, 10.19f)
                verticalLineTo(18.0f)
                horizontalLineTo(12.0f)
                curveTo(12.0f, 18.7f, 12.12f, 19.37f, 12.34f, 20.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _homeMinusOutline!!
    }

private var _homeMinusOutline: ImageVector? = null
