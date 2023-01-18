package compose.icons.phosphoricons.duotone

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
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.MagnifyingGlass: ImageVector
    get() {
        if (_magnifyingGlass != null) {
            return _magnifyingGlass!!
        }
        _magnifyingGlass = Builder(name = "MagnifyingGlass", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(116.0f, 116.0f)
                moveToRelative(-84.0f, 0.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, 168.0f, 0.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, -168.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.7f, 218.3f)
                lineToRelative(-43.3f, -43.2f)
                arcToRelative(92.2f, 92.2f, 0.0f, true, false, -11.3f, 11.3f)
                lineToRelative(43.2f, 43.3f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 11.4f, 0.0f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 229.7f, 218.3f)
                close()
                moveTo(40.0f, 116.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, true, true, 76.0f, 76.0f)
                arcTo(76.1f, 76.1f, 0.0f, false, true, 40.0f, 116.0f)
                close()
            }
        }
        .build()
        return _magnifyingGlass!!
    }

private var _magnifyingGlass: ImageVector? = null
