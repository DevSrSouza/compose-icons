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

public val MaterialDesignIcons.CloseBoxMultiple: ImageVector
    get() {
        if (_closeBoxMultiple != null) {
            return _closeBoxMultiple!!
        }
        _closeBoxMultiple = Builder(name = "CloseBoxMultiple", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 22.0f, 2.0f, 21.11f, 2.0f, 20.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                moveTo(20.22f, 2.0f)
                horizontalLineTo(7.78f)
                curveTo(6.8f, 2.0f, 6.0f, 2.8f, 6.0f, 3.78f)
                verticalLineTo(16.22f)
                curveTo(6.0f, 17.2f, 6.8f, 18.0f, 7.78f, 18.0f)
                horizontalLineTo(20.22f)
                curveTo(21.2f, 18.0f, 22.0f, 17.2f, 22.0f, 16.22f)
                verticalLineTo(3.78f)
                curveTo(22.0f, 2.8f, 21.2f, 2.0f, 20.22f, 2.0f)
                moveTo(19.0f, 13.6f)
                lineTo(17.6f, 15.0f)
                lineTo(14.0f, 11.4f)
                lineTo(10.4f, 15.0f)
                lineTo(9.0f, 13.6f)
                lineTo(12.6f, 10.0f)
                lineTo(9.0f, 6.4f)
                lineTo(10.4f, 5.0f)
                lineTo(14.0f, 8.6f)
                lineTo(17.6f, 5.0f)
                lineTo(19.0f, 6.4f)
                lineTo(15.4f, 10.0f)
                lineTo(19.0f, 13.6f)
                close()
            }
        }
        .build()
        return _closeBoxMultiple!!
    }

private var _closeBoxMultiple: ImageVector? = null
