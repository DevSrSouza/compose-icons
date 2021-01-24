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

public val SolidGroup.Wrench: ImageVector
    get() {
        if (_wrench != null) {
            return _wrench!!
        }
        _wrench = Builder(name = "Wrench", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(507.73f, 109.1f)
                curveToRelative(-2.24f, -9.03f, -13.54f, -12.09f, -20.12f, -5.51f)
                lineToRelative(-74.36f, 74.36f)
                lineToRelative(-67.88f, -11.31f)
                lineToRelative(-11.31f, -67.88f)
                lineToRelative(74.36f, -74.36f)
                curveToRelative(6.62f, -6.62f, 3.43f, -17.9f, -5.66f, -20.16f)
                curveToRelative(-47.38f, -11.74f, -99.55f, 0.91f, -136.58f, 37.93f)
                curveToRelative(-39.64f, 39.64f, -50.55f, 97.1f, -34.05f, 147.2f)
                lineTo(18.74f, 402.76f)
                curveToRelative(-24.99f, 24.99f, -24.99f, 65.51f, 0.0f, 90.5f)
                curveToRelative(24.99f, 24.99f, 65.51f, 24.99f, 90.5f, 0.0f)
                lineToRelative(213.21f, -213.21f)
                curveToRelative(50.12f, 16.71f, 107.47f, 5.68f, 147.37f, -34.22f)
                curveToRelative(37.07f, -37.07f, 49.7f, -89.32f, 37.91f, -136.73f)
                close()
                moveTo(64.0f, 472.0f)
                curveToRelative(-13.25f, 0.0f, -24.0f, -10.75f, -24.0f, -24.0f)
                curveToRelative(0.0f, -13.26f, 10.75f, -24.0f, 24.0f, -24.0f)
                reflectiveCurveToRelative(24.0f, 10.74f, 24.0f, 24.0f)
                curveToRelative(0.0f, 13.25f, -10.75f, 24.0f, -24.0f, 24.0f)
                close()
            }
        }
        .build()
        return _wrench!!
    }

private var _wrench: ImageVector? = null
