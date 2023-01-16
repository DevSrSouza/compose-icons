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

public val MaterialDesignIcons.Pot: ImageVector
    get() {
        if (_pot != null) {
            return _pot!!
        }
        _pot = Builder(name = "Pot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 19.0f)
                curveTo(19.0f, 20.1f, 18.1f, 21.0f, 17.0f, 21.0f)
                horizontalLineTo(7.0f)
                curveTo(5.9f, 21.0f, 5.0f, 20.1f, 5.0f, 19.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _pot!!
    }

private var _pot: ImageVector? = null
