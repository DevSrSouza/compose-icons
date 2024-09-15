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

public val LineAwesomeIcons.HandPointLeft: ImageVector
    get() {
        if (_handPointLeft != null) {
            return _handPointLeft!!
        }
        _handPointLeft = Builder(name = "HandPointLeft", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.906f, 3.0f)
                curveTo(15.289f, 3.0f, 14.0f, 4.23f, 14.0f, 5.656f)
                curveTo(14.0f, 6.992f, 14.469f, 7.984f, 14.938f, 8.625f)
                curveTo(15.23f, 9.027f, 15.359f, 9.094f, 15.563f, 9.25f)
                lineTo(15.75f, 10.0f)
                lineTo(5.0f, 10.0f)
                curveTo(3.355f, 10.0f, 2.0f, 11.355f, 2.0f, 13.0f)
                curveTo(2.0f, 14.645f, 3.355f, 16.0f, 5.0f, 16.0f)
                lineTo(8.563f, 16.0f)
                lineTo(10.219f, 23.625f)
                curveTo(10.516f, 25.004f, 11.746f, 26.0f, 13.156f, 26.0f)
                lineTo(30.0f, 26.0f)
                lineTo(30.0f, 10.0f)
                lineTo(24.406f, 10.0f)
                lineTo(17.625f, 3.281f)
                lineTo(17.313f, 3.0f)
                close()
                moveTo(16.594f, 5.094f)
                lineTo(23.0f, 11.406f)
                lineTo(23.0f, 24.0f)
                lineTo(13.156f, 24.0f)
                curveTo(12.68f, 24.0f, 12.258f, 23.688f, 12.156f, 23.219f)
                lineTo(10.375f, 14.781f)
                lineTo(10.188f, 14.0f)
                lineTo(5.0f, 14.0f)
                curveTo(4.434f, 14.0f, 4.0f, 13.566f, 4.0f, 13.0f)
                curveTo(4.0f, 12.434f, 4.434f, 12.0f, 5.0f, 12.0f)
                lineTo(18.344f, 12.0f)
                lineTo(18.031f, 10.75f)
                lineTo(17.438f, 8.5f)
                lineTo(17.313f, 8.094f)
                lineTo(16.969f, 7.906f)
                curveTo(16.969f, 7.906f, 16.789f, 7.82f, 16.531f, 7.469f)
                curveTo(16.273f, 7.117f, 16.0f, 6.559f, 16.0f, 5.656f)
                curveTo(16.0f, 5.348f, 16.172f, 5.176f, 16.594f, 5.094f)
                close()
                moveTo(25.0f, 12.0f)
                lineTo(28.0f, 12.0f)
                lineTo(28.0f, 24.0f)
                lineTo(25.0f, 24.0f)
                close()
            }
        }
        .build()
        return _handPointLeft!!
    }

private var _handPointLeft: ImageVector? = null
