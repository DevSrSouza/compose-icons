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

public val SimpleIcons.C: ImageVector
    get() {
        if (_c != null) {
            return _c!!
        }
        _c = Builder(name = "C", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5921f, 9.1962f)
                reflectiveCurveToRelative(-0.354f, -3.298f, -3.627f, -3.39f)
                curveToRelative(-3.2741f, -0.09f, -4.9552f, 2.474f, -4.9552f, 6.14f)
                curveToRelative(0.0f, 3.6651f, 1.858f, 6.5972f, 5.0451f, 6.5972f)
                curveToRelative(3.184f, 0.0f, 3.5381f, -3.665f, 3.5381f, -3.665f)
                lineToRelative(6.1041f, 0.365f)
                reflectiveCurveToRelative(0.36f, 3.31f, -2.196f, 5.836f)
                curveToRelative(-2.552f, 2.5241f, -5.6901f, 2.9371f, -7.8762f, 2.9201f)
                curveToRelative(-2.19f, -0.017f, -5.2261f, 0.034f, -8.1602f, -2.97f)
                curveToRelative(-2.938f, -3.0101f, -3.436f, -5.9302f, -3.436f, -8.8002f)
                curveToRelative(0.0f, -2.8701f, 0.556f, -6.6702f, 4.047f, -9.5502f)
                curveTo(7.444f, 0.72f, 9.849f, 0.0f, 12.254f, 0.0f)
                curveToRelative(10.0422f, 0.0f, 10.7172f, 9.2602f, 10.7172f, 9.2602f)
                close()
            }
        }
        .build()
        return _c!!
    }

private var _c: ImageVector? = null
