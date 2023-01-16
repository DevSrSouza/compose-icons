package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.PlaylistRemove: ImageVector
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
                verticalLineTo(12.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(10.0f)
                moveTo(14.0f, 6.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(6.0f)
                moveTo(3.0f, 16.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(16.0f)
                moveTo(14.4f, 22.0f)
                lineTo(17.0f, 19.4f)
                lineTo(19.6f, 22.0f)
                lineTo(21.0f, 20.6f)
                lineTo(18.4f, 18.0f)
                lineTo(21.0f, 15.4f)
                lineTo(19.6f, 14.0f)
                lineTo(17.0f, 16.6f)
                lineTo(14.4f, 14.0f)
                lineTo(13.0f, 15.4f)
                lineTo(15.6f, 18.0f)
                lineTo(13.0f, 20.6f)
                lineTo(14.4f, 22.0f)
                close()
            }
        }
        .build()
        return _playlistRemove!!
    }

private var _playlistRemove: ImageVector? = null
