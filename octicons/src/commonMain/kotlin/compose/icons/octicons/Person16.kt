package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Person16: ImageVector
    get() {
        if (_person16 != null) {
            return _person16!!
        }
        _person16 = Builder(name = "Person16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.5f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 5.0f, 0.0f)
                close()
                moveTo(10.561f, 8.073f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.123f, 0.0f)
                arcToRelative(6.004f, 6.004f, 0.0f, false, false, -3.431f, 5.142f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.498f, 0.07f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 8.99f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.498f, -0.07f)
                arcToRelative(6.005f, 6.005f, 0.0f, false, false, -3.432f, -5.142f)
                close()
            }
        }
        .build()
        return _person16!!
    }

private var _person16: ImageVector? = null
