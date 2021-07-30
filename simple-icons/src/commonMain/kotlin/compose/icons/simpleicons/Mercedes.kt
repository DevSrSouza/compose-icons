package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Mercedes: ImageVector
    get() {
        if (_mercedes != null) {
            return _mercedes!!
        }
        _mercedes = Builder(name = "Mercedes", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveToRelative(6.623f, 0.0f, 12.0f, 5.377f, 12.0f, 12.0f)
                reflectiveCurveToRelative(-5.377f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.623f, 0.0f, 12.0f)
                reflectiveCurveTo(5.377f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(3.245f, 17.539f)
                arcTo(10.357f, 10.357f, 0.0f, false, false, 12.0f, 22.36f)
                curveToRelative(3.681f, 0.0f, 6.917f, -1.924f, 8.755f, -4.821f)
                lineTo(12.0f, 14.203f)
                close()
                moveTo(13.908f, 10.898f)
                lineToRelative(7.267f, 5.915f)
                arcTo(10.306f, 10.306f, 0.0f, false, false, 22.36f, 12.0f)
                curveToRelative(0.0f, -5.577f, -4.417f, -10.131f, -9.94f, -10.352f)
                close()
                moveTo(11.58f, 1.648f)
                curveTo(6.057f, 1.869f, 1.64f, 6.423f, 1.64f, 12.0f)
                curveToRelative(0.0f, 1.737f, 0.428f, 3.374f, 1.185f, 4.813f)
                lineToRelative(7.267f, -5.915f)
                close()
            }
        }
        .build()
        return _mercedes!!
    }

private var _mercedes: ImageVector? = null
