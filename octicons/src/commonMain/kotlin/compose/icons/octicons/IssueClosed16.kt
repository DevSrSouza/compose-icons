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

public val Octicons.IssueClosed16: ImageVector
    get() {
        if (_issueClosed16 != null) {
            return _issueClosed16!!
        }
        _issueClosed16 = Builder(name = "IssueClosed16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.5f, 8.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 10.65f, -5.003f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.959f, -1.153f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 2.592f, 8.33f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.444f, -0.407f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 1.5f, 8.0f)
                close()
                moveTo(8.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                close()
                moveTo(8.0f, 4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.5f, 0.0f)
                verticalLineToRelative(-3.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 8.0f, 4.0f)
                close()
                moveTo(12.78f, 8.28f)
                lineToRelative(3.0f, -3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, -1.06f)
                lineToRelative(-2.47f, 2.47f)
                lineToRelative(-0.97f, -0.97f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(1.5f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, 0.0f)
                close()
            }
        }
        .build()
        return _issueClosed16!!
    }

private var _issueClosed16: ImageVector? = null
