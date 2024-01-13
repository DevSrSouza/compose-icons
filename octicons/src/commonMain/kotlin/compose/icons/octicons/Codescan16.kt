package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Codescan16: ImageVector
    get() {
        if (_codescan16 != null) {
            return _codescan16!!
        }
        _codescan16 = Builder(name = "Codescan16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.47f, 4.97f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.06f)
                lineTo(9.94f, 7.5f)
                lineTo(8.47f, 8.97f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, 1.06f)
                lineToRelative(2.0f, -2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.06f)
                lineToRelative(-2.0f, -2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 0.0f)
                close()
                moveTo(6.53f, 6.03f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, -1.06f)
                lineToRelative(-2.0f, 2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.06f)
                lineToRelative(2.0f, 2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, -1.06f)
                lineTo(5.06f, 7.5f)
                lineToRelative(1.47f, -1.47f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.246f, 13.307f)
                arcToRelative(7.501f, 7.501f, 0.0f, true, true, 1.06f, -1.06f)
                lineToRelative(2.474f, 2.473f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.326f, 1.275f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.734f, -0.215f)
                close()
                moveTo(1.5f, 7.5f)
                arcToRelative(6.002f, 6.002f, 0.0f, false, false, 3.608f, 5.504f)
                arcToRelative(6.002f, 6.002f, 0.0f, false, false, 6.486f, -1.117f)
                arcToRelative(0.748f, 0.748f, 0.0f, false, true, 0.292f, -0.293f)
                arcTo(6.0f, 6.0f, 0.0f, true, false, 1.5f, 7.5f)
                close()
            }
        }
        .build()
        return _codescan16!!
    }

private var _codescan16: ImageVector? = null
