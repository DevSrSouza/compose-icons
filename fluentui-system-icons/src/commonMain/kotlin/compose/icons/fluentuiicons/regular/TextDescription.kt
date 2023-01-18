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

public val RegularGroup.TextDescription: ImageVector
    get() {
        if (_textDescription != null) {
            return _textDescription!!
        }
        _textDescription = Builder(name = "TextDescription", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.75f, 17.0f)
                horizontalLineTo(15.25f)
                curveTo(15.6642f, 17.0f, 16.0f, 17.3358f, 16.0f, 17.75f)
                curveTo(16.0f, 18.1297f, 15.7178f, 18.4435f, 15.3518f, 18.4932f)
                lineTo(15.25f, 18.5f)
                horizontalLineTo(2.75f)
                curveTo(2.3358f, 18.5f, 2.0f, 18.1642f, 2.0f, 17.75f)
                curveTo(2.0f, 17.3703f, 2.2822f, 17.0565f, 2.6482f, 17.0068f)
                lineTo(2.75f, 17.0f)
                horizontalLineTo(15.25f)
                horizontalLineTo(2.75f)
                close()
                moveTo(2.75f, 13.0f)
                horizontalLineTo(21.25f)
                curveTo(21.6642f, 13.0f, 22.0f, 13.3358f, 22.0f, 13.75f)
                curveTo(22.0f, 14.1297f, 21.7178f, 14.4435f, 21.3518f, 14.4932f)
                lineTo(21.25f, 14.5f)
                horizontalLineTo(2.75f)
                curveTo(2.3358f, 14.5f, 2.0f, 14.1642f, 2.0f, 13.75f)
                curveTo(2.0f, 13.3703f, 2.2822f, 13.0565f, 2.6482f, 13.0068f)
                lineTo(2.75f, 13.0f)
                horizontalLineTo(21.25f)
                horizontalLineTo(2.75f)
                close()
                moveTo(2.75f, 9.0f)
                horizontalLineTo(21.25f)
                curveTo(21.6642f, 9.0f, 22.0f, 9.3358f, 22.0f, 9.75f)
                curveTo(22.0f, 10.1297f, 21.7178f, 10.4435f, 21.3518f, 10.4932f)
                lineTo(21.25f, 10.5f)
                horizontalLineTo(2.75f)
                curveTo(2.3358f, 10.5f, 2.0f, 10.1642f, 2.0f, 9.75f)
                curveTo(2.0f, 9.3703f, 2.2822f, 9.0565f, 2.6482f, 9.0069f)
                lineTo(2.75f, 9.0f)
                horizontalLineTo(21.25f)
                horizontalLineTo(2.75f)
                close()
                moveTo(2.75f, 5.0f)
                horizontalLineTo(21.25f)
                curveTo(21.6642f, 5.0f, 22.0f, 5.3358f, 22.0f, 5.75f)
                curveTo(22.0f, 6.1297f, 21.7178f, 6.4435f, 21.3518f, 6.4932f)
                lineTo(21.25f, 6.5f)
                horizontalLineTo(2.75f)
                curveTo(2.3358f, 6.5f, 2.0f, 6.1642f, 2.0f, 5.75f)
                curveTo(2.0f, 5.3703f, 2.2822f, 5.0565f, 2.6482f, 5.0068f)
                lineTo(2.75f, 5.0f)
                horizontalLineTo(21.25f)
                horizontalLineTo(2.75f)
                close()
            }
        }
        .build()
        return _textDescription!!
    }

private var _textDescription: ImageVector? = null
