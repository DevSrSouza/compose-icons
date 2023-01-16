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

public val MaterialDesignIcons.Equal: ImageVector
    get() {
        if (_equal != null) {
            return _equal!!
        }
        _equal = Builder(name = "Equal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 10.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(10.0f)
                moveTo(19.0f, 16.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _equal!!
    }

private var _equal: ImageVector? = null
