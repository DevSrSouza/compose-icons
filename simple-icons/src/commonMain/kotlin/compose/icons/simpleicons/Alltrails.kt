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

public val SimpleIcons.Alltrails: ImageVector
    get() {
        if (_alltrails != null) {
            return _alltrails!!
        }
        _alltrails = Builder(name = "Alltrails", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.694f, 18.72f)
                curveToRelative(-3.845f, -4.058f, -12.083f, -5.754f, -17.345f, -3.216f)
                lineToRelative(5.504f, -7.623f)
                lineToRelative(2.63f, 4.163f)
                curveToRelative(0.148f, 0.246f, 0.47f, 0.32f, 0.71f, 0.164f)
                lineToRelative(1.993f, -1.333f)
                curveToRelative(1.684f, 1.806f, 3.358f, 3.618f, 4.796f, 5.158f)
                arcToRelative(0.19f, 0.19f, 0.0f, false, false, 0.322f, -0.139f)
                arcToRelative(0.185f, 0.185f, 0.0f, false, false, -0.023f, -0.088f)
                horizontalLineToRelative(0.001f)
                curveToRelative(-1.41f, -2.458f, -2.826f, -4.913f, -4.25f, -7.364f)
                curveToRelative(-0.254f, -0.434f, -0.552f, -0.503f, -0.986f, -0.219f)
                lineToRelative(-1.34f, 0.921f)
                lineToRelative(-3.382f, -5.226f)
                arcToRelative(0.587f, 0.587f, 0.0f, false, false, -0.494f, -0.275f)
                arcToRelative(0.574f, 0.574f, 0.0f, false, false, -0.487f, 0.265f)
                arcTo(5684.859f, 5684.859f, 0.0f, false, true, 0.08f, 18.973f)
                verticalLineToRelative(0.002f)
                curveToRelative(-0.2f, 0.28f, -0.001f, 0.67f, 0.343f, 0.671f)
                curveToRelative(0.175f, -0.002f, 0.331f, -0.124f, 0.488f, -0.2f)
                curveToRelative(3.142f, -1.626f, 10.197f, -3.996f, 15.073f, -0.26f)
                curveToRelative(2.141f, 1.817f, 9.61f, 1.408f, 7.71f, -0.465f)
            }
        }
        .build()
        return _alltrails!!
    }

private var _alltrails: ImageVector? = null
