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

public val MaterialDesignIcons.ArrowBottomRightBoldOutline: ImageVector
    get() {
        if (_arrowBottomRightBoldOutline != null) {
            return _arrowBottomRightBoldOutline!!
        }
        _arrowBottomRightBoldOutline = Builder(name = "ArrowBottomRightBoldOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.88f, 15.54f)
                lineTo(4.22f, 9.88f)
                lineTo(9.88f, 4.22f)
                lineTo(15.54f, 9.88f)
                lineTo(19.78f, 5.64f)
                verticalLineTo(19.78f)
                horizontalLineTo(5.64f)
                lineTo(9.88f, 15.54f)
                moveTo(17.66f, 10.59f)
                lineTo(15.54f, 12.71f)
                lineTo(9.88f, 7.05f)
                lineTo(7.05f, 9.88f)
                lineTo(12.71f, 15.54f)
                lineTo(10.59f, 17.66f)
                horizontalLineTo(17.66f)
                verticalLineTo(10.59f)
                close()
            }
        }
        .build()
        return _arrowBottomRightBoldOutline!!
    }

private var _arrowBottomRightBoldOutline: ImageVector? = null
