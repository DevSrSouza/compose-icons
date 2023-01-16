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

public val MaterialDesignIcons.Origin: ImageVector
    get() {
        if (_origin != null) {
            return _origin!!
        }
        _origin = Builder(name = "Origin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.13f)
                curveTo(12.0f, 2.23f, 11.95f, 2.33f, 11.89f, 2.41f)
                curveTo(11.5f, 3.0f, 11.16f, 3.64f, 11.04f, 4.33f)
                lineTo(11.0f, 4.56f)
                lineTo(12.0f, 4.5f)
                arcTo(7.5f, 7.5f, 0.0f, false, true, 19.5f, 12.0f)
                curveTo(19.5f, 13.62f, 19.0f, 15.11f, 18.12f, 16.34f)
                curveTo(16.73f, 18.68f, 14.72f, 20.65f, 12.34f, 21.97f)
                curveTo(12.25f, 22.0f, 12.12f, 22.0f, 12.06f, 21.93f)
                curveTo(12.0f, 21.83f, 12.0f, 21.7f, 12.09f, 21.61f)
                curveTo(12.47f, 21.09f, 12.73f, 20.5f, 12.87f, 19.85f)
                lineTo(12.93f, 19.44f)
                lineTo(12.0f, 19.5f)
                arcTo(7.5f, 7.5f, 0.0f, false, true, 4.5f, 12.0f)
                curveTo(4.5f, 10.39f, 5.0f, 8.89f, 5.88f, 7.67f)
                curveTo(7.26f, 5.32f, 9.28f, 3.34f, 11.67f, 2.0f)
                curveTo(11.78f, 1.95f, 11.94f, 2.0f, 12.0f, 2.13f)
                moveTo(12.0f, 9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.0f, 12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 12.0f, 15.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 15.0f, 12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 12.0f, 9.0f)
                close()
            }
        }
        .build()
        return _origin!!
    }

private var _origin: ImageVector? = null
