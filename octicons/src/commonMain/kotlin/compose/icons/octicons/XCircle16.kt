package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.XCircle16: ImageVector
    get() {
        if (_xCircle16 != null) {
            return _xCircle16!!
        }
        _xCircle16 = Builder(name = "XCircle16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.404f, 12.596f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, true, 9.192f, -9.192f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, -9.192f, 9.192f)
                close()
                moveTo(2.344f, 2.343f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.313f, 11.314f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 2.343f, 2.343f)
                close()
                moveTo(6.03f, 4.97f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 1.06f)
                lineTo(6.94f, 8.0f)
                lineTo(4.97f, 9.97f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, 1.06f)
                lineTo(8.0f, 9.06f)
                lineToRelative(1.97f, 1.97f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, -1.06f)
                lineTo(9.06f, 8.0f)
                lineToRelative(1.97f, -1.97f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, -1.06f)
                lineTo(8.0f, 6.94f)
                lineTo(6.03f, 4.97f)
                close()
            }
        }
        .build()
        return _xCircle16!!
    }

private var _xCircle16: ImageVector? = null
