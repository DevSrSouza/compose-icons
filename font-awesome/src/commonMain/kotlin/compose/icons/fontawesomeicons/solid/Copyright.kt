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
                curveTo(119.033f, 8.0f, 8.0f, 119.033f, 8.0f, 256.0f)
                reflectiveCurveToRelative(111.033f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.033f, 248.0f, -248.0f)
                reflectiveCurveTo(392.967f, 8.0f, 256.0f, 8.0f)
                close()
                moveTo(373.134f, 354.753f)
                curveToRelative(-1.592f, 1.867f, -39.776f, 45.731f, -109.851f, 45.731f)
                curveToRelative(-84.692f, 0.0f, -144.484f, -63.26f, -144.484f, -145.567f)
                curveToRelative(0.0f, -81.303f, 62.004f, -143.401f, 143.762f, -143.401f)
                curveToRelative(66.957f, 0.0f, 101.965f, 37.315f, 103.422f, 38.904f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 1.238f, 14.623f)
                lineToRelative(-22.38f, 34.655f)
                curveToRelative(-4.049f, 6.267f, -12.774f, 7.351f, -18.234f, 2.295f)
                curveToRelative(-0.233f, -0.214f, -26.529f, -23.88f, -61.88f, -23.88f)
                curveToRelative(-46.116f, 0.0f, -73.916f, 33.575f, -73.916f, 76.082f)
                curveToRelative(0.0f, 39.602f, 25.514f, 79.692f, 74.277f, 79.692f)
                curveToRelative(38.697f, 0.0f, 65.28f, -28.338f, 65.544f, -28.625f)
                curveToRelative(5.132f, -5.565f, 14.059f, -5.033f, 18.508f, 1.053f)
                lineToRelative(24.547f, 33.572f)
                arcToRelative(12.001f, 12.001f, 0.0f, false, true, -0.553f, 14.866f)
                close()
            }
        }
        .build()
        return _copyright!!
    }

private var _copyright: ImageVector? = null
