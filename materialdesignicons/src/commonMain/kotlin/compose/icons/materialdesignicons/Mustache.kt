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

public val MaterialDesignIcons.Mustache: ImageVector
    get() {
        if (_mustache != null) {
            return _mustache!!
        }
        _mustache = Builder(name = "Mustache", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 12.0f)
                curveTo(19.0f, 12.0f, 18.0f, 9.0f, 15.0f, 9.0f)
                reflectiveCurveTo(12.0f, 11.0f, 12.0f, 11.0f)
                reflectiveCurveTo(12.0f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveTo(5.0f, 12.0f, 3.0f, 12.0f)
                curveTo(2.0f, 12.0f, 1.0f, 11.0f, 1.0f, 11.0f)
                reflectiveCurveTo(2.0f, 16.0f, 6.0f, 16.0f)
                curveTo(11.0f, 16.0f, 12.0f, 13.0f, 12.0f, 13.0f)
                reflectiveCurveTo(13.0f, 16.0f, 18.0f, 16.0f)
                curveTo(22.0f, 16.0f, 23.0f, 11.0f, 23.0f, 11.0f)
                reflectiveCurveTo(22.0f, 12.0f, 21.0f, 12.0f)
                close()
            }
        }
        .build()
        return _mustache!!
    }

private var _mustache: ImageVector? = null
