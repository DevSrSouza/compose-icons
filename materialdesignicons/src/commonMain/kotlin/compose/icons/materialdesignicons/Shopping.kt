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

public val MaterialDesignIcons.Shopping: ImageVector
    get() {
        if (_shopping != null) {
            return _shopping!!
        }
        _shopping = Builder(name = "Shopping", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 13.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 7.0f, 8.0f)
                horizontalLineTo(9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 12.0f, 11.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 15.0f, 8.0f)
                horizontalLineTo(17.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 12.0f, 13.0f)
                moveTo(12.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 15.0f, 6.0f)
                horizontalLineTo(9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 3.0f)
                moveTo(19.0f, 6.0f)
                horizontalLineTo(17.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 12.0f, 1.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 7.0f, 6.0f)
                horizontalLineTo(5.0f)
                curveTo(3.89f, 6.0f, 3.0f, 6.89f, 3.0f, 8.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 22.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 20.0f)
                verticalLineTo(8.0f)
                curveTo(21.0f, 6.89f, 20.1f, 6.0f, 19.0f, 6.0f)
                close()
            }
        }
        .build()
        return _shopping!!
    }

private var _shopping: ImageVector? = null
