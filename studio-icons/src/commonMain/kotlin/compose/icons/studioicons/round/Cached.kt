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

public val RoundGroup.Cached: ImageVector
    get() {
        if (_cached != null) {
            return _cached!!
        }
        _cached = Builder(name = "Cached", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.65f, 8.35f)
                lineToRelative(-2.79f, 2.79f)
                curveToRelative(-0.32f, 0.32f, -0.1f, 0.86f, 0.35f, 0.86f)
                horizontalLineTo(18.0f)
                curveToRelative(0.0f, 3.31f, -2.69f, 6.0f, -6.0f, 6.0f)
                curveToRelative(-0.79f, 0.0f, -1.56f, -0.15f, -2.25f, -0.44f)
                curveToRelative(-0.36f, -0.15f, -0.77f, -0.04f, -1.04f, 0.23f)
                curveToRelative(-0.51f, 0.51f, -0.33f, 1.37f, 0.34f, 1.64f)
                curveToRelative(0.91f, 0.37f, 1.91f, 0.57f, 2.95f, 0.57f)
                curveToRelative(4.42f, 0.0f, 8.0f, -3.58f, 8.0f, -8.0f)
                horizontalLineToRelative(1.79f)
                curveToRelative(0.45f, 0.0f, 0.67f, -0.54f, 0.35f, -0.85f)
                lineToRelative(-2.79f, -2.79f)
                curveToRelative(-0.19f, -0.2f, -0.51f, -0.2f, -0.7f, -0.01f)
                close()
                moveTo(6.0f, 12.0f)
                curveToRelative(0.0f, -3.31f, 2.69f, -6.0f, 6.0f, -6.0f)
                curveToRelative(0.79f, 0.0f, 1.56f, 0.15f, 2.25f, 0.44f)
                curveToRelative(0.36f, 0.15f, 0.77f, 0.04f, 1.04f, -0.23f)
                curveToRelative(0.51f, -0.51f, 0.33f, -1.37f, -0.34f, -1.64f)
                curveTo(14.04f, 4.2f, 13.04f, 4.0f, 12.0f, 4.0f)
                curveToRelative(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f)
                horizontalLineTo(2.21f)
                curveToRelative(-0.45f, 0.0f, -0.67f, 0.54f, -0.35f, 0.85f)
                lineToRelative(2.79f, 2.79f)
                curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0.0f)
                lineToRelative(2.79f, -2.79f)
                curveToRelative(0.31f, -0.31f, 0.09f, -0.85f, -0.36f, -0.85f)
                horizontalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _cached!!
    }

private var _cached: ImageVector? = null
