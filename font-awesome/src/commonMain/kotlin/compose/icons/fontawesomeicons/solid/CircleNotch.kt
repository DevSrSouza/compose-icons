package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.CircleNotch: ImageVector
    get() {
        if (_circleNotch != null) {
            return _circleNotch!!
        }
        _circleNotch = Builder(name = "CircleNotch", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, 39.06f)
                verticalLineToRelative(16.66f)
                curveToRelative(0.0f, 10.8f, 7.28f, 20.16f, 17.69f, 23.07f)
                curveTo(383.2f, 100.43f, 440.0f, 171.52f, 440.0f, 256.0f)
                curveToRelative(0.0f, 101.69f, -82.29f, 184.0f, -184.0f, 184.0f)
                curveToRelative(-101.69f, 0.0f, -184.0f, -82.29f, -184.0f, -184.0f)
                curveToRelative(0.0f, -84.47f, 56.79f, -155.56f, 134.31f, -177.22f)
                curveTo(216.72f, 75.87f, 224.0f, 66.52f, 224.0f, 55.71f)
                verticalLineTo(39.06f)
                curveToRelative(0.0f, -15.71f, -14.83f, -27.15f, -30.05f, -23.23f)
                curveTo(86.6f, 43.48f, 7.39f, 141.21f, 8.0f, 257.33f)
                curveToRelative(0.72f, 137.05f, 111.48f, 246.96f, 248.53f, 246.67f)
                curveTo(393.26f, 503.71f, 504.0f, 392.79f, 504.0f, 256.0f)
                curveToRelative(0.0f, -115.63f, -79.14f, -212.78f, -186.21f, -240.24f)
                curveTo(302.68f, 11.89f, 288.0f, 23.46f, 288.0f, 39.06f)
                close()
            }
        }
        .build()
        return _circleNotch!!
    }

private var _circleNotch: ImageVector? = null
