package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.GradienterLine: ImageVector
    get() {
        if (_gradienterLine != null) {
            return _gradienterLine!!
        }
        _gradienterLine = Builder(name = "GradienterLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.05f, 13.0f)
                horizontalLineToRelative(2.012f)
                arcToRelative(8.001f, 8.001f, 0.0f, false, false, 15.876f, 0.0f)
                horizontalLineToRelative(2.013f)
                curveToRelative(-0.502f, 5.053f, -4.766f, 9.0f, -9.951f, 9.0f)
                curveToRelative(-5.185f, 0.0f, -9.449f, -3.947f, -9.95f, -9.0f)
                close()
                moveTo(2.05f, 11.0f)
                curveTo(2.55f, 5.947f, 6.814f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(9.449f, 3.947f, 9.95f, 9.0f)
                horizontalLineToRelative(-2.012f)
                arcToRelative(8.001f, 8.001f, 0.0f, false, false, -15.876f, 0.0f)
                lineTo(2.049f, 11.0f)
                close()
                moveTo(12.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 4.0f)
                close()
            }
        }
        .build()
        return _gradienterLine!!
    }

private var _gradienterLine: ImageVector? = null
