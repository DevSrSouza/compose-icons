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

public val RoundGroup.MovieFilter: ImageVector
    get() {
        if (_movieFilter != null) {
            return _movieFilter!!
        }
        _movieFilter = Builder(name = "MovieFilter", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.5f, 4.0f)
                lineTo(18.0f, 4.0f)
                lineToRelative(1.74f, 2.61f)
                curveToRelative(0.11f, 0.17f, -0.01f, 0.39f, -0.21f, 0.39f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.33f, 0.0f, -0.65f, -0.17f, -0.83f, -0.45f)
                lineTo(15.0f, 4.0f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(1.74f, 2.61f)
                curveToRelative(0.11f, 0.17f, -0.01f, 0.39f, -0.21f, 0.39f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.33f, 0.0f, -0.65f, -0.17f, -0.83f, -0.45f)
                lineTo(10.0f, 4.0f)
                lineTo(8.0f, 4.0f)
                lineToRelative(1.74f, 2.61f)
                curveToRelative(0.11f, 0.17f, -0.01f, 0.39f, -0.21f, 0.39f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.33f, 0.0f, -0.64f, -0.17f, -0.83f, -0.45f)
                lineTo(5.0f, 4.0f)
                lineTo(4.0f, 4.0f)
                curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f)
                lineTo(2.0f, 18.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(22.0f, 4.5f)
                curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(11.25f, 15.25f)
                lineTo(10.0f, 18.0f)
                lineToRelative(-1.25f, -2.75f)
                lineTo(6.0f, 14.0f)
                lineToRelative(2.75f, -1.25f)
                lineTo(10.0f, 10.0f)
                lineToRelative(1.25f, 2.75f)
                lineTo(14.0f, 14.0f)
                lineToRelative(-2.75f, 1.25f)
                close()
                moveTo(16.94f, 11.94f)
                lineTo(16.0f, 14.0f)
                lineToRelative(-0.94f, -2.06f)
                lineTo(13.0f, 11.0f)
                lineToRelative(2.06f, -0.94f)
                lineTo(16.0f, 8.0f)
                lineToRelative(0.94f, 2.06f)
                lineTo(19.0f, 11.0f)
                lineToRelative(-2.06f, 0.94f)
                close()
            }
        }
        .build()
        return _movieFilter!!
    }

private var _movieFilter: ImageVector? = null
