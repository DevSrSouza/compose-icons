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

public val FilledGroup.ShareScreenPersonOverlay: ImageVector
    get() {
        if (_shareScreenPersonOverlay != null) {
            return _shareScreenPersonOverlay!!
        }
        _shareScreenPersonOverlay = Builder(name = "ShareScreenPersonOverlay", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 7.25f)
                curveTo(2.0f, 5.4551f, 3.4551f, 4.0f, 5.25f, 4.0f)
                horizontalLineTo(18.75f)
                curveTo(20.5449f, 4.0f, 22.0f, 5.4551f, 22.0f, 7.25f)
                verticalLineTo(14.5f)
                curveTo(22.0f, 12.567f, 20.433f, 11.0f, 18.5f, 11.0f)
                curveTo(16.567f, 11.0f, 15.0f, 12.567f, 15.0f, 14.5f)
                curveTo(15.0f, 15.4793f, 15.4022f, 16.3647f, 16.0505f, 17.0f)
                horizontalLineTo(15.7727f)
                curveTo(14.2419f, 17.0f, 13.0f, 18.2401f, 13.0f, 19.772f)
                verticalLineTo(19.875f)
                curveTo(13.0f, 19.9167f, 13.0007f, 19.9583f, 13.002f, 20.0f)
                horizontalLineTo(5.25f)
                curveTo(3.4551f, 20.0f, 2.0f, 18.5449f, 2.0f, 16.75f)
                verticalLineTo(7.25f)
                close()
                moveTo(5.0f, 8.0f)
                verticalLineTo(12.0f)
                curveTo(5.0f, 12.5523f, 5.4477f, 13.0f, 6.0f, 13.0f)
                horizontalLineTo(11.0f)
                curveTo(11.5523f, 13.0f, 12.0f, 12.5523f, 12.0f, 12.0f)
                verticalLineTo(8.0f)
                curveTo(12.0f, 7.4477f, 11.5523f, 7.0f, 11.0f, 7.0f)
                horizontalLineTo(6.0f)
                curveTo(5.4477f, 7.0f, 5.0f, 7.4477f, 5.0f, 8.0f)
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
        return _shareScreenPersonOverlay!!
    }

private var _shareScreenPersonOverlay: ImageVector? = null
