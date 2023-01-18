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

public val FilledGroup.Mic: ImageVector
    get() {
        if (_mic != null) {
            return _mic!!
        }
        _mic = Builder(name = "Mic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.25f, 11.0f)
                curveTo(18.6297f, 11.0f, 18.9435f, 11.2822f, 18.9932f, 11.6482f)
                lineTo(19.0f, 11.75f)
                verticalLineTo(12.25f)
                curveTo(19.0f, 15.8094f, 16.245f, 18.7254f, 12.751f, 18.9817f)
                lineTo(12.75f, 21.25f)
                curveTo(12.75f, 21.6642f, 12.4142f, 22.0f, 12.0f, 22.0f)
                curveTo(11.6203f, 22.0f, 11.3065f, 21.7178f, 11.2568f, 21.3518f)
                lineTo(11.25f, 21.25f)
                lineTo(11.25f, 18.9818f)
                curveTo(7.8332f, 18.7316f, 5.1228f, 15.938f, 5.0041f, 12.4863f)
                lineTo(5.0f, 12.25f)
                verticalLineTo(11.75f)
                curveTo(5.0f, 11.3358f, 5.3358f, 11.0f, 5.75f, 11.0f)
                curveTo(6.1297f, 11.0f, 6.4435f, 11.2822f, 6.4932f, 11.6482f)
                lineTo(6.5f, 11.75f)
                verticalLineTo(12.25f)
                curveTo(6.5f, 15.077f, 8.7345f, 17.3821f, 11.5336f, 17.4956f)
                lineTo(11.75f, 17.5f)
                horizontalLineTo(12.25f)
                curveTo(15.077f, 17.5f, 17.3821f, 15.2656f, 17.4956f, 12.4664f)
                lineTo(17.5f, 12.25f)
                verticalLineTo(11.75f)
                curveTo(17.5f, 11.3358f, 17.8358f, 11.0f, 18.25f, 11.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(14.2091f, 2.0f, 16.0f, 3.7909f, 16.0f, 6.0f)
                verticalLineTo(12.0f)
                curveTo(16.0f, 14.2091f, 14.2091f, 16.0f, 12.0f, 16.0f)
                curveTo(9.7909f, 16.0f, 8.0f, 14.2091f, 8.0f, 12.0f)
                verticalLineTo(6.0f)
                curveTo(8.0f, 3.7909f, 9.7909f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _mic!!
    }

private var _mic: ImageVector? = null
