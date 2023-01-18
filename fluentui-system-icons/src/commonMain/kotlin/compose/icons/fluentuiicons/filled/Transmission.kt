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

public val FilledGroup.Transmission: ImageVector
    get() {
        if (_transmission != null) {
            return _transmission!!
        }
        _transmission = Builder(name = "Transmission", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(10.4812f, 2.0f, 9.25f, 3.2312f, 9.25f, 4.75f)
                curveTo(9.25f, 6.0088f, 10.0957f, 7.07f, 11.25f, 7.3965f)
                verticalLineTo(11.25f)
                curveTo(11.25f, 11.6642f, 11.5858f, 12.0f, 12.0f, 12.0f)
                curveTo(12.4142f, 12.0f, 12.75f, 11.6642f, 12.75f, 11.25f)
                verticalLineTo(7.3965f)
                curveTo(13.9043f, 7.07f, 14.75f, 6.0088f, 14.75f, 4.75f)
                curveTo(14.75f, 3.2312f, 13.5188f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(5.5f, 4.0f)
                curveTo(4.1193f, 4.0f, 3.0f, 5.1193f, 3.0f, 6.5f)
                verticalLineTo(18.5f)
                curveTo(3.0f, 19.8807f, 4.1193f, 21.0f, 5.5f, 21.0f)
                curveTo(6.8807f, 21.0f, 8.0f, 19.8807f, 8.0f, 18.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(18.5f)
                curveTo(9.5f, 19.8807f, 10.6193f, 21.0f, 12.0f, 21.0f)
                curveTo(13.3807f, 21.0f, 14.5f, 19.8807f, 14.5f, 18.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(19.0f)
                curveTo(20.1046f, 15.0f, 21.0f, 14.1046f, 21.0f, 13.0f)
                verticalLineTo(6.5f)
                curveTo(21.0f, 5.1193f, 19.8807f, 4.0f, 18.5f, 4.0f)
                curveTo(17.1193f, 4.0f, 16.0f, 5.1193f, 16.0f, 6.5f)
                verticalLineTo(10.0f)
                horizontalLineTo(13.75f)
                verticalLineTo(11.5f)
                horizontalLineTo(17.5f)
                verticalLineTo(6.5f)
                curveTo(17.5f, 5.9477f, 17.9477f, 5.5f, 18.5f, 5.5f)
                curveTo(19.0523f, 5.5f, 19.5f, 5.9477f, 19.5f, 6.5f)
                verticalLineTo(13.0f)
                curveTo(19.5f, 13.2761f, 19.2761f, 13.5f, 19.0f, 13.5f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.5f)
                curveTo(13.0f, 19.0523f, 12.5523f, 19.5f, 12.0f, 19.5f)
                curveTo(11.4477f, 19.5f, 11.0f, 19.0523f, 11.0f, 18.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(6.5f)
                verticalLineTo(18.5f)
                curveTo(6.5f, 19.0523f, 6.0523f, 19.5f, 5.5f, 19.5f)
                curveTo(4.9477f, 19.5f, 4.5f, 19.0523f, 4.5f, 18.5f)
                verticalLineTo(6.5f)
                curveTo(4.5f, 5.9477f, 4.9477f, 5.5f, 5.5f, 5.5f)
                curveTo(6.0523f, 5.5f, 6.5f, 5.9477f, 6.5f, 6.5f)
                verticalLineTo(11.5f)
                horizontalLineTo(10.25f)
                verticalLineTo(10.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(6.5f)
                curveTo(8.0f, 5.1193f, 6.8807f, 4.0f, 5.5f, 4.0f)
                close()
            }
        }
        .build()
        return _transmission!!
    }

private var _transmission: ImageVector? = null
