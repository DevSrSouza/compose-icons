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

public val SimpleIcons.Threema: ImageVector
    get() {
        if (_threema != null) {
            return _threema!!
        }
        _threema = Builder(name = "Threema", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.998f, 20.486f)
                arcToRelative(1.757f, 1.757f, 0.0f, true, true, 0.0f, 3.514f)
                arcToRelative(1.757f, 1.757f, 0.0f, false, true, 0.0f, -3.514f)
                close()
                moveTo(5.663f, 20.486f)
                arcToRelative(1.757f, 1.757f, 0.0f, true, true, 0.0f, 3.514f)
                arcToRelative(1.757f, 1.757f, 0.0f, false, true, 0.0f, -3.514f)
                close()
                moveTo(18.334f, 20.486f)
                arcToRelative(1.757f, 1.757f, 0.0f, true, true, 0.0f, 3.514f)
                arcToRelative(1.757f, 1.757f, 0.0f, false, true, 0.0f, -3.514f)
                close()
                moveTo(12.0f, 0.0f)
                curveToRelative(5.7f, 0.0f, 10.322f, 4.066f, 10.322f, 9.082f)
                curveToRelative(0.0f, 5.016f, -4.622f, 9.083f, -10.322f, 9.083f)
                arcToRelative(11.45f, 11.45f, 0.0f, false, true, -4.523f, -0.917f)
                lineToRelative(-5.171f, 1.293f)
                lineToRelative(1.105f, -4.42f)
                curveToRelative(-1.094f, -1.442f, -1.733f, -3.175f, -1.733f, -5.039f)
                curveTo(1.678f, 4.066f, 6.3f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(11.999f, 4.235f)
                arcTo(2.926f, 2.926f, 0.0f, false, false, 9.072f, 7.16f)
                verticalLineToRelative(1.17f)
                horizontalLineToRelative(-0.115f)
                arcToRelative(0.47f, 0.47f, 0.0f, false, false, -0.47f, 0.47f)
                verticalLineToRelative(4.126f)
                curveToRelative(0.0f, 0.26f, 0.21f, 0.471f, 0.47f, 0.471f)
                horizontalLineToRelative(6.086f)
                curveToRelative(0.26f, 0.0f, 0.47f, -0.21f, 0.47f, -0.47f)
                lineTo(15.513f, 8.798f)
                arcToRelative(0.47f, 0.47f, 0.0f, false, false, -0.47f, -0.47f)
                horizontalLineToRelative(-0.115f)
                verticalLineToRelative(-1.17f)
                arcToRelative(2.927f, 2.927f, 0.0f, false, false, -2.93f, -2.924f)
                close()
                moveTo(11.999f, 5.405f)
                curveToRelative(0.972f, 0.0f, 1.758f, 0.786f, 1.758f, 1.754f)
                verticalLineToRelative(1.17f)
                horizontalLineToRelative(-3.514f)
                verticalLineToRelative(-1.17f)
                curveToRelative(0.0f, -0.968f, 0.786f, -1.754f, 1.756f, -1.754f)
                close()
            }
        }
        .build()
        return _threema!!
    }

private var _threema: ImageVector? = null
