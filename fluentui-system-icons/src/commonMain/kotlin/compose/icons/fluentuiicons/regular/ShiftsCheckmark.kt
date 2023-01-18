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

public val RegularGroup.ShiftsCheckmark: ImageVector
    get() {
        if (_shiftsCheckmark != null) {
            return _shiftsCheckmark!!
        }
        _shiftsCheckmark = Builder(name = "ShiftsCheckmark", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 6.25f)
                curveTo(4.5f, 5.2835f, 5.2835f, 4.5f, 6.25f, 4.5f)
                horizontalLineTo(17.75f)
                curveTo(18.7165f, 4.5f, 19.5f, 5.2835f, 19.5f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(19.5f, 18.7165f, 18.7165f, 19.5f, 17.75f, 19.5f)
                horizontalLineTo(12.6865f)
                curveTo(12.5142f, 20.0335f, 12.2747f, 20.5368f, 11.9782f, 21.0f)
                horizontalLineTo(17.75f)
                curveTo(19.5449f, 21.0f, 21.0f, 19.5449f, 21.0f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(21.0f, 4.4551f, 19.5449f, 3.0f, 17.75f, 3.0f)
                horizontalLineTo(6.25f)
                curveTo(4.4551f, 3.0f, 3.0f, 4.4551f, 3.0f, 6.25f)
                verticalLineTo(12.0218f)
                curveTo(3.4632f, 11.7253f, 3.9665f, 11.4858f, 4.5f, 11.3135f)
                verticalLineTo(6.25f)
                close()
                moveTo(12.5f, 6.75f)
                curveTo(12.5f, 6.3358f, 12.1642f, 6.0f, 11.75f, 6.0f)
                curveTo(11.3358f, 6.0f, 11.0f, 6.3358f, 11.0f, 6.75f)
                verticalLineTo(12.75f)
                curveTo(11.0f, 13.1642f, 11.3358f, 13.5f, 11.75f, 13.5f)
                horizontalLineTo(16.25f)
                curveTo(16.6642f, 13.5f, 17.0f, 13.1642f, 17.0f, 12.75f)
                curveTo(17.0f, 12.3358f, 16.6642f, 12.0f, 16.25f, 12.0f)
                horizontalLineTo(12.5f)
                verticalLineTo(6.75f)
                close()
                moveTo(12.0f, 17.5f)
                curveTo(12.0f, 20.5376f, 9.5376f, 23.0f, 6.5f, 23.0f)
                curveTo(3.4624f, 23.0f, 1.0f, 20.5376f, 1.0f, 17.5f)
                curveTo(1.0f, 14.4624f, 3.4624f, 12.0f, 6.5f, 12.0f)
                curveTo(9.5376f, 12.0f, 12.0f, 14.4624f, 12.0f, 17.5f)
                close()
                moveTo(8.8535f, 15.6464f)
                curveTo(8.6583f, 15.4512f, 8.3417f, 15.4512f, 8.1465f, 15.6464f)
                lineTo(5.5f, 18.2929f)
                lineTo(4.6035f, 17.3964f)
                curveTo(4.4083f, 17.2012f, 4.0917f, 17.2012f, 3.8965f, 17.3964f)
                curveTo(3.7012f, 17.5917f, 3.7012f, 17.9083f, 3.8965f, 18.1036f)
                lineTo(5.1465f, 19.3536f)
                curveTo(5.3417f, 19.5488f, 5.6583f, 19.5488f, 5.8535f, 19.3536f)
                lineTo(8.8535f, 16.3536f)
                curveTo(9.0488f, 16.1583f, 9.0488f, 15.8417f, 8.8535f, 15.6464f)
                close()
            }
        }
        .build()
        return _shiftsCheckmark!!
    }

private var _shiftsCheckmark: ImageVector? = null
