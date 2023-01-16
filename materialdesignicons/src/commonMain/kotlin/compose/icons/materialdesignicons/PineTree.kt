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

public val MaterialDesignIcons.PineTree: ImageVector
    get() {
        if (_pineTree != null) {
            return _pineTree!!
        }
        _pineTree = Builder(name = "PineTree", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 21.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(3.0f)
                lineTo(8.0f, 13.0f)
                horizontalLineTo(5.0f)
                lineTo(10.0f, 8.0f)
                horizontalLineTo(7.0f)
                lineTo(12.0f, 3.0f)
                lineTo(17.0f, 8.0f)
                horizontalLineTo(14.0f)
                lineTo(19.0f, 13.0f)
                horizontalLineTo(16.0f)
                lineTo(21.0f, 18.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _pineTree!!
    }

private var _pineTree: ImageVector? = null
