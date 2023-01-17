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

public val Octicons.FeedForked16: ImageVector
    get() {
        if (_feedForked16 != null) {
            return _feedForked16!!
        }
        _feedForked16 = Builder(name = "FeedForked16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 16.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 8.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(6.0f, 6.928f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, -1.0f, 0.0f)
                verticalLineTo(7.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.5f, 9.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.072f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 1.0f, 0.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.0f, 7.5f)
                verticalLineToRelative(-0.572f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, -1.0f, 0.0f)
                verticalLineTo(7.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                close()
            }
        }
        .build()
        return _feedForked16!!
    }

private var _feedForked16: ImageVector? = null
