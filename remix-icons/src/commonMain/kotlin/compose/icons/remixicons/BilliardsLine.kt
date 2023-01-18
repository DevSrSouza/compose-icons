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

public val RemixIcons.BilliardsLine: ImageVector
    get() {
        if (_billiardsLine != null) {
            return _billiardsLine!!
        }
        _billiardsLine = Builder(name = "BilliardsLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(5.523f, 0.0f, 10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveTo(2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 4.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(12.0f, 6.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 0.0f, 12.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                close()
                moveTo(12.0f, 7.75f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -1.88f, 4.147f)
                curveToRelative(-0.565f, 0.457f, -0.92f, 1.118f, -0.92f, 1.853f)
                curveToRelative(0.0f, 1.38f, 1.254f, 2.5f, 2.8f, 2.5f)
                curveToRelative(1.546f, 0.0f, 2.8f, -1.12f, 2.8f, -2.5f)
                curveToRelative(0.0f, -0.735f, -0.355f, -1.396f, -0.92f, -1.852f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 12.0f, 7.75f)
                close()
                moveTo(12.0f, 12.75f)
                curveToRelative(0.753f, 0.0f, 1.3f, 0.488f, 1.3f, 1.0f)
                reflectiveCurveToRelative(-0.547f, 1.0f, -1.3f, 1.0f)
                reflectiveCurveToRelative(-1.3f, -0.488f, -1.3f, -1.0f)
                reflectiveCurveToRelative(0.547f, -1.0f, 1.3f, -1.0f)
                close()
                moveTo(12.0f, 9.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                close()
            }
        }
        .build()
        return _billiardsLine!!
    }

private var _billiardsLine: ImageVector? = null
