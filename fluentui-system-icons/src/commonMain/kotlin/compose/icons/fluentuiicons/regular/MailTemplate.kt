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

public val RegularGroup.MailTemplate: ImageVector
    get() {
        if (_mailTemplate != null) {
            return _mailTemplate!!
        }
        _mailTemplate = Builder(name = "MailTemplate", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 5.25f)
                curveTo(2.0f, 3.4551f, 3.4551f, 2.0f, 5.25f, 2.0f)
                horizontalLineTo(15.75f)
                curveTo(17.5449f, 2.0f, 19.0f, 3.4551f, 19.0f, 5.25f)
                verticalLineTo(10.0072f)
                curveTo(18.9173f, 10.0024f, 18.8339f, 10.0f, 18.75f, 10.0f)
                horizontalLineTo(17.5f)
                verticalLineTo(5.25f)
                curveTo(17.5f, 4.2835f, 16.7165f, 3.5f, 15.75f, 3.5f)
                horizontalLineTo(5.25f)
                curveTo(4.2835f, 3.5f, 3.5f, 4.2835f, 3.5f, 5.25f)
                verticalLineTo(16.75f)
                curveTo(3.5f, 17.7165f, 4.2835f, 18.5f, 5.25f, 18.5f)
                horizontalLineTo(6.0f)
                verticalLineTo(18.75f)
                curveTo(6.0f, 19.185f, 6.0654f, 19.6048f, 6.1868f, 20.0f)
                horizontalLineTo(5.25f)
                curveTo(3.4551f, 20.0f, 2.0f, 18.5449f, 2.0f, 16.75f)
                verticalLineTo(5.25f)
                close()
                moveTo(6.75f, 5.0f)
                curveTo(6.3358f, 5.0f, 6.0f, 5.3358f, 6.0f, 5.75f)
                curveTo(6.0f, 6.1642f, 6.3358f, 6.5f, 6.75f, 6.5f)
                horizontalLineTo(14.25f)
                curveTo(14.6642f, 6.5f, 15.0f, 6.1642f, 15.0f, 5.75f)
                curveTo(15.0f, 5.3358f, 14.6642f, 5.0f, 14.25f, 5.0f)
                horizontalLineTo(6.75f)
                close()
                moveTo(8.0f, 8.25f)
                curveTo(8.0f, 7.8358f, 8.3358f, 7.5f, 8.75f, 7.5f)
                horizontalLineTo(14.25f)
                curveTo(14.6642f, 7.5f, 15.0f, 7.8358f, 15.0f, 8.25f)
                curveTo(15.0f, 8.6642f, 14.6642f, 9.0f, 14.25f, 9.0f)
                horizontalLineTo(8.75f)
                curveTo(8.3358f, 9.0f, 8.0f, 8.6642f, 8.0f, 8.25f)
                close()
                moveTo(7.0f, 14.25f)
                curveTo(7.0f, 12.4551f, 8.4551f, 11.0f, 10.25f, 11.0f)
                horizontalLineTo(18.75f)
                curveTo(20.5449f, 11.0f, 22.0f, 12.4551f, 22.0f, 14.25f)
                verticalLineTo(18.75f)
                curveTo(22.0f, 20.5449f, 20.5449f, 22.0f, 18.75f, 22.0f)
                horizontalLineTo(10.25f)
                curveTo(8.4551f, 22.0f, 7.0f, 20.5449f, 7.0f, 18.75f)
                verticalLineTo(14.25f)
                close()
                moveTo(10.25f, 12.5f)
                curveTo(9.7457f, 12.5f, 9.2912f, 12.7133f, 8.9719f, 13.0546f)
                lineTo(14.5001f, 16.6084f)
                lineTo(20.0281f, 13.0546f)
                curveTo(19.7088f, 12.7133f, 19.2543f, 12.5f, 18.75f, 12.5f)
                horizontalLineTo(10.25f)
                close()
                moveTo(8.5f, 18.75f)
                curveTo(8.5f, 19.7165f, 9.2835f, 20.5f, 10.25f, 20.5f)
                horizontalLineTo(18.75f)
                curveTo(19.7165f, 20.5f, 20.5f, 19.7165f, 20.5f, 18.75f)
                verticalLineTo(14.5345f)
                lineTo(14.9056f, 18.1309f)
                curveTo(14.6586f, 18.2897f, 14.3415f, 18.2897f, 14.0945f, 18.1309f)
                lineTo(8.5f, 14.5345f)
                verticalLineTo(18.75f)
                close()
            }
        }
        .build()
        return _mailTemplate!!
    }

private var _mailTemplate: ImageVector? = null
