package compose.icons.studioicons.sharp

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
import compose.icons.studioicons.SharpGroup

public val SharpGroup.WifiCalling3: ImageVector
    get() {
        if (_wifiCalling3 != null) {
            return _wifiCalling3!!
        }
        _wifiCalling3 = Builder(name = "WifiCalling3", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.49f, 3.0f)
                curveToRelative(-2.21f, 0.0f, -4.21f, 0.9f, -5.66f, 2.34f)
                lineToRelative(1.06f, 1.06f)
                curveToRelative(1.18f, -1.18f, 2.8f, -1.91f, 4.59f, -1.91f)
                reflectiveCurveToRelative(3.42f, 0.73f, 4.59f, 1.91f)
                lineToRelative(1.06f, -1.06f)
                curveTo(20.7f, 3.9f, 18.7f, 3.0f, 16.49f, 3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.03f, 7.46f)
                curveTo(19.12f, 6.56f, 17.87f, 6.0f, 16.49f, 6.0f)
                reflectiveCurveToRelative(-2.63f, 0.56f, -3.54f, 1.46f)
                lineToRelative(1.06f, 1.06f)
                curveToRelative(0.63f, -0.63f, 1.51f, -1.03f, 2.47f, -1.03f)
                reflectiveCurveToRelative(1.84f, 0.39f, 2.47f, 1.03f)
                lineTo(20.03f, 7.46f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.08f, 9.59f)
                lineTo(16.49f, 11.0f)
                lineToRelative(1.41f, -1.41f)
                curveTo(17.54f, 9.22f, 17.04f, 9.0f, 16.49f, 9.0f)
                reflectiveCurveTo(15.44f, 9.22f, 15.08f, 9.59f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 15.0f)
                lineToRelative(-5.0f, -1.0f)
                lineToRelative(-2.9f, 2.9f)
                curveToRelative(-2.5f, -1.43f, -4.57f, -3.5f, -6.0f, -6.0f)
                lineTo(10.0f, 8.0f)
                lineTo(9.0f, 3.0f)
                lineTo(3.0f, 3.0f)
                curveToRelative(0.0f, 3.28f, 0.89f, 6.35f, 2.43f, 9.0f)
                curveToRelative(1.58f, 2.73f, 3.85f, 4.99f, 6.57f, 6.57f)
                curveToRelative(2.65f, 1.53f, 5.72f, 2.43f, 9.0f, 2.43f)
                lineTo(21.0f, 15.0f)
                close()
            }
        }
        .build()
        return _wifiCalling3!!
    }

private var _wifiCalling3: ImageVector? = null
