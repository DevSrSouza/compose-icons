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

public val FilledGroup.ScanDash: ImageVector
    get() {
        if (_scanDash != null) {
            return _scanDash!!
        }
        _scanDash = Builder(name = "ScanDash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 3.0f)
                curveTo(4.567f, 3.0f, 3.0f, 4.567f, 3.0f, 6.5f)
                verticalLineTo(8.3636f)
                curveTo(3.0f, 8.9159f, 3.4477f, 9.3636f, 4.0f, 9.3636f)
                curveTo(4.5523f, 9.3636f, 5.0f, 8.9159f, 5.0f, 8.3636f)
                verticalLineTo(6.5f)
                curveTo(5.0f, 5.6716f, 5.6716f, 5.0f, 6.5f, 5.0f)
                horizontalLineTo(8.3636f)
                curveTo(8.9159f, 5.0f, 9.3636f, 4.5523f, 9.3636f, 4.0f)
                curveTo(9.3636f, 3.4477f, 8.9159f, 3.0f, 8.3636f, 3.0f)
                horizontalLineTo(6.5f)
                close()
                moveTo(15.6364f, 3.0f)
                curveTo(15.0841f, 3.0f, 14.6364f, 3.4477f, 14.6364f, 4.0f)
                curveTo(14.6364f, 4.5523f, 15.0841f, 5.0f, 15.6364f, 5.0f)
                horizontalLineTo(17.5f)
                curveTo(18.3284f, 5.0f, 19.0f, 5.6716f, 19.0f, 6.5f)
                verticalLineTo(8.3636f)
                curveTo(19.0f, 8.9159f, 19.4477f, 9.3636f, 20.0f, 9.3636f)
                curveTo(20.5523f, 9.3636f, 21.0f, 8.9159f, 21.0f, 8.3636f)
                verticalLineTo(6.5f)
                curveTo(21.0f, 4.567f, 19.433f, 3.0f, 17.5f, 3.0f)
                horizontalLineTo(15.6364f)
                close()
                moveTo(5.0f, 15.6364f)
                curveTo(5.0f, 15.0841f, 4.5523f, 14.6364f, 4.0f, 14.6364f)
                curveTo(3.4477f, 14.6364f, 3.0f, 15.0841f, 3.0f, 15.6364f)
                verticalLineTo(17.5f)
                curveTo(3.0f, 19.433f, 4.567f, 21.0f, 6.5f, 21.0f)
                horizontalLineTo(8.3636f)
                curveTo(8.9159f, 21.0f, 9.3636f, 20.5523f, 9.3636f, 20.0f)
                curveTo(9.3636f, 19.4477f, 8.9159f, 19.0f, 8.3636f, 19.0f)
                horizontalLineTo(6.5f)
                curveTo(5.6716f, 19.0f, 5.0f, 18.3284f, 5.0f, 17.5f)
                verticalLineTo(15.6364f)
                close()
                moveTo(21.0f, 15.6364f)
                curveTo(21.0f, 15.0841f, 20.5523f, 14.6364f, 20.0f, 14.6364f)
                curveTo(19.4477f, 14.6364f, 19.0f, 15.0841f, 19.0f, 15.6364f)
                verticalLineTo(17.5f)
                curveTo(19.0f, 18.3284f, 18.3284f, 19.0f, 17.5f, 19.0f)
                horizontalLineTo(15.6364f)
                curveTo(15.0841f, 19.0f, 14.6364f, 19.4477f, 14.6364f, 20.0f)
                curveTo(14.6364f, 20.5523f, 15.0841f, 21.0f, 15.6364f, 21.0f)
                horizontalLineTo(17.5f)
                curveTo(19.433f, 21.0f, 21.0f, 19.433f, 21.0f, 17.5f)
                verticalLineTo(15.6364f)
                close()
                moveTo(8.0f, 11.0f)
                curveTo(7.4477f, 11.0f, 7.0f, 11.4477f, 7.0f, 12.0f)
                curveTo(7.0f, 12.5523f, 7.4477f, 13.0f, 8.0f, 13.0f)
                horizontalLineTo(16.0f)
                curveTo(16.5523f, 13.0f, 17.0f, 12.5523f, 17.0f, 12.0f)
                curveTo(17.0f, 11.4477f, 16.5523f, 11.0f, 16.0f, 11.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _scanDash!!
    }

private var _scanDash: ImageVector? = null
