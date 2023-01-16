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

public val MaterialDesignIcons.Cricket: ImageVector
    get() {
        if (_cricket != null) {
            return _cricket!!
        }
        _cricket = Builder(name = "Cricket", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.34f, 17.77f)
                lineTo(15.75f, 16.36f)
                lineTo(20.0f, 20.58f)
                lineTo(18.56f, 22.0f)
                lineTo(14.34f, 17.77f)
                moveTo(18.5f, 2.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 22.0f, 5.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 18.5f, 9.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 15.0f, 5.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 18.5f, 2.0f)
                moveTo(2.24f, 7.11f)
                lineTo(5.07f, 4.28f)
                curveTo(5.46f, 3.89f, 6.09f, 3.89f, 6.5f, 4.28f)
                lineTo(14.97f, 12.77f)
                curveTo(15.36f, 13.16f, 15.36f, 13.79f, 14.97f, 14.18f)
                lineTo(12.14f, 17.0f)
                curveTo(11.75f, 17.4f, 11.12f, 17.4f, 10.72f, 17.0f)
                lineTo(2.24f, 8.53f)
                curveTo(1.85f, 8.13f, 1.85f, 7.5f, 2.24f, 7.11f)
                close()
            }
        }
        .build()
        return _cricket!!
    }

private var _cricket: ImageVector? = null
