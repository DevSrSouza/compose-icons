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

public val FilledGroup.Payment: ImageVector
    get() {
        if (_payment != null) {
            return _payment!!
        }
        _payment = Builder(name = "Payment", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.25f, 5.0f)
                curveTo(3.4551f, 5.0f, 2.0f, 6.4551f, 2.0f, 8.25f)
                verticalLineTo(9.5f)
                horizontalLineTo(22.0f)
                verticalLineTo(8.25f)
                curveTo(22.0f, 6.4551f, 20.5449f, 5.0f, 18.75f, 5.0f)
                horizontalLineTo(5.25f)
                close()
                moveTo(22.0f, 11.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(15.75f)
                curveTo(2.0f, 17.5449f, 3.4551f, 19.0f, 5.25f, 19.0f)
                horizontalLineTo(18.75f)
                curveTo(20.5449f, 19.0f, 22.0f, 17.5449f, 22.0f, 15.75f)
                verticalLineTo(11.0f)
                close()
                moveTo(15.75f, 14.5f)
                horizontalLineTo(18.25f)
                curveTo(18.6642f, 14.5f, 19.0f, 14.8358f, 19.0f, 15.25f)
                curveTo(19.0f, 15.6642f, 18.6642f, 16.0f, 18.25f, 16.0f)
                horizontalLineTo(15.75f)
                curveTo(15.3358f, 16.0f, 15.0f, 15.6642f, 15.0f, 15.25f)
                curveTo(15.0f, 14.8358f, 15.3358f, 14.5f, 15.75f, 14.5f)
                close()
            }
        }
        .build()
        return _payment!!
    }

private var _payment: ImageVector? = null
