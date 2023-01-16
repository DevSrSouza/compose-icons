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

public val MaterialDesignIcons.Eraser: ImageVector
    get() {
        if (_eraser != null) {
            return _eraser!!
        }
        _eraser = Builder(name = "Eraser", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.24f, 3.56f)
                lineTo(21.19f, 8.5f)
                curveTo(21.97f, 9.29f, 21.97f, 10.55f, 21.19f, 11.34f)
                lineTo(12.0f, 20.53f)
                curveTo(10.44f, 22.09f, 7.91f, 22.09f, 6.34f, 20.53f)
                lineTo(2.81f, 17.0f)
                curveTo(2.03f, 16.21f, 2.03f, 14.95f, 2.81f, 14.16f)
                lineTo(13.41f, 3.56f)
                curveTo(14.2f, 2.78f, 15.46f, 2.78f, 16.24f, 3.56f)
                moveTo(4.22f, 15.58f)
                lineTo(7.76f, 19.11f)
                curveTo(8.54f, 19.9f, 9.8f, 19.9f, 10.59f, 19.11f)
                lineTo(14.12f, 15.58f)
                lineTo(9.17f, 10.63f)
                lineTo(4.22f, 15.58f)
                close()
            }
        }
        .build()
        return _eraser!!
    }

private var _eraser: ImageVector? = null
