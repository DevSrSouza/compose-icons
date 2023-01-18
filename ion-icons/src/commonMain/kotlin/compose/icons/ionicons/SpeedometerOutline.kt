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

public val IonIcons.SpeedometerOutline: ImageVector
    get() {
        if (_speedometerOutline != null) {
            return _speedometerOutline!!
        }
        _speedometerOutline = Builder(name = "SpeedometerOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(326.1f, 231.9f)
                lineToRelative(-47.5f, 75.5f)
                arcToRelative(31.0f, 31.0f, 0.0f, false, true, -7.0f, 7.0f)
                arcToRelative(30.11f, 30.11f, 0.0f, false, true, -35.0f, -49.0f)
                lineToRelative(75.5f, -47.5f)
                arcToRelative(10.23f, 10.23f, 0.0f, false, true, 11.7f, 0.0f)
                arcTo(10.06f, 10.06f, 0.0f, false, true, 326.1f, 231.9f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 64.0f)
                curveTo(132.3f, 64.0f, 32.0f, 164.2f, 32.0f, 287.9f)
                arcTo(223.18f, 223.18f, 0.0f, false, false, 88.3f, 436.4f)
                curveToRelative(1.1f, 1.2f, 2.1f, 2.4f, 3.2f, 3.5f)
                arcToRelative(25.19f, 25.19f, 0.0f, false, false, 37.1f, -0.1f)
                arcToRelative(173.13f, 173.13f, 0.0f, false, true, 254.8f, 0.0f)
                arcToRelative(25.19f, 25.19f, 0.0f, false, false, 37.1f, 0.1f)
                lineToRelative(3.2f, -3.5f)
                arcTo(223.18f, 223.18f, 0.0f, false, false, 480.0f, 287.9f)
                curveTo(480.0f, 164.2f, 379.7f, 64.0f, 256.0f, 64.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 128.0f)
                lineTo(256.0f, 160.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(416.0f, 288.0f)
                lineTo(384.0f, 288.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 288.0f)
                lineTo(96.0f, 288.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(165.49f, 197.49f)
                lineTo(142.86f, 174.86f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(346.51f, 197.49f)
                lineTo(369.14f, 174.86f)
            }
        }
        .build()
        return _speedometerOutline!!
    }

private var _speedometerOutline: ImageVector? = null
