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

public val LineAwesomeIcons.HandPaper: ImageVector
    get() {
        if (_handPaper != null) {
            return _handPaper!!
        }
        _handPaper = Builder(name = "HandPaper", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                curveTo(14.617f, 2.0f, 13.469f, 2.969f, 13.125f, 4.25f)
                curveTo(12.773f, 4.105f, 12.402f, 4.0f, 12.0f, 4.0f)
                curveTo(10.355f, 4.0f, 9.0f, 5.355f, 9.0f, 7.0f)
                lineTo(9.0f, 17.75f)
                lineTo(8.125f, 16.875f)
                curveTo(6.961f, 15.711f, 5.039f, 15.711f, 3.875f, 16.875f)
                curveTo(2.711f, 18.039f, 2.711f, 19.961f, 3.875f, 21.125f)
                lineTo(10.656f, 27.906f)
                curveTo(11.832f, 29.078f, 13.457f, 30.0f, 15.375f, 30.0f)
                lineTo(20.0f, 30.0f)
                curveTo(23.855f, 30.0f, 27.0f, 26.855f, 27.0f, 23.0f)
                lineTo(27.0f, 11.0f)
                curveTo(27.0f, 9.355f, 25.645f, 8.0f, 24.0f, 8.0f)
                curveTo(23.648f, 8.0f, 23.316f, 8.074f, 23.0f, 8.188f)
                lineTo(23.0f, 7.0f)
                curveTo(23.0f, 5.355f, 21.645f, 4.0f, 20.0f, 4.0f)
                curveTo(19.598f, 4.0f, 19.227f, 4.105f, 18.875f, 4.25f)
                curveTo(18.531f, 2.969f, 17.383f, 2.0f, 16.0f, 2.0f)
                close()
                moveTo(16.0f, 4.0f)
                curveTo(16.566f, 4.0f, 17.0f, 4.434f, 17.0f, 5.0f)
                lineTo(17.0f, 15.0f)
                lineTo(19.0f, 15.0f)
                lineTo(19.0f, 7.0f)
                curveTo(19.0f, 6.434f, 19.434f, 6.0f, 20.0f, 6.0f)
                curveTo(20.566f, 6.0f, 21.0f, 6.434f, 21.0f, 7.0f)
                lineTo(21.0f, 15.0f)
                lineTo(23.0f, 15.0f)
                lineTo(23.0f, 11.0f)
                curveTo(23.0f, 10.434f, 23.434f, 10.0f, 24.0f, 10.0f)
                curveTo(24.566f, 10.0f, 25.0f, 10.434f, 25.0f, 11.0f)
                lineTo(25.0f, 23.0f)
                curveTo(25.0f, 25.773f, 22.773f, 28.0f, 20.0f, 28.0f)
                lineTo(15.375f, 28.0f)
                curveTo(14.102f, 28.0f, 13.008f, 27.379f, 12.094f, 26.469f)
                lineTo(5.281f, 19.719f)
                curveTo(4.883f, 19.32f, 4.883f, 18.68f, 5.281f, 18.281f)
                curveTo(5.68f, 17.883f, 6.32f, 17.883f, 6.719f, 18.281f)
                lineTo(9.281f, 20.875f)
                lineTo(11.0f, 22.594f)
                lineTo(11.0f, 7.0f)
                curveTo(11.0f, 6.434f, 11.434f, 6.0f, 12.0f, 6.0f)
                curveTo(12.566f, 6.0f, 13.0f, 6.434f, 13.0f, 7.0f)
                lineTo(13.0f, 15.0f)
                lineTo(15.0f, 15.0f)
                lineTo(15.0f, 5.0f)
                curveTo(15.0f, 4.434f, 15.434f, 4.0f, 16.0f, 4.0f)
                close()
            }
        }
        .build()
        return _handPaper!!
    }

private var _handPaper: ImageVector? = null
