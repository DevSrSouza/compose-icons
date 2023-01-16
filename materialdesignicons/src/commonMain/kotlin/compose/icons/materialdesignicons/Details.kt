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

public val MaterialDesignIcons.Details: ImageVector
    get() {
        if (_details != null) {
            return _details!!
        }
        _details = Builder(name = "Details", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.38f, 6.0f)
                horizontalLineTo(17.63f)
                lineTo(12.0f, 16.0f)
                lineTo(6.38f, 6.0f)
                moveTo(3.0f, 4.0f)
                lineTo(12.0f, 20.0f)
                lineTo(21.0f, 4.0f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _details!!
    }

private var _details: ImageVector? = null
