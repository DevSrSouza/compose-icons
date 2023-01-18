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

public val RegularGroup.ShieldLock: ImageVector
    get() {
        if (_shieldLock != null) {
            return _shieldLock!!
        }
        _shieldLock = Builder(name = "ShieldLock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 5.75f)
                curveTo(3.0f, 5.3358f, 3.3358f, 5.0f, 3.75f, 5.0f)
                curveTo(6.4134f, 5.0f, 9.008f, 4.0565f, 11.55f, 2.15f)
                curveTo(11.8167f, 1.95f, 12.1833f, 1.95f, 12.45f, 2.15f)
                curveTo(14.992f, 4.0565f, 17.5866f, 5.0f, 20.25f, 5.0f)
                curveTo(20.6642f, 5.0f, 21.0f, 5.3358f, 21.0f, 5.75f)
                verticalLineTo(11.0f)
                curveTo(21.0f, 11.1813f, 20.9961f, 11.3609f, 20.9883f, 11.5387f)
                curveTo(20.5804f, 11.1263f, 20.0707f, 10.8148f, 19.5f, 10.6449f)
                verticalLineTo(6.4779f)
                curveTo(16.9227f, 6.3259f, 14.4192f, 5.3883f, 12.0f, 3.6778f)
                curveTo(9.5808f, 5.3883f, 7.0774f, 6.3259f, 4.5f, 6.4779f)
                verticalLineTo(11.0f)
                curveTo(4.5f, 15.2556f, 6.9534f, 18.3789f, 12.0f, 20.4419f)
                curveTo(12.3455f, 20.3007f, 12.6788f, 20.1545f, 13.0f, 20.0033f)
                verticalLineTo(21.5f)
                curveTo(13.0f, 21.5492f, 13.0014f, 21.598f, 13.0042f, 21.6465f)
                curveTo(12.7663f, 21.7496f, 12.5232f, 21.85f, 12.2749f, 21.9478f)
                curveTo(12.0982f, 22.0174f, 11.9018f, 22.0174f, 11.7251f, 21.9478f)
                curveTo(5.9576f, 19.6757f, 3.0f, 16.0012f, 3.0f, 11.0f)
                verticalLineTo(5.75f)
                close()
                moveTo(16.0f, 15.0f)
                verticalLineTo(14.0f)
                curveTo(16.0f, 12.6193f, 17.1193f, 11.5f, 18.5f, 11.5f)
                curveTo(19.8807f, 11.5f, 21.0f, 12.6193f, 21.0f, 14.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(21.5f)
                curveTo(22.3284f, 15.0f, 23.0f, 15.6716f, 23.0f, 16.5f)
                verticalLineTo(21.5f)
                curveTo(23.0f, 22.3284f, 22.3284f, 23.0f, 21.5f, 23.0f)
                horizontalLineTo(15.5f)
                curveTo(14.6716f, 23.0f, 14.0f, 22.3284f, 14.0f, 21.5f)
                verticalLineTo(16.5f)
                curveTo(14.0f, 15.6716f, 14.6716f, 15.0f, 15.5f, 15.0f)
                horizontalLineTo(16.0f)
                close()
                moveTo(17.5f, 14.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(14.0f)
                curveTo(19.5f, 13.4477f, 19.0523f, 13.0f, 18.5f, 13.0f)
                curveTo(17.9477f, 13.0f, 17.5f, 13.4477f, 17.5f, 14.0f)
                close()
                moveTo(19.5f, 19.0f)
                curveTo(19.5f, 18.4477f, 19.0523f, 18.0f, 18.5f, 18.0f)
                curveTo(17.9477f, 18.0f, 17.5f, 18.4477f, 17.5f, 19.0f)
                curveTo(17.5f, 19.5523f, 17.9477f, 20.0f, 18.5f, 20.0f)
                curveTo(19.0523f, 20.0f, 19.5f, 19.5523f, 19.5f, 19.0f)
                close()
            }
        }
        .build()
        return _shieldLock!!
    }

private var _shieldLock: ImageVector? = null
