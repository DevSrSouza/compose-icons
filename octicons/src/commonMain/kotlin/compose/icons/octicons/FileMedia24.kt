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

public val Octicons.FileMedia24: ImageVector
    get() {
        if (_fileMedia24 != null) {
            return _fileMedia24!!
        }
        _fileMedia24 = Builder(name = "FileMedia24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.75f, 21.5f)
                lineTo(2.25f, 21.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 0.5f, 19.75f)
                lineTo(0.5f, 4.25f)
                curveToRelative(0.0f, -0.966f, 0.784f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(19.5f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(15.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -1.75f, 1.75f)
                close()
                moveTo(2.25f, 4.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(15.5f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(3.178f)
                lineTo(14.0f, 10.977f)
                arcToRelative(1.749f, 1.749f, 0.0f, false, true, 2.506f, -0.032f)
                lineTo(22.0f, 16.44f)
                lineTo(22.0f, 4.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                close()
                moveTo(22.0f, 19.75f)
                verticalLineToRelative(-1.19f)
                lineToRelative(-6.555f, -6.554f)
                arcToRelative(0.248f, 0.248f, 0.0f, false, false, -0.18f, -0.073f)
                arcToRelative(0.247f, 0.247f, 0.0f, false, false, -0.178f, 0.077f)
                lineTo(7.497f, 20.0f)
                lineTo(21.75f, 20.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                close()
                moveTo(10.5f, 9.25f)
                arcToRelative(3.25f, 3.25f, 0.0f, true, true, -6.5f, 0.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 6.5f, 0.0f)
                close()
                moveTo(9.0f, 9.25f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, -3.501f, 0.001f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 9.0f, 9.25f)
                close()
            }
        }
        .build()
        return _fileMedia24!!
    }

private var _fileMedia24: ImageVector? = null
