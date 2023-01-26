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

public val RoundGroup.PianoOff: ImageVector
    get() {
        if (_pianoOff != null) {
            return _pianoOff!!
        }
        _pianoOff = Builder(name = "PianoOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.49f, 21.9f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                lineTo(3.51f, 3.51f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineTo(3.0f, 5.83f)
                verticalLineTo(19.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(13.17f)
                lineToRelative(0.9f, 0.9f)
                curveTo(19.46f, 22.29f, 20.09f, 22.29f, 20.49f, 21.9f)
                close()
                moveTo(8.25f, 19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(7.83f)
                lineToRelative(2.0f, 2.0f)
                verticalLineToRelative(3.67f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.25f)
                verticalLineTo(19.0f)
                close()
                moveTo(9.75f, 19.0f)
                verticalLineToRelative(-4.5f)
                horizontalLineTo(10.0f)
                curveToRelative(0.46f, 0.0f, 0.82f, -0.31f, 0.94f, -0.73f)
                lineToRelative(3.31f, 3.31f)
                verticalLineTo(19.0f)
                horizontalLineTo(9.75f)
                close()
                moveTo(11.0f, 8.17f)
                lineTo(5.83f, 3.0f)
                horizontalLineTo(19.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                verticalLineToRelative(13.17f)
                lineToRelative(-2.0f, -2.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(8.5f)
                curveToRelative(0.0f, 0.19f, -0.07f, 0.36f, -0.16f, 0.51f)
                lineTo(13.0f, 10.17f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(8.17f)
                close()
            }
        }
        .build()
        return _pianoOff!!
    }

private var _pianoOff: ImageVector? = null
