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

public val SimpleIcons.Xaml: ImageVector
    get() {
        if (_xaml != null) {
            return _xaml!!
        }
        _xaml = Builder(name = "Xaml", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.391f, 1.537f)
                arcToRelative(0.785f, 0.785f, 0.0f, false, false, -0.679f, 0.391f)
                lineToRelative(-5.607f, 9.678f)
                arcToRelative(0.785f, 0.785f, 0.0f, false, false, 0.0f, 0.787f)
                lineToRelative(5.607f, 9.678f)
                arcToRelative(0.785f, 0.785f, 0.0f, false, false, 0.679f, 0.391f)
                horizontalLineToRelative(11.218f)
                curveToRelative(0.28f, 0.0f, 0.539f, -0.149f, 0.679f, -0.391f)
                lineToRelative(5.607f, -9.678f)
                arcToRelative(0.785f, 0.785f, 0.0f, false, false, 0.0f, -0.787f)
                lineToRelative(-5.607f, -9.678f)
                arcToRelative(0.785f, 0.785f, 0.0f, false, false, -0.679f, -0.391f)
                close()
                moveTo(6.421f, 2.374f)
                horizontalLineToRelative(10.542f)
                lineToRelative(-5.209f, 9.211f)
                lineTo(5.968f, 11.585f)
                lineToRelative(4.72f, -8.175f)
                arcToRelative(0.131f, 0.131f, 0.0f, false, false, -0.113f, -0.196f)
                lineTo(7.506f, 3.213f)
                arcToRelative(0.262f, 0.262f, 0.0f, false, false, -0.227f, 0.131f)
                lineToRelative(-4.763f, 8.242f)
                horizontalLineToRelative(-1.431f)
                close()
                moveTo(17.754f, 2.677f)
                lineTo(23.155f, 12.0f)
                lineToRelative(-5.372f, 9.274f)
                lineToRelative(-5.299f, -9.278f)
                close()
                moveTo(17.925f, 5.502f)
                arcToRelative(0.13f, 0.13f, 0.0f, false, false, -0.113f, 0.067f)
                lineToRelative(-1.519f, 2.689f)
                arcToRelative(0.262f, 0.262f, 0.0f, false, false, 0.001f, 0.259f)
                lineToRelative(1.943f, 3.361f)
                arcToRelative(0.262f, 0.262f, 0.0f, false, true, 0.0f, 0.262f)
                lineToRelative(-1.927f, 3.338f)
                arcToRelative(0.262f, 0.262f, 0.0f, false, false, -0.001f, 0.261f)
                lineToRelative(1.527f, 2.674f)
                curveToRelative(0.05f, 0.088f, 0.176f, 0.088f, 0.227f, 0.001f)
                lineToRelative(3.55f, -6.143f)
                arcToRelative(0.523f, 0.523f, 0.0f, false, false, -0.0f, -0.524f)
                lineTo(18.039f, 5.567f)
                arcToRelative(0.13f, 0.13f, 0.0f, false, false, -0.114f, -0.065f)
                close()
                moveTo(1.09f, 12.422f)
                horizontalLineToRelative(1.436f)
                lineToRelative(4.763f, 8.231f)
                arcToRelative(0.262f, 0.262f, 0.0f, false, false, 0.226f, 0.131f)
                lineToRelative(3.072f, 0.002f)
                arcToRelative(0.131f, 0.131f, 0.0f, false, false, 0.113f, -0.196f)
                lineToRelative(-4.721f, -8.167f)
                horizontalLineToRelative(5.785f)
                lineToRelative(5.256f, 9.203f)
                lineTo(6.421f, 21.626f)
                close()
            }
        }
        .build()
        return _xaml!!
    }

private var _xaml: ImageVector? = null
