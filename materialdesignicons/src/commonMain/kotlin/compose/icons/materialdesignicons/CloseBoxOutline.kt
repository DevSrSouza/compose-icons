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

public val MaterialDesignIcons.CloseBoxOutline: ImageVector
    get() {
        if (_closeBoxOutline != null) {
            return _closeBoxOutline!!
        }
        _closeBoxOutline = Builder(name = "CloseBoxOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                horizontalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 3.0f)
                moveTo(19.0f, 19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(19.0f)
                moveTo(17.0f, 8.4f)
                lineTo(13.4f, 12.0f)
                lineTo(17.0f, 15.6f)
                lineTo(15.6f, 17.0f)
                lineTo(12.0f, 13.4f)
                lineTo(8.4f, 17.0f)
                lineTo(7.0f, 15.6f)
                lineTo(10.6f, 12.0f)
                lineTo(7.0f, 8.4f)
                lineTo(8.4f, 7.0f)
                lineTo(12.0f, 10.6f)
                lineTo(15.6f, 7.0f)
                lineTo(17.0f, 8.4f)
                close()
            }
        }
        .build()
        return _closeBoxOutline!!
    }

private var _closeBoxOutline: ImageVector? = null
