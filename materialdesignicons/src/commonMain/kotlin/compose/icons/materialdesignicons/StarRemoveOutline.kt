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

public val MaterialDesignIcons.StarRemoveOutline: ImageVector
    get() {
        if (_starRemoveOutline != null) {
            return _starRemoveOutline!!
        }
        _starRemoveOutline = Builder(name = "StarRemoveOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.8f, 21.0f)
                lineTo(7.4f, 14.0f)
                lineTo(2.0f, 9.2f)
                lineTo(9.2f, 8.6f)
                lineTo(12.0f, 2.0f)
                lineTo(14.8f, 8.6f)
                lineTo(22.0f, 9.2f)
                lineTo(18.8f, 12.0f)
                horizontalLineTo(18.0f)
                curveTo(17.3f, 12.0f, 16.6f, 12.1f, 15.9f, 12.4f)
                lineTo(18.1f, 10.5f)
                lineTo(13.7f, 10.1f)
                lineTo(12.0f, 6.1f)
                lineTo(10.3f, 10.1f)
                lineTo(5.9f, 10.5f)
                lineTo(9.2f, 13.4f)
                lineTo(8.2f, 17.7f)
                lineTo(12.0f, 15.4f)
                lineTo(12.5f, 15.7f)
                curveTo(12.3f, 16.2f, 12.1f, 16.8f, 12.1f, 17.3f)
                lineTo(5.8f, 21.0f)
                moveTo(20.1f, 14.5f)
                lineTo(18.0f, 16.6f)
                lineTo(15.9f, 14.5f)
                lineTo(14.5f, 15.9f)
                lineTo(16.6f, 18.0f)
                lineTo(14.5f, 20.1f)
                lineTo(15.9f, 21.5f)
                lineTo(18.0f, 19.4f)
                lineTo(20.1f, 21.5f)
                lineTo(21.5f, 20.1f)
                lineTo(19.4f, 18.0f)
                lineTo(21.5f, 15.9f)
                lineTo(20.1f, 14.5f)
                close()
            }
        }
        .build()
        return _starRemoveOutline!!
    }

private var _starRemoveOutline: ImageVector? = null
