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

public val MaterialDesignIcons.StarOffOutline: ImageVector
    get() {
        if (_starOffOutline != null) {
            return _starOffOutline!!
        }
        _starOffOutline = Builder(name = "StarOffOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.1f, 21.5f)
                lineTo(2.4f, 1.7f)
                lineTo(1.1f, 3.0f)
                lineTo(6.9f, 8.8f)
                lineTo(2.0f, 9.2f)
                lineTo(7.5f, 14.0f)
                lineTo(5.9f, 21.0f)
                lineTo(12.1f, 17.3f)
                lineTo(18.3f, 21.0f)
                lineTo(18.0f, 19.8f)
                lineTo(20.9f, 22.7f)
                lineTo(22.1f, 21.5f)
                moveTo(15.8f, 17.7f)
                lineTo(12.0f, 15.4f)
                lineTo(8.2f, 17.7f)
                lineTo(9.2f, 13.4f)
                lineTo(5.9f, 10.5f)
                lineTo(8.4f, 10.3f)
                lineTo(15.8f, 17.7f)
                moveTo(11.2f, 8.0f)
                lineTo(10.0f, 6.8f)
                lineTo(12.0f, 2.0f)
                lineTo(14.8f, 8.6f)
                lineTo(22.0f, 9.2f)
                lineTo(16.9f, 13.6f)
                lineTo(15.8f, 12.5f)
                lineTo(18.2f, 10.5f)
                lineTo(13.8f, 10.1f)
                lineTo(12.1f, 6.1f)
                lineTo(11.2f, 8.0f)
                close()
            }
        }
        .build()
        return _starOffOutline!!
    }

private var _starOffOutline: ImageVector? = null
