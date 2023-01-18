package compose.icons.ionicons

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
import compose.icons.IonIcons

public val IonIcons.LogoIonic: ImageVector
    get() {
        if (_logoIonic != null) {
            return _logoIonic!!
        }
        _logoIonic = Builder(name = "LogoIonic", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 153.9f)
                arcTo(102.1f, 102.1f, 0.0f, true, false, 358.1f, 256.0f)
                arcTo(102.23f, 102.23f, 0.0f, false, false, 256.0f, 153.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(402.59f, 116.45f)
                moveToRelative(-46.52f, 0.0f)
                arcToRelative(46.52f, 46.52f, 0.0f, true, true, 93.04f, 0.0f)
                arcToRelative(46.52f, 46.52f, 0.0f, true, true, -93.04f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(459.86f, 163.2f)
                lineToRelative(-1.95f, -4.28f)
                lineToRelative(-3.11f, 3.52f)
                arcToRelative(70.0f, 70.0f, 0.0f, false, true, -28.06f, 19.32f)
                lineToRelative(-3.0f, 1.1f)
                lineToRelative(1.22f, 2.93f)
                arcTo(181.43f, 181.43f, 0.0f, false, true, 439.0f, 256.0f)
                curveToRelative(0.0f, 100.92f, -82.1f, 183.0f, -183.0f, 183.0f)
                reflectiveCurveTo(73.0f, 356.92f, 73.0f, 256.0f)
                reflectiveCurveTo(155.08f, 73.0f, 256.0f, 73.0f)
                arcToRelative(180.94f, 180.94f, 0.0f, false, true, 78.43f, 17.7f)
                lineTo(337.3f, 92.0f)
                lineToRelative(1.25f, -2.92f)
                arcTo(70.19f, 70.19f, 0.0f, false, true, 359.21f, 62.0f)
                lineToRelative(3.67f, -2.93f)
                lineTo(358.71f, 57.0f)
                arcTo(221.61f, 221.61f, 0.0f, false, false, 256.0f, 32.0f)
                curveTo(132.49f, 32.0f, 32.0f, 132.49f, 32.0f, 256.0f)
                reflectiveCurveTo(132.49f, 480.0f, 256.0f, 480.0f)
                reflectiveCurveTo(480.0f, 379.51f, 480.0f, 256.0f)
                arcTo(222.19f, 222.19f, 0.0f, false, false, 459.86f, 163.2f)
                close()
            }
        }
        .build()
        return _logoIonic!!
    }

private var _logoIonic: ImageVector? = null
