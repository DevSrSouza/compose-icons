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

public val RemixIcons.PantoneLine: ImageVector
    get() {
        if (_pantoneLine != null) {
            return _pantoneLine!!
        }
        _pantoneLine = Builder(name = "PantoneLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.764f, 8.0f)
                lineToRelative(-0.295f, -0.73f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.553f, -1.302f)
                lineToRelative(9.272f, -3.746f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.301f, 0.552f)
                lineToRelative(5.62f, 13.908f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.553f, 1.302f)
                lineTo(12.39f, 21.73f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.302f, -0.553f)
                lineTo(11.0f, 20.96f)
                lineTo(11.0f, 21.0f)
                lineTo(7.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-0.27f)
                lineToRelative(-3.35f, -1.353f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.552f, -1.302f)
                lineTo(5.764f, 8.0f)
                close()
                moveTo(8.0f, 19.0f)
                horizontalLineToRelative(2.209f)
                lineTo(8.0f, 13.533f)
                lineTo(8.0f, 19.0f)
                close()
                moveTo(6.0f, 12.756f)
                lineToRelative(-1.673f, 4.141f)
                lineTo(6.0f, 17.608f)
                verticalLineToRelative(-4.852f)
                close()
                moveTo(7.698f, 7.447f)
                lineToRelative(4.87f, 12.054f)
                lineToRelative(7.418f, -2.997f)
                lineToRelative(-4.87f, -12.053f)
                lineToRelative(-7.418f, 2.996f)
                close()
                moveTo(10.676f, 9.48f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -0.749f, -1.855f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.75f, 1.855f)
                close()
            }
        }
        .build()
        return _pantoneLine!!
    }

private var _pantoneLine: ImageVector? = null
