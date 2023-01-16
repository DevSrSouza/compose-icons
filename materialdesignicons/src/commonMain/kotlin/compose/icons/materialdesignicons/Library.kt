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

public val MaterialDesignIcons.Library: ImageVector
    get() {
        if (_library != null) {
            return _library!!
        }
        _library = Builder(name = "Library", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 8.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 15.0f, 5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 12.0f, 2.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.0f, 5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 12.0f, 8.0f)
                moveTo(12.0f, 11.54f)
                curveTo(9.64f, 9.35f, 6.5f, 8.0f, 3.0f, 8.0f)
                verticalLineTo(19.0f)
                curveTo(6.5f, 19.0f, 9.64f, 20.35f, 12.0f, 22.54f)
                curveTo(14.36f, 20.35f, 17.5f, 19.0f, 21.0f, 19.0f)
                verticalLineTo(8.0f)
                curveTo(17.5f, 8.0f, 14.36f, 9.35f, 12.0f, 11.54f)
                close()
            }
        }
        .build()
        return _library!!
    }

private var _library: ImageVector? = null
