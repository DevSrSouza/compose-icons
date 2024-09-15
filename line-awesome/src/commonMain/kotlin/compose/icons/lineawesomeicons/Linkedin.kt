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

public val LineAwesomeIcons.Linkedin: ImageVector
    get() {
        if (_linkedin != null) {
            return _linkedin!!
        }
        _linkedin = Builder(name = "Linkedin", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 5.0f)
                curveTo(6.133f, 5.0f, 5.0f, 6.133f, 5.0f, 7.5f)
                lineTo(5.0f, 24.5f)
                curveTo(5.0f, 25.867f, 6.133f, 27.0f, 7.5f, 27.0f)
                lineTo(24.5f, 27.0f)
                curveTo(25.867f, 27.0f, 27.0f, 25.867f, 27.0f, 24.5f)
                lineTo(27.0f, 7.5f)
                curveTo(27.0f, 6.133f, 25.867f, 5.0f, 24.5f, 5.0f)
                close()
                moveTo(7.5f, 7.0f)
                lineTo(24.5f, 7.0f)
                curveTo(24.785f, 7.0f, 25.0f, 7.215f, 25.0f, 7.5f)
                lineTo(25.0f, 24.5f)
                curveTo(25.0f, 24.785f, 24.785f, 25.0f, 24.5f, 25.0f)
                lineTo(7.5f, 25.0f)
                curveTo(7.215f, 25.0f, 7.0f, 24.785f, 7.0f, 24.5f)
                lineTo(7.0f, 7.5f)
                curveTo(7.0f, 7.215f, 7.215f, 7.0f, 7.5f, 7.0f)
                close()
                moveTo(10.438f, 8.719f)
                curveTo(9.488f, 8.719f, 8.719f, 9.488f, 8.719f, 10.438f)
                curveTo(8.719f, 11.387f, 9.488f, 12.156f, 10.438f, 12.156f)
                curveTo(11.387f, 12.156f, 12.156f, 11.387f, 12.156f, 10.438f)
                curveTo(12.156f, 9.488f, 11.387f, 8.719f, 10.438f, 8.719f)
                close()
                moveTo(19.469f, 13.281f)
                curveTo(18.035f, 13.281f, 17.082f, 14.066f, 16.688f, 14.813f)
                lineTo(16.625f, 14.813f)
                lineTo(16.625f, 13.5f)
                lineTo(13.813f, 13.5f)
                lineTo(13.813f, 23.0f)
                lineTo(16.75f, 23.0f)
                lineTo(16.75f, 18.313f)
                curveTo(16.75f, 17.074f, 16.996f, 15.875f, 18.531f, 15.875f)
                curveTo(20.043f, 15.875f, 20.063f, 17.273f, 20.063f, 18.375f)
                lineTo(20.063f, 23.0f)
                lineTo(23.0f, 23.0f)
                lineTo(23.0f, 17.781f)
                curveTo(23.0f, 15.227f, 22.457f, 13.281f, 19.469f, 13.281f)
                close()
                moveTo(9.0f, 13.5f)
                lineTo(9.0f, 23.0f)
                lineTo(11.969f, 23.0f)
                lineTo(11.969f, 13.5f)
                close()
            }
        }
        .build()
        return _linkedin!!
    }

private var _linkedin: ImageVector? = null
