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

public val MaterialDesignIcons.Backburger: ImageVector
    get() {
        if (_backburger != null) {
            return _backburger!!
        }
        _backburger = Builder(name = "Backburger", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 13.0f)
                lineTo(9.0f, 17.0f)
                lineTo(7.6f, 18.42f)
                lineTo(1.18f, 12.0f)
                lineTo(7.6f, 5.58f)
                lineTo(9.0f, 7.0f)
                lineTo(5.0f, 11.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(5.0f)
                moveTo(21.0f, 6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(21.0f)
                moveTo(21.0f, 16.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(21.0f)
                close()
            }
        }
        .build()
        return _backburger!!
    }

private var _backburger: ImageVector? = null
