package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.HatCowboy: ImageVector
    get() {
        if (_hatCowboy != null) {
            return _hatCowboy!!
        }
        _hatCowboy = Builder(name = "HatCowboy", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(490.0f, 296.9f)
                curveTo(480.51f, 239.51f, 450.51f, 64.0f, 392.3f, 64.0f)
                curveToRelative(-14.0f, 0.0f, -26.49f, 5.93f, -37.0f, 14.0f)
                arcToRelative(58.21f, 58.21f, 0.0f, false, true, -70.58f, 0.0f)
                curveToRelative(-10.51f, -8.0f, -23.0f, -14.0f, -37.0f, -14.0f)
                curveToRelative(-58.2f, 0.0f, -88.2f, 175.47f, -97.71f, 232.88f)
                curveTo(188.81f, 309.47f, 243.73f, 320.0f, 320.0f, 320.0f)
                reflectiveCurveToRelative(131.23f, -10.51f, 170.0f, -23.1f)
                close()
                moveTo(632.9f, 259.72f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -19.75f, 1.5f)
                curveToRelative(-1.0f, 0.9f, -101.27f, 90.78f, -293.16f, 90.78f)
                curveToRelative(-190.82f, 0.0f, -292.22f, -89.94f, -293.24f, -90.84f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 1.0f, 278.53f)
                curveTo(1.73f, 280.55f, 78.32f, 480.0f, 320.0f, 480.0f)
                reflectiveCurveToRelative(318.27f, -199.45f, 319.0f, -201.47f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -6.09f, -18.81f)
                close()
            }
        }
        .build()
        return _hatCowboy!!
    }

private var _hatCowboy: ImageVector? = null
