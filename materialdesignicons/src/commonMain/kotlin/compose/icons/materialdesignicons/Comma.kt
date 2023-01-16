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

public val MaterialDesignIcons.Comma: ImageVector
    get() {
        if (_comma != null) {
            return _comma!!
        }
        _comma = Builder(name = "Comma", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 3.0f)
                horizontalLineTo(16.95f)
                verticalLineTo(12.96f)
                lineTo(12.96f, 20.94f)
                horizontalLineTo(8.0f)
                lineTo(11.97f, 12.96f)
                horizontalLineTo(7.0f)
                verticalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _comma!!
    }

private var _comma: ImageVector? = null
