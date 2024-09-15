package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.Cloudscale: ImageVector
    get() {
        if (_cloudscale != null) {
            return _cloudscale!!
        }
        _cloudscale = Builder(name = "Cloudscale", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.832f, 3.0f, 3.0f, 8.832f, 3.0f, 16.0f)
                curveTo(3.0f, 23.168f, 8.832f, 29.0f, 16.0f, 29.0f)
                curveTo(23.168f, 29.0f, 29.0f, 23.168f, 29.0f, 16.0f)
                curveTo(29.0f, 8.832f, 23.168f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(22.065f, 5.0f, 27.0f, 9.935f, 27.0f, 16.0f)
                curveTo(27.0f, 22.065f, 22.065f, 27.0f, 16.0f, 27.0f)
                curveTo(9.935f, 27.0f, 5.0f, 22.065f, 5.0f, 16.0f)
                curveTo(5.0f, 9.935f, 9.935f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(16.0f, 9.0f)
                curveTo(12.134f, 9.0f, 9.0f, 12.134f, 9.0f, 16.0f)
                curveTo(9.0f, 16.225f, 9.012f, 16.447f, 9.033f, 16.666f)
                curveTo(9.207f, 14.063f, 11.353f, 12.0f, 14.0f, 12.0f)
                curveTo(15.309f, 12.0f, 16.487f, 12.515f, 17.375f, 13.342f)
                lineTo(16.512f, 14.074f)
                curveTo(16.348f, 14.031f, 16.178f, 14.0f, 16.0f, 14.0f)
                curveTo(14.895f, 14.0f, 14.0f, 14.895f, 14.0f, 16.0f)
                curveTo(14.0f, 17.105f, 14.895f, 18.0f, 16.0f, 18.0f)
                curveTo(17.105f, 18.0f, 18.0f, 17.105f, 18.0f, 16.0f)
                curveTo(18.0f, 15.822f, 17.969f, 15.652f, 17.926f, 15.488f)
                lineTo(21.854f, 10.854f)
                curveTo(21.944f, 10.763f, 22.0f, 10.638f, 22.0f, 10.5f)
                curveTo(22.0f, 10.224f, 21.776f, 10.0f, 21.5f, 10.0f)
                curveTo(21.362f, 10.0f, 21.237f, 10.056f, 21.146f, 10.146f)
                lineTo(20.531f, 10.668f)
                curveTo(19.31f, 9.629f, 17.729f, 9.0f, 16.0f, 9.0f)
                close()
            }
        }
        .build()
        return _cloudscale!!
    }

private var _cloudscale: ImageVector? = null
