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

public val RoundGroup.PlaylistRemove: ImageVector
    get() {
        if (_playlistRemove != null) {
            return _playlistRemove!!
        }
        _playlistRemove = Builder(name = "PlaylistRemove", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.71f, 21.3f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                lineTo(17.0f, 19.41f)
                lineToRelative(1.89f, 1.89f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                reflectiveCurveToRelative(0.39f, -1.02f, 0.0f, -1.41f)
                lineTo(18.41f, 18.0f)
                lineToRelative(1.89f, -1.89f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                reflectiveCurveToRelative(-1.02f, -0.39f, -1.41f, 0.0f)
                lineTo(17.0f, 16.59f)
                lineToRelative(-1.89f, -1.89f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                reflectiveCurveToRelative(-0.39f, 1.02f, 0.0f, 1.41f)
                lineTo(15.59f, 18.0f)
                lineToRelative(-1.89f, 1.89f)
                curveTo(13.32f, 20.27f, 13.32f, 20.91f, 13.71f, 21.3f)
                close()
                moveTo(14.0f, 11.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(4.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(9.0f)
                curveTo(13.55f, 12.0f, 14.0f, 11.55f, 14.0f, 11.0f)
                close()
                moveTo(14.0f, 7.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(4.0f)
                curveTo(3.45f, 6.0f, 3.0f, 6.45f, 3.0f, 7.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(9.0f)
                curveTo(13.55f, 8.0f, 14.0f, 7.55f, 14.0f, 7.0f)
                close()
                moveTo(3.0f, 15.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(4.0f)
                curveTo(3.45f, 14.0f, 3.0f, 14.45f, 3.0f, 15.0f)
                close()
            }
        }
        .build()
        return _playlistRemove!!
    }

private var _playlistRemove: ImageVector? = null
