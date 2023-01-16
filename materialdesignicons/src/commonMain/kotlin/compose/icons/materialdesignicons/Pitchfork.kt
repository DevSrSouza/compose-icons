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

public val MaterialDesignIcons.Pitchfork: ImageVector
    get() {
        if (_pitchfork != null) {
            return _pitchfork!!
        }
        _pitchfork = Builder(name = "Pitchfork", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.9f, 0.9f)
                lineTo(13.1f, 3.7f)
                curveTo(12.3f, 4.5f, 12.3f, 5.7f, 13.1f, 6.5f)
                lineTo(14.5f, 8.0f)
                lineTo(9.2f, 13.4f)
                lineTo(7.8f, 12.0f)
                curveTo(7.0f, 11.2f, 5.8f, 11.2f, 5.0f, 12.0f)
                lineTo(1.0f, 16.0f)
                lineTo(2.4f, 17.4f)
                lineTo(6.4f, 13.4f)
                lineTo(7.8f, 14.8f)
                lineTo(3.8f, 18.8f)
                lineTo(5.2f, 20.2f)
                lineTo(9.2f, 16.2f)
                lineTo(10.6f, 17.6f)
                lineTo(9.9f, 18.4f)
                lineTo(6.7f, 21.6f)
                lineTo(8.0f, 23.0f)
                lineTo(12.0f, 19.0f)
                curveTo(12.8f, 18.2f, 12.8f, 17.0f, 12.0f, 16.2f)
                lineTo(10.6f, 14.8f)
                lineTo(15.9f, 9.4f)
                lineTo(17.3f, 10.8f)
                curveTo(18.1f, 11.6f, 19.3f, 11.6f, 20.1f, 10.8f)
                lineTo(23.0f, 8.0f)
                lineTo(15.9f, 0.9f)
                moveTo(18.7f, 9.4f)
                lineTo(14.5f, 5.2f)
                lineTo(15.9f, 3.8f)
                lineTo(20.1f, 8.0f)
                lineTo(18.7f, 9.4f)
                close()
            }
        }
        .build()
        return _pitchfork!!
    }

private var _pitchfork: ImageVector? = null
