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

public val SimpleIcons.Iconjar: ImageVector
    get() {
        if (_iconjar != null) {
            return _iconjar!!
        }
        _iconjar = Builder(name = "Iconjar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.15f, 5.875f)
                curveToRelative(-0.492f, 0.0f, -0.936f, -0.453f, -0.936f, -0.954f)
                curveToRelative(0.0f, -1.155f, 2.858f, -2.01f, 6.11f, -2.01f)
                curveToRelative(0.295f, 0.0f, 0.492f, 0.0f, 0.492f, -0.25f)
                curveToRelative(0.0f, -0.452f, -0.985f, -0.602f, -0.985f, -1.355f)
                curveTo(9.831f, 0.502f, 10.767f, 0.0f, 11.95f, 0.0f)
                curveToRelative(1.183f, 0.0f, 2.12f, 0.502f, 2.12f, 1.306f)
                curveToRelative(0.0f, 0.753f, -0.986f, 0.853f, -0.986f, 1.355f)
                curveToRelative(0.0f, 0.151f, 0.148f, 0.251f, 0.492f, 0.251f)
                curveToRelative(3.252f, 0.0f, 6.16f, 0.803f, 6.16f, 2.009f)
                arcToRelative(0.944f, 0.944f, 0.0f, false, true, -0.937f, 0.953f)
                lineTo(5.151f, 5.874f)
                close()
                moveTo(19.882f, 10.443f)
                curveToRelative(1.183f, 0.753f, 1.626f, 2.109f, 1.43f, 3.365f)
                lineToRelative(-1.38f, 7.58f)
                curveTo(19.636f, 22.897f, 18.354f, 24.0f, 16.826f, 24.0f)
                lineTo(7.17f, 24.0f)
                curveToRelative(-1.526f, 0.0f, -2.808f, -1.104f, -3.104f, -2.611f)
                lineToRelative(-1.38f, -7.581f)
                arcToRelative(3.307f, 3.307f, 0.0f, false, true, 1.48f, -3.315f)
                curveToRelative(0.69f, -0.501f, 0.836f, -1.355f, 0.0f, -1.656f)
                curveToRelative(-1.184f, -0.452f, -0.938f, -1.908f, 0.245f, -1.908f)
                horizontalLineToRelative(7.193f)
                curveToRelative(1.133f, 0.0f, 2.514f, 0.853f, 2.514f, 3.615f)
                curveToRelative(0.0f, 2.762f, -1.282f, 2.51f, -1.282f, 4.468f)
                curveToRelative(0.0f, 0.854f, 0.69f, 1.758f, 1.527f, 1.859f)
                curveToRelative(1.43f, 0.15f, 2.267f, -0.402f, 2.267f, -2.41f)
                curveToRelative(0.0f, -2.06f, -1.182f, -3.013f, -1.182f, -4.72f)
                curveToRelative(0.0f, -2.059f, 1.28f, -2.863f, 2.118f, -2.863f)
                horizontalLineToRelative(2.07f)
                curveToRelative(1.182f, 0.0f, 1.43f, 1.457f, 0.246f, 1.909f)
                curveToRelative(-0.837f, 0.35f, -0.69f, 1.205f, 0.0f, 1.656f)
                close()
            }
        }
        .build()
        return _iconjar!!
    }

private var _iconjar: ImageVector? = null
