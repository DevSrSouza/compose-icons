package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.BalloonOutline: ImageVector
    get() {
        if (_balloonOutline != null) {
            return _balloonOutline!!
        }
        _balloonOutline = Builder(name = "BalloonOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(414.11f, 153.82f)
                curveTo(429.66f, 264.4f, 345.85f, 357.09f, 282.54f, 366.0f)
                reflectiveCurveToRelative(-169.48f, -57.5f, -185.0f, -167.68f)
                arcToRelative(159.82f, 159.82f, 0.0f, true, true, 316.53f, -44.49f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(236.06f, 308.05f)
                curveToRelative(-32.83f, -13.0f, -67.08f, -43.1f, -82.27f, -85.46f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(367.7f, 495.78f)
                curveToRelative(-32.83f, -13.0f, -63.31f, -40.06f, -78.5f, -82.41f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(266.71f, 368.21f)
                lineToRelative(-9.17f, 49.61f)
                lineToRelative(63.31f, -8.9f)
                lineToRelative(-22.49f, -45.16f)
                lineToRelative(-31.65f, 4.45f)
                close()
            }
        }
        .build()
        return _balloonOutline!!
    }

private var _balloonOutline: ImageVector? = null
