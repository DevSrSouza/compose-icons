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

public val MaterialDesignIcons.CheckDecagramOutline: ImageVector
    get() {
        if (_checkDecagramOutline != null) {
            return _checkDecagramOutline!!
        }
        _checkDecagramOutline = Builder(name = "CheckDecagramOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 12.0f)
                lineTo(20.6f, 9.2f)
                lineTo(20.9f, 5.5f)
                lineTo(17.3f, 4.7f)
                lineTo(15.4f, 1.5f)
                lineTo(12.0f, 3.0f)
                lineTo(8.6f, 1.5f)
                lineTo(6.7f, 4.7f)
                lineTo(3.1f, 5.5f)
                lineTo(3.4f, 9.2f)
                lineTo(1.0f, 12.0f)
                lineTo(3.4f, 14.8f)
                lineTo(3.1f, 18.5f)
                lineTo(6.7f, 19.3f)
                lineTo(8.6f, 22.5f)
                lineTo(12.0f, 21.0f)
                lineTo(15.4f, 22.5f)
                lineTo(17.3f, 19.3f)
                lineTo(20.9f, 18.5f)
                lineTo(20.6f, 14.8f)
                lineTo(23.0f, 12.0f)
                moveTo(18.7f, 16.9f)
                lineTo(16.0f, 17.5f)
                lineTo(14.6f, 19.9f)
                lineTo(12.0f, 18.8f)
                lineTo(9.4f, 19.9f)
                lineTo(8.0f, 17.5f)
                lineTo(5.3f, 16.9f)
                lineTo(5.5f, 14.1f)
                lineTo(3.7f, 12.0f)
                lineTo(5.5f, 9.9f)
                lineTo(5.3f, 7.1f)
                lineTo(8.0f, 6.5f)
                lineTo(9.4f, 4.1f)
                lineTo(12.0f, 5.2f)
                lineTo(14.6f, 4.1f)
                lineTo(16.0f, 6.5f)
                lineTo(18.7f, 7.1f)
                lineTo(18.5f, 9.9f)
                lineTo(20.3f, 12.0f)
                lineTo(18.5f, 14.1f)
                lineTo(18.7f, 16.9f)
                moveTo(16.6f, 7.6f)
                lineTo(18.0f, 9.0f)
                lineTo(10.0f, 17.0f)
                lineTo(6.0f, 13.0f)
                lineTo(7.4f, 11.6f)
                lineTo(10.0f, 14.2f)
                lineTo(16.6f, 7.6f)
                close()
            }
        }
        .build()
        return _checkDecagramOutline!!
    }

private var _checkDecagramOutline: ImageVector? = null
