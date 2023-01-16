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

public val MaterialDesignIcons.ArrowUpBox: ImageVector
    get() {
        if (_arrowUpBox != null) {
            return _arrowUpBox!!
        }
        _arrowUpBox = Builder(name = "ArrowUpBox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 21.0f)
                horizontalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 3.0f)
                horizontalLineTo(19.0f)
                curveTo(20.11f, 3.0f, 21.0f, 3.9f, 21.0f, 5.0f)
                verticalLineTo(19.0f)
                moveTo(13.0f, 18.0f)
                verticalLineTo(9.5f)
                lineTo(16.5f, 13.0f)
                lineTo(17.92f, 11.58f)
                lineTo(12.0f, 5.66f)
                lineTo(6.08f, 11.58f)
                lineTo(7.5f, 13.0f)
                lineTo(11.0f, 9.5f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _arrowUpBox!!
    }

private var _arrowUpBox: ImageVector? = null
