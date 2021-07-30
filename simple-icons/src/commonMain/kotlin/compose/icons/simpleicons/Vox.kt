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

public val SimpleIcons.Vox: ImageVector
    get() {
        if (_vox != null) {
            return _vox!!
        }
        _vox = Builder(name = "Vox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 8.198f)
                lineToRelative(4.182f, 7.604f)
                horizontalLineToRelative(2.442f)
                lineTo(8.15f, 13.07f)
                arcToRelative(4.276f, 4.276f, 0.0f, false, true, 2.054f, -4.872f)
                lineTo(7.112f, 8.198f)
                lineToRelative(-1.677f, 3.216f)
                lineToRelative(-1.706f, -3.216f)
                close()
                moveTo(14.342f, 8.198f)
                arcToRelative(4.24f, 4.24f, 0.0f, false, true, 1.923f, 2.206f)
                curveToRelative(0.784f, 2.081f, -0.098f, 4.415f, -2.145f, 5.398f)
                horizontalLineToRelative(2.767f)
                lineToRelative(1.564f, -1.754f)
                lineToRelative(1.42f, 1.754f)
                lineTo(24.0f, 15.802f)
                lineToRelative(-3.505f, -4.032f)
                lineToRelative(3.088f, -3.572f)
                lineTo(19.41f, 8.198f)
                lineToRelative(-0.952f, 1.249f)
                lineToRelative(-0.931f, -1.249f)
                close()
                moveTo(12.252f, 9.794f)
                curveToRelative(-0.949f, 0.0f, -1.913f, 0.69f, -2.074f, 1.775f)
                arcToRelative(2.132f, 2.132f, 0.0f, false, false, 2.064f, 2.483f)
                curveToRelative(1.268f, 0.01f, 2.192f, -1.126f, 2.156f, -2.18f)
                curveToRelative(-0.013f, -1.015f, -0.877f, -2.08f, -2.146f, -2.078f)
                close()
            }
        }
        .build()
        return _vox!!
    }

private var _vox: ImageVector? = null
