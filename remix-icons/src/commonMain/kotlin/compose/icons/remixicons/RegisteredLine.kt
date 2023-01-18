package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.RegisteredLine: ImageVector
    get() {
        if (_registeredLine != null) {
            return _registeredLine!!
        }
        _registeredLine = Builder(name = "RegisteredLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(5.523f, 0.0f, 10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveTo(2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 4.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(12.5f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 1.82f, 6.49f)
                lineTo(16.868f, 17.0f)
                horizontalLineToRelative(-2.472f)
                lineToRelative(-2.18f, -3.0f)
                lineTo(10.0f, 14.0f)
                verticalLineToRelative(3.0f)
                lineTo(8.0f, 17.0f)
                lineTo(8.0f, 7.0f)
                horizontalLineToRelative(4.5f)
                close()
                moveTo(12.5f, 9.0f)
                lineTo(10.0f, 9.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.493f, -1.356f)
                lineTo(14.0f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.5f, 9.0f)
                close()
            }
        }
        .build()
        return _registeredLine!!
    }

private var _registeredLine: ImageVector? = null
