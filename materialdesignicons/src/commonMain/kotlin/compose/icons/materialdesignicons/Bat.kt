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

public val MaterialDesignIcons.Bat: ImageVector
    get() {
        if (_bat != null) {
            return _bat!!
        }
        _bat = Builder(name = "Bat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.75f, 8.0f)
                curveTo(0.75f, 8.0f, 5.0f, 7.0f, 8.0f, 9.0f)
                curveTo(8.0f, 9.0f, 8.5f, 12.75f, 10.5f, 12.75f)
                verticalLineTo(11.0f)
                curveTo(10.5f, 11.0f, 11.0f, 12.0f, 12.0f, 12.0f)
                curveTo(13.0f, 12.0f, 13.5f, 11.0f, 13.5f, 11.0f)
                verticalLineTo(12.75f)
                curveTo(15.5f, 12.75f, 16.0f, 9.0f, 16.0f, 9.0f)
                curveTo(19.0f, 7.0f, 23.25f, 8.0f, 23.25f, 8.0f)
                curveTo(21.25f, 9.0f, 21.0f, 12.5f, 21.0f, 12.5f)
                curveTo(17.0f, 12.5f, 17.0f, 15.75f, 17.0f, 15.75f)
                curveTo(12.0f, 14.75f, 12.0f, 18.5f, 12.0f, 18.5f)
                curveTo(12.0f, 18.5f, 12.0f, 14.75f, 7.0f, 15.75f)
                curveTo(7.0f, 15.75f, 7.0f, 12.5f, 3.0f, 12.5f)
                curveTo(3.0f, 12.5f, 2.75f, 9.0f, 0.75f, 8.0f)
                close()
            }
        }
        .build()
        return _bat!!
    }

private var _bat: ImageVector? = null
