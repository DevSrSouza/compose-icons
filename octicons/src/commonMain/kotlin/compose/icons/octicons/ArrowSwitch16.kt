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

public val Octicons.ArrowSwitch16: ImageVector
    get() {
        if (_arrowSwitch16 != null) {
            return _arrowSwitch16!!
        }
        _arrowSwitch16 = Builder(name = "ArrowSwitch16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.22f, 14.78f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                lineTo(4.56f, 12.0f)
                horizontalLineToRelative(8.69f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(4.56f, 10.5f)
                lineToRelative(1.72f, -1.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, -1.06f)
                lineToRelative(-3.0f, 3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.06f)
                lineToRelative(3.0f, 3.0f)
                close()
                moveTo(10.78f, 8.28f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, -1.06f)
                lineToRelative(1.72f, -1.72f)
                lineTo(2.75f, 5.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(8.69f)
                lineTo(9.72f, 2.28f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, -1.06f)
                lineToRelative(3.0f, 3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.06f)
                lineToRelative(-3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _arrowSwitch16!!
    }

private var _arrowSwitch16: ImageVector? = null
