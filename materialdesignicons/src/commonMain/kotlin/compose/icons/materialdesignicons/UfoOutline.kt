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

public val MaterialDesignIcons.UfoOutline: ImageVector
    get() {
        if (_ufoOutline != null) {
            return _ufoOutline!!
        }
        _ufoOutline = Builder(name = "UfoOutline", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 10.54f)
                curveTo(16.78f, 7.44f, 14.63f, 5.0f, 12.0f, 5.0f)
                reflectiveCurveTo(7.22f, 7.44f, 7.0f, 10.54f)
                curveTo(4.0f, 11.23f, 2.0f, 12.5f, 2.0f, 14.0f)
                curveTo(2.0f, 16.21f, 6.5f, 18.0f, 12.0f, 18.0f)
                reflectiveCurveTo(22.0f, 16.21f, 22.0f, 14.0f)
                curveTo(22.0f, 12.5f, 20.0f, 11.23f, 17.0f, 10.54f)
                moveTo(14.93f, 11.84f)
                curveTo(13.03f, 12.05f, 10.97f, 12.05f, 9.07f, 11.84f)
                curveTo(9.03f, 11.56f, 9.0f, 11.28f, 9.0f, 11.0f)
                curveTo(9.0f, 8.8f, 10.35f, 7.0f, 12.0f, 7.0f)
                reflectiveCurveTo(15.0f, 8.8f, 15.0f, 11.0f)
                curveTo(15.0f, 11.28f, 15.0f, 11.56f, 14.93f, 11.84f)
                close()
            }
        }
        .build()
        return _ufoOutline!!
    }

private var _ufoOutline: ImageVector? = null
