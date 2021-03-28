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

public val Octicons.Location16: ImageVector
    get() {
        if (_location16 != null) {
            return _location16!!
        }
        _location16 = Builder(name = "Location16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.536f, 3.464f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, 7.072f)
                lineTo(8.0f, 14.07f)
                lineToRelative(-3.536f, -3.535f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 7.072f, -7.072f)
                verticalLineToRelative(0.001f)
                close()
                moveTo(12.596f, 11.596f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, false, -9.192f, 0.0f)
                lineToRelative(3.535f, 3.536f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.122f, 0.0f)
                lineToRelative(3.535f, -3.536f)
                close()
                moveTo(8.0f, 9.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                close()
            }
        }
        .build()
        return _location16!!
    }

private var _location16: ImageVector? = null
