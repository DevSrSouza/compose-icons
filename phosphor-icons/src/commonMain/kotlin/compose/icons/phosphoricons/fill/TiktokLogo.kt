package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.TiktokLogo: ImageVector
    get() {
        if (_tiktokLogo != null) {
            return _tiktokLogo!!
        }
        _tiktokLogo = Builder(name = "TiktokLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 84.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                arcToRelative(103.2f, 103.2f, 0.0f, false, true, -48.0f, -11.7f)
                verticalLineTo(156.0f)
                arcTo(76.0f, 76.0f, 0.0f, true, true, 86.6f, 81.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.5f, 1.7f)
                arcTo(7.8f, 7.8f, 0.0f, false, true, 96.0f, 89.1f)
                verticalLineToRelative(41.6f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -4.6f, 7.2f)
                arcTo(20.0f, 20.0f, 0.0f, true, false, 120.0f, 156.0f)
                verticalLineTo(28.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 48.0f, 48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 232.0f, 84.0f)
                close()
            }
        }
        .build()
        return _tiktokLogo!!
    }

private var _tiktokLogo: ImageVector? = null
