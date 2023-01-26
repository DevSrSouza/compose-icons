package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.WifiFind: ImageVector
    get() {
        if (_wifiFind != null) {
            return _wifiFind!!
        }
        _wifiFind = Builder(name = "WifiFind", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.59f, 10.39f)
                lineTo(24.0f, 8.98f)
                curveTo(20.93f, 5.9f, 16.69f, 4.0f, 12.0f, 4.0f)
                curveTo(7.31f, 4.0f, 3.07f, 5.9f, 0.0f, 8.98f)
                lineTo(12.0f, 21.0f)
                lineToRelative(1.41f, -1.42f)
                lineTo(2.93f, 9.08f)
                curveTo(5.45f, 7.16f, 8.59f, 6.0f, 12.0f, 6.0f)
                curveTo(16.13f, 6.0f, 19.88f, 7.68f, 22.59f, 10.39f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 18.59f)
                lineToRelative(-2.56f, -2.56f)
                curveTo(20.79f, 15.44f, 21.0f, 14.75f, 21.0f, 14.0f)
                curveToRelative(0.0f, -2.24f, -1.76f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.76f, -4.0f, 4.0f)
                curveToRelative(0.0f, 2.24f, 1.76f, 4.0f, 4.0f, 4.0f)
                curveToRelative(0.75f, 0.0f, 1.44f, -0.21f, 2.03f, -0.56f)
                lineTo(21.59f, 20.0f)
                lineTo(23.0f, 18.59f)
                close()
                moveTo(15.0f, 14.0f)
                curveToRelative(0.0f, -1.12f, 0.88f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.88f, 2.0f, 2.0f)
                curveToRelative(0.0f, 1.12f, -0.88f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveTo(15.0f, 15.12f, 15.0f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.59f, 10.39f)
                curveTo(19.88f, 7.68f, 16.13f, 6.0f, 12.0f, 6.0f)
                curveTo(8.59f, 6.0f, 5.45f, 7.16f, 2.93f, 9.08f)
                lineToRelative(2.26f, 2.26f)
                lineToRelative(8.24f, 8.24f)
                lineToRelative(0.46f, -0.46f)
                curveTo(12.15f, 18.09f, 11.0f, 16.21f, 11.0f, 14.0f)
                curveToRelative(0.0f, -1.62f, 0.62f, -3.13f, 1.75f, -4.25f)
                reflectiveCurveTo(15.38f, 8.0f, 17.0f, 8.0f)
                curveToRelative(2.21f, 0.0f, 4.09f, 1.15f, 5.13f, 2.89f)
                lineToRelative(0.49f, -0.49f)
                lineToRelative(-0.02f, -0.02f)
                lineTo(22.59f, 10.39f)
                close()
            }
        }
        .build()
        return _wifiFind!!
    }

private var _wifiFind: ImageVector? = null
