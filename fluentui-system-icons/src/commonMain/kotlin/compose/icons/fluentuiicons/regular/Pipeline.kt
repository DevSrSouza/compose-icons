package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.Pipeline: ImageVector
    get() {
        if (_pipeline != null) {
            return _pipeline!!
        }
        _pipeline = Builder(name = "Pipeline", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 6.25f)
                curveTo(2.0f, 5.0074f, 3.0074f, 4.0f, 4.25f, 4.0f)
                curveTo(5.4081f, 4.0f, 6.3619f, 4.875f, 6.4863f, 6.0f)
                lineTo(17.5137f, 6.0f)
                curveTo(17.6381f, 4.875f, 18.5919f, 4.0f, 19.75f, 4.0f)
                curveTo(20.9926f, 4.0f, 22.0f, 5.0074f, 22.0f, 6.25f)
                verticalLineTo(16.75f)
                curveTo(22.0f, 17.9926f, 20.9926f, 19.0f, 19.75f, 19.0f)
                curveTo(18.5919f, 19.0f, 17.6381f, 18.125f, 17.5137f, 17.0f)
                lineTo(6.4863f, 17.0f)
                curveTo(6.3619f, 18.125f, 5.4081f, 19.0f, 4.25f, 19.0f)
                curveTo(3.0074f, 19.0f, 2.0f, 17.9926f, 2.0f, 16.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(5.0f, 6.25f)
                curveTo(5.0f, 5.8358f, 4.6642f, 5.5f, 4.25f, 5.5f)
                curveTo(3.8358f, 5.5f, 3.5f, 5.8358f, 3.5f, 6.25f)
                verticalLineTo(16.75f)
                curveTo(3.5f, 17.1642f, 3.8358f, 17.5f, 4.25f, 17.5f)
                curveTo(4.6642f, 17.5f, 5.0f, 17.1642f, 5.0f, 16.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(6.5f, 15.5f)
                lineTo(17.5f, 15.5f)
                verticalLineTo(7.5f)
                lineTo(6.5f, 7.5f)
                verticalLineTo(15.5f)
                close()
                moveTo(20.5f, 6.25f)
                curveTo(20.5f, 5.8358f, 20.1642f, 5.5f, 19.75f, 5.5f)
                curveTo(19.3358f, 5.5f, 19.0f, 5.8358f, 19.0f, 6.25f)
                verticalLineTo(16.75f)
                curveTo(19.0f, 17.1642f, 19.3358f, 17.5f, 19.75f, 17.5f)
                curveTo(20.1642f, 17.5f, 20.5f, 17.1642f, 20.5f, 16.75f)
                verticalLineTo(6.25f)
                close()
            }
        }
        .build()
        return _pipeline!!
    }

private var _pipeline: ImageVector? = null
