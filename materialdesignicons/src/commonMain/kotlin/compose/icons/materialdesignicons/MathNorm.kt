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

public val MaterialDesignIcons.MathNorm: ImageVector
    get() {
        if (_mathNorm != null) {
            return _mathNorm!!
        }
        _mathNorm = Builder(name = "MathNorm", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 21.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(14.0f)
                moveTo(8.0f, 21.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _mathNorm!!
    }

private var _mathNorm: ImageVector? = null
