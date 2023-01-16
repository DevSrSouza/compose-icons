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

public val MaterialDesignIcons.EllipseOutline: ImageVector
    get() {
        if (_ellipseOutline != null) {
            return _ellipseOutline!!
        }
        _ellipseOutline = Builder(name = "EllipseOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                curveTo(16.41f, 6.0f, 20.0f, 8.69f, 20.0f, 12.0f)
                curveTo(20.0f, 15.31f, 16.41f, 18.0f, 12.0f, 18.0f)
                curveTo(7.59f, 18.0f, 4.0f, 15.31f, 4.0f, 12.0f)
                curveTo(4.0f, 8.69f, 7.59f, 6.0f, 12.0f, 6.0f)
                moveTo(12.0f, 4.0f)
                curveTo(6.5f, 4.0f, 2.0f, 7.58f, 2.0f, 12.0f)
                curveTo(2.0f, 16.42f, 6.5f, 20.0f, 12.0f, 20.0f)
                curveTo(17.5f, 20.0f, 22.0f, 16.42f, 22.0f, 12.0f)
                curveTo(22.0f, 7.58f, 17.5f, 4.0f, 12.0f, 4.0f)
                close()
            }
        }
        .build()
        return _ellipseOutline!!
    }

private var _ellipseOutline: ImageVector? = null
