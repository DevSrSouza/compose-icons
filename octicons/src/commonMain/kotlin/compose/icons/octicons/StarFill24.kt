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

public val Octicons.StarFill24: ImageVector
    get() {
        if (_starFill24 != null) {
            return _starFill24!!
        }
        _starFill24 = Builder(name = "StarFill24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.672f, 0.668f)
                lineToRelative(3.059f, 6.197f)
                lineToRelative(6.838f, 0.993f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.416f, 1.28f)
                lineToRelative(-4.948f, 4.823f)
                lineToRelative(1.168f, 6.812f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.088f, 0.79f)
                lineTo(12.0f, 18.347f)
                lineToRelative(-6.116f, 3.216f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.088f, -0.791f)
                lineToRelative(1.168f, -6.811f)
                lineToRelative(-4.948f, -4.823f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, 0.416f, -1.279f)
                lineToRelative(6.838f, -0.994f)
                lineTo(11.327f, 0.668f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.345f, 0.0f)
                close()
            }
        }
        .build()
        return _starFill24!!
    }

private var _starFill24: ImageVector? = null
