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

public val MaterialDesignIcons.StarOutline: ImageVector
    get() {
        if (_starOutline != null) {
            return _starOutline!!
        }
        _starOutline = Builder(name = "StarOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 15.39f)
                lineTo(8.24f, 17.66f)
                lineTo(9.23f, 13.38f)
                lineTo(5.91f, 10.5f)
                lineTo(10.29f, 10.13f)
                lineTo(12.0f, 6.09f)
                lineTo(13.71f, 10.13f)
                lineTo(18.09f, 10.5f)
                lineTo(14.77f, 13.38f)
                lineTo(15.76f, 17.66f)
                moveTo(22.0f, 9.24f)
                lineTo(14.81f, 8.63f)
                lineTo(12.0f, 2.0f)
                lineTo(9.19f, 8.63f)
                lineTo(2.0f, 9.24f)
                lineTo(7.45f, 13.97f)
                lineTo(5.82f, 21.0f)
                lineTo(12.0f, 17.27f)
                lineTo(18.18f, 21.0f)
                lineTo(16.54f, 13.97f)
                lineTo(22.0f, 9.24f)
                close()
            }
        }
        .build()
        return _starOutline!!
    }

private var _starOutline: ImageVector? = null
