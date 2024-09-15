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

public val SimpleIcons.Nucleo: ImageVector
    get() {
        if (_nucleo != null) {
            return _nucleo!!
        }
        _nucleo = Builder(name = "Nucleo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.799f, 12.0f)
                arcTo(1.799f, 1.799f, 0.0f, false, true, 12.0f, 13.799f)
                arcTo(1.799f, 1.799f, 0.0f, false, true, 10.201f, 12.0f)
                arcTo(1.799f, 1.799f, 0.0f, false, true, 12.0f, 10.201f)
                arcTo(1.799f, 1.799f, 0.0f, false, true, 13.799f, 12.0f)
                moveToRelative(1.473f, 3.262f)
                arcToRelative(35.222f, 35.222f, 0.0f, false, true, -3.313f, 2.962f)
                arcToRelative(44.077f, 44.077f, 0.0f, false, true, -3.313f, -2.962f)
                arcToRelative(35.213f, 35.213f, 0.0f, false, true, -2.961f, -3.313f)
                arcTo(35.213f, 35.213f, 0.0f, false, true, 8.647f, 8.637f)
                arcToRelative(43.934f, 43.934f, 0.0f, false, true, 3.313f, -2.961f)
                arcToRelative(43.934f, 43.934f, 0.0f, false, true, 3.313f, 2.961f)
                arcToRelative(35.129f, 35.129f, 0.0f, false, true, 2.961f, 3.313f)
                arcToRelative(29.265f, 29.265f, 0.0f, false, true, -2.961f, 3.313f)
                moveToRelative(1.004f, -7.581f)
                arcToRelative(40.918f, 40.918f, 0.0f, false, false, -3.162f, -2.861f)
                curveToRelative(2.961f, -2.159f, 5.722f, -3.463f, 7.629f, -3.463f)
                arcToRelative(1.889f, 1.889f, 0.0f, false, true, 1.405f, 0.452f)
                curveToRelative(1.104f, 1.104f, 0.251f, 4.266f, -2.359f, 8.08f)
                horizontalLineToRelative(1.656f)
                arcToRelative(25.097f, 25.097f, 0.0f, false, false, 1.405f, -2.459f)
                curveToRelative(1.405f, -3.011f, 1.506f, -5.32f, 0.3f, -6.575f)
                arcToRelative(3.659f, 3.659f, 0.0f, false, false, -2.458f, -0.852f)
                curveToRelative(-3.212f, 0.0f, -8.333f, 3.011f, -13.0f, 7.677f)
                arcToRelative(40.918f, 40.918f, 0.0f, false, false, -2.861f, 3.162f)
                curveTo(1.721f, 6.579f, 0.667f, 2.966f, 1.821f, 1.811f)
                arcToRelative(1.969f, 1.969f, 0.0f, false, true, 1.405f, -0.452f)
                curveToRelative(1.707f, 0.0f, 4.116f, 1.054f, 6.675f, 2.811f)
                verticalLineTo(2.564f)
                curveTo(7.392f, 0.908f, 5.034f, 0.004f, 3.226f, 0.004f)
                arcToRelative(3.229f, 3.229f, 0.0f, false, false, -2.359f, 0.854f)
                curveToRelative(-1.255f, 1.255f, -1.103f, 3.563f, 0.302f, 6.575f)
                curveToRelative(1.304f, 2.811f, 3.664f, 5.922f, 6.524f, 8.834f)
                arcToRelative(40.918f, 40.918f, 0.0f, false, false, 3.162f, 2.861f)
                curveToRelative(-2.911f, 2.159f, -5.722f, 3.463f, -7.629f, 3.463f)
                arcToRelative(1.892f, 1.892f, 0.0f, false, true, -1.405f, -0.454f)
                curveToRelative(-1.104f, -1.104f, -0.251f, -4.266f, 2.359f, -8.081f)
                horizontalLineTo(2.574f)
                arcToRelative(25.167f, 25.167f, 0.0f, false, false, -1.405f, 2.459f)
                curveToRelative(-1.405f, 3.014f, -1.506f, 5.322f, -0.302f, 6.578f)
                arcToRelative(3.232f, 3.232f, 0.0f, false, false, 2.359f, 0.853f)
                curveToRelative(3.212f, 0.0f, 8.332f, -3.011f, 13.0f, -7.677f)
                arcToRelative(40.808f, 40.808f, 0.0f, false, false, 2.861f, -3.162f)
                curveToRelative(3.109f, 4.265f, 4.166f, 7.878f, 3.011f, 9.03f)
                arcToRelative(1.89f, 1.89f, 0.0f, false, true, -1.405f, 0.452f)
                curveToRelative(-1.706f, 0.0f, -4.116f, -1.054f, -6.676f, -2.811f)
                verticalLineToRelative(1.656f)
                curveToRelative(2.56f, 1.609f, 4.919f, 2.562f, 6.676f, 2.562f)
                arcToRelative(3.229f, 3.229f, 0.0f, false, false, 2.359f, -0.854f)
                curveToRelative(1.255f, -1.255f, 1.104f, -3.563f, -0.3f, -6.575f)
                curveToRelative(-1.256f, -2.861f, -3.615f, -5.973f, -6.476f, -8.886f)
                close()
            }
        }
        .build()
        return _nucleo!!
    }

private var _nucleo: ImageVector? = null
