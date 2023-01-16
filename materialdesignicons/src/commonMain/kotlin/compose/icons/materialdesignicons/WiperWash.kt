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

public val MaterialDesignIcons.WiperWash: ImageVector
    get() {
        if (_wiperWash != null) {
            return _wiperWash!!
        }
        _wiperWash = Builder(name = "WiperWash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 6.0f)
                curveTo(13.0f, 5.7f, 13.1f, 4.6f, 13.8f, 3.8f)
                lineTo(12.0f, 2.4f)
                lineTo(10.2f, 3.9f)
                curveTo(10.9f, 4.6f, 11.0f, 5.7f, 11.0f, 6.0f)
                curveTo(4.7f, 6.4f, 2.0f, 11.0f, 2.0f, 11.0f)
                lineTo(9.0f, 18.0f)
                curveTo(9.0f, 18.0f, 9.7f, 16.7f, 11.0f, 16.2f)
                verticalLineTo(18.3f)
                curveTo(10.4f, 18.6f, 10.0f, 19.3f, 10.0f, 20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 22.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 20.0f)
                curveTo(14.0f, 19.3f, 13.6f, 18.6f, 13.0f, 18.3f)
                verticalLineTo(16.2f)
                curveTo(14.3f, 16.7f, 15.0f, 18.0f, 15.0f, 18.0f)
                lineTo(22.0f, 11.0f)
                curveTo(22.0f, 11.0f, 19.3f, 6.5f, 13.0f, 6.0f)
                moveTo(11.0f, 14.1f)
                curveTo(10.2f, 14.3f, 9.5f, 14.6f, 8.9f, 15.1f)
                lineTo(4.7f, 10.9f)
                curveTo(5.8f, 9.8f, 7.8f, 8.3f, 11.0f, 8.1f)
                verticalLineTo(14.1f)
                moveTo(15.1f, 15.1f)
                curveTo(14.5f, 14.7f, 13.8f, 14.3f, 13.0f, 14.1f)
                verticalLineTo(8.1f)
                curveTo(16.2f, 8.4f, 18.2f, 9.8f, 19.3f, 10.9f)
                lineTo(15.1f, 15.1f)
                moveTo(18.0f, 1.3f)
                lineTo(17.3f, 3.2f)
                curveTo(16.6f, 2.9f, 15.5f, 2.9f, 14.7f, 3.2f)
                lineTo(14.0f, 1.3f)
                curveTo(15.2f, 0.9f, 16.8f, 0.9f, 18.0f, 1.3f)
                moveTo(21.0f, 6.0f)
                horizontalLineTo(19.0f)
                curveTo(19.0f, 6.0f, 19.0f, 4.7f, 18.2f, 3.9f)
                lineTo(19.7f, 2.6f)
                curveTo(21.0f, 4.0f, 21.0f, 5.9f, 21.0f, 6.0f)
                moveTo(4.2f, 2.6f)
                lineTo(5.7f, 3.9f)
                curveTo(5.0f, 4.7f, 5.0f, 6.0f, 5.0f, 6.0f)
                horizontalLineTo(3.0f)
                curveTo(3.0f, 5.9f, 3.0f, 4.0f, 4.2f, 2.6f)
                moveTo(10.0f, 1.3f)
                lineTo(9.3f, 3.2f)
                curveTo(8.6f, 2.9f, 7.5f, 2.9f, 6.7f, 3.2f)
                lineTo(6.0f, 1.3f)
                curveTo(7.2f, 0.9f, 8.8f, 0.9f, 10.0f, 1.3f)
                close()
            }
        }
        .build()
        return _wiperWash!!
    }

private var _wiperWash: ImageVector? = null
