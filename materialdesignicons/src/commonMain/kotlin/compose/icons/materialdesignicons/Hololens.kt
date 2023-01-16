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

public val MaterialDesignIcons.Hololens: ImageVector
    get() {
        if (_hololens != null) {
            return _hololens!!
        }
        _hololens = Builder(name = "Hololens", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 8.0f)
                curveTo(12.0f, 8.0f, 22.0f, 8.0f, 22.0f, 11.0f)
                curveTo(22.0f, 11.0f, 22.09f, 14.36f, 21.75f, 14.25f)
                curveTo(21.0f, 11.0f, 12.0f, 11.0f, 12.0f, 11.0f)
                curveTo(12.0f, 11.0f, 3.0f, 11.0f, 2.25f, 14.25f)
                curveTo(1.91f, 14.36f, 2.0f, 11.0f, 2.0f, 11.0f)
                curveTo(2.0f, 8.0f, 12.0f, 8.0f, 12.0f, 8.0f)
                moveTo(12.0f, 12.0f)
                curveTo(20.0f, 12.0f, 20.75f, 14.25f, 20.75f, 14.25f)
                curveTo(19.75f, 17.25f, 19.0f, 18.0f, 15.0f, 18.0f)
                curveTo(12.0f, 18.0f, 13.0f, 16.5f, 12.0f, 16.5f)
                curveTo(11.0f, 16.5f, 12.0f, 18.0f, 9.0f, 18.0f)
                curveTo(5.0f, 18.0f, 4.25f, 17.25f, 3.25f, 14.25f)
                curveTo(3.25f, 14.25f, 4.0f, 12.0f, 12.0f, 12.0f)
                close()
            }
        }
        .build()
        return _hololens!!
    }

private var _hololens: ImageVector? = null
