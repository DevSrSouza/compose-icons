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

public val MaterialDesignIcons.ArrowTopRightBoldOutline: ImageVector
    get() {
        if (_arrowTopRightBoldOutline != null) {
            return _arrowTopRightBoldOutline!!
        }
        _arrowTopRightBoldOutline = Builder(name = "ArrowTopRightBoldOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.64f, 4.22f)
                horizontalLineTo(19.78f)
                verticalLineTo(18.36f)
                lineTo(15.54f, 14.12f)
                lineTo(9.88f, 19.78f)
                lineTo(4.22f, 14.12f)
                lineTo(9.88f, 8.46f)
                lineTo(5.64f, 4.22f)
                moveTo(17.66f, 6.34f)
                horizontalLineTo(10.59f)
                lineTo(12.71f, 8.46f)
                lineTo(7.05f, 14.12f)
                lineTo(9.88f, 16.95f)
                lineTo(15.54f, 11.29f)
                lineTo(17.66f, 13.41f)
                verticalLineTo(6.34f)
                horizontalLineTo(17.66f)
                close()
            }
        }
        .build()
        return _arrowTopRightBoldOutline!!
    }

private var _arrowTopRightBoldOutline: ImageVector? = null
