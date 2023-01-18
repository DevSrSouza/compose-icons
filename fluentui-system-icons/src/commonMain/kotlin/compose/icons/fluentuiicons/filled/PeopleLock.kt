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

public val FilledGroup.PeopleLock: ImageVector
    get() {
        if (_peopleLock != null) {
            return _peopleLock!!
        }
        _peopleLock = Builder(name = "PeopleLock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 7.0f)
                curveTo(12.0f, 9.2091f, 10.2091f, 11.0f, 8.0f, 11.0f)
                curveTo(5.7909f, 11.0f, 4.0f, 9.2091f, 4.0f, 7.0f)
                curveTo(4.0f, 4.7909f, 5.7909f, 3.0f, 8.0f, 3.0f)
                curveTo(10.2091f, 3.0f, 12.0f, 4.7909f, 12.0f, 7.0f)
                close()
                moveTo(16.0091f, 10.8325f)
                curveTo(16.4614f, 10.6192f, 16.9668f, 10.5f, 17.5f, 10.5f)
                curveTo(17.8277f, 10.5f, 18.1449f, 10.545f, 18.4458f, 10.6293f)
                curveTo(19.3723f, 10.1187f, 20.0f, 9.1327f, 20.0f, 8.0f)
                curveTo(20.0f, 6.3432f, 18.6569f, 5.0f, 17.0f, 5.0f)
                curveTo(15.3431f, 5.0f, 14.0f, 6.3432f, 14.0f, 8.0f)
                curveTo(14.0f, 9.3096f, 14.8392f, 10.4233f, 16.0091f, 10.8325f)
                close()
                moveTo(13.7019f, 14.1301f)
                curveTo(12.7126f, 14.4631f, 12.0f, 15.3984f, 12.0f, 16.5f)
                verticalLineTo(18.9901f)
                curveTo(11.1155f, 19.5769f, 9.8398f, 20.0f, 8.0f, 20.0f)
                curveTo(2.0f, 20.0f, 2.0f, 15.5f, 2.0f, 15.5f)
                verticalLineTo(15.25f)
                curveTo(2.0f, 14.0074f, 3.0074f, 13.0f, 4.25f, 13.0f)
                horizontalLineTo(11.75f)
                curveTo(12.5849f, 13.0f, 13.3136f, 13.4548f, 13.7019f, 14.1301f)
                close()
                moveTo(15.0f, 15.0f)
                verticalLineTo(14.0f)
                curveTo(15.0f, 12.6193f, 16.1193f, 11.5f, 17.5f, 11.5f)
                curveTo(18.8807f, 11.5f, 20.0f, 12.6193f, 20.0f, 14.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(20.5f)
                curveTo(21.3284f, 15.0f, 22.0f, 15.6716f, 22.0f, 16.5f)
                verticalLineTo(21.5f)
                curveTo(22.0f, 22.3284f, 21.3284f, 23.0f, 20.5f, 23.0f)
                horizontalLineTo(14.5f)
                curveTo(13.6716f, 23.0f, 13.0f, 22.3284f, 13.0f, 21.5f)
                verticalLineTo(16.5f)
                curveTo(13.0f, 15.6716f, 13.6716f, 15.0f, 14.5f, 15.0f)
                horizontalLineTo(15.0f)
                close()
                moveTo(16.5f, 14.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.5f)
                verticalLineTo(14.0f)
                curveTo(18.5f, 13.4477f, 18.0523f, 13.0f, 17.5f, 13.0f)
                curveTo(16.9477f, 13.0f, 16.5f, 13.4477f, 16.5f, 14.0f)
                close()
                moveTo(18.5f, 19.0f)
                curveTo(18.5f, 18.4477f, 18.0523f, 18.0f, 17.5f, 18.0f)
                curveTo(16.9477f, 18.0f, 16.5f, 18.4477f, 16.5f, 19.0f)
                curveTo(16.5f, 19.5523f, 16.9477f, 20.0f, 17.5f, 20.0f)
                curveTo(18.0523f, 20.0f, 18.5f, 19.5523f, 18.5f, 19.0f)
                close()
            }
        }
        .build()
        return _peopleLock!!
    }

private var _peopleLock: ImageVector? = null
