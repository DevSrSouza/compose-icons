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

public val RemixIcons.NurseFill: ImageVector
    get() {
        if (_nurseFill != null) {
            return _nurseFill!!
        }
        _nurseFill = Builder(name = "NurseFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.956f, 15.564f)
                curveToRelative(2.659f, 1.058f, 4.616f, 3.5f, 4.982f, 6.436f)
                lineTo(4.062f, 22.0f)
                curveToRelative(0.366f, -2.936f, 2.323f, -5.378f, 4.982f, -6.436f)
                lineTo(12.0f, 20.0f)
                lineToRelative(2.956f, -4.436f)
                close()
                moveTo(18.0f, 2.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 3.314f, -2.686f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.686f, -6.0f, -6.0f)
                lineTo(6.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(16.0f, 8.0f)
                lineTo(8.0f, 8.0f)
                curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f)
                close()
            }
        }
        .build()
        return _nurseFill!!
    }

private var _nurseFill: ImageVector? = null
