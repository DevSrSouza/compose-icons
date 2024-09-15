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

public val LineAwesomeIcons.ThumbsUpSolid: ImageVector
    get() {
        if (_thumbsUpSolid != null) {
            return _thumbsUpSolid!!
        }
        _thumbsUpSolid = Builder(name = "ThumbsUpSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.688f, 3.0f)
                lineTo(16.375f, 3.281f)
                lineTo(9.594f, 10.0f)
                lineTo(5.0f, 10.0f)
                lineTo(5.0f, 26.0f)
                lineTo(21.844f, 26.0f)
                curveTo(23.254f, 26.0f, 24.484f, 25.004f, 24.781f, 23.625f)
                lineTo(26.938f, 13.625f)
                curveTo(27.332f, 11.777f, 25.887f, 10.0f, 24.0f, 10.0f)
                lineTo(18.25f, 10.0f)
                lineTo(18.438f, 9.25f)
                curveTo(18.641f, 9.094f, 18.77f, 9.027f, 19.063f, 8.625f)
                curveTo(19.531f, 7.984f, 20.0f, 6.992f, 20.0f, 5.656f)
                curveTo(20.0f, 4.23f, 18.711f, 3.0f, 17.094f, 3.0f)
                close()
                moveTo(17.406f, 5.094f)
                curveTo(17.828f, 5.176f, 18.0f, 5.348f, 18.0f, 5.656f)
                curveTo(18.0f, 6.559f, 17.727f, 7.117f, 17.469f, 7.469f)
                curveTo(17.211f, 7.82f, 17.031f, 7.906f, 17.031f, 7.906f)
                lineTo(16.688f, 8.094f)
                lineTo(16.563f, 8.5f)
                lineTo(15.969f, 10.75f)
                lineTo(15.656f, 12.0f)
                lineTo(24.0f, 12.0f)
                curveTo(24.66f, 12.0f, 25.105f, 12.574f, 24.969f, 13.219f)
                lineTo(22.844f, 23.219f)
                curveTo(22.742f, 23.688f, 22.32f, 24.0f, 21.844f, 24.0f)
                lineTo(11.0f, 24.0f)
                lineTo(11.0f, 11.406f)
                close()
                moveTo(7.0f, 12.0f)
                lineTo(9.0f, 12.0f)
                lineTo(9.0f, 24.0f)
                lineTo(7.0f, 24.0f)
                close()
            }
        }
        .build()
        return _thumbsUpSolid!!
    }

private var _thumbsUpSolid: ImageVector? = null
