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

public val MaterialDesignIcons.PlaylistMusicOutline: ImageVector
    get() {
        if (_playlistMusicOutline != null) {
            return _playlistMusicOutline!!
        }
        _playlistMusicOutline = Builder(name = "PlaylistMusicOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(15.0f)
                moveTo(15.0f, 10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(15.0f)
                moveTo(3.0f, 16.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(3.0f)
                moveTo(17.0f, 6.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(17.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 16.0f, 20.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 13.0f, 17.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 16.0f, 14.0f)
                curveTo(16.35f, 14.0f, 16.69f, 14.07f, 17.0f, 14.18f)
                verticalLineTo(6.0f)
                moveTo(16.0f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 16.0f)
                close()
            }
        }
        .build()
        return _playlistMusicOutline!!
    }

private var _playlistMusicOutline: ImageVector? = null
