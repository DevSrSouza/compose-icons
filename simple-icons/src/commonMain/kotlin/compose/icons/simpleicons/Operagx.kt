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

public val SimpleIcons.Operagx: ImageVector
    get() {
        if (_operagx != null) {
            return _operagx!!
        }
        _operagx = Builder(name = "Operagx", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.01f)
                curveToRelative(0.0f, 3.412f, -1.462f, 6.674f, -4.013f, 8.943f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 11.992f, 24.0f)
                curveToRelative(-0.178f, 0.0f, -0.385f, -0.019f, -0.563f, -0.019f)
                curveTo(5.016f, 23.681f, 0.0f, 18.403f, 0.0f, 11.991f)
                curveTo(0.0f, 5.37f, 5.372f, 0.0f, 11.99f, 0.0f)
                horizontalLineToRelative(0.038f)
                curveToRelative(2.944f, 0.0f, 5.775f, 1.087f, 7.96f, 3.047f)
                arcTo(12.04f, 12.04f, 0.0f, false, true, 24.0f, 12.009f)
                close()
                moveTo(14.86f, 22.453f)
                curveToRelative(-2.729f, -0.056f, -5.279f, -1.397f, -7.041f, -3.684f)
                curveToRelative(-1.388f, -1.64f, -2.203f, -4.013f, -2.269f, -6.516f)
                verticalLineToRelative(-0.544f)
                curveToRelative(0.047f, -2.521f, 0.881f, -4.893f, 2.269f, -6.534f)
                curveToRelative(1.744f, -2.269f, 4.294f, -3.61f, 7.012f, -3.666f)
                arcToRelative(10.67f, 10.67f, 0.0f, false, false, -2.784f, -0.384f)
                horizontalLineToRelative(-0.038f)
                curveToRelative(-5.99f, 0.0f, -10.865f, 4.894f, -10.865f, 10.866f)
                curveToRelative(0.0f, 5.812f, 4.528f, 10.584f, 10.34f, 10.847f)
                arcToRelative(10.087f, 10.087f, 0.0f, false, false, 3.375f, -0.385f)
                close()
                moveTo(22.856f, 12.009f)
                curveToRelative(0.0f, -3.065f, -1.303f, -5.99f, -3.59f, -8.053f)
                arcToRelative(7.69f, 7.69f, 0.0f, false, false, -4.228f, -1.284f)
                curveToRelative(-2.447f, 0.0f, -4.754f, 1.181f, -6.357f, 3.244f)
                curveToRelative(-1.247f, 1.462f, -1.969f, 3.59f, -2.025f, 5.83f)
                verticalLineToRelative(0.526f)
                curveToRelative(0.056f, 2.25f, 0.778f, 4.369f, 2.006f, 5.812f)
                lineToRelative(0.02f, 0.02f)
                curveToRelative(1.602f, 2.071f, 3.909f, 3.252f, 6.355f, 3.252f)
                arcToRelative(7.69f, 7.69f, 0.0f, false, false, 4.229f, -1.284f)
                arcToRelative(10.894f, 10.894f, 0.0f, false, false, 3.59f, -8.063f)
                close()
                moveTo(19.106f, 12.009f)
                curveToRelative(0.0f, 4.05f, -2.184f, 7.341f, -4.912f, 7.585f)
                curveToRelative(2.128f, -1.388f, 3.61f, -4.257f, 3.61f, -7.585f)
                curveToRelative(0.0f, -3.328f, -1.463f, -6.197f, -3.61f, -7.575f)
                curveToRelative(2.728f, 0.244f, 4.912f, 3.525f, 4.912f, 7.575f)
                close()
            }
        }
        .build()
        return _operagx!!
    }

private var _operagx: ImageVector? = null
