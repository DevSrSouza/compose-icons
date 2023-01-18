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

public val FilledGroup.Connector: ImageVector
    get() {
        if (_connector != null) {
            return _connector!!
        }
        _connector = Builder(name = "Connector", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.2516f, 4.0f)
                curveTo(8.6658f, 4.0f, 9.0016f, 4.3358f, 9.0016f, 4.75f)
                verticalLineTo(7.5232f)
                lineTo(10.8759f, 10.3383f)
                curveTo(10.9579f, 10.4614f, 11.0016f, 10.6061f, 11.0016f, 10.754f)
                verticalLineTo(15.25f)
                curveTo(11.0016f, 15.6642f, 10.6658f, 16.0f, 10.2516f, 16.0f)
                horizontalLineTo(8.9979f)
                lineTo(8.9988f, 19.2536f)
                curveTo(8.9988f, 19.6678f, 8.6631f, 20.0036f, 8.2488f, 20.0036f)
                curveTo(7.8692f, 20.0036f, 7.5553f, 19.7214f, 7.5057f, 19.3553f)
                lineTo(7.4988f, 19.2536f)
                lineTo(7.4979f, 16.0f)
                lineTo(5.5029f, 15.999f)
                lineTo(5.5036f, 19.2566f)
                curveTo(5.5036f, 19.6708f, 5.1678f, 20.0066f, 4.7536f, 20.0066f)
                curveTo(4.3739f, 20.0066f, 4.0601f, 19.7244f, 4.0104f, 19.3584f)
                lineTo(4.0036f, 19.2566f)
                lineTo(4.0029f, 15.999f)
                lineTo(2.7539f, 16.0f)
                curveTo(2.3397f, 16.0f, 2.0039f, 15.6642f, 2.0039f, 15.25f)
                verticalLineTo(10.754f)
                curveTo(2.0039f, 10.6061f, 2.0476f, 10.4614f, 2.1296f, 10.3383f)
                lineTo(4.0039f, 7.5232f)
                verticalLineTo(4.75f)
                curveTo(4.0039f, 4.3358f, 4.3397f, 4.0f, 4.7539f, 4.0f)
                horizontalLineTo(8.2516f)
                close()
                moveTo(15.2562f, 4.0014f)
                horizontalLineTo(19.7516f)
                curveTo(20.1313f, 4.0014f, 20.4451f, 4.2835f, 20.4948f, 4.6496f)
                lineTo(20.5016f, 4.7514f)
                lineTo(20.5009f, 8.0f)
                horizontalLineTo(21.2516f)
                curveTo(21.6658f, 8.0f, 22.0016f, 8.3358f, 22.0016f, 8.75f)
                verticalLineTo(13.246f)
                curveTo(22.0016f, 13.3939f, 21.9579f, 13.5386f, 21.8759f, 13.6617f)
                lineTo(20.0016f, 16.4768f)
                verticalLineTo(19.25f)
                curveTo(20.0016f, 19.6642f, 19.6658f, 20.0f, 19.2516f, 20.0f)
                horizontalLineTo(15.7539f)
                curveTo(15.3397f, 20.0f, 15.0039f, 19.6642f, 15.0039f, 19.25f)
                verticalLineTo(16.4768f)
                lineTo(13.1296f, 13.6617f)
                curveTo(13.0476f, 13.5386f, 13.0039f, 13.3939f, 13.0039f, 13.246f)
                verticalLineTo(8.75f)
                curveTo(13.0039f, 8.3358f, 13.3397f, 8.0f, 13.7539f, 8.0f)
                horizontalLineTo(14.5059f)
                lineTo(14.5062f, 4.7514f)
                curveTo(14.5062f, 4.3717f, 14.7883f, 4.0579f, 15.1544f, 4.0082f)
                lineTo(15.2562f, 4.0014f)
                horizontalLineTo(19.7516f)
                horizontalLineTo(15.2562f)
                close()
                moveTo(19.0016f, 5.5014f)
                horizontalLineTo(16.0062f)
                lineTo(16.0059f, 8.0f)
                horizontalLineTo(19.0009f)
                lineTo(19.0016f, 5.5014f)
                close()
            }
        }
        .build()
        return _connector!!
    }

private var _connector: ImageVector? = null
