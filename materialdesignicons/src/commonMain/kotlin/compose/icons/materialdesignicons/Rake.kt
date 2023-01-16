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

public val MaterialDesignIcons.Rake: ImageVector
    get() {
        if (_rake != null) {
            return _rake!!
        }
        _rake = Builder(name = "Rake", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 17.05f)
                lineTo(9.43f, 16.0f)
                lineTo(22.07f, 3.35f)
                lineTo(20.66f, 1.93f)
                lineTo(8.0f, 14.58f)
                lineTo(6.95f, 13.5f)
                curveTo(6.17f, 12.73f, 4.9f, 12.73f, 4.12f, 13.5f)
                lineTo(2.0f, 15.64f)
                lineTo(2.71f, 16.34f)
                lineTo(4.83f, 14.22f)
                lineTo(5.54f, 14.93f)
                lineTo(3.41f, 17.05f)
                lineTo(4.12f, 17.76f)
                lineTo(6.24f, 15.64f)
                lineTo(6.95f, 16.34f)
                lineTo(4.83f, 18.46f)
                lineTo(5.54f, 19.17f)
                lineTo(7.66f, 17.05f)
                lineTo(8.36f, 17.76f)
                lineTo(6.24f, 19.88f)
                lineTo(6.95f, 20.59f)
                lineTo(9.07f, 18.46f)
                lineTo(9.78f, 19.17f)
                lineTo(7.66f, 21.29f)
                lineTo(8.36f, 22.0f)
                lineTo(10.5f, 19.88f)
                curveTo(11.27f, 19.1f, 11.27f, 17.83f, 10.5f, 17.05f)
                close()
            }
        }
        .build()
        return _rake!!
    }

private var _rake: ImageVector? = null
