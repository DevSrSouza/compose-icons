package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.MediaPodcast: ImageVector
    get() {
        if (_mediaPodcast != null) {
            return _mediaPodcast!!
        }
        _mediaPodcast = Builder(name = "MediaPodcast", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.636f, 20.364f)
                curveTo(4.007f, 18.735f, 3.0f, 16.485f, 3.0f, 14.0f)
                curveTo(3.0f, 9.029f, 7.029f, 5.0f, 12.0f, 5.0f)
                curveTo(16.971f, 5.0f, 21.0f, 9.029f, 21.0f, 14.0f)
                curveTo(21.0f, 16.485f, 19.993f, 18.735f, 18.364f, 20.364f)
                lineTo(19.778f, 21.778f)
                curveTo(21.769f, 19.788f, 23.0f, 17.038f, 23.0f, 14.0f)
                curveTo(23.0f, 7.925f, 18.075f, 3.0f, 12.0f, 3.0f)
                curveTo(5.925f, 3.0f, 1.0f, 7.925f, 1.0f, 14.0f)
                curveTo(1.0f, 17.038f, 2.231f, 19.788f, 4.222f, 21.778f)
                lineTo(5.636f, 20.364f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.95f, 18.95f)
                curveTo(18.216f, 17.683f, 19.0f, 15.933f, 19.0f, 14.0f)
                curveTo(19.0f, 10.134f, 15.866f, 7.0f, 12.0f, 7.0f)
                curveTo(8.134f, 7.0f, 5.0f, 10.134f, 5.0f, 14.0f)
                curveTo(5.0f, 15.933f, 5.784f, 17.683f, 7.05f, 18.95f)
                lineTo(8.465f, 17.536f)
                curveTo(7.56f, 16.631f, 7.0f, 15.381f, 7.0f, 14.0f)
                curveTo(7.0f, 11.239f, 9.239f, 9.0f, 12.0f, 9.0f)
                curveTo(14.761f, 9.0f, 17.0f, 11.239f, 17.0f, 14.0f)
                curveTo(17.0f, 15.381f, 16.44f, 16.631f, 15.536f, 17.535f)
                lineTo(16.95f, 18.95f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.121f, 16.121f)
                curveTo(14.664f, 15.578f, 15.0f, 14.828f, 15.0f, 14.0f)
                curveTo(15.0f, 12.343f, 13.657f, 11.0f, 12.0f, 11.0f)
                curveTo(10.343f, 11.0f, 9.0f, 12.343f, 9.0f, 14.0f)
                curveTo(9.0f, 14.828f, 9.336f, 15.578f, 9.879f, 16.121f)
                lineTo(11.293f, 14.707f)
                curveTo(11.112f, 14.526f, 11.0f, 14.276f, 11.0f, 14.0f)
                curveTo(11.0f, 13.448f, 11.448f, 13.0f, 12.0f, 13.0f)
                curveTo(12.552f, 13.0f, 13.0f, 13.448f, 13.0f, 14.0f)
                curveTo(13.0f, 14.276f, 12.888f, 14.526f, 12.707f, 14.707f)
                lineTo(14.121f, 16.121f)
                close()
            }
        }
        .build()
        return _mediaPodcast!!
    }

private var _mediaPodcast: ImageVector? = null
