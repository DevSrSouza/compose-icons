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

public val RoundGroup.ThumbsUpDown: ImageVector
    get() {
        if (_thumbsUpDown != null) {
            return _thumbsUpDown!!
        }
        _thumbsUpDown = Builder(name = "ThumbsUpDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.06f, 5.0f)
                horizontalLineTo(5.82f)
                lineToRelative(0.66f, -3.18f)
                curveToRelative(0.08f, -0.37f, -0.04f, -0.75f, -0.3f, -1.02f)
                curveTo(5.74f, 0.36f, 5.03f, 0.36f, 4.6f, 0.8f)
                lineToRelative(-4.0f, 4.0f)
                curveToRelative(-0.39f, 0.37f, -0.6f, 0.88f, -0.6f, 1.41f)
                verticalLineTo(12.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(5.92f)
                curveToRelative(0.8f, 0.0f, 1.52f, -0.48f, 1.84f, -1.21f)
                lineToRelative(2.14f, -5.0f)
                curveTo(12.46f, 6.47f, 11.49f, 5.0f, 10.06f, 5.0f)
                close()
                moveTo(22.0f, 10.0f)
                horizontalLineToRelative(-5.92f)
                curveToRelative(-0.8f, 0.0f, -1.52f, 0.48f, -1.84f, 1.21f)
                lineToRelative(-2.14f, 5.0f)
                curveToRelative(-0.56f, 1.32f, 0.4f, 2.79f, 1.84f, 2.79f)
                horizontalLineToRelative(4.24f)
                lineToRelative(-0.66f, 3.18f)
                curveToRelative(-0.08f, 0.37f, 0.04f, 0.75f, 0.3f, 1.02f)
                curveToRelative(0.44f, 0.44f, 1.15f, 0.44f, 1.58f, 0.0f)
                lineToRelative(4.0f, -4.0f)
                curveToRelative(0.38f, -0.38f, 0.59f, -0.88f, 0.59f, -1.41f)
                verticalLineTo(12.0f)
                curveToRelative(0.01f, -1.1f, -0.89f, -2.0f, -1.99f, -2.0f)
                close()
            }
        }
        .build()
        return _thumbsUpDown!!
    }

private var _thumbsUpDown: ImageVector? = null
