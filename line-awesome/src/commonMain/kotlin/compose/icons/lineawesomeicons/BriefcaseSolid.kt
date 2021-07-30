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

public val LineAwesomeIcons.BriefcaseSolid: ImageVector
    get() {
        if (_briefcaseSolid != null) {
            return _briefcaseSolid!!
        }
        _briefcaseSolid = Builder(name = "BriefcaseSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(14.1367f, 3.0f, 12.6016f, 4.2773f, 12.1563f, 6.0f)
                lineTo(3.0f, 6.0f)
                lineTo(3.0f, 26.0f)
                lineTo(29.0f, 26.0f)
                lineTo(29.0f, 6.0f)
                lineTo(19.8438f, 6.0f)
                curveTo(19.3984f, 4.2773f, 17.8633f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(16.8086f, 5.0f, 17.4297f, 5.3867f, 17.75f, 6.0f)
                lineTo(14.25f, 6.0f)
                curveTo(14.5703f, 5.3867f, 15.1914f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(5.0f, 8.0f)
                lineTo(27.0f, 8.0f)
                lineTo(27.0f, 17.0f)
                lineTo(5.0f, 17.0f)
                close()
                moveTo(16.0f, 14.0f)
                curveTo(15.4492f, 14.0f, 15.0f, 14.4492f, 15.0f, 15.0f)
                curveTo(15.0f, 15.5508f, 15.4492f, 16.0f, 16.0f, 16.0f)
                curveTo(16.5508f, 16.0f, 17.0f, 15.5508f, 17.0f, 15.0f)
                curveTo(17.0f, 14.4492f, 16.5508f, 14.0f, 16.0f, 14.0f)
                close()
                moveTo(5.0f, 19.0f)
                lineTo(27.0f, 19.0f)
                lineTo(27.0f, 24.0f)
                lineTo(5.0f, 24.0f)
                close()
            }
        }
        .build()
        return _briefcaseSolid!!
    }

private var _briefcaseSolid: ImageVector? = null
