package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.VideoLine: ImageVector
    get() {
        if (_videoLine != null) {
            return _videoLine!!
        }
        _videoLine = Builder(name = "VideoLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.993f)
                curveTo(3.0f, 3.445f, 3.445f, 3.0f, 3.993f, 3.0f)
                horizontalLineToRelative(16.014f)
                curveToRelative(0.548f, 0.0f, 0.993f, 0.445f, 0.993f, 0.993f)
                verticalLineToRelative(16.014f)
                arcToRelative(0.994f, 0.994f, 0.0f, false, true, -0.993f, 0.993f)
                lineTo(3.993f, 21.0f)
                arcTo(0.994f, 0.994f, 0.0f, false, true, 3.0f, 20.007f)
                lineTo(3.0f, 3.993f)
                close()
                moveTo(5.0f, 5.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(14.0f)
                lineTo(19.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(10.622f, 8.415f)
                lineToRelative(4.879f, 3.252f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, 0.0f, 0.666f)
                lineToRelative(-4.88f, 3.252f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, -0.621f, -0.332f)
                lineTo(10.0f, 8.747f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, 0.622f, -0.332f)
                close()
            }
        }
        .build()
        return _videoLine!!
    }

private var _videoLine: ImageVector? = null
