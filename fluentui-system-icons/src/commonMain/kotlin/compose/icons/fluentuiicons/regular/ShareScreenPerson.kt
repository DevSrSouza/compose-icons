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

public val RegularGroup.ShareScreenPerson: ImageVector
    get() {
        if (_shareScreenPerson != null) {
            return _shareScreenPerson!!
        }
        _shareScreenPerson = Builder(name = "ShareScreenPerson", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.25f, 4.0f)
                curveTo(3.4551f, 4.0f, 2.0f, 5.4551f, 2.0f, 7.25f)
                verticalLineTo(16.75f)
                curveTo(2.0f, 18.5449f, 3.4551f, 20.0f, 5.25f, 20.0f)
                horizontalLineTo(13.002f)
                curveTo(13.0007f, 19.9583f, 13.0f, 19.9167f, 13.0f, 19.875f)
                verticalLineTo(19.772f)
                curveTo(13.0f, 19.3134f, 13.1113f, 18.8809f, 13.3084f, 18.5f)
                horizontalLineTo(5.25f)
                curveTo(4.2835f, 18.5f, 3.5f, 17.7165f, 3.5f, 16.75f)
                verticalLineTo(7.25f)
                curveTo(3.5f, 6.2835f, 4.2835f, 5.5f, 5.25f, 5.5f)
                horizontalLineTo(18.75f)
                curveTo(19.7165f, 5.5f, 20.5f, 6.2835f, 20.5f, 7.25f)
                verticalLineTo(11.6273f)
                curveTo(21.4067f, 12.2598f, 22.0f, 13.3106f, 22.0f, 14.5f)
                verticalLineTo(7.25f)
                curveTo(22.0f, 5.4551f, 20.5449f, 4.0f, 18.75f, 4.0f)
                horizontalLineTo(5.25f)
                close()
                moveTo(21.0f, 14.5f)
                curveTo(21.0f, 15.8807f, 19.8807f, 17.0f, 18.5f, 17.0f)
                curveTo(17.1193f, 17.0f, 16.0f, 15.8807f, 16.0f, 14.5f)
                curveTo(16.0f, 13.1193f, 17.1193f, 12.0f, 18.5f, 12.0f)
                curveTo(19.8807f, 12.0f, 21.0f, 13.1193f, 21.0f, 14.5f)
                close()
                moveTo(23.0f, 19.875f)
                curveTo(23.0f, 21.4315f, 21.7143f, 23.0f, 18.5f, 23.0f)
                curveTo(15.2857f, 23.0f, 14.0f, 21.4374f, 14.0f, 19.875f)
                verticalLineTo(19.772f)
                curveTo(14.0f, 18.7929f, 14.7937f, 18.0f, 15.7727f, 18.0f)
                horizontalLineTo(21.2273f)
                curveTo(22.2063f, 18.0f, 23.0f, 18.793f, 23.0f, 19.772f)
                verticalLineTo(19.875f)
                close()
            }
        }
        .build()
        return _shareScreenPerson!!
    }

private var _shareScreenPerson: ImageVector? = null
