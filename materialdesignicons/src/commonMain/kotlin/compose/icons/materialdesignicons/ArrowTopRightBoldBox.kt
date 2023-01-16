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

public val MaterialDesignIcons.ArrowTopRightBoldBox: ImageVector
    get() {
        if (_arrowTopRightBoldBox != null) {
            return _arrowTopRightBoldBox!!
        }
        _arrowTopRightBoldBox = Builder(name = "ArrowTopRightBoldBox", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                curveTo(20.1f, 3.0f, 21.0f, 3.9f, 21.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(21.0f, 20.1f, 20.1f, 21.0f, 19.0f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 21.0f, 3.0f, 20.1f, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 3.9f, 3.9f, 3.0f, 5.0f, 3.0f)
                horizontalLineTo(19.0f)
                moveTo(8.7f, 8.0f)
                lineTo(10.8f, 10.1f)
                lineTo(7.0f, 14.0f)
                lineTo(9.8f, 16.8f)
                lineTo(13.6f, 12.9f)
                lineTo(15.7f, 15.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(8.7f)
                close()
            }
        }
        .build()
        return _arrowTopRightBoldBox!!
    }

private var _arrowTopRightBoldBox: ImageVector? = null
