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

public val MaterialDesignIcons.Coffee: ImageVector
    get() {
        if (_coffee != null) {
            return _coffee!!
        }
        _coffee = Builder(name = "Coffee", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 21.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(2.0f)
                moveTo(20.0f, 8.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(20.0f)
                moveTo(20.0f, 3.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(13.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 8.0f, 17.0f)
                horizontalLineTo(14.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 18.0f, 13.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 8.0f)
                verticalLineTo(5.0f)
                curveTo(22.0f, 3.89f, 21.1f, 3.0f, 20.0f, 3.0f)
                close()
            }
        }
        .build()
        return _coffee!!
    }

private var _coffee: ImageVector? = null
