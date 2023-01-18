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

public val FilledGroup.ShiftsProhibited: ImageVector
    get() {
        if (_shiftsProhibited != null) {
            return _shiftsProhibited!!
        }
        _shiftsProhibited = Builder(name = "ShiftsProhibited", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.25f, 3.0f)
                curveTo(4.4551f, 3.0f, 3.0f, 4.4551f, 3.0f, 6.25f)
                verticalLineTo(12.0218f)
                curveTo(4.0103f, 11.375f, 5.2114f, 11.0f, 6.5f, 11.0f)
                curveTo(8.2478f, 11.0f, 9.8344f, 11.6898f, 11.0025f, 12.812f)
                curveTo(11.0009f, 12.7916f, 11.0f, 12.7709f, 11.0f, 12.75f)
                verticalLineTo(6.75f)
                curveTo(11.0f, 6.3358f, 11.3358f, 6.0f, 11.75f, 6.0f)
                curveTo(12.1642f, 6.0f, 12.5f, 6.3358f, 12.5f, 6.75f)
                verticalLineTo(12.0f)
                horizontalLineTo(16.25f)
                curveTo(16.6642f, 12.0f, 17.0f, 12.3358f, 17.0f, 12.75f)
                curveTo(17.0f, 13.1642f, 16.6642f, 13.5f, 16.25f, 13.5f)
                horizontalLineTo(11.75f)
                curveTo(11.7036f, 13.5f, 11.6583f, 13.4958f, 11.6142f, 13.4877f)
                curveTo(12.4823f, 14.5927f, 13.0f, 15.9859f, 13.0f, 17.5f)
                curveTo(13.0f, 18.7886f, 12.625f, 19.9897f, 11.9782f, 21.0f)
                horizontalLineTo(17.75f)
                curveTo(19.5449f, 21.0f, 21.0f, 19.5449f, 21.0f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(21.0f, 4.4551f, 19.5449f, 3.0f, 17.75f, 3.0f)
                horizontalLineTo(6.25f)
                close()
                moveTo(12.0f, 17.5f)
                curveTo(12.0f, 20.5376f, 9.5376f, 23.0f, 6.5f, 23.0f)
                curveTo(3.4624f, 23.0f, 1.0f, 20.5376f, 1.0f, 17.5f)
                curveTo(1.0f, 14.4624f, 3.4624f, 12.0f, 6.5f, 12.0f)
                curveTo(9.5376f, 12.0f, 12.0f, 14.4624f, 12.0f, 17.5f)
                close()
                moveTo(2.5f, 17.5f)
                curveTo(2.5f, 18.3335f, 2.755f, 19.1075f, 3.1911f, 19.7482f)
                lineTo(8.7482f, 14.1911f)
                curveTo(8.1075f, 13.755f, 7.3335f, 13.5f, 6.5f, 13.5f)
                curveTo(4.2909f, 13.5f, 2.5f, 15.2909f, 2.5f, 17.5f)
                close()
                moveTo(6.5f, 21.5f)
                curveTo(8.7091f, 21.5f, 10.5f, 19.7091f, 10.5f, 17.5f)
                curveTo(10.5f, 16.6665f, 10.245f, 15.8925f, 9.8089f, 15.2518f)
                lineTo(4.2518f, 20.8089f)
                curveTo(4.8925f, 21.245f, 5.6665f, 21.5f, 6.5f, 21.5f)
                close()
            }
        }
        .build()
        return _shiftsProhibited!!
    }

private var _shiftsProhibited: ImageVector? = null
