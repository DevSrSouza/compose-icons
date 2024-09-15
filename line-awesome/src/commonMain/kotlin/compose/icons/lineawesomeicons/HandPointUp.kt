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

public val LineAwesomeIcons.HandPointUp: ImageVector
    get() {
        if (_handPointUp != null) {
            return _handPointUp!!
        }
        _handPointUp = Builder(name = "HandPointUp", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 2.0f)
                curveTo(11.355f, 2.0f, 10.0f, 3.355f, 10.0f, 5.0f)
                lineTo(10.0f, 15.75f)
                lineTo(9.25f, 15.563f)
                curveTo(9.094f, 15.359f, 9.027f, 15.23f, 8.625f, 14.938f)
                curveTo(7.984f, 14.469f, 6.992f, 14.0f, 5.656f, 14.0f)
                curveTo(4.23f, 14.0f, 3.0f, 15.289f, 3.0f, 16.906f)
                lineTo(3.0f, 17.313f)
                lineTo(3.281f, 17.625f)
                lineTo(10.0f, 24.406f)
                lineTo(10.0f, 30.0f)
                lineTo(26.0f, 30.0f)
                lineTo(26.0f, 13.156f)
                curveTo(26.0f, 11.746f, 25.004f, 10.516f, 23.625f, 10.219f)
                lineTo(16.0f, 8.563f)
                lineTo(16.0f, 5.0f)
                curveTo(16.0f, 3.355f, 14.645f, 2.0f, 13.0f, 2.0f)
                close()
                moveTo(13.0f, 4.0f)
                curveTo(13.566f, 4.0f, 14.0f, 4.434f, 14.0f, 5.0f)
                lineTo(14.0f, 10.188f)
                lineTo(14.781f, 10.375f)
                lineTo(23.219f, 12.156f)
                curveTo(23.688f, 12.258f, 24.0f, 12.68f, 24.0f, 13.156f)
                lineTo(24.0f, 23.0f)
                lineTo(11.406f, 23.0f)
                lineTo(5.094f, 16.594f)
                curveTo(5.176f, 16.172f, 5.348f, 16.0f, 5.656f, 16.0f)
                curveTo(6.559f, 16.0f, 7.117f, 16.273f, 7.469f, 16.531f)
                curveTo(7.82f, 16.789f, 7.906f, 16.969f, 7.906f, 16.969f)
                lineTo(8.094f, 17.313f)
                lineTo(8.5f, 17.438f)
                lineTo(10.75f, 18.031f)
                lineTo(12.0f, 18.344f)
                lineTo(12.0f, 5.0f)
                curveTo(12.0f, 4.434f, 12.434f, 4.0f, 13.0f, 4.0f)
                close()
                moveTo(12.0f, 25.0f)
                lineTo(24.0f, 25.0f)
                lineTo(24.0f, 28.0f)
                lineTo(12.0f, 28.0f)
                close()
            }
        }
        .build()
        return _handPointUp!!
    }

private var _handPointUp: ImageVector? = null
