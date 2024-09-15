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

public val LineAwesomeIcons.HandPointRightSolid: ImageVector
    get() {
        if (_handPointRightSolid != null) {
            return _handPointRightSolid!!
        }
        _handPointRightSolid = Builder(name = "HandPointRightSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.688f, 3.0f)
                lineTo(14.375f, 3.281f)
                lineTo(7.594f, 10.0f)
                lineTo(2.0f, 10.0f)
                lineTo(2.0f, 26.0f)
                lineTo(18.844f, 26.0f)
                curveTo(20.254f, 26.0f, 21.484f, 25.004f, 21.781f, 23.625f)
                lineTo(23.438f, 16.0f)
                lineTo(27.0f, 16.0f)
                curveTo(28.645f, 16.0f, 30.0f, 14.645f, 30.0f, 13.0f)
                curveTo(30.0f, 11.355f, 28.645f, 10.0f, 27.0f, 10.0f)
                lineTo(16.25f, 10.0f)
                lineTo(16.438f, 9.25f)
                curveTo(16.641f, 9.094f, 16.77f, 9.027f, 17.063f, 8.625f)
                curveTo(17.531f, 7.984f, 18.0f, 6.992f, 18.0f, 5.656f)
                curveTo(18.0f, 4.23f, 16.711f, 3.0f, 15.094f, 3.0f)
                close()
                moveTo(15.406f, 5.094f)
                curveTo(15.828f, 5.176f, 16.0f, 5.348f, 16.0f, 5.656f)
                curveTo(16.0f, 6.559f, 15.727f, 7.117f, 15.469f, 7.469f)
                curveTo(15.211f, 7.82f, 15.031f, 7.906f, 15.031f, 7.906f)
                lineTo(14.688f, 8.094f)
                lineTo(14.563f, 8.5f)
                lineTo(13.969f, 10.75f)
                lineTo(13.656f, 12.0f)
                lineTo(27.0f, 12.0f)
                curveTo(27.566f, 12.0f, 28.0f, 12.434f, 28.0f, 13.0f)
                curveTo(28.0f, 13.566f, 27.566f, 14.0f, 27.0f, 14.0f)
                lineTo(21.813f, 14.0f)
                lineTo(21.625f, 14.781f)
                lineTo(19.844f, 23.219f)
                curveTo(19.742f, 23.688f, 19.32f, 24.0f, 18.844f, 24.0f)
                lineTo(9.0f, 24.0f)
                lineTo(9.0f, 11.406f)
                close()
                moveTo(4.0f, 12.0f)
                lineTo(7.0f, 12.0f)
                lineTo(7.0f, 24.0f)
                lineTo(4.0f, 24.0f)
                close()
            }
        }
        .build()
        return _handPointRightSolid!!
    }

private var _handPointRightSolid: ImageVector? = null
