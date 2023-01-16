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

public val MaterialDesignIcons.DecagramOutline: ImageVector
    get() {
        if (_decagramOutline != null) {
            return _decagramOutline!!
        }
        _decagramOutline = Builder(name = "DecagramOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 12.0f)
                lineTo(20.56f, 14.78f)
                lineTo(20.9f, 18.46f)
                lineTo(17.29f, 19.28f)
                lineTo(15.4f, 22.46f)
                lineTo(12.0f, 21.0f)
                lineTo(8.6f, 22.47f)
                lineTo(6.71f, 19.29f)
                lineTo(3.1f, 18.47f)
                lineTo(3.44f, 14.78f)
                lineTo(1.0f, 12.0f)
                lineTo(3.44f, 9.21f)
                lineTo(3.1f, 5.53f)
                lineTo(6.71f, 4.72f)
                lineTo(8.6f, 1.54f)
                lineTo(12.0f, 3.0f)
                lineTo(15.4f, 1.54f)
                lineTo(17.29f, 4.72f)
                lineTo(20.9f, 5.54f)
                lineTo(20.56f, 9.22f)
                lineTo(23.0f, 12.0f)
                moveTo(20.33f, 12.0f)
                lineTo(18.5f, 9.89f)
                lineTo(18.74f, 7.1f)
                lineTo(16.0f, 6.5f)
                lineTo(14.58f, 4.07f)
                lineTo(12.0f, 5.18f)
                lineTo(9.42f, 4.07f)
                lineTo(8.0f, 6.5f)
                lineTo(5.26f, 7.09f)
                lineTo(5.5f, 9.88f)
                lineTo(3.67f, 12.0f)
                lineTo(5.5f, 14.1f)
                lineTo(5.26f, 16.9f)
                lineTo(8.0f, 17.5f)
                lineTo(9.42f, 19.93f)
                lineTo(12.0f, 18.81f)
                lineTo(14.58f, 19.92f)
                lineTo(16.0f, 17.5f)
                lineTo(18.74f, 16.89f)
                lineTo(18.5f, 14.1f)
                lineTo(20.33f, 12.0f)
                close()
            }
        }
        .build()
        return _decagramOutline!!
    }

private var _decagramOutline: ImageVector? = null
