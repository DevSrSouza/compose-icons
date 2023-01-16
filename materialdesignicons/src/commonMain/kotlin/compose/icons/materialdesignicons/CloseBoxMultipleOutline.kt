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

public val MaterialDesignIcons.CloseBoxMultipleOutline: ImageVector
    get() {
        if (_closeBoxMultipleOutline != null) {
            return _closeBoxMultipleOutline!!
        }
        _closeBoxMultipleOutline = Builder(name = "CloseBoxMultipleOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                horizontalLineTo(8.0f)
                curveTo(6.9f, 2.0f, 6.0f, 2.9f, 6.0f, 4.0f)
                verticalLineTo(16.0f)
                curveTo(6.0f, 17.11f, 6.9f, 18.0f, 8.0f, 18.0f)
                horizontalLineTo(20.0f)
                curveTo(21.11f, 18.0f, 22.0f, 17.11f, 22.0f, 16.0f)
                verticalLineTo(4.0f)
                curveTo(22.0f, 2.9f, 21.11f, 2.0f, 20.0f, 2.0f)
                moveTo(20.0f, 16.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(16.0f)
                moveTo(4.0f, 6.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 22.0f, 2.0f, 21.11f, 2.0f, 20.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.0f)
                moveTo(9.77f, 12.84f)
                lineTo(12.6f, 10.0f)
                lineTo(9.77f, 7.15f)
                lineTo(11.17f, 5.75f)
                lineTo(14.0f, 8.6f)
                lineTo(16.84f, 5.77f)
                lineTo(18.24f, 7.17f)
                lineTo(15.4f, 10.0f)
                lineTo(18.23f, 12.84f)
                lineTo(16.83f, 14.24f)
                lineTo(14.0f, 11.4f)
                lineTo(11.17f, 14.24f)
                lineTo(9.77f, 12.84f)
                close()
            }
        }
        .build()
        return _closeBoxMultipleOutline!!
    }

private var _closeBoxMultipleOutline: ImageVector? = null
