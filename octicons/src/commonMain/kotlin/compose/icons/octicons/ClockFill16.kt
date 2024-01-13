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

public val Octicons.ClockFill16: ImageVector
    get() {
        if (_clockFill16 != null) {
            return _clockFill16!!
        }
        _clockFill16 = Builder(name = "ClockFill16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 16.0f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 0.0f, 8.0f)
                close()
                moveTo(8.575f, 4.75f)
                arcToRelative(0.825f, 0.825f, 0.0f, true, false, -1.65f, 0.0f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 0.337f, 0.205f, 0.64f, 0.519f, 0.766f)
                lineToRelative(2.5f, 1.0f)
                arcToRelative(0.825f, 0.825f, 0.0f, false, false, 0.612f, -1.532f)
                lineToRelative(-1.981f, -0.793f)
                close()
            }
        }
        .build()
        return _clockFill16!!
    }

private var _clockFill16: ImageVector? = null
