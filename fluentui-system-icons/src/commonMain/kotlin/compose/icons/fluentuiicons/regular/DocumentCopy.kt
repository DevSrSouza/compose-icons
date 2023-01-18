package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.DocumentCopy: ImageVector
    get() {
        if (_documentCopy != null) {
            return _documentCopy!!
        }
        _documentCopy = Builder(name = "DocumentCopy", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5028f, 4.627f)
                lineTo(5.5f, 6.75f)
                verticalLineTo(17.2542f)
                curveTo(5.5f, 19.0491f, 6.9551f, 20.5042f, 8.75f, 20.5042f)
                lineTo(17.3663f, 20.5045f)
                curveTo(17.0573f, 21.3782f, 16.224f, 22.0042f, 15.2444f, 22.0042f)
                horizontalLineTo(8.75f)
                curveTo(6.1266f, 22.0042f, 4.0f, 19.8776f, 4.0f, 17.2542f)
                verticalLineTo(6.75f)
                curveTo(4.0f, 5.7693f, 4.6274f, 4.9351f, 5.5028f, 4.627f)
                close()
                moveTo(13.1284f, 2.0f)
                curveTo(13.7254f, 2.0f, 14.2979f, 2.2372f, 14.7199f, 2.6595f)
                lineTo(19.3383f, 7.2805f)
                curveTo(19.7599f, 7.7025f, 19.9968f, 8.2746f, 19.9968f, 8.8711f)
                verticalLineTo(17.2542f)
                curveTo(19.9968f, 18.4969f, 18.9895f, 19.5042f, 17.7468f, 19.5042f)
                horizontalLineTo(8.7524f)
                curveTo(7.5098f, 19.5042f, 6.5024f, 18.4969f, 6.5024f, 17.2542f)
                verticalLineTo(4.25f)
                curveTo(6.5024f, 3.0074f, 7.5098f, 2.0f, 8.7524f, 2.0f)
                horizontalLineTo(13.1284f)
                close()
                moveTo(12.9994f, 3.5f)
                horizontalLineTo(8.7524f)
                curveTo(8.3382f, 3.5f, 8.0024f, 3.8358f, 8.0024f, 4.25f)
                verticalLineTo(17.2542f)
                curveTo(8.0024f, 17.6684f, 8.3382f, 18.0042f, 8.7524f, 18.0042f)
                horizontalLineTo(17.7468f)
                curveTo(18.161f, 18.0042f, 18.4968f, 17.6684f, 18.4968f, 17.2542f)
                lineTo(18.4964f, 9.003f)
                lineTo(15.25f, 9.0039f)
                curveTo(14.0591f, 9.0039f, 13.0844f, 8.0787f, 13.0052f, 6.9079f)
                lineTo(13.0f, 6.7539f)
                lineTo(12.9994f, 3.5f)
                close()
                moveTo(14.4994f, 4.561f)
                lineTo(14.5f, 6.7539f)
                curveTo(14.5f, 7.1336f, 14.7822f, 7.4474f, 15.1482f, 7.497f)
                lineTo(15.25f, 7.5039f)
                lineTo(17.4404f, 7.503f)
                lineTo(14.4994f, 4.561f)
                close()
            }
        }
        .build()
        return _documentCopy!!
    }

private var _documentCopy: ImageVector? = null
