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

public val RegularGroup.ReOrder: ImageVector
    get() {
        if (_reOrder != null) {
            return _reOrder!!
        }
        _reOrder = Builder(name = "ReOrder", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.75f, 13.25f)
                horizontalLineTo(21.25f)
                curveTo(21.6642f, 13.25f, 22.0f, 13.5858f, 22.0f, 14.0f)
                curveTo(22.0f, 14.3797f, 21.7178f, 14.6935f, 21.3518f, 14.7432f)
                lineTo(21.25f, 14.75f)
                horizontalLineTo(2.75f)
                curveTo(2.3358f, 14.75f, 2.0f, 14.4142f, 2.0f, 14.0f)
                curveTo(2.0f, 13.6203f, 2.2822f, 13.3065f, 2.6482f, 13.2568f)
                lineTo(2.75f, 13.25f)
                horizontalLineTo(21.25f)
                horizontalLineTo(2.75f)
                close()
                moveTo(2.75f, 9.25f)
                horizontalLineTo(21.25f)
                curveTo(21.6642f, 9.25f, 22.0f, 9.5858f, 22.0f, 10.0f)
                curveTo(22.0f, 10.3797f, 21.7178f, 10.6935f, 21.3518f, 10.7432f)
                lineTo(21.25f, 10.75f)
                horizontalLineTo(2.75f)
                curveTo(2.3358f, 10.75f, 2.0f, 10.4142f, 2.0f, 10.0f)
                curveTo(2.0f, 9.6203f, 2.2822f, 9.3065f, 2.6482f, 9.2569f)
                lineTo(2.75f, 9.25f)
                horizontalLineTo(21.25f)
                horizontalLineTo(2.75f)
                close()
            }
        }
        .build()
        return _reOrder!!
    }

private var _reOrder: ImageVector? = null
