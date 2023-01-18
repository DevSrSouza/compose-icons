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

public val FilledGroup.BorderOutsideThick: ImageVector
    get() {
        if (_borderOutsideThick != null) {
            return _borderOutsideThick!!
        }
        _borderOutsideThick = Builder(name = "BorderOutsideThick", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.5f, 5.75f)
                curveTo(2.5f, 3.9551f, 3.9551f, 2.5f, 5.75f, 2.5f)
                horizontalLineTo(18.25f)
                curveTo(20.0449f, 2.5f, 21.5f, 3.9551f, 21.5f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(21.5f, 20.0449f, 20.0449f, 21.5f, 18.25f, 21.5f)
                horizontalLineTo(5.75f)
                curveTo(3.9551f, 21.5f, 2.5f, 20.0449f, 2.5f, 18.25f)
                verticalLineTo(5.75f)
                close()
                moveTo(5.75f, 5.0f)
                curveTo(5.3358f, 5.0f, 5.0f, 5.3358f, 5.0f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(5.0f, 18.6642f, 5.3358f, 19.0f, 5.75f, 19.0f)
                horizontalLineTo(18.25f)
                curveTo(18.6642f, 19.0f, 19.0f, 18.6642f, 19.0f, 18.25f)
                verticalLineTo(5.75f)
                curveTo(19.0f, 5.3358f, 18.6642f, 5.0f, 18.25f, 5.0f)
                horizontalLineTo(5.75f)
                close()
            }
        }
        .build()
        return _borderOutsideThick!!
    }

private var _borderOutsideThick: ImageVector? = null
