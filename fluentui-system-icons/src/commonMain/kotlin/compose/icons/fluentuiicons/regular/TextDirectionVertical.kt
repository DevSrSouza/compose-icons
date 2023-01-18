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

public val RegularGroup.TextDirectionVertical: ImageVector
    get() {
        if (_textDirectionVertical != null) {
            return _textDirectionVertical!!
        }
        _textDirectionVertical = Builder(name = "TextDirectionVertical", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 3.75f)
                curveTo(6.0f, 3.3358f, 6.3358f, 3.0f, 6.75f, 3.0f)
                curveTo(7.1642f, 3.0f, 7.5f, 3.3358f, 7.5f, 3.75f)
                verticalLineTo(18.4393f)
                lineTo(8.2197f, 17.7197f)
                curveTo(8.5126f, 17.4268f, 8.9874f, 17.4268f, 9.2803f, 17.7197f)
                curveTo(9.5732f, 18.0126f, 9.5732f, 18.4874f, 9.2803f, 18.7803f)
                lineTo(7.2803f, 20.7803f)
                curveTo(6.9874f, 21.0732f, 6.5126f, 21.0732f, 6.2197f, 20.7803f)
                lineTo(4.2197f, 18.7803f)
                curveTo(3.9268f, 18.4874f, 3.9268f, 18.0126f, 4.2197f, 17.7197f)
                curveTo(4.5126f, 17.4268f, 4.9874f, 17.4268f, 5.2803f, 17.7197f)
                lineTo(6.0f, 18.4393f)
                verticalLineTo(3.75f)
                close()
                moveTo(11.5527f, 12.9694f)
                lineTo(15.3063f, 3.4743f)
                curveTo(15.5417f, 2.8788f, 16.3488f, 2.8442f, 16.651f, 3.3698f)
                lineTo(16.7015f, 3.4749f)
                lineTo(20.4479f, 12.9754f)
                curveTo(20.5999f, 13.3607f, 20.4107f, 13.7962f, 20.0253f, 13.9482f)
                curveTo(19.6721f, 14.0875f, 19.2767f, 13.9401f, 19.0962f, 13.6178f)
                lineTo(19.0525f, 13.5256f)
                lineTo(18.0562f, 11.0f)
                horizontalLineTo(13.9432f)
                lineTo(12.9477f, 13.5209f)
                curveTo(12.8081f, 13.874f, 12.4303f, 14.0621f, 12.0716f, 13.9737f)
                lineTo(11.9745f, 13.9426f)
                curveTo(11.6214f, 13.803f, 11.4333f, 13.4253f, 11.5217f, 13.0666f)
                lineTo(11.5527f, 12.9694f)
                close()
                moveTo(16.0029f, 5.7923f)
                lineTo(14.5362f, 9.5f)
                horizontalLineTo(17.4642f)
                lineTo(16.0029f, 5.7923f)
                close()
                moveTo(16.25f, 14.0f)
                curveTo(15.8358f, 14.0f, 15.5f, 14.3358f, 15.5f, 14.75f)
                verticalLineTo(18.4393f)
                lineTo(14.7803f, 17.7197f)
                curveTo(14.4874f, 17.4268f, 14.0126f, 17.4268f, 13.7197f, 17.7197f)
                curveTo(13.4268f, 18.0126f, 13.4268f, 18.4874f, 13.7197f, 18.7803f)
                lineTo(15.7197f, 20.7803f)
                curveTo(16.0126f, 21.0732f, 16.4874f, 21.0732f, 16.7803f, 20.7803f)
                lineTo(18.7803f, 18.7803f)
                curveTo(19.0732f, 18.4874f, 19.0732f, 18.0126f, 18.7803f, 17.7197f)
                curveTo(18.4874f, 17.4268f, 18.0126f, 17.4268f, 17.7197f, 17.7197f)
                lineTo(17.0f, 18.4393f)
                verticalLineTo(14.75f)
                curveTo(17.0f, 14.3358f, 16.6642f, 14.0f, 16.25f, 14.0f)
                close()
            }
        }
        .build()
        return _textDirectionVertical!!
    }

private var _textDirectionVertical: ImageVector? = null
