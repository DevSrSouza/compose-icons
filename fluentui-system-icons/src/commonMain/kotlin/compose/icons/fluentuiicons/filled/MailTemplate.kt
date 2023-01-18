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

public val FilledGroup.MailTemplate: ImageVector
    get() {
        if (_mailTemplate != null) {
            return _mailTemplate!!
        }
        _mailTemplate = Builder(name = "MailTemplate", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 5.0f)
                curveTo(2.0f, 3.3431f, 3.3431f, 2.0f, 5.0f, 2.0f)
                horizontalLineTo(16.0f)
                curveTo(17.6569f, 2.0f, 19.0f, 3.3431f, 19.0f, 5.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(10.0f)
                curveTo(7.7909f, 10.0f, 6.0f, 11.7909f, 6.0f, 14.0f)
                verticalLineTo(19.0f)
                curveTo(6.0f, 19.3453f, 6.0437f, 19.6804f, 6.126f, 20.0f)
                horizontalLineTo(5.0f)
                curveTo(3.3431f, 20.0f, 2.0f, 18.6569f, 2.0f, 17.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(5.75f, 4.0f)
                curveTo(5.3358f, 4.0f, 5.0f, 4.3358f, 5.0f, 4.75f)
                curveTo(5.0f, 5.1642f, 5.3358f, 5.5f, 5.75f, 5.5f)
                horizontalLineTo(15.25f)
                curveTo(15.6642f, 5.5f, 16.0f, 5.1642f, 16.0f, 4.75f)
                curveTo(16.0f, 4.3358f, 15.6642f, 4.0f, 15.25f, 4.0f)
                horizontalLineTo(5.75f)
                close()
                moveTo(7.75f, 7.0f)
                curveTo(7.3358f, 7.0f, 7.0f, 7.3358f, 7.0f, 7.75f)
                curveTo(7.0f, 8.1642f, 7.3358f, 8.5f, 7.75f, 8.5f)
                horizontalLineTo(15.25f)
                curveTo(15.6642f, 8.5f, 16.0f, 8.1642f, 16.0f, 7.75f)
                curveTo(16.0f, 7.3358f, 15.6642f, 7.0f, 15.25f, 7.0f)
                horizontalLineTo(7.75f)
                close()
                moveTo(7.5484f, 12.2705f)
                curveTo(8.0916f, 11.5019f, 8.9872f, 11.0f, 10.0f, 11.0f)
                horizontalLineTo(19.0f)
                curveTo(20.0128f, 11.0f, 20.9084f, 11.5019f, 21.4516f, 12.2706f)
                lineTo(14.5f, 16.6153f)
                lineTo(7.5484f, 12.2705f)
                close()
                moveTo(7.0143f, 13.7056f)
                curveTo(7.0048f, 13.8025f, 7.0f, 13.9007f, 7.0f, 14.0f)
                verticalLineTo(19.0f)
                curveTo(7.0f, 20.6569f, 8.3432f, 22.0f, 10.0f, 22.0f)
                horizontalLineTo(19.0f)
                curveTo(20.6569f, 22.0f, 22.0f, 20.6569f, 22.0f, 19.0f)
                verticalLineTo(14.0f)
                curveTo(22.0f, 13.9007f, 21.9952f, 13.8025f, 21.9857f, 13.7056f)
                lineTo(14.8975f, 18.1358f)
                curveTo(14.6543f, 18.2878f, 14.3457f, 18.2878f, 14.1025f, 18.1358f)
                lineTo(7.0143f, 13.7056f)
                close()
            }
        }
        .build()
        return _mailTemplate!!
    }

private var _mailTemplate: ImageVector? = null
