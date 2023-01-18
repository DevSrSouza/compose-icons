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

public val RemixIcons.Scissors2Fill: ImageVector
    get() {
        if (_scissors2Fill != null) {
            return _scissors2Fill!!
        }
        _scissors2Fill = Builder(name = "Scissors2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 14.121f)
                lineToRelative(-2.317f, 2.317f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -2.121f, -2.121f)
                lineTo(9.88f, 12.0f)
                lineTo(4.21f, 6.333f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.829f)
                lineToRelative(0.708f, -0.707f)
                lineTo(12.0f, 9.88f)
                lineToRelative(7.081f, -7.082f)
                lineToRelative(0.708f, 0.707f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 2.829f)
                lineTo(14.12f, 12.0f)
                lineToRelative(2.317f, 2.317f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -2.121f, 2.121f)
                lineTo(12.0f, 14.12f)
                close()
                moveTo(6.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                close()
                moveTo(18.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                close()
            }
        }
        .build()
        return _scissors2Fill!!
    }

private var _scissors2Fill: ImageVector? = null
