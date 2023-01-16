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

public val MaterialDesignIcons.ArrowDown: ImageVector
    get() {
        if (_arrowDown != null) {
            return _arrowDown!!
        }
        _arrowDown = Builder(name = "ArrowDown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 4.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(16.0f)
                lineTo(18.5f, 10.5f)
                lineTo(19.92f, 11.92f)
                lineTo(12.0f, 19.84f)
                lineTo(4.08f, 11.92f)
                lineTo(5.5f, 10.5f)
                lineTo(11.0f, 16.0f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _arrowDown!!
    }

private var _arrowDown: ImageVector? = null
