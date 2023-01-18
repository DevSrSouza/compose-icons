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

public val FilledGroup.TvUsb: ImageVector
    get() {
        if (_tvUsb != null) {
            return _tvUsb!!
        }
        _tvUsb = Builder(name = "TvUsb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.75f, 3.0f)
                curveTo(3.2312f, 3.0f, 2.0f, 4.2312f, 2.0f, 5.75f)
                verticalLineTo(14.25f)
                curveTo(2.0f, 15.7688f, 3.2312f, 17.0f, 4.75f, 17.0f)
                horizontalLineTo(14.5f)
                verticalLineTo(14.0f)
                curveTo(14.5f, 13.1821f, 14.8928f, 12.4559f, 15.5f, 11.9998f)
                verticalLineTo(11.0f)
                curveTo(15.5f, 9.6193f, 16.6193f, 8.5f, 18.0f, 8.5f)
                horizontalLineTo(21.0f)
                curveTo(21.3556f, 8.5f, 21.6938f, 8.5742f, 22.0f, 8.708f)
                verticalLineTo(5.75f)
                curveTo(22.0f, 4.2312f, 20.7688f, 3.0f, 19.25f, 3.0f)
                horizontalLineTo(4.75f)
                close()
                moveTo(5.75f, 18.5f)
                horizontalLineTo(14.7511f)
                curveTo(14.7972f, 18.5949f, 14.8494f, 18.6871f, 14.9076f, 18.7761f)
                lineTo(15.7078f, 20.0f)
                horizontalLineTo(5.75f)
                curveTo(5.3358f, 20.0f, 5.0f, 19.6642f, 5.0f, 19.25f)
                curveTo(5.0f, 18.8358f, 5.3358f, 18.5f, 5.75f, 18.5f)
                close()
                moveTo(17.5f, 20.0f)
                lineTo(16.163f, 17.9552f)
                curveTo(16.0567f, 17.7925f, 16.0f, 17.6024f, 16.0f, 17.408f)
                verticalLineTo(14.0f)
                curveTo(16.0f, 13.4477f, 16.4477f, 13.0f, 17.0f, 13.0f)
                verticalLineTo(11.0f)
                curveTo(17.0f, 10.4477f, 17.4477f, 10.0f, 18.0f, 10.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 10.0f, 22.0f, 10.4477f, 22.0f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(22.5523f, 13.0f, 23.0f, 13.4477f, 23.0f, 14.0f)
                verticalLineTo(17.4407f)
                curveTo(23.0f, 17.6376f, 22.9419f, 17.8301f, 22.8329f, 17.9941f)
                lineTo(21.5f, 20.0f)
                verticalLineTo(22.0f)
                curveTo(21.5f, 22.5523f, 21.0523f, 23.0f, 20.5f, 23.0f)
                horizontalLineTo(18.5f)
                curveTo(17.9477f, 23.0f, 17.5f, 22.5523f, 17.5f, 22.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(18.5f, 11.5f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.5f)
                verticalLineTo(11.5f)
                horizontalLineTo(18.5f)
                close()
            }
        }
        .build()
        return _tvUsb!!
    }

private var _tvUsb: ImageVector? = null
