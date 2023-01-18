package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.KakaoTalkFill: ImageVector
    get() {
        if (_kakaoTalkFill != null) {
            return _kakaoTalkFill!!
        }
        _kakaoTalkFill = Builder(name = "KakaoTalkFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveToRelative(5.799f, 0.0f, 10.5f, 3.664f, 10.5f, 8.185f)
                curveToRelative(0.0f, 4.52f, -4.701f, 8.184f, -10.5f, 8.184f)
                arcToRelative(13.5f, 13.5f, 0.0f, false, true, -1.727f, -0.11f)
                lineToRelative(-4.408f, 2.883f)
                curveToRelative(-0.501f, 0.265f, -0.678f, 0.236f, -0.472f, -0.413f)
                lineToRelative(0.892f, -3.678f)
                curveToRelative(-2.88f, -1.46f, -4.785f, -3.99f, -4.785f, -6.866f)
                curveTo(1.5f, 6.665f, 6.201f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(17.907f, 11.06f)
                lineToRelative(1.47f, -1.424f)
                arcToRelative(0.472f, 0.472f, 0.0f, false, false, -0.656f, -0.678f)
                lineToRelative(-1.928f, 1.866f)
                lineTo(16.793f, 9.282f)
                arcToRelative(0.472f, 0.472f, 0.0f, false, false, -0.944f, 0.0f)
                verticalLineToRelative(2.557f)
                arcToRelative(0.471f, 0.471f, 0.0f, false, false, 0.0f, 0.222f)
                lineTo(15.849f, 13.5f)
                arcToRelative(0.472f, 0.472f, 0.0f, false, false, 0.944f, 0.0f)
                verticalLineToRelative(-1.363f)
                lineToRelative(0.427f, -0.413f)
                lineToRelative(1.428f, 2.033f)
                arcToRelative(0.472f, 0.472f, 0.0f, true, false, 0.773f, -0.543f)
                lineToRelative(-1.514f, -2.155f)
                close()
                moveTo(14.949f, 12.984f)
                horizontalLineToRelative(-1.46f)
                lineTo(13.489f, 9.297f)
                arcToRelative(0.472f, 0.472f, 0.0f, false, false, -0.943f, 0.0f)
                verticalLineToRelative(4.159f)
                curveToRelative(0.0f, 0.26f, 0.21f, 0.472f, 0.471f, 0.472f)
                horizontalLineToRelative(1.932f)
                arcToRelative(0.472f, 0.472f, 0.0f, true, false, 0.0f, -0.944f)
                close()
                moveTo(9.092f, 11.892f)
                lineToRelative(0.696f, -1.707f)
                lineToRelative(0.638f, 1.707f)
                lineTo(9.092f, 11.892f)
                close()
                moveTo(11.615f, 12.38f)
                lineToRelative(0.002f, -0.016f)
                arcToRelative(0.469f, 0.469f, 0.0f, false, false, -0.127f, -0.32f)
                lineToRelative(-1.046f, -2.8f)
                arcToRelative(0.69f, 0.69f, 0.0f, false, false, -0.627f, -0.474f)
                arcToRelative(0.696f, 0.696f, 0.0f, false, false, -0.653f, 0.447f)
                lineToRelative(-1.661f, 4.075f)
                arcToRelative(0.472f, 0.472f, 0.0f, false, false, 0.874f, 0.357f)
                lineToRelative(0.33f, -0.813f)
                horizontalLineToRelative(2.07f)
                lineToRelative(0.299f, 0.8f)
                arcToRelative(0.472f, 0.472f, 0.0f, true, false, 0.884f, -0.33f)
                lineToRelative(-0.345f, -0.926f)
                close()
                moveTo(8.293f, 9.302f)
                arcToRelative(0.472f, 0.472f, 0.0f, false, false, -0.471f, -0.472f)
                lineTo(4.577f, 8.83f)
                arcToRelative(0.472f, 0.472f, 0.0f, true, false, 0.0f, 0.944f)
                horizontalLineToRelative(1.16f)
                verticalLineToRelative(3.736f)
                arcToRelative(0.472f, 0.472f, 0.0f, false, false, 0.944f, 0.0f)
                lineTo(6.681f, 9.774f)
                horizontalLineToRelative(1.14f)
                curveToRelative(0.261f, 0.0f, 0.472f, -0.212f, 0.472f, -0.472f)
                close()
            }
        }
        .build()
        return _kakaoTalkFill!!
    }

private var _kakaoTalkFill: ImageVector? = null
