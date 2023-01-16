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

public val MaterialDesignIcons.Knob: ImageVector
    get() {
        if (_knob != null) {
            return _knob!!
        }
        _knob = Builder(name = "Knob", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.5f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f)
                reflectiveCurveTo(6.5f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveTo(22.0f, 17.5f, 22.0f, 12.0f)
                reflectiveCurveTo(17.5f, 2.0f, 12.0f, 2.0f)
                moveTo(13.0f, 10.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(4.1f)
                curveTo(11.3f, 4.0f, 11.7f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveTo(12.7f, 4.0f, 13.0f, 4.1f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _knob!!
    }

private var _knob: ImageVector? = null
