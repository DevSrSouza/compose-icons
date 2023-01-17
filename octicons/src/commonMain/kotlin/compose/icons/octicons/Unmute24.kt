package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Unmute24: ImageVector
    get() {
        if (_unmute24 != null) {
            return _unmute24!!
        }
        _unmute24 = Builder(name = "Unmute24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.553f, 3.064f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 12.0f, 3.75f)
                verticalLineToRelative(16.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.255f, 0.555f)
                lineTo(5.46f, 16.0f)
                lineTo(2.75f, 16.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 1.0f, 14.25f)
                verticalLineToRelative(-4.5f)
                curveTo(1.0f, 8.784f, 1.784f, 8.0f, 2.75f, 8.0f)
                horizontalLineToRelative(2.71f)
                lineToRelative(5.285f, -4.805f)
                arcToRelative(0.752f, 0.752f, 0.0f, false, true, 0.808f, -0.13f)
                close()
                moveTo(10.5f, 5.445f)
                lineToRelative(-4.245f, 3.86f)
                arcToRelative(0.748f, 0.748f, 0.0f, false, true, -0.505f, 0.195f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.187f, 0.0f, 0.367f, 0.069f, 0.505f, 0.195f)
                lineToRelative(4.245f, 3.86f)
                close()
                moveTo(18.718f, 4.222f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, 0.0f)
                curveToRelative(4.296f, 4.296f, 4.296f, 11.26f, 0.0f, 15.556f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, -1.06f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, false, 0.0f, -13.436f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.06f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.243f, 7.757f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.061f, 1.061f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 0.0f, 6.364f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, 1.06f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -8.485f)
                close()
            }
        }
        .build()
        return _unmute24!!
    }

private var _unmute24: ImageVector? = null
