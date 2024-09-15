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

public val SimpleIcons.Mini: ImageVector
    get() {
        if (_mini != null) {
            return _mini!!
        }
        _mini = Builder(name = "Mini", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 9.172f)
                horizontalLineToRelative(7.556f)
                curveToRelative(0.48f, -0.749f, 1.111f, -1.343f, 1.893f, -1.783f)
                curveToRelative(0.782f, -0.439f, 1.631f, -0.659f, 2.548f, -0.659f)
                curveToRelative(0.916f, 0.0f, 1.767f, 0.22f, 2.553f, 0.661f)
                curveToRelative(0.785f, 0.441f, 1.415f, 1.035f, 1.889f, 1.78f)
                lineTo(24.0f, 9.172f)
                lineToRelative(-0.748f, 0.748f)
                horizontalLineToRelative(-6.399f)
                arcToRelative(4.278f, 4.278f, 0.0f, false, true, 0.299f, 0.889f)
                horizontalLineToRelative(5.233f)
                lineToRelative(-0.748f, 0.749f)
                horizontalLineToRelative(-4.369f)
                curveToRelative(0.013f, 0.193f, 0.019f, 0.34f, 0.019f, 0.439f)
                curveToRelative(0.0f, 0.1f, -0.006f, 0.247f, -0.019f, 0.44f)
                horizontalLineToRelative(3.49f)
                lineToRelative(-0.749f, 0.748f)
                horizontalLineToRelative(-2.857f)
                arcToRelative(4.066f, 4.066f, 0.0f, false, true, -0.299f, 0.884f)
                horizontalLineToRelative(2.264f)
                lineToRelative(-0.758f, 0.748f)
                lineTo(16.44f, 14.818f)
                curveToRelative(-0.474f, 0.746f, -1.104f, 1.342f, -1.889f, 1.786f)
                curveToRelative(-0.785f, 0.444f, -1.636f, 0.665f, -2.553f, 0.665f)
                curveToRelative(-0.917f, 0.0f, -1.766f, -0.221f, -2.548f, -0.663f)
                curveToRelative(-0.783f, -0.442f, -1.413f, -1.039f, -1.893f, -1.788f)
                lineTo(5.642f, 14.818f)
                lineToRelative(-0.744f, -0.748f)
                horizontalLineToRelative(2.26f)
                arcToRelative(4.093f, 4.093f, 0.0f, false, true, -0.296f, -0.884f)
                lineTo(4.006f, 13.186f)
                lineToRelative(-0.758f, -0.748f)
                horizontalLineToRelative(3.49f)
                curveToRelative(-0.013f, -0.193f, -0.019f, -0.34f, -0.019f, -0.44f)
                curveToRelative(0.0f, -0.1f, 0.006f, -0.246f, 0.019f, -0.439f)
                horizontalLineToRelative(-4.36f)
                lineToRelative(-0.758f, -0.749f)
                horizontalLineToRelative(5.242f)
                arcToRelative(4.306f, 4.306f, 0.0f, false, true, 0.296f, -0.889f)
                lineTo(0.748f, 9.921f)
                close()
                moveTo(7.844f, 10.244f)
                curveToRelative(-0.238f, 0.558f, -0.357f, 1.143f, -0.357f, 1.754f)
                curveToRelative(0.0f, 0.611f, 0.119f, 1.196f, 0.357f, 1.755f)
                curveToRelative(0.238f, 0.558f, 0.559f, 1.039f, 0.963f, 1.444f)
                curveToRelative(0.404f, 0.405f, 0.884f, 0.727f, 1.44f, 0.966f)
                curveToRelative(0.556f, 0.239f, 1.14f, 0.359f, 1.752f, 0.359f)
                curveToRelative(0.61f, 0.0f, 1.195f, -0.119f, 1.753f, -0.359f)
                curveToRelative(0.558f, -0.239f, 1.039f, -0.561f, 1.442f, -0.966f)
                curveToRelative(0.404f, -0.405f, 0.725f, -0.887f, 0.966f, -1.444f)
                curveToRelative(0.24f, -0.558f, 0.36f, -1.143f, 0.36f, -1.755f)
                curveToRelative(0.0f, -0.611f, -0.12f, -1.196f, -0.36f, -1.754f)
                curveToRelative(-0.241f, -0.558f, -0.562f, -1.039f, -0.966f, -1.442f)
                curveToRelative(-0.404f, -0.403f, -0.885f, -0.724f, -1.442f, -0.964f)
                curveToRelative(-0.558f, -0.239f, -1.143f, -0.359f, -1.753f, -0.359f)
                curveToRelative(-0.611f, 0.0f, -1.195f, 0.119f, -1.751f, 0.359f)
                curveToRelative(-0.556f, 0.239f, -1.036f, 0.561f, -1.44f, 0.964f)
                curveToRelative(-0.404f, 0.404f, -0.725f, 0.884f, -0.963f, 1.442f)
                close()
                moveTo(8.398f, 13.186f)
                horizontalLineToRelative(0.468f)
                lineToRelative(-0.014f, -1.773f)
                lineToRelative(0.566f, 1.773f)
                lineToRelative(0.52f, -0.003f)
                lineToRelative(0.556f, -1.761f)
                verticalLineToRelative(1.764f)
                horizontalLineToRelative(0.499f)
                verticalLineToRelative(-2.377f)
                lineToRelative(-0.703f, -0.001f)
                lineToRelative(-0.603f, 1.895f)
                lineToRelative(-0.615f, -1.893f)
                lineToRelative(-0.674f, -0.002f)
                close()
                moveTo(11.531f, 13.186f)
                horizontalLineToRelative(0.495f)
                verticalLineToRelative(-2.377f)
                horizontalLineToRelative(-0.495f)
                close()
                moveTo(12.564f, 13.186f)
                horizontalLineToRelative(0.477f)
                verticalLineToRelative(-1.712f)
                lineToRelative(0.949f, 1.712f)
                horizontalLineToRelative(0.575f)
                verticalLineToRelative(-2.377f)
                horizontalLineToRelative(-0.468f)
                verticalLineToRelative(1.722f)
                lineToRelative(-0.949f, -1.722f)
                horizontalLineToRelative(-0.585f)
                close()
                moveTo(15.112f, 13.186f)
                horizontalLineToRelative(0.486f)
                verticalLineToRelative(-2.377f)
                horizontalLineToRelative(-0.486f)
                close()
            }
        }
        .build()
        return _mini!!
    }

private var _mini: ImageVector? = null
