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

public val SimpleIcons.Symphony: ImageVector
    get() {
        if (_symphony != null) {
            return _symphony!!
        }
        _symphony = Builder(name = "Symphony", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.471f, 8.118f)
                verticalLineToRelative(-4.22f)
                curveToRelative(0.0f, -0.864f, -0.468f, -1.677f, -1.22f, -2.12f)
                curveTo(18.124f, 1.113f, 15.684f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(5.876f, 1.113f, 4.75f, 1.777f)
                arcToRelative(2.476f, 2.476f, 0.0f, false, false, -1.22f, 2.12f)
                verticalLineToRelative(6.338f)
                lineToRelative(13.412f, 3.882f)
                verticalLineToRelative(2.824f)
                curveToRelative(0.0f, 0.382f, -0.24f, 0.65f, -0.648f, 0.849f)
                lineTo(12.0f, 19.941f)
                lineToRelative(-4.315f, -2.162f)
                curveToRelative(-0.386f, -0.188f, -0.626f, -0.456f, -0.626f, -0.838f)
                verticalLineToRelative(-2.118f)
                lineTo(3.53f, 13.764f)
                verticalLineToRelative(3.177f)
                curveToRelative(0.0f, 1.744f, 1.0f, 3.228f, 2.588f, 4.001f)
                lineTo(12.0f, 24.0f)
                lineToRelative(5.86f, -3.047f)
                curveToRelative(1.61f, -0.784f, 2.61f, -2.268f, 2.61f, -4.011f)
                verticalLineToRelative(-5.294f)
                lineTo(7.059f, 7.765f)
                verticalLineTo(4.542f)
                curveTo(8.017f, 4.08f, 9.651f, 3.529f, 12.0f, 3.529f)
                curveToRelative(2.349f, 0.0f, 3.983f, 0.55f, 4.941f, 1.013f)
                verticalLineToRelative(2.517f)
                lineToRelative(3.53f, 1.059f)
                close()
            }
        }
        .build()
        return _symphony!!
    }

private var _symphony: ImageVector? = null
