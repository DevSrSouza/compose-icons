package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Zendframework: ImageVector
    get() {
        if (_zendframework != null) {
            return _zendframework!!
        }
        _zendframework = Builder(name = "Zendframework", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.932f, 6.242f)
                verticalLineToRelative(2.535f)
                horizontalLineToRelative(5.652f)
                lineTo(0.0f, 17.757f)
                horizontalLineToRelative(10.219f)
                verticalLineToRelative(-2.534f)
                horizontalLineToRelative(-5.18f)
                lineToRelative(6.553f, -8.98f)
                lineTo(0.932f, 6.243f)
                close()
                moveTo(14.469f, 6.404f)
                curveToRelative(-3.178f, 0.0f, -3.178f, 3.178f, -3.178f, 3.178f)
                horizontalLineToRelative(9.531f)
                curveTo(24.0f, 9.582f, 24.0f, 6.404f, 24.0f, 6.404f)
                horizontalLineToRelative(-9.531f)
                close()
                moveTo(14.463f, 10.471f)
                curveToRelative(-3.173f, 0.0f, -3.172f, 3.172f, -3.172f, 3.172f)
                lineToRelative(4.762f, 0.005f)
                curveToRelative(3.178f, 0.0f, 3.177f, -3.177f, 3.177f, -3.177f)
                horizontalLineToRelative(-4.767f)
                close()
                moveTo(14.463f, 14.52f)
                curveToRelative(-3.173f, 0.0f, -3.172f, 3.183f, -3.172f, 3.183f)
                lineToRelative(1.584f, -0.006f)
                curveToRelative(3.178f, 0.0f, 3.178f, -3.177f, 3.178f, -3.177f)
                horizontalLineToRelative(-1.59f)
                close()
            }
        }
        .build()
        return _zendframework!!
    }

private var _zendframework: ImageVector? = null
