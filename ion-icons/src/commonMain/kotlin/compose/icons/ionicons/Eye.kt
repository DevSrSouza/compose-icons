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

public val IonIcons.Eye: ImageVector
    get() {
        if (_eye != null) {
            return _eye!!
        }
        _eye = Builder(name = "Eye", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 256.0f)
                moveToRelative(-64.0f, 0.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 128.0f, 0.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, -128.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(490.84f, 238.6f)
                curveToRelative(-26.46f, -40.92f, -60.79f, -75.68f, -99.27f, -100.53f)
                curveTo(349.0f, 110.55f, 302.0f, 96.0f, 255.66f, 96.0f)
                curveToRelative(-42.52f, 0.0f, -84.33f, 12.15f, -124.27f, 36.11f)
                curveTo(90.66f, 156.54f, 53.76f, 192.23f, 21.71f, 238.18f)
                arcToRelative(31.92f, 31.92f, 0.0f, false, false, -0.64f, 35.54f)
                curveToRelative(26.41f, 41.33f, 60.4f, 76.14f, 98.28f, 100.65f)
                curveTo(162.0f, 402.0f, 207.9f, 416.0f, 255.66f, 416.0f)
                curveToRelative(46.71f, 0.0f, 93.81f, -14.43f, 136.2f, -41.72f)
                curveToRelative(38.46f, -24.77f, 72.72f, -59.66f, 99.08f, -100.92f)
                arcTo(32.2f, 32.2f, 0.0f, false, false, 490.84f, 238.6f)
                close()
                moveTo(256.0f, 352.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, true, 96.0f, -96.0f)
                arcTo(96.11f, 96.11f, 0.0f, false, true, 256.0f, 352.0f)
                close()
            }
        }
        .build()
        return _eye!!
    }

private var _eye: ImageVector? = null
