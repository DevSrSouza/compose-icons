package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.Hexagon: ImageVector
    get() {
        if (_hexagon != null) {
            return _hexagon!!
        }
        _hexagon = Builder(name = "Hexagon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.05f, 3.0f)
                horizontalLineTo(7.95f)
                curveTo(7.24f, 3.0f, 6.58f, 3.38f, 6.22f, 4.0f)
                lineToRelative(-4.04f, 7.0f)
                curveToRelative(-0.36f, 0.62f, -0.36f, 1.38f, 0.0f, 2.0f)
                lineToRelative(4.04f, 7.0f)
                curveToRelative(0.36f, 0.62f, 1.02f, 1.0f, 1.73f, 1.0f)
                horizontalLineToRelative(8.09f)
                curveToRelative(0.71f, 0.0f, 1.37f, -0.38f, 1.73f, -1.0f)
                lineToRelative(4.04f, -7.0f)
                curveToRelative(0.36f, -0.62f, 0.36f, -1.38f, 0.0f, -2.0f)
                lineToRelative(-4.04f, -7.0f)
                curveTo(17.42f, 3.38f, 16.76f, 3.0f, 16.05f, 3.0f)
                close()
            }
        }
        .build()
        return _hexagon!!
    }

private var _hexagon: ImageVector? = null
