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

public val MaterialDesignIcons.ArrowRightBoldOutline: ImageVector
    get() {
        if (_arrowRightBoldOutline != null) {
            return _arrowRightBoldOutline!!
        }
        _arrowRightBoldOutline = Builder(name = "ArrowRightBoldOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 16.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(2.0f)
                lineTo(21.0f, 12.0f)
                lineTo(11.0f, 22.0f)
                verticalLineTo(16.0f)
                moveTo(13.0f, 7.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                lineTo(18.0f, 12.0f)
                lineTo(13.0f, 7.0f)
                close()
            }
        }
        .build()
        return _arrowRightBoldOutline!!
    }

private var _arrowRightBoldOutline: ImageVector? = null
