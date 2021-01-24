package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.Eye: ImageVector
    get() {
        if (_eye != null) {
            return _eye!!
        }
        _eye = Builder(name = "Eye", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, 144.0f)
                arcToRelative(110.94f, 110.94f, 0.0f, false, false, -31.24f, 5.0f)
                arcToRelative(55.4f, 55.4f, 0.0f, false, true, 7.24f, 27.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, -56.0f, 56.0f)
                arcToRelative(55.4f, 55.4f, 0.0f, false, true, -27.0f, -7.24f)
                arcTo(111.71f, 111.71f, 0.0f, true, false, 288.0f, 144.0f)
                close()
                moveTo(572.52f, 241.4f)
                curveTo(518.29f, 135.59f, 410.93f, 64.0f, 288.0f, 64.0f)
                reflectiveCurveTo(57.68f, 135.64f, 3.48f, 241.41f)
                arcToRelative(32.35f, 32.35f, 0.0f, false, false, 0.0f, 29.19f)
                curveTo(57.71f, 376.41f, 165.07f, 448.0f, 288.0f, 448.0f)
                reflectiveCurveToRelative(230.32f, -71.64f, 284.52f, -177.41f)
                arcToRelative(32.35f, 32.35f, 0.0f, false, false, 0.0f, -29.19f)
                close()
                moveTo(288.0f, 400.0f)
                curveToRelative(-98.65f, 0.0f, -189.09f, -55.0f, -237.93f, -144.0f)
                curveTo(98.91f, 167.0f, 189.34f, 112.0f, 288.0f, 112.0f)
                reflectiveCurveToRelative(189.09f, 55.0f, 237.93f, 144.0f)
                curveTo(477.1f, 345.0f, 386.66f, 400.0f, 288.0f, 400.0f)
                close()
            }
        }
        .build()
        return _eye!!
    }

private var _eye: ImageVector? = null
