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

public val SimpleIcons.Expo: ImageVector
    get() {
        if (_expo != null) {
            return _expo!!
        }
        _expo = Builder(name = "Expo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 20.084f)
                curveToRelative(0.043f, 0.53f, 0.23f, 1.063f, 0.718f, 1.778f)
                curveToRelative(0.58f, 0.849f, 1.576f, 1.315f, 2.303f, 0.567f)
                curveToRelative(0.49f, -0.505f, 5.794f, -9.776f, 8.35f, -13.29f)
                arcToRelative(0.761f, 0.761f, 0.0f, false, true, 1.248f, 0.0f)
                curveToRelative(2.556f, 3.514f, 7.86f, 12.785f, 8.35f, 13.29f)
                curveToRelative(0.727f, 0.748f, 1.723f, 0.282f, 2.303f, -0.567f)
                curveToRelative(0.57f, -0.835f, 0.728f, -1.42f, 0.728f, -2.046f)
                curveToRelative(0.0f, -0.426f, -8.26f, -15.798f, -9.092f, -17.078f)
                curveToRelative(-0.8f, -1.23f, -1.044f, -1.498f, -2.397f, -1.542f)
                horizontalLineToRelative(-1.032f)
                curveToRelative(-1.353f, 0.044f, -1.597f, 0.311f, -2.398f, 1.542f)
                curveTo(8.267f, 3.991f, 0.33f, 18.758f, 0.0f, 19.77f)
                close()
            }
        }
        .build()
        return _expo!!
    }

private var _expo: ImageVector? = null
