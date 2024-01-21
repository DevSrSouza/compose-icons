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

public val Octicons.XCircleFill12: ImageVector
    get() {
        if (_xCircleFill12 != null) {
            return _xCircleFill12!!
        }
        _xCircleFill12 = Builder(name = "XCircleFill12", defaultWidth = 12.0.dp, defaultHeight =
                12.0.dp, viewportWidth = 12.0f, viewportHeight = 12.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.757f, 10.243f)
                arcToRelative(6.001f, 6.001f, 0.0f, true, true, 8.488f, -8.486f)
                arcToRelative(6.001f, 6.001f, 0.0f, false, true, -8.488f, 8.486f)
                close()
                moveTo(6.0f, 4.763f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(2.763f, 4.0f)
                lineToRelative(2.0f, 2.0f)
                lineToRelative(-2.0f, 2.0f)
                lineTo(4.0f, 9.237f)
                lineToRelative(2.0f, -2.0f)
                lineToRelative(2.0f, 2.0f)
                lineTo(9.237f, 8.0f)
                lineToRelative(-2.0f, -2.0f)
                lineToRelative(2.0f, -2.0f)
                lineTo(8.0f, 2.763f)
                close()
            }
        }
        .build()
        return _xCircleFill12!!
    }

private var _xCircleFill12: ImageVector? = null
