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

public val RemixIcons.EditCircleLine: ImageVector
    get() {
        if (_editCircleLine != null) {
            return _editCircleLine!!
        }
        _editCircleLine = Builder(name = "EditCircleLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.684f, 4.029f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 7.287f, 7.287f)
                arcToRelative(7.936f, 7.936f, 0.0f, false, false, -0.603f, -2.44f)
                lineToRelative(1.5f, -1.502f)
                arcTo(9.933f, 9.933f, 0.0f, false, true, 22.0f, 12.0f)
                curveToRelative(0.0f, 5.523f, -4.477f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveTo(2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                arcToRelative(9.982f, 9.982f, 0.0f, false, true, 4.626f, 1.132f)
                lineToRelative(-1.501f, 1.5f)
                arcToRelative(7.941f, 7.941f, 0.0f, false, false, -2.44f, -0.603f)
                close()
                moveTo(20.485f, 2.1f)
                lineTo(21.9f, 3.515f)
                lineToRelative(-9.192f, 9.192f)
                lineToRelative(-1.412f, 0.003f)
                lineToRelative(-0.002f, -1.417f)
                lineTo(20.485f, 2.1f)
                close()
            }
        }
        .build()
        return _editCircleLine!!
    }

private var _editCircleLine: ImageVector? = null
