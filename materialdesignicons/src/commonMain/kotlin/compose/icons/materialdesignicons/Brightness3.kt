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

public val MaterialDesignIcons.Brightness3: ImageVector
    get() {
        if (_brightness3 != null) {
            return _brightness3!!
        }
        _brightness3 = Builder(name = "Brightness3", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 2.0f)
                curveTo(7.95f, 2.0f, 6.95f, 2.16f, 6.0f, 2.46f)
                curveTo(10.06f, 3.73f, 13.0f, 7.5f, 13.0f, 12.0f)
                curveTo(13.0f, 16.5f, 10.06f, 20.27f, 6.0f, 21.54f)
                curveTo(6.95f, 21.84f, 7.95f, 22.0f, 9.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 19.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 9.0f, 2.0f)
                close()
            }
        }
        .build()
        return _brightness3!!
    }

private var _brightness3: ImageVector? = null
