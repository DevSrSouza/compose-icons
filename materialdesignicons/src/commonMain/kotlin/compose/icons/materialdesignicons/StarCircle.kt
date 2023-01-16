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

public val MaterialDesignIcons.StarCircle: ImageVector
    get() {
        if (_starCircle != null) {
            return _starCircle!!
        }
        _starCircle = Builder(name = "StarCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.23f, 18.0f)
                lineTo(12.0f, 15.45f)
                lineTo(7.77f, 18.0f)
                lineTo(8.89f, 13.19f)
                lineTo(5.16f, 9.96f)
                lineTo(10.08f, 9.54f)
                lineTo(12.0f, 5.0f)
                lineTo(13.92f, 9.53f)
                lineTo(18.84f, 9.95f)
                lineTo(15.11f, 13.18f)
                lineTo(16.23f, 18.0f)
                moveTo(12.0f, 2.0f)
                curveTo(6.47f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _starCircle!!
    }

private var _starCircle: ImageVector? = null
