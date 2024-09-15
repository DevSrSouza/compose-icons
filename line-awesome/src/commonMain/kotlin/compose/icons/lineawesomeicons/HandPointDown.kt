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

public val LineAwesomeIcons.HandPointDown: ImageVector
    get() {
        if (_handPointDown != null) {
            return _handPointDown!!
        }
        _handPointDown = Builder(name = "HandPointDown", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 2.0f)
                lineTo(10.0f, 7.594f)
                lineTo(3.281f, 14.375f)
                lineTo(3.0f, 14.688f)
                lineTo(3.0f, 15.094f)
                curveTo(3.0f, 16.711f, 4.23f, 18.0f, 5.656f, 18.0f)
                curveTo(6.992f, 18.0f, 7.984f, 17.531f, 8.625f, 17.063f)
                curveTo(9.027f, 16.77f, 9.094f, 16.641f, 9.25f, 16.438f)
                lineTo(10.0f, 16.25f)
                lineTo(10.0f, 27.0f)
                curveTo(10.0f, 28.645f, 11.355f, 30.0f, 13.0f, 30.0f)
                curveTo(14.645f, 30.0f, 16.0f, 28.645f, 16.0f, 27.0f)
                lineTo(16.0f, 23.438f)
                lineTo(23.625f, 21.781f)
                curveTo(25.004f, 21.484f, 26.0f, 20.254f, 26.0f, 18.844f)
                lineTo(26.0f, 2.0f)
                close()
                moveTo(12.0f, 4.0f)
                lineTo(24.0f, 4.0f)
                lineTo(24.0f, 7.0f)
                lineTo(12.0f, 7.0f)
                close()
                moveTo(11.406f, 9.0f)
                lineTo(24.0f, 9.0f)
                lineTo(24.0f, 18.844f)
                curveTo(24.0f, 19.32f, 23.688f, 19.742f, 23.219f, 19.844f)
                lineTo(14.781f, 21.625f)
                lineTo(14.0f, 21.813f)
                lineTo(14.0f, 27.0f)
                curveTo(14.0f, 27.566f, 13.566f, 28.0f, 13.0f, 28.0f)
                curveTo(12.434f, 28.0f, 12.0f, 27.566f, 12.0f, 27.0f)
                lineTo(12.0f, 13.656f)
                lineTo(10.75f, 13.969f)
                lineTo(8.5f, 14.563f)
                lineTo(8.094f, 14.688f)
                lineTo(7.906f, 15.031f)
                curveTo(7.906f, 15.031f, 7.82f, 15.211f, 7.469f, 15.469f)
                curveTo(7.117f, 15.727f, 6.559f, 16.0f, 5.656f, 16.0f)
                curveTo(5.348f, 16.0f, 5.176f, 15.828f, 5.094f, 15.406f)
                close()
            }
        }
        .build()
        return _handPointDown!!
    }

private var _handPointDown: ImageVector? = null
