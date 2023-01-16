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

public val MaterialDesignIcons.ArrowLeft: ImageVector
    get() {
        if (_arrowLeft != null) {
            return _arrowLeft!!
        }
        _arrowLeft = Builder(name = "ArrowLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(8.0f)
                lineTo(13.5f, 18.5f)
                lineTo(12.08f, 19.92f)
                lineTo(4.16f, 12.0f)
                lineTo(12.08f, 4.08f)
                lineTo(13.5f, 5.5f)
                lineTo(8.0f, 11.0f)
                horizontalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _arrowLeft!!
    }

private var _arrowLeft: ImageVector? = null
