package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.VideoStable: ImageVector
    get() {
        if (_videoStable != null) {
            return _videoStable!!
        }
        _videoStable = Builder(name = "VideoStable", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 4.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(20.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(2.0f)
                close()
                moveTo(4.0f, 18.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(2.95f)
                lineToRelative(-2.33f, 8.73f)
                lineTo(16.82f, 18.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(20.0f, 18.0f)
                horizontalLineToRelative(-2.95f)
                lineToRelative(2.34f, -8.73f)
                lineTo(7.18f, 6.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _videoStable!!
    }

private var _videoStable: ImageVector? = null
