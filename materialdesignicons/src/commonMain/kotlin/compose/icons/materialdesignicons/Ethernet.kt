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

public val MaterialDesignIcons.Ethernet: ImageVector
    get() {
        if (_ethernet != null) {
            return _ethernet!!
        }
        _ethernet = Builder(name = "Ethernet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 15.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(15.0f)
                moveTo(4.38f, 3.0f)
                horizontalLineTo(19.63f)
                curveTo(20.94f, 3.0f, 22.0f, 4.06f, 22.0f, 5.38f)
                verticalLineTo(19.63f)
                arcTo(2.37f, 2.37f, 0.0f, false, true, 19.63f, 22.0f)
                horizontalLineTo(4.38f)
                curveTo(3.06f, 22.0f, 2.0f, 20.94f, 2.0f, 19.63f)
                verticalLineTo(5.38f)
                curveTo(2.0f, 4.06f, 3.06f, 3.0f, 4.38f, 3.0f)
                close()
            }
        }
        .build()
        return _ethernet!!
    }

private var _ethernet: ImageVector? = null
