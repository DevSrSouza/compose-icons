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

public val MaterialDesignIcons.Needle: ImageVector
    get() {
        if (_needle != null) {
            return _needle!!
        }
        _needle = Builder(name = "Needle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.15f, 15.18f)
                lineTo(9.73f, 13.77f)
                lineTo(11.15f, 12.35f)
                lineTo(12.56f, 13.77f)
                lineTo(13.97f, 12.35f)
                lineTo(12.56f, 10.94f)
                lineTo(13.97f, 9.53f)
                lineTo(15.39f, 10.94f)
                lineTo(16.8f, 9.53f)
                lineTo(13.97f, 6.7f)
                lineTo(6.9f, 13.77f)
                lineTo(9.73f, 16.6f)
                lineTo(11.15f, 15.18f)
                moveTo(3.08f, 19.0f)
                lineTo(6.2f, 15.89f)
                lineTo(4.08f, 13.77f)
                lineTo(13.97f, 3.87f)
                lineTo(16.1f, 6.0f)
                lineTo(17.5f, 4.58f)
                lineTo(16.1f, 3.16f)
                lineTo(17.5f, 1.75f)
                lineTo(21.75f, 6.0f)
                lineTo(20.34f, 7.4f)
                lineTo(18.92f, 6.0f)
                lineTo(17.5f, 7.4f)
                lineTo(19.63f, 9.53f)
                lineTo(9.73f, 19.42f)
                lineTo(7.61f, 17.3f)
                lineTo(3.08f, 21.84f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _needle!!
    }

private var _needle: ImageVector? = null
