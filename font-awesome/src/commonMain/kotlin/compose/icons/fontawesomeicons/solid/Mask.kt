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

public val SolidGroup.Mask: ImageVector
    get() {
        if (_mask != null) {
            return _mask!!
        }
        _mask = Builder(name = "Mask", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.67f, 64.0f)
                curveToRelative(-442.6f, 0.0f, -357.57f, 384.0f, -158.46f, 384.0f)
                curveToRelative(39.9f, 0.0f, 77.47f, -20.69f, 101.42f, -55.86f)
                lineToRelative(25.73f, -37.79f)
                curveToRelative(15.66f, -22.99f, 46.97f, -22.99f, 62.63f, 0.0f)
                lineToRelative(25.73f, 37.79f)
                curveTo(401.66f, 427.31f, 439.23f, 448.0f, 479.13f, 448.0f)
                curveToRelative(189.86f, 0.0f, 290.63f, -384.0f, -158.46f, -384.0f)
                close()
                moveTo(184.0f, 308.36f)
                curveToRelative(-41.06f, 0.0f, -67.76f, -25.66f, -80.08f, -41.05f)
                curveToRelative(-5.23f, -6.53f, -5.23f, -16.09f, 0.0f, -22.63f)
                curveToRelative(12.32f, -15.4f, 39.01f, -41.05f, 80.08f, -41.05f)
                reflectiveCurveToRelative(67.76f, 25.66f, 80.08f, 41.05f)
                curveToRelative(5.23f, 6.53f, 5.23f, 16.09f, 0.0f, 22.63f)
                curveToRelative(-12.32f, 15.4f, -39.02f, 41.05f, -80.08f, 41.05f)
                close()
                moveTo(456.0f, 308.36f)
                curveToRelative(-41.06f, 0.0f, -67.76f, -25.66f, -80.08f, -41.05f)
                curveToRelative(-5.23f, -6.53f, -5.23f, -16.09f, 0.0f, -22.63f)
                curveToRelative(12.32f, -15.4f, 39.01f, -41.05f, 80.08f, -41.05f)
                reflectiveCurveToRelative(67.76f, 25.66f, 80.08f, 41.05f)
                curveToRelative(5.23f, 6.53f, 5.23f, 16.09f, 0.0f, 22.63f)
                curveToRelative(-12.32f, 15.4f, -39.02f, 41.05f, -80.08f, 41.05f)
                close()
            }
        }
        .build()
        return _mask!!
    }

private var _mask: ImageVector? = null
