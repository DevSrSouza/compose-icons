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

public val MaterialDesignIcons.PlaylistStar: ImageVector
    get() {
        if (_playlistStar != null) {
            return _playlistStar!!
        }
        _playlistStar = Builder(name = "PlaylistStar", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 19.1f)
                lineTo(19.5f, 20.6f)
                lineTo(18.8f, 17.8f)
                lineTo(21.0f, 15.9f)
                lineTo(18.1f, 15.7f)
                lineTo(17.0f, 13.0f)
                lineTo(15.9f, 15.6f)
                lineTo(13.0f, 15.9f)
                lineTo(15.2f, 17.8f)
                lineTo(14.5f, 20.6f)
                lineTo(17.0f, 19.1f)
                moveTo(3.0f, 14.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(14.0f)
                moveTo(3.0f, 6.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(6.0f)
                moveTo(3.0f, 10.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _playlistStar!!
    }

private var _playlistStar: ImageVector? = null
