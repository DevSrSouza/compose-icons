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

public val MaterialDesignIcons.PlaylistEdit: ImageVector
    get() {
        if (_playlistEdit != null) {
            return _playlistEdit!!
        }
        _playlistEdit = Builder(name = "PlaylistEdit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(3.0f)
                moveTo(3.0f, 10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(3.0f)
                moveTo(20.0f, 10.1f)
                curveTo(19.9f, 10.1f, 19.7f, 10.2f, 19.6f, 10.3f)
                lineTo(18.6f, 11.3f)
                lineTo(20.7f, 13.4f)
                lineTo(21.7f, 12.4f)
                curveTo(21.9f, 12.2f, 21.9f, 11.8f, 21.7f, 11.6f)
                lineTo(20.4f, 10.3f)
                curveTo(20.3f, 10.2f, 20.2f, 10.1f, 20.0f, 10.1f)
                moveTo(18.1f, 11.9f)
                lineTo(12.0f, 17.9f)
                verticalLineTo(20.0f)
                horizontalLineTo(14.1f)
                lineTo(20.2f, 13.9f)
                lineTo(18.1f, 11.9f)
                moveTo(3.0f, 14.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _playlistEdit!!
    }

private var _playlistEdit: ImageVector? = null
