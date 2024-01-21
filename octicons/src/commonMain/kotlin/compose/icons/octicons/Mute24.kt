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

public val Octicons.Mute24: ImageVector
    get() {
        if (_mute24 != null) {
            return _mute24!!
        }
        _mute24 = Builder(name = "Mute24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.75f)
                verticalLineToRelative(16.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.255f, 0.555f)
                lineTo(5.46f, 16.0f)
                horizontalLineTo(2.75f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 1.0f, 14.25f)
                verticalLineToRelative(-4.5f)
                curveTo(1.0f, 8.784f, 1.784f, 8.0f, 2.75f, 8.0f)
                horizontalLineToRelative(2.71f)
                lineToRelative(5.285f, -4.805f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 12.0f, 3.75f)
                close()
                moveTo(6.255f, 9.305f)
                arcToRelative(0.748f, 0.748f, 0.0f, false, true, -0.505f, 0.195f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.187f, 0.0f, 0.367f, 0.069f, 0.505f, 0.195f)
                lineToRelative(4.245f, 3.86f)
                verticalLineTo(5.445f)
                close()
                moveTo(16.28f, 8.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineTo(17.94f, 12.0f)
                lineToRelative(-2.72f, 2.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, 1.06f)
                lineTo(19.0f, 13.06f)
                lineToRelative(2.72f, 2.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, -1.06f)
                lineTo(20.06f, 12.0f)
                lineToRelative(2.72f, -2.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, -1.06f)
                lineTo(19.0f, 10.94f)
                lineToRelative(-2.72f, -2.72f)
                close()
            }
        }
        .build()
        return _mute24!!
    }

private var _mute24: ImageVector? = null
