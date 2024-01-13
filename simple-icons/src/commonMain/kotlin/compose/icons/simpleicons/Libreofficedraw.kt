package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Libreofficedraw: ImageVector
    get() {
        if (_libreofficedraw != null) {
            return _libreofficedraw!!
        }
        _libreofficedraw = Builder(name = "Libreofficedraw", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 0.0f)
                curveTo(3.338f, 0.0f, 2.0f, 1.338f, 2.0f, 3.0f)
                verticalLineToRelative(18.0f)
                curveToRelative(0.0f, 1.662f, 1.338f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.662f, 0.0f, 3.0f, -1.338f, 3.0f, -3.0f)
                lineTo(22.0f, 9.0f)
                lineToRelative(-9.0f, -9.0f)
                lineTo(5.0f, 0.0f)
                close()
                moveTo(6.0f, 12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                curveToRelative(1.6f, 0.0f, 2.897f, 1.257f, 2.984f, 2.837f)
                lineTo(11.5f, 11.0f)
                lineToRelative(-2.298f, 3.98f)
                curveToRelative(-0.068f, 0.004f, -0.133f, 0.02f, -0.203f, 0.02f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                close()
                moveTo(9.191f, 17.0f)
                lineTo(11.501f, 13.0f)
                lineTo(13.811f, 17.0f)
                lineTo(9.19f, 17.0f)
                close()
                moveTo(18.0f, 16.0f)
                horizontalLineToRelative(-3.613f)
                lineTo(13.0f, 13.597f)
                lineTo(13.0f, 11.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(22.0f, 0.0f)
                verticalLineToRelative(7.0f)
                lineToRelative(-7.0f, -7.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(17.0f, 15.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _libreofficedraw!!
    }

private var _libreofficedraw: ImageVector? = null
