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

public val FilledGroup.DrawerDismiss: ImageVector
    get() {
        if (_drawerDismiss != null) {
            return _drawerDismiss!!
        }
        _drawerDismiss = Builder(name = "DrawerDismiss", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 6.5f)
                curveTo(22.0f, 9.5376f, 19.5376f, 12.0f, 16.5f, 12.0f)
                curveTo(13.4624f, 12.0f, 11.0f, 9.5376f, 11.0f, 6.5f)
                curveTo(11.0f, 3.4624f, 13.4624f, 1.0f, 16.5f, 1.0f)
                curveTo(19.5376f, 1.0f, 22.0f, 3.4624f, 22.0f, 6.5f)
                close()
                moveTo(14.8536f, 4.1465f)
                curveTo(14.6583f, 3.9512f, 14.3417f, 3.9512f, 14.1464f, 4.1465f)
                curveTo(13.9512f, 4.3417f, 13.9512f, 4.6583f, 14.1464f, 4.8535f)
                lineTo(15.7929f, 6.5f)
                lineTo(14.1464f, 8.1465f)
                curveTo(13.9512f, 8.3417f, 13.9512f, 8.6583f, 14.1464f, 8.8535f)
                curveTo(14.3417f, 9.0488f, 14.6583f, 9.0488f, 14.8536f, 8.8535f)
                lineTo(16.5f, 7.2071f)
                lineTo(18.1464f, 8.8535f)
                curveTo(18.3417f, 9.0488f, 18.6583f, 9.0488f, 18.8536f, 8.8535f)
                curveTo(19.0488f, 8.6583f, 19.0488f, 8.3417f, 18.8536f, 8.1465f)
                lineTo(17.2071f, 6.5f)
                lineTo(18.8536f, 4.8535f)
                curveTo(19.0488f, 4.6583f, 19.0488f, 4.3417f, 18.8536f, 4.1465f)
                curveTo(18.6583f, 3.9512f, 18.3417f, 3.9512f, 18.1464f, 4.1465f)
                lineTo(16.5f, 5.7929f)
                lineTo(14.8536f, 4.1465f)
                close()
                moveTo(6.25f, 4.0f)
                horizontalLineTo(10.4982f)
                curveTo(10.3004f, 4.4742f, 10.1572f, 4.9768f, 10.0764f, 5.5f)
                horizontalLineTo(6.25f)
                curveTo(5.2835f, 5.5f, 4.5f, 6.2835f, 4.5f, 7.25f)
                verticalLineTo(8.0f)
                horizontalLineTo(10.1739f)
                curveTo(10.2986f, 8.5278f, 10.4876f, 9.0307f, 10.7322f, 9.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(9.0577f)
                curveTo(9.44f, 14.0f, 9.75f, 14.31f, 9.75f, 14.6923f)
                verticalLineTo(14.75f)
                curveTo(9.75f, 15.9926f, 10.7574f, 17.0f, 12.0f, 17.0f)
                curveTo(13.2426f, 17.0f, 14.25f, 15.9926f, 14.25f, 14.75f)
                verticalLineTo(14.6923f)
                curveTo(14.25f, 14.31f, 14.56f, 14.0f, 14.9423f, 14.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(12.2678f)
                curveTo(20.051f, 11.9806f, 20.5557f, 11.6168f, 21.0f, 11.1904f)
                verticalLineTo(18.75f)
                curveTo(21.0f, 20.5449f, 19.5449f, 22.0f, 17.75f, 22.0f)
                horizontalLineTo(6.25f)
                curveTo(4.4551f, 22.0f, 3.0f, 20.5449f, 3.0f, 18.75f)
                verticalLineTo(7.25f)
                curveTo(3.0f, 5.4551f, 4.4551f, 4.0f, 6.25f, 4.0f)
                close()
            }
        }
        .build()
        return _drawerDismiss!!
    }

private var _drawerDismiss: ImageVector? = null
