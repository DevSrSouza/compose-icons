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

public val MaterialDesignIcons.EyeOutline: ImageVector
    get() {
        if (_eyeOutline != null) {
            return _eyeOutline!!
        }
        _eyeOutline = Builder(name = "EyeOutline", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 15.0f, 12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 15.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 9.0f, 12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 9.0f)
                moveTo(12.0f, 4.5f)
                curveTo(17.0f, 4.5f, 21.27f, 7.61f, 23.0f, 12.0f)
                curveTo(21.27f, 16.39f, 17.0f, 19.5f, 12.0f, 19.5f)
                curveTo(7.0f, 19.5f, 2.73f, 16.39f, 1.0f, 12.0f)
                curveTo(2.73f, 7.61f, 7.0f, 4.5f, 12.0f, 4.5f)
                moveTo(3.18f, 12.0f)
                curveTo(4.83f, 15.36f, 8.24f, 17.5f, 12.0f, 17.5f)
                curveTo(15.76f, 17.5f, 19.17f, 15.36f, 20.82f, 12.0f)
                curveTo(19.17f, 8.64f, 15.76f, 6.5f, 12.0f, 6.5f)
                curveTo(8.24f, 6.5f, 4.83f, 8.64f, 3.18f, 12.0f)
                close()
            }
        }
        .build()
        return _eyeOutline!!
    }

private var _eyeOutline: ImageVector? = null
