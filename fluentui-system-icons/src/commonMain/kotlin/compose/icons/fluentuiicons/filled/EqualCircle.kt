package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.EqualCircle: ImageVector
    get() {
        if (_equalCircle != null) {
            return _equalCircle!!
        }
        _equalCircle = Builder(name = "EqualCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                close()
                moveTo(16.2522f, 10.5f)
                horizontalLineTo(7.7528f)
                curveTo(7.3386f, 10.5f, 7.0028f, 10.1642f, 7.0028f, 9.75f)
                curveTo(7.0028f, 9.3358f, 7.3386f, 9.0f, 7.7528f, 9.0f)
                lineTo(16.2522f, 9.0f)
                curveTo(16.6664f, 9.0f, 17.0022f, 9.3358f, 17.0022f, 9.75f)
                curveTo(17.0022f, 10.1642f, 16.6664f, 10.5f, 16.2522f, 10.5f)
                close()
                moveTo(16.2522f, 15.0f)
                horizontalLineTo(7.7528f)
                curveTo(7.3386f, 15.0f, 7.0028f, 14.6642f, 7.0028f, 14.25f)
                curveTo(7.0028f, 13.8358f, 7.3386f, 13.5f, 7.7528f, 13.5f)
                horizontalLineTo(16.2522f)
                curveTo(16.6664f, 13.5f, 17.0022f, 13.8358f, 17.0022f, 14.25f)
                curveTo(17.0022f, 14.6642f, 16.6664f, 15.0f, 16.2522f, 15.0f)
                close()
            }
        }
        .build()
        return _equalCircle!!
    }

private var _equalCircle: ImageVector? = null
