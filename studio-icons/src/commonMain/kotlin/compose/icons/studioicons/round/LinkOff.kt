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

public val RoundGroup.LinkOff: ImageVector
    get() {
        if (_linkOff != null) {
            return _linkOff!!
        }
        _linkOff = Builder(name = "LinkOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 9.0f)
                horizontalLineToRelative(2.87f)
                curveToRelative(1.46f, 0.0f, 2.8f, 0.98f, 3.08f, 2.42f)
                curveToRelative(0.31f, 1.64f, -0.74f, 3.11f, -2.22f, 3.48f)
                lineToRelative(1.53f, 1.53f)
                curveToRelative(1.77f, -0.91f, 2.95f, -2.82f, 2.7f, -5.01f)
                curveTo(21.68f, 8.86f, 19.37f, 7.0f, 16.79f, 7.0f)
                horizontalLineTo(14.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                curveTo(13.0f, 8.55f, 13.45f, 9.0f, 14.0f, 9.0f)
                close()
                moveTo(3.51f, 3.51f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(2.64f, 2.64f)
                curveToRelative(-1.77f, 0.91f, -2.95f, 2.82f, -2.7f, 5.01f)
                curveTo(2.32f, 15.14f, 4.63f, 17.0f, 7.21f, 17.0f)
                horizontalLineTo(10.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(7.13f)
                curveToRelative(-1.46f, 0.0f, -2.8f, -0.98f, -3.08f, -2.42f)
                curveTo(3.74f, 10.94f, 4.8f, 9.47f, 6.27f, 9.1f)
                lineToRelative(2.12f, 2.12f)
                curveTo(8.16f, 11.41f, 8.0f, 11.68f, 8.0f, 12.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.17f)
                lineToRelative(8.9f, 8.9f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                lineTo(3.51f, 3.51f)
                close()
                moveTo(14.0f, 11.0f)
                lineToRelative(1.71f, 1.71f)
                curveTo(15.89f, 12.53f, 16.0f, 12.28f, 16.0f, 12.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _linkOff!!
    }

private var _linkOff: ImageVector? = null
