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

public val RoundGroup.Rtt: ImageVector
    get() {
        if (_rtt != null) {
            return _rtt!!
        }
        _rtt = Builder(name = "Rtt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.76f, 4.69f)
                lineTo(8.15f, 8.58f)
                curveToRelative(-0.12f, 0.78f, 0.48f, 1.49f, 1.28f, 1.49f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.64f, 0.0f, 1.18f, -0.46f, 1.28f, -1.09f)
                lineToRelative(0.53f, -3.41f)
                horizontalLineToRelative(2.58f)
                lineTo(11.8f, 18.43f)
                horizontalLineToRelative(-1.24f)
                curveToRelative(-0.63f, 0.0f, -1.16f, 0.46f, -1.26f, 1.08f)
                lineToRelative(0.0f, 0.01f)
                curveTo(9.17f, 20.3f, 9.77f, 21.0f, 10.56f, 21.0f)
                horizontalLineToRelative(4.67f)
                curveToRelative(0.63f, 0.0f, 1.17f, -0.46f, 1.26f, -1.08f)
                lineToRelative(0.0f, -0.01f)
                curveToRelative(0.12f, -0.78f, -0.48f, -1.48f, -1.26f, -1.48f)
                horizontalLineToRelative(-0.86f)
                lineToRelative(2.0f, -12.86f)
                horizontalLineToRelative(2.58f)
                lineToRelative(-0.47f, 3.01f)
                curveToRelative(-0.12f, 0.78f, 0.48f, 1.49f, 1.28f, 1.49f)
                horizontalLineToRelative(0.03f)
                curveToRelative(0.64f, 0.0f, 1.18f, -0.46f, 1.28f, -1.09f)
                lineToRelative(0.57f, -3.67f)
                curveTo(21.83f, 4.09f, 20.89f, 3.0f, 19.66f, 3.0f)
                horizontalLineToRelative(-8.92f)
                curveTo(9.76f, 3.0f, 8.92f, 3.72f, 8.76f, 4.69f)
                close()
                moveTo(8.0f, 5.0f)
                horizontalLineTo(4.86f)
                curveTo(4.36f, 5.0f, 3.94f, 5.36f, 3.87f, 5.85f)
                lineToRelative(0.0f, 0.0f)
                curveTo(3.77f, 6.45f, 4.24f, 7.0f, 4.86f, 7.0f)
                horizontalLineToRelative(2.83f)
                lineTo(8.0f, 5.0f)
                close()
                moveTo(7.39f, 9.0f)
                horizontalLineTo(4.25f)
                curveTo(3.75f, 9.0f, 3.33f, 9.36f, 3.26f, 9.85f)
                lineToRelative(0.0f, 0.0f)
                curveTo(3.16f, 10.45f, 3.63f, 11.0f, 4.25f, 11.0f)
                horizontalLineToRelative(2.83f)
                lineTo(7.39f, 9.0f)
                close()
                moveTo(8.31f, 17.0f)
                horizontalLineTo(3.17f)
                curveToRelative(-0.49f, 0.0f, -0.91f, 0.36f, -0.99f, 0.85f)
                lineToRelative(0.0f, 0.0f)
                curveTo(2.08f, 18.45f, 2.55f, 19.0f, 3.17f, 19.0f)
                horizontalLineTo(8.0f)
                lineTo(8.31f, 17.0f)
                close()
                moveTo(8.93f, 13.0f)
                horizontalLineTo(3.79f)
                curveToRelative(-0.49f, 0.0f, -0.91f, 0.36f, -0.99f, 0.85f)
                lineToRelative(0.0f, 0.0f)
                curveTo(2.7f, 14.45f, 3.17f, 15.0f, 3.79f, 15.0f)
                horizontalLineToRelative(4.84f)
                lineTo(8.93f, 13.0f)
                close()
            }
        }
        .build()
        return _rtt!!
    }

private var _rtt: ImageVector? = null
