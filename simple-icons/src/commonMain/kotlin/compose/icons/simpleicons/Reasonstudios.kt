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

public val SimpleIcons.Reasonstudios: ImageVector
    get() {
        if (_reasonstudios != null) {
            return _reasonstudios!!
        }
        _reasonstudios = Builder(name = "Reasonstudios", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.49f, 5.114f)
                lineToRelative(8.3f, -4.79f)
                arcToRelative(2.421f, 2.421f, 0.0f, false, true, 2.39f, -0.017f)
                lineToRelative(0.03f, 0.017f)
                lineToRelative(8.299f, 4.79f)
                curveToRelative(0.74f, 0.427f, 1.2f, 1.212f, 1.211f, 2.065f)
                verticalLineTo(16.79f)
                curveToRelative(0.0f, 0.854f, -0.451f, 1.645f, -1.184f, 2.08f)
                lineToRelative(-0.027f, 0.016f)
                lineToRelative(-8.299f, 4.79f)
                arcToRelative(2.42f, 2.42f, 0.0f, false, true, -2.39f, 0.017f)
                lineToRelative(-0.03f, -0.017f)
                lineToRelative(-8.3f, -4.79f)
                arcToRelative(2.421f, 2.421f, 0.0f, false, true, -1.21f, -2.065f)
                verticalLineTo(7.21f)
                curveToRelative(0.0f, -0.855f, 0.45f, -1.645f, 1.184f, -2.08f)
                lineToRelative(0.026f, -0.016f)
                lineToRelative(8.3f, -4.79f)
                close()
                moveTo(12.0f, 4.026f)
                lineTo(5.092f, 8.013f)
                verticalLineToRelative(7.974f)
                lineTo(12.0f, 19.974f)
                verticalLineTo(12.0f)
                lineToRelative(6.908f, -3.987f)
                close()
            }
        }
        .build()
        return _reasonstudios!!
    }

private var _reasonstudios: ImageVector? = null
