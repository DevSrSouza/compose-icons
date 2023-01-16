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

public val MaterialDesignIcons.Lumx: ImageVector
    get() {
        if (_lumx != null) {
            return _lumx!!
        }
        _lumx = Builder(name = "Lumx", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.35f, 1.75f)
                lineTo(20.13f, 9.53f)
                lineTo(13.77f, 15.89f)
                lineTo(12.35f, 14.47f)
                lineTo(17.3f, 9.53f)
                lineTo(10.94f, 3.16f)
                lineTo(12.35f, 1.75f)
                moveTo(15.89f, 9.53f)
                lineTo(14.47f, 10.94f)
                lineTo(10.23f, 6.7f)
                lineTo(5.28f, 11.65f)
                lineTo(3.87f, 10.23f)
                lineTo(10.23f, 3.87f)
                lineTo(15.89f, 9.53f)
                moveTo(10.23f, 8.11f)
                lineTo(11.65f, 9.53f)
                lineTo(6.7f, 14.47f)
                lineTo(13.06f, 20.84f)
                lineTo(11.65f, 22.25f)
                lineTo(3.87f, 14.47f)
                lineTo(10.23f, 8.11f)
                moveTo(8.11f, 14.47f)
                lineTo(9.53f, 13.06f)
                lineTo(13.77f, 17.3f)
                lineTo(18.72f, 12.35f)
                lineTo(20.13f, 13.77f)
                lineTo(13.77f, 20.13f)
                lineTo(8.11f, 14.47f)
                close()
            }
        }
        .build()
        return _lumx!!
    }

private var _lumx: ImageVector? = null
