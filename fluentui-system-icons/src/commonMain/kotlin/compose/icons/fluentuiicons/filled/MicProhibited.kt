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

public val FilledGroup.MicProhibited: ImageVector
    get() {
        if (_micProhibited != null) {
            return _micProhibited!!
        }
        _micProhibited = Builder(name = "MicProhibited", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.1748f, 15.9962f)
                curveTo(11.6577f, 13.9575f, 13.1007f, 12.2902f, 15.0f, 11.4982f)
                verticalLineTo(6.0f)
                curveTo(15.0f, 3.7909f, 13.2091f, 2.0f, 11.0f, 2.0f)
                curveTo(8.7909f, 2.0f, 7.0f, 3.7909f, 7.0f, 6.0f)
                verticalLineTo(12.0f)
                curveTo(7.0f, 14.2091f, 8.7909f, 16.0f, 11.0f, 16.0f)
                curveTo(11.0586f, 16.0f, 11.1169f, 15.9987f, 11.1748f, 15.9962f)
                close()
                moveTo(11.0f, 17.5f)
                curveTo(11.0f, 18.596f, 11.2713f, 19.6287f, 11.7503f, 20.5345f)
                lineTo(11.75f, 21.25f)
                curveTo(11.75f, 21.6642f, 11.4142f, 22.0f, 11.0f, 22.0f)
                curveTo(10.6203f, 22.0f, 10.3065f, 21.7178f, 10.2568f, 21.3518f)
                lineTo(10.25f, 21.25f)
                lineTo(10.25f, 18.9818f)
                curveTo(6.8332f, 18.7316f, 4.1228f, 15.938f, 4.0041f, 12.4863f)
                lineTo(4.0f, 12.25f)
                verticalLineTo(11.75f)
                curveTo(4.0f, 11.3358f, 4.3358f, 11.0f, 4.75f, 11.0f)
                curveTo(5.1297f, 11.0f, 5.4435f, 11.2822f, 5.4932f, 11.6482f)
                lineTo(5.5f, 11.75f)
                verticalLineTo(12.25f)
                curveTo(5.5f, 15.077f, 7.7344f, 17.3821f, 10.5336f, 17.4956f)
                lineTo(10.75f, 17.5f)
                horizontalLineTo(11.0f)
                close()
                moveTo(23.0f, 17.5f)
                curveTo(23.0f, 20.5376f, 20.5376f, 23.0f, 17.5f, 23.0f)
                curveTo(14.4624f, 23.0f, 12.0f, 20.5376f, 12.0f, 17.5f)
                curveTo(12.0f, 14.4624f, 14.4624f, 12.0f, 17.5f, 12.0f)
                curveTo(20.5376f, 12.0f, 23.0f, 14.4624f, 23.0f, 17.5f)
                close()
                moveTo(13.5f, 17.5f)
                curveTo(13.5f, 18.3335f, 13.755f, 19.1075f, 14.1911f, 19.7482f)
                lineTo(19.7482f, 14.1911f)
                curveTo(19.1075f, 13.755f, 18.3335f, 13.5f, 17.5f, 13.5f)
                curveTo(15.2909f, 13.5f, 13.5f, 15.2909f, 13.5f, 17.5f)
                close()
                moveTo(17.5f, 21.5f)
                curveTo(19.7091f, 21.5f, 21.5f, 19.7091f, 21.5f, 17.5f)
                curveTo(21.5f, 16.6665f, 21.245f, 15.8925f, 20.8089f, 15.2518f)
                lineTo(15.2518f, 20.8089f)
                curveTo(15.8925f, 21.245f, 16.6665f, 21.5f, 17.5f, 21.5f)
                close()
            }
        }
        .build()
        return _micProhibited!!
    }

private var _micProhibited: ImageVector? = null
