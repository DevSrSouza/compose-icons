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

public val SolidGroup.Copyright: ImageVector
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
                moveTo(373.13f, 354.75f)
                curveToRelative(-1.59f, 1.87f, -39.78f, 45.73f, -109.85f, 45.73f)
                curveToRelative(-84.69f, 0.0f, -144.48f, -63.26f, -144.48f, -145.57f)
                curveToRelative(0.0f, -81.3f, 62.0f, -143.4f, 143.76f, -143.4f)
                curveToRelative(66.96f, 0.0f, 101.96f, 37.31f, 103.42f, 38.9f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 1.24f, 14.62f)
                lineToRelative(-22.38f, 34.65f)
                curveToRelative(-4.05f, 6.27f, -12.77f, 7.35f, -18.23f, 2.3f)
                curveToRelative(-0.23f, -0.21f, -26.53f, -23.88f, -61.88f, -23.88f)
                curveToRelative(-46.12f, 0.0f, -73.92f, 33.58f, -73.92f, 76.08f)
                curveToRelative(0.0f, 39.6f, 25.51f, 79.69f, 74.28f, 79.69f)
                curveToRelative(38.7f, 0.0f, 65.28f, -28.34f, 65.54f, -28.63f)
                curveToRelative(5.13f, -5.57f, 14.06f, -5.03f, 18.51f, 1.05f)
                lineToRelative(24.55f, 33.57f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -0.55f, 14.87f)
                close()
            }
        }
        .build()
        return _copyright!!
    }

private var _copyright: ImageVector? = null
