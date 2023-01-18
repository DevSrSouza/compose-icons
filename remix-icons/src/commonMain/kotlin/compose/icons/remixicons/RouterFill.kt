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

public val RemixIcons.RouterFill: ImageVector
    get() {
        if (_routerFill != null) {
            return _routerFill!!
        }
        _routerFill = Builder(name = "RouterFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 14.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(6.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(2.51f, 8.837f)
                curveTo(3.835f, 4.864f, 7.584f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(8.166f, 2.864f, 9.49f, 6.837f)
                lineToRelative(-1.898f, 0.632f)
                arcToRelative(8.003f, 8.003f, 0.0f, false, false, -15.184f, 0.0f)
                lineToRelative(-1.897f, -0.632f)
                close()
                moveTo(6.306f, 10.102f)
                arcToRelative(6.003f, 6.003f, 0.0f, false, true, 11.388f, 0.0f)
                lineToRelative(-1.898f, 0.633f)
                arcToRelative(4.002f, 4.002f, 0.0f, false, false, -7.592f, 0.0f)
                lineToRelative(-1.898f, -0.633f)
                close()
            }
        }
        .build()
        return _routerFill!!
    }

private var _routerFill: ImageVector? = null
