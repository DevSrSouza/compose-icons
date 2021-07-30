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

public val SimpleIcons.Blueprint: ImageVector
    get() {
        if (_blueprint != null) {
            return _blueprint!!
        }
        _blueprint = Builder(name = "Blueprint", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.809f, 5.524f)
                lineTo(12.806f, 0.179f)
                lineToRelative(-0.013f, -0.007f)
                lineToRelative(0.078f, -0.045f)
                horizontalLineToRelative(-0.166f)
                arcToRelative(1.282f, 1.282f, 0.0f, false, false, -1.196f, 0.043f)
                lineToRelative(-0.699f, 0.403f)
                lineToRelative(-8.604f, 4.954f)
                arcToRelative(1.285f, 1.285f, 0.0f, false, false, -0.644f, 1.113f)
                verticalLineToRelative(10.718f)
                curveToRelative(0.0f, 0.46f, 0.245f, 0.884f, 0.644f, 1.113f)
                lineToRelative(9.304f, 5.357f)
                curveToRelative(0.402f, 0.232f, 0.898f, 0.228f, 1.297f, -0.009f)
                lineToRelative(9.002f, -5.345f)
                curveToRelative(0.39f, -0.231f, 0.629f, -0.651f, 0.629f, -1.105f)
                lineTo(22.438f, 6.628f)
                curveToRelative(0.0f, -0.453f, -0.239f, -0.873f, -0.629f, -1.104f)
                close()
                moveTo(2.527f, 6.083f)
                lineTo(11.843f, 0.719f)
                arcToRelative(0.642f, 0.642f, 0.0f, false, true, 0.636f, 0.012f)
                lineToRelative(9.002f, 5.345f)
                arcToRelative(0.638f, 0.638f, 0.0f, false, true, 0.207f, 0.203f)
                lineToRelative(-4.543f, 2.555f)
                lineToRelative(-4.498f, -2.7f)
                arcToRelative(0.963f, 0.963f, 0.0f, false, false, -0.968f, -0.014f)
                lineTo(6.83f, 8.848f)
                lineTo(2.287f, 6.329f)
                arcToRelative(0.644f, 0.644f, 0.0f, false, true, 0.24f, -0.246f)
                close()
                moveTo(16.657f, 14.376f)
                lineToRelative(-4.496f, -2.492f)
                lineTo(12.161f, 6.641f)
                arcToRelative(0.32f, 0.32f, 0.0f, false, true, 0.155f, 0.045f)
                lineToRelative(4.341f, 2.605f)
                verticalLineToRelative(5.085f)
                close()
                moveTo(11.894f, 12.47f)
                lineToRelative(4.692f, 2.601f)
                lineToRelative(-4.431f, 2.659f)
                lineToRelative(-4.648f, -2.615f)
                arcToRelative(0.317f, 0.317f, 0.0f, false, true, -0.115f, -0.112f)
                lineToRelative(4.502f, -2.533f)
                close()
                moveTo(11.83f, 23.272f)
                lineToRelative(-9.304f, -5.357f)
                arcToRelative(0.643f, 0.643f, 0.0f, false, true, -0.322f, -0.557f)
                lineTo(2.204f, 7.018f)
                lineTo(6.7f, 9.51f)
                verticalLineToRelative(5.324f)
                curveToRelative(0.0f, 0.348f, 0.188f, 0.669f, 0.491f, 0.84f)
                lineToRelative(4.811f, 2.706f)
                lineToRelative(0.157f, 0.088f)
                verticalLineToRelative(4.887f)
                arcToRelative(0.637f, 0.637f, 0.0f, false, true, -0.329f, -0.083f)
                close()
            }
        }
        .build()
        return _blueprint!!
    }

private var _blueprint: ImageVector? = null
