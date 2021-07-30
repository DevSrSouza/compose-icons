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

public val SimpleIcons.Spacex: ImageVector
    get() {
        if (_spacex != null) {
            return _spacex!!
        }
        _spacex = Builder(name = "Spacex", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 7.417f)
                curveTo(8.882f, 8.287f, 1.89f, 14.75f, 0.321f, 16.28f)
                lineTo(0.0f, 16.583f)
                horizontalLineToRelative(2.797f)
                curveTo(10.356f, 9.005f, 21.222f, 7.663f, 24.0f, 7.417f)
                close()
                moveTo(6.954f, 13.767f)
                curveToRelative(-0.472f, 0.321f, -0.945f, 0.68f, -1.398f, 1.02f)
                lineToRelative(2.457f, 1.796f)
                horizontalLineToRelative(2.778f)
                close()
                moveTo(2.948f, 10.8f)
                lineTo(0.189f, 10.8f)
                lineToRelative(3.25f, 2.381f)
                curveToRelative(0.473f, -0.321f, 1.02f, -0.661f, 1.512f, -0.945f)
                close()
            }
        }
        .build()
        return _spacex!!
    }

private var _spacex: ImageVector? = null
