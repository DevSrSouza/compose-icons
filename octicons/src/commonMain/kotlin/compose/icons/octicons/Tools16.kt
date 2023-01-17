package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Tools16: ImageVector
    get() {
        if (_tools16 != null) {
            return _tools16!!
        }
        _tools16 = Builder(name = "Tools16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.433f, 2.304f)
                arcTo(4.492f, 4.492f, 0.0f, false, false, 3.5f, 6.0f)
                curveToRelative(0.0f, 1.598f, 0.832f, 3.002f, 2.09f, 3.802f)
                curveToRelative(0.518f, 0.328f, 0.929f, 0.923f, 0.902f, 1.64f)
                verticalLineToRelative(0.008f)
                lineToRelative(-0.164f, 3.337f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.498f, -0.073f)
                lineToRelative(0.163f, -3.33f)
                curveToRelative(0.002f, -0.085f, -0.05f, -0.216f, -0.207f, -0.316f)
                arcTo(5.996f, 5.996f, 0.0f, false, true, 2.0f, 6.0f)
                arcToRelative(5.993f, 5.993f, 0.0f, false, true, 2.567f, -4.92f)
                arcToRelative(1.482f, 1.482f, 0.0f, false, true, 1.673f, -0.04f)
                curveToRelative(0.462f, 0.296f, 0.76f, 0.827f, 0.76f, 1.423f)
                verticalLineToRelative(2.82f)
                curveToRelative(0.0f, 0.082f, 0.041f, 0.16f, 0.11f, 0.206f)
                lineToRelative(0.75f, 0.51f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.28f, 0.0f)
                lineToRelative(0.75f, -0.51f)
                arcTo(0.249f, 0.249f, 0.0f, false, false, 9.0f, 5.282f)
                verticalLineTo(2.463f)
                curveToRelative(0.0f, -0.596f, 0.298f, -1.127f, 0.76f, -1.423f)
                arcToRelative(1.482f, 1.482f, 0.0f, false, true, 1.673f, 0.04f)
                arcTo(5.993f, 5.993f, 0.0f, false, true, 14.0f, 6.0f)
                arcToRelative(5.996f, 5.996f, 0.0f, false, true, -2.786f, 5.068f)
                curveToRelative(-0.157f, 0.1f, -0.209f, 0.23f, -0.207f, 0.315f)
                lineToRelative(0.163f, 3.33f)
                arcToRelative(0.752f, 0.752f, 0.0f, false, true, -1.094f, 0.714f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.404f, -0.64f)
                lineToRelative(-0.164f, -3.345f)
                curveToRelative(-0.027f, -0.717f, 0.384f, -1.312f, 0.902f, -1.64f)
                arcTo(4.495f, 4.495f, 0.0f, false, false, 12.5f, 6.0f)
                arcToRelative(4.492f, 4.492f, 0.0f, false, false, -1.933f, -3.696f)
                curveToRelative(-0.024f, 0.017f, -0.067f, 0.067f, -0.067f, 0.16f)
                verticalLineToRelative(2.818f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -0.767f, 1.448f)
                lineToRelative(-0.75f, 0.51f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -1.966f, 0.0f)
                lineToRelative(-0.75f, -0.51f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 5.5f, 5.282f)
                verticalLineTo(2.463f)
                curveToRelative(0.0f, -0.092f, -0.043f, -0.142f, -0.067f, -0.159f)
                close()
            }
        }
        .build()
        return _tools16!!
    }

private var _tools16: ImageVector? = null
