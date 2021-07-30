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

public val SimpleIcons.Asus: ImageVector
    get() {
        if (_asus != null) {
            return _asus!!
        }
        _asus = Builder(name = "Asus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.904f, 10.788f)
                lineTo(23.904f, 9.522f)
                horizontalLineToRelative(-4.656f)
                curveToRelative(-0.972f, 0.0f, -1.41f, 0.6f, -1.482f, 1.182f)
                verticalLineToRelative(0.018f)
                verticalLineToRelative(-1.2f)
                horizontalLineToRelative(-1.368f)
                verticalLineToRelative(1.266f)
                horizontalLineToRelative(1.362f)
                close()
                moveTo(17.76f, 11.244f)
                lineToRelative(-1.368f, -0.078f)
                verticalLineToRelative(1.458f)
                curveToRelative(0.0f, 0.456f, -0.228f, 0.594f, -1.02f, 0.594f)
                lineTo(14.28f, 13.218f)
                curveToRelative(-0.654f, 0.0f, -0.93f, -0.186f, -0.93f, -0.594f)
                verticalLineToRelative(-1.596f)
                lineToRelative(-1.386f, -0.102f)
                verticalLineToRelative(1.812f)
                horizontalLineToRelative(-0.03f)
                curveToRelative(-0.078f, -0.528f, -0.276f, -1.14f, -1.596f, -1.23f)
                lineTo(6.0f, 11.22f)
                curveToRelative(0.0f, 0.666f, 0.474f, 1.062f, 1.218f, 1.14f)
                lineToRelative(3.024f, 0.306f)
                curveToRelative(0.24f, 0.018f, 0.414f, 0.09f, 0.414f, 0.288f)
                curveToRelative(0.0f, 0.216f, -0.18f, 0.24f, -0.456f, 0.24f)
                lineTo(5.946f, 13.194f)
                lineTo(5.946f, 11.22f)
                lineToRelative(-1.386f, -0.09f)
                verticalLineToRelative(3.348f)
                horizontalLineToRelative(5.646f)
                curveToRelative(1.26f, 0.0f, 1.662f, -0.654f, 1.722f, -1.2f)
                horizontalLineToRelative(0.03f)
                curveToRelative(0.156f, 0.864f, 0.912f, 1.2f, 2.19f, 1.2f)
                horizontalLineToRelative(1.41f)
                curveToRelative(1.494f, 0.0f, 2.202f, -0.456f, 2.202f, -1.524f)
                close()
                moveTo(22.158f, 11.502f)
                lineToRelative(-4.338f, -0.258f)
                curveToRelative(0.0f, 0.666f, 0.438f, 1.11f, 1.182f, 1.17f)
                lineToRelative(3.09f, 0.24f)
                curveToRelative(0.24f, 0.018f, 0.384f, 0.078f, 0.384f, 0.276f)
                curveToRelative(0.0f, 0.186f, -0.168f, 0.258f, -0.516f, 0.258f)
                horizontalLineToRelative(-4.212f)
                verticalLineToRelative(1.29f)
                horizontalLineToRelative(4.302f)
                curveToRelative(1.356f, 0.0f, 1.95f, -0.474f, 1.95f, -1.554f)
                curveToRelative(0.0f, -0.972f, -0.534f, -1.338f, -1.842f, -1.422f)
                close()
                moveTo(11.964f, 9.522f)
                horizontalLineToRelative(1.386f)
                verticalLineToRelative(1.266f)
                horizontalLineToRelative(-1.386f)
                close()
                moveTo(3.798f, 11.07f)
                lineToRelative(-1.506f, -0.15f)
                lineTo(0.0f, 14.478f)
                horizontalLineToRelative(1.686f)
                close()
                moveTo(11.712f, 9.522f)
                horizontalLineToRelative(-4.23f)
                curveToRelative(-0.984f, 0.0f, -1.416f, 0.612f, -1.518f, 1.2f)
                verticalLineToRelative(-1.2f)
                lineTo(3.618f, 9.522f)
                curveToRelative(-0.33f, 0.0f, -0.486f, 0.102f, -0.642f, 0.33f)
                lineToRelative(-0.648f, 0.936f)
                horizontalLineToRelative(9.384f)
                close()
            }
        }
        .build()
        return _asus!!
    }

private var _asus: ImageVector? = null
