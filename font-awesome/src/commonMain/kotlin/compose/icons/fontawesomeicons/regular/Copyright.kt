package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.Copyright: ImageVector
    get() {
        if (_copyright != null) {
            return _copyright!!
        }
        _copyright = Builder(name = "Copyright", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 8.0f)
                curveTo(119.03f, 8.0f, 8.0f, 119.03f, 8.0f, 256.0f)
                reflectiveCurveToRelative(111.03f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.03f, 248.0f, -248.0f)
                reflectiveCurveTo(392.97f, 8.0f, 256.0f, 8.0f)
                close()
                moveTo(256.0f, 456.0f)
                curveToRelative(-110.53f, 0.0f, -200.0f, -89.45f, -200.0f, -200.0f)
                curveToRelative(0.0f, -110.53f, 89.45f, -200.0f, 200.0f, -200.0f)
                curveToRelative(110.53f, 0.0f, 200.0f, 89.45f, 200.0f, 200.0f)
                curveToRelative(0.0f, 110.53f, -89.45f, 200.0f, -200.0f, 200.0f)
                close()
                moveTo(363.35f, 354.94f)
                curveToRelative(-9.61f, 9.71f, -45.53f, 41.4f, -104.07f, 41.4f)
                curveToRelative(-82.43f, 0.0f, -140.48f, -61.42f, -140.48f, -141.57f)
                curveToRelative(0.0f, -79.15f, 60.28f, -139.4f, 139.76f, -139.4f)
                curveToRelative(55.53f, 0.0f, 88.74f, 26.62f, 97.59f, 34.78f)
                arcToRelative(11.97f, 11.97f, 0.0f, false, true, 1.94f, 15.32f)
                lineToRelative(-18.16f, 28.11f)
                curveToRelative(-3.84f, 5.95f, -11.97f, 7.28f, -17.5f, 2.92f)
                curveToRelative(-8.6f, -6.78f, -31.81f, -22.54f, -61.71f, -22.54f)
                curveToRelative(-48.3f, 0.0f, -77.92f, 35.33f, -77.92f, 80.08f)
                curveToRelative(0.0f, 41.59f, 26.89f, 83.69f, 78.28f, 83.69f)
                curveToRelative(32.66f, 0.0f, 56.84f, -19.04f, 65.73f, -27.23f)
                curveToRelative(5.27f, -4.86f, 13.6f, -4.04f, 17.82f, 1.74f)
                lineToRelative(19.86f, 27.17f)
                arcToRelative(11.95f, 11.95f, 0.0f, false, true, -1.15f, 15.52f)
                close()
            }
        }
        .build()
        return _copyright!!
    }

private var _copyright: ImageVector? = null
