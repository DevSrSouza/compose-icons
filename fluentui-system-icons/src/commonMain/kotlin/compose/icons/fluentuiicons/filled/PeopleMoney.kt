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

public val FilledGroup.PeopleMoney: ImageVector
    get() {
        if (_peopleMoney != null) {
            return _peopleMoney!!
        }
        _peopleMoney = Builder(name = "PeopleMoney", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 11.0f)
                curveTo(10.2091f, 11.0f, 12.0f, 9.2091f, 12.0f, 7.0f)
                curveTo(12.0f, 4.7909f, 10.2091f, 3.0f, 8.0f, 3.0f)
                curveTo(5.7909f, 3.0f, 4.0f, 4.7909f, 4.0f, 7.0f)
                curveTo(4.0f, 9.2091f, 5.7909f, 11.0f, 8.0f, 11.0f)
                close()
                moveTo(17.0f, 11.0f)
                curveTo(18.6569f, 11.0f, 20.0f, 9.6568f, 20.0f, 8.0f)
                curveTo(20.0f, 6.3432f, 18.6569f, 5.0f, 17.0f, 5.0f)
                curveTo(15.3431f, 5.0f, 14.0f, 6.3432f, 14.0f, 8.0f)
                curveTo(14.0f, 9.6568f, 15.3431f, 11.0f, 17.0f, 11.0f)
                close()
                moveTo(4.25f, 13.0f)
                curveTo(3.0074f, 13.0f, 2.0f, 14.0074f, 2.0f, 15.25f)
                verticalLineTo(15.5f)
                curveTo(2.0f, 15.5f, 2.0f, 20.0f, 8.0f, 20.0f)
                curveTo(9.2378f, 20.0f, 10.2202f, 19.8085f, 11.0f, 19.5045f)
                lineTo(11.0f, 19.5f)
                verticalLineTo(15.5f)
                curveTo(11.0f, 14.4362f, 11.6645f, 13.5276f, 12.601f, 13.1665f)
                curveTo(12.3385f, 13.0592f, 12.0512f, 13.0f, 11.75f, 13.0f)
                horizontalLineTo(4.25f)
                close()
                moveTo(12.0f, 15.5f)
                curveTo(12.0f, 14.6716f, 12.6716f, 14.0f, 13.5f, 14.0f)
                horizontalLineTo(21.5f)
                curveTo(22.3284f, 14.0f, 23.0f, 14.6716f, 23.0f, 15.5f)
                verticalLineTo(19.5f)
                curveTo(23.0f, 20.3284f, 22.3284f, 21.0f, 21.5f, 21.0f)
                horizontalLineTo(13.5f)
                curveTo(12.6716f, 21.0f, 12.0f, 20.3284f, 12.0f, 19.5f)
                verticalLineTo(15.5f)
                close()
                moveTo(13.0f, 16.0f)
                verticalLineTo(17.0f)
                curveTo(14.1046f, 17.0f, 15.0f, 16.1046f, 15.0f, 15.0f)
                horizontalLineTo(14.0f)
                curveTo(14.0f, 15.5523f, 13.5523f, 16.0f, 13.0f, 16.0f)
                close()
                moveTo(22.0f, 17.0f)
                verticalLineTo(16.0f)
                curveTo(21.4477f, 16.0f, 21.0f, 15.5523f, 21.0f, 15.0f)
                horizontalLineTo(20.0f)
                curveTo(20.0f, 16.1046f, 20.8954f, 17.0f, 22.0f, 17.0f)
                close()
                moveTo(20.0f, 20.0f)
                horizontalLineTo(21.0f)
                curveTo(21.0f, 19.4477f, 21.4477f, 19.0f, 22.0f, 19.0f)
                verticalLineTo(18.0f)
                curveTo(20.8954f, 18.0f, 20.0f, 18.8954f, 20.0f, 20.0f)
                close()
                moveTo(13.0f, 18.0f)
                verticalLineTo(19.0f)
                curveTo(13.5523f, 19.0f, 14.0f, 19.4477f, 14.0f, 20.0f)
                horizontalLineTo(15.0f)
                curveTo(15.0f, 18.8954f, 14.1046f, 18.0f, 13.0f, 18.0f)
                close()
                moveTo(17.5f, 19.25f)
                curveTo(18.4665f, 19.25f, 19.25f, 18.4665f, 19.25f, 17.5f)
                curveTo(19.25f, 16.5335f, 18.4665f, 15.75f, 17.5f, 15.75f)
                curveTo(16.5335f, 15.75f, 15.75f, 16.5335f, 15.75f, 17.5f)
                curveTo(15.75f, 18.4665f, 16.5335f, 19.25f, 17.5f, 19.25f)
                close()
            }
        }
        .build()
        return _peopleMoney!!
    }

private var _peopleMoney: ImageVector? = null
