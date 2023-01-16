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

public val MaterialDesignIcons.Ufo: ImageVector
    get() {
        if (_ufo != null) {
            return _ufo!!
        }
        _ufo = Builder(name = "Ufo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.94f, 10.28f)
                curveTo(15.66f, 7.87f, 14.0f, 6.0f, 12.0f, 6.0f)
                reflectiveCurveTo(8.34f, 7.87f, 8.06f, 10.28f)
                curveTo(4.5f, 10.82f, 2.0f, 12.06f, 2.0f, 13.5f)
                curveTo(2.0f, 15.43f, 6.5f, 17.0f, 12.0f, 17.0f)
                reflectiveCurveTo(22.0f, 15.43f, 22.0f, 13.5f)
                curveTo(22.0f, 12.06f, 19.5f, 10.82f, 15.94f, 10.28f)
                close()
            }
        }
        .build()
        return _ufo!!
    }

private var _ufo: ImageVector? = null
