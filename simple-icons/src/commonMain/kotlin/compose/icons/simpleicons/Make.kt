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

public val SimpleIcons.Make: ImageVector
    get() {
        if (_make != null) {
            return _make!!
        }
        _make = Builder(name = "Make", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.38f, 3.498f)
                curveToRelative(-0.27f, 0.0f, -0.511f, 0.19f, -0.566f, 0.465f)
                lineTo(9.85f, 18.986f)
                arcToRelative(0.578f, 0.578f, 0.0f, false, false, 0.453f, 0.678f)
                lineToRelative(4.095f, 0.826f)
                arcToRelative(0.58f, 0.58f, 0.0f, false, false, 0.682f, -0.455f)
                lineToRelative(2.963f, -15.021f)
                arcToRelative(0.578f, 0.578f, 0.0f, false, false, -0.453f, -0.678f)
                lineToRelative(-4.096f, -0.826f)
                arcToRelative(0.589f, 0.589f, 0.0f, false, false, -0.113f, -0.012f)
                close()
                moveTo(7.504f, 3.596f)
                arcToRelative(0.576f, 0.576f, 0.0f, false, false, -0.516f, 0.318f)
                lineTo(0.062f, 17.697f)
                arcToRelative(0.575f, 0.575f, 0.0f, false, false, 0.256f, 0.774f)
                lineToRelative(3.733f, 1.877f)
                arcToRelative(0.578f, 0.578f, 0.0f, false, false, 0.775f, -0.258f)
                lineToRelative(6.926f, -13.781f)
                arcToRelative(0.577f, 0.577f, 0.0f, false, false, -0.256f, -0.776f)
                lineTo(7.762f, 3.658f)
                arcToRelative(0.571f, 0.571f, 0.0f, false, false, -0.258f, -0.062f)
                close()
                moveTo(19.244f, 3.711f)
                arcToRelative(0.576f, 0.576f, 0.0f, false, false, -0.576f, 0.576f)
                verticalLineToRelative(15.426f)
                curveToRelative(0.0f, 0.318f, 0.258f, 0.578f, 0.576f, 0.578f)
                horizontalLineToRelative(4.178f)
                arcToRelative(0.58f, 0.58f, 0.0f, false, false, 0.578f, -0.578f)
                lineTo(24.0f, 4.287f)
                arcToRelative(0.578f, 0.578f, 0.0f, false, false, -0.578f, -0.576f)
                close()
            }
        }
        .build()
        return _make!!
    }

private var _make: ImageVector? = null
