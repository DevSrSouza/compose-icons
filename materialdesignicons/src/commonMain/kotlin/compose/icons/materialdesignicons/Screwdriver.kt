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

public val MaterialDesignIcons.Screwdriver: ImageVector
    get() {
        if (_screwdriver != null) {
            return _screwdriver!!
        }
        _screwdriver = Builder(name = "Screwdriver", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 1.83f)
                curveTo(17.5f, 1.83f, 17.0f, 2.0f, 16.59f, 2.41f)
                curveTo(13.72f, 5.28f, 8.0f, 11.0f, 8.0f, 11.0f)
                lineTo(9.5f, 12.5f)
                lineTo(6.0f, 16.0f)
                horizontalLineTo(4.0f)
                lineTo(2.0f, 20.0f)
                lineTo(4.0f, 22.0f)
                lineTo(8.0f, 20.0f)
                verticalLineTo(18.0f)
                lineTo(11.5f, 14.5f)
                lineTo(13.0f, 16.0f)
                curveTo(13.0f, 16.0f, 18.72f, 10.28f, 21.59f, 7.41f)
                curveTo(22.21f, 6.5f, 22.37f, 5.37f, 21.59f, 4.59f)
                lineTo(19.41f, 2.41f)
                curveTo(19.0f, 2.0f, 18.5f, 1.83f, 18.0f, 1.83f)
                moveTo(18.0f, 4.0f)
                lineTo(20.0f, 6.0f)
                lineTo(13.0f, 13.0f)
                lineTo(11.0f, 11.0f)
                lineTo(18.0f, 4.0f)
                close()
            }
        }
        .build()
        return _screwdriver!!
    }

private var _screwdriver: ImageVector? = null
