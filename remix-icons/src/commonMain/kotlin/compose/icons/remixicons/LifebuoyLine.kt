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

public val RemixIcons.LifebuoyLine: ImageVector
    get() {
        if (_lifebuoyLine != null) {
            return _lifebuoyLine!!
        }
        _lifebuoyLine = Builder(name = "LifebuoyLine", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(12.0f, 17.0f)
                arcToRelative(4.987f, 4.987f, 0.0f, false, true, -1.828f, -0.345f)
                lineToRelative(-2.236f, 2.237f)
                arcTo(7.963f, 7.963f, 0.0f, false, false, 12.0f, 20.0f)
                arcToRelative(7.963f, 7.963f, 0.0f, false, false, 4.064f, -1.108f)
                lineToRelative(-2.236f, -2.237f)
                arcTo(4.987f, 4.987f, 0.0f, false, true, 12.0f, 17.0f)
                close()
                moveTo(4.0f, 12.0f)
                curveToRelative(0.0f, 1.484f, 0.404f, 2.873f, 1.108f, 4.064f)
                lineToRelative(2.237f, -2.236f)
                arcTo(4.987f, 4.987f, 0.0f, false, true, 7.0f, 12.0f)
                curveToRelative(0.0f, -0.645f, 0.122f, -1.261f, 0.345f, -1.828f)
                lineTo(5.108f, 7.936f)
                arcTo(7.963f, 7.963f, 0.0f, false, false, 4.0f, 12.0f)
                close()
                moveTo(18.892f, 7.936f)
                lineToRelative(-2.237f, 2.236f)
                curveToRelative(0.223f, 0.567f, 0.345f, 1.183f, 0.345f, 1.828f)
                reflectiveCurveToRelative(-0.122f, 1.261f, -0.345f, 1.828f)
                lineToRelative(2.237f, 2.236f)
                arcTo(7.963f, 7.963f, 0.0f, false, false, 20.0f, 12.0f)
                arcToRelative(7.963f, 7.963f, 0.0f, false, false, -1.108f, -4.064f)
                close()
                moveTo(12.0f, 9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, -6.0f)
                close()
                moveTo(12.0f, 4.0f)
                arcToRelative(7.963f, 7.963f, 0.0f, false, false, -4.064f, 1.108f)
                lineToRelative(2.236f, 2.237f)
                arcTo(4.987f, 4.987f, 0.0f, false, true, 12.0f, 7.0f)
                curveToRelative(0.645f, 0.0f, 1.261f, 0.122f, 1.828f, 0.345f)
                lineToRelative(2.236f, -2.237f)
                arcTo(7.963f, 7.963f, 0.0f, false, false, 12.0f, 4.0f)
                close()
            }
        }
        .build()
        return _lifebuoyLine!!
    }

private var _lifebuoyLine: ImageVector? = null
