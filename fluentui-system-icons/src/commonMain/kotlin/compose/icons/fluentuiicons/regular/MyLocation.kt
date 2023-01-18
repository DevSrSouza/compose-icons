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

public val RegularGroup.MyLocation: ImageVector
    get() {
        if (_myLocation != null) {
            return _myLocation!!
        }
        _myLocation = Builder(name = "MyLocation", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(12.3797f, 2.0f, 12.6935f, 2.2822f, 12.7432f, 2.6482f)
                lineTo(12.75f, 2.75f)
                lineTo(12.7491f, 4.5377f)
                curveTo(16.2928f, 4.8876f, 19.1124f, 7.7072f, 19.4632f, 11.2525f)
                lineTo(19.5f, 11.25f)
                horizontalLineTo(21.25f)
                curveTo(21.6642f, 11.25f, 22.0f, 11.5858f, 22.0f, 12.0f)
                curveTo(22.0f, 12.3797f, 21.7178f, 12.6935f, 21.3518f, 12.7432f)
                lineTo(21.25f, 12.75f)
                lineTo(19.4617f, 12.749f)
                curveTo(19.1124f, 16.2928f, 16.2928f, 19.1124f, 12.7475f, 19.4632f)
                lineTo(12.75f, 19.5f)
                verticalLineTo(21.25f)
                curveTo(12.75f, 21.6642f, 12.4142f, 22.0f, 12.0f, 22.0f)
                curveTo(11.6203f, 22.0f, 11.3065f, 21.7178f, 11.2568f, 21.3518f)
                lineTo(11.25f, 21.25f)
                lineTo(11.251f, 19.4617f)
                curveTo(7.7072f, 19.1124f, 4.8876f, 16.2928f, 4.5368f, 12.7475f)
                lineTo(4.5f, 12.75f)
                horizontalLineTo(2.75f)
                curveTo(2.3358f, 12.75f, 2.0f, 12.4142f, 2.0f, 12.0f)
                curveTo(2.0f, 11.6203f, 2.2822f, 11.3065f, 2.6482f, 11.2568f)
                lineTo(2.75f, 11.25f)
                lineTo(4.5377f, 11.2509f)
                curveTo(4.8876f, 7.7072f, 7.7072f, 4.8876f, 11.2525f, 4.5368f)
                lineTo(11.25f, 4.5f)
                verticalLineTo(2.75f)
                curveTo(11.25f, 2.3358f, 11.5858f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 6.0f)
                curveTo(8.6863f, 6.0f, 6.0f, 8.6863f, 6.0f, 12.0f)
                curveTo(6.0f, 15.3137f, 8.6863f, 18.0f, 12.0f, 18.0f)
                curveTo(15.3137f, 18.0f, 18.0f, 15.3137f, 18.0f, 12.0f)
                curveTo(18.0f, 8.6863f, 15.3137f, 6.0f, 12.0f, 6.0f)
                close()
                moveTo(12.0f, 8.0f)
                curveTo(14.2091f, 8.0f, 16.0f, 9.7909f, 16.0f, 12.0f)
                curveTo(16.0f, 14.2091f, 14.2091f, 16.0f, 12.0f, 16.0f)
                curveTo(9.7909f, 16.0f, 8.0f, 14.2091f, 8.0f, 12.0f)
                curveTo(8.0f, 9.7909f, 9.7909f, 8.0f, 12.0f, 8.0f)
                close()
            }
        }
        .build()
        return _myLocation!!
    }

private var _myLocation: ImageVector? = null
