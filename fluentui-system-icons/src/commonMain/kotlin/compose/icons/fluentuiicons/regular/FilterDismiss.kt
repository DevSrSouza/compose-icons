package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.FilterDismiss: ImageVector
    get() {
        if (_filterDismiss != null) {
            return _filterDismiss!!
        }
        _filterDismiss = Builder(name = "FilterDismiss", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 7.5f)
                curveTo(23.0f, 10.5376f, 20.5376f, 13.0f, 17.5f, 13.0f)
                curveTo(14.4624f, 13.0f, 12.0f, 10.5376f, 12.0f, 7.5f)
                curveTo(12.0f, 4.4624f, 14.4624f, 2.0f, 17.5f, 2.0f)
                curveTo(20.5376f, 2.0f, 23.0f, 4.4624f, 23.0f, 7.5f)
                close()
                moveTo(15.8536f, 5.1465f)
                curveTo(15.6583f, 4.9512f, 15.3417f, 4.9512f, 15.1464f, 5.1465f)
                curveTo(14.9512f, 5.3417f, 14.9512f, 5.6583f, 15.1464f, 5.8535f)
                lineTo(16.7929f, 7.5f)
                lineTo(15.1464f, 9.1465f)
                curveTo(14.9512f, 9.3417f, 14.9512f, 9.6583f, 15.1464f, 9.8535f)
                curveTo(15.3417f, 10.0488f, 15.6583f, 10.0488f, 15.8536f, 9.8535f)
                lineTo(17.5f, 8.2071f)
                lineTo(19.1464f, 9.8535f)
                curveTo(19.3417f, 10.0488f, 19.6583f, 10.0488f, 19.8536f, 9.8535f)
                curveTo(20.0488f, 9.6583f, 20.0488f, 9.3417f, 19.8536f, 9.1465f)
                lineTo(18.2071f, 7.5f)
                lineTo(19.8536f, 5.8535f)
                curveTo(20.0488f, 5.6583f, 20.0488f, 5.3417f, 19.8536f, 5.1465f)
                curveTo(19.6583f, 4.9512f, 19.3417f, 4.9512f, 19.1464f, 5.1465f)
                lineTo(17.5f, 6.7929f)
                lineTo(15.8536f, 5.1465f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.3464f, 12.5f)
                curveTo(12.8317f, 12.0719f, 12.3841f, 11.5659f, 12.0218f, 11.0f)
                horizontalLineTo(7.5f)
                curveTo(7.0858f, 11.0f, 6.75f, 11.3358f, 6.75f, 11.75f)
                curveTo(6.75f, 12.1642f, 7.0858f, 12.5f, 7.5f, 12.5f)
                horizontalLineTo(13.3464f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 7.5f)
                curveTo(11.0f, 6.9837f, 11.0602f, 6.4815f, 11.1739f, 6.0f)
                horizontalLineTo(4.5f)
                curveTo(4.0858f, 6.0f, 3.75f, 6.3358f, 3.75f, 6.75f)
                curveTo(3.75f, 7.1642f, 4.0858f, 7.5f, 4.5f, 7.5f)
                horizontalLineTo(11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 16.0f)
                curveTo(13.9142f, 16.0f, 14.25f, 16.3358f, 14.25f, 16.75f)
                curveTo(14.25f, 17.1642f, 13.9142f, 17.5f, 13.5f, 17.5f)
                horizontalLineTo(10.5f)
                curveTo(10.0858f, 17.5f, 9.75f, 17.1642f, 9.75f, 16.75f)
                curveTo(9.75f, 16.3358f, 10.0858f, 16.0f, 10.5f, 16.0f)
                horizontalLineTo(13.5f)
                close()
            }
        }
        .build()
        return _filterDismiss!!
    }

private var _filterDismiss: ImageVector? = null
