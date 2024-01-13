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

public val SimpleIcons.Linkfire: ImageVector
    get() {
        if (_linkfire != null) {
            return _linkfire!!
        }
        _linkfire = Builder(name = "Linkfire", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.08f, 1.997f)
                arcTo(10.041f, 10.042f, 0.0f, false, false, 0.0f, 12.006f)
                arcToRelative(10.041f, 10.042f, 0.0f, false, false, 10.08f, 10.0f)
                arcToRelative(10.037f, 10.038f, 0.0f, false, false, 7.12f, -2.933f)
                curveToRelative(2.883f, -2.796f, 4.509f, -8.065f, 5.775f, -12.861f)
                lineToRelative(0.038f, -0.152f)
                lineToRelative(0.09f, -0.343f)
                arcToRelative(0.227f, 0.227f, 0.0f, false, false, -0.038f, -0.197f)
                arcToRelative(0.234f, 0.234f, 0.0f, false, false, -0.185f, -0.09f)
                horizontalLineToRelative(-1.711f)
                arcToRelative(0.23f, 0.23f, 0.0f, false, true, -0.215f, -0.14f)
                arcToRelative(0.227f, 0.227f, 0.0f, false, true, 0.053f, -0.25f)
                lineToRelative(2.925f, -2.646f)
                verticalLineToRelative(-0.011f)
                arcToRelative(0.23f, 0.23f, 0.0f, false, false, 0.053f, -0.246f)
                arcToRelative(0.23f, 0.23f, 0.0f, false, false, -0.216f, -0.143f)
                close()
                moveTo(10.465f, 6.642f)
                horizontalLineToRelative(3.847f)
                arcToRelative(1.686f, 1.686f, 0.0f, false, true, 1.682f, 1.686f)
                verticalLineToRelative(3.844f)
                arcToRelative(1.686f, 1.686f, 0.0f, false, true, -1.682f, 1.686f)
                lineTo(10.47f, 13.858f)
                arcToRelative(1.686f, 1.686f, 0.0f, false, true, -1.684f, -1.686f)
                verticalLineToRelative(-0.722f)
                horizontalLineToRelative(1.442f)
                verticalLineToRelative(0.722f)
                arcToRelative(0.246f, 0.246f, 0.0f, false, false, 0.242f, 0.242f)
                horizontalLineToRelative(3.848f)
                arcToRelative(0.242f, 0.242f, 0.0f, false, false, 0.242f, -0.242f)
                lineTo(14.56f, 8.324f)
                arcToRelative(0.242f, 0.242f, 0.0f, false, false, -0.242f, -0.242f)
                lineTo(10.47f, 8.082f)
                arcToRelative(0.242f, 0.242f, 0.0f, false, false, -0.242f, 0.242f)
                verticalLineToRelative(0.722f)
                lineTo(8.784f, 9.046f)
                verticalLineToRelative(-0.718f)
                arcToRelative(1.686f, 1.686f, 0.0f, false, true, 1.684f, -1.686f)
                close()
                moveTo(7.582f, 9.526f)
                horizontalLineToRelative(3.84f)
                arcToRelative(1.686f, 1.686f, 0.0f, false, true, 1.684f, 1.686f)
                verticalLineToRelative(0.718f)
                horizontalLineToRelative(-1.44f)
                verticalLineToRelative(-0.718f)
                arcToRelative(0.242f, 0.242f, 0.0f, false, false, -0.24f, -0.242f)
                lineTo(7.577f, 10.97f)
                arcToRelative(0.242f, 0.242f, 0.0f, false, false, -0.242f, 0.242f)
                verticalLineToRelative(3.847f)
                arcToRelative(0.242f, 0.242f, 0.0f, false, false, 0.242f, 0.242f)
                horizontalLineToRelative(3.847f)
                arcToRelative(0.242f, 0.242f, 0.0f, false, false, 0.241f, -0.242f)
                verticalLineToRelative(-0.718f)
                horizontalLineToRelative(1.448f)
                verticalLineToRelative(0.718f)
                arcToRelative(1.686f, 1.686f, 0.0f, false, true, -1.686f, 1.682f)
                lineTo(7.582f, 16.741f)
                arcToRelative(1.686f, 1.686f, 0.0f, false, true, -1.69f, -1.682f)
                verticalLineToRelative(-3.847f)
                arcToRelative(1.686f, 1.686f, 0.0f, false, true, 1.69f, -1.686f)
                close()
            }
        }
        .build()
        return _linkfire!!
    }

private var _linkfire: ImageVector? = null
