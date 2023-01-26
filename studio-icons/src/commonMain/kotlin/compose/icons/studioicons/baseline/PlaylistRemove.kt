package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.PlaylistRemove: ImageVector
    get() {
        if (_playlistRemove != null) {
            return _playlistRemove!!
        }
        _playlistRemove = Builder(name = "PlaylistRemove", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 10.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(11.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(14.0f, 6.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(11.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(3.0f, 16.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(16.0f)
                close()
                moveTo(14.41f, 22.0f)
                lineTo(17.0f, 19.41f)
                lineTo(19.59f, 22.0f)
                lineTo(21.0f, 20.59f)
                lineTo(18.41f, 18.0f)
                lineTo(21.0f, 15.41f)
                lineTo(19.59f, 14.0f)
                lineTo(17.0f, 16.59f)
                lineTo(14.41f, 14.0f)
                lineTo(13.0f, 15.41f)
                lineTo(15.59f, 18.0f)
                lineTo(13.0f, 20.59f)
                lineTo(14.41f, 22.0f)
                close()
            }
        }
        .build()
        return _playlistRemove!!
    }

private var _playlistRemove: ImageVector? = null
