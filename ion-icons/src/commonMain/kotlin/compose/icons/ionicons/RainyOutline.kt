package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.RainyOutline: ImageVector
    get() {
        if (_rainyOutline != null) {
            return _rainyOutline!!
        }
        _rainyOutline = Builder(name = "RainyOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(114.61f, 162.85f)
                arcTo(16.07f, 16.07f, 0.0f, false, false, 128.0f, 149.6f)
                curveTo(140.09f, 76.17f, 193.63f, 32.0f, 256.0f, 32.0f)
                curveToRelative(57.93f, 0.0f, 96.62f, 37.75f, 112.2f, 77.74f)
                arcToRelative(15.84f, 15.84f, 0.0f, false, false, 12.2f, 9.87f)
                curveToRelative(50.0f, 8.15f, 91.6f, 41.54f, 91.6f, 99.59f)
                curveTo(472.0f, 278.6f, 423.4f, 320.0f, 364.0f, 320.0f)
                horizontalLineTo(130.0f)
                curveToRelative(-49.5f, 0.0f, -90.0f, -24.7f, -90.0f, -79.2f)
                curveTo(40.0f, 192.33f, 78.67f, 168.58f, 114.61f, 162.85f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(144.0f, 384.0f)
                lineTo(112.0f, 432.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 384.0f)
                lineTo(160.0f, 480.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(304.0f, 384.0f)
                lineTo(272.0f, 432.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(384.0f, 384.0f)
                lineTo(320.0f, 480.0f)
            }
        }
        .build()
        return _rainyOutline!!
    }

private var _rainyOutline: ImageVector? = null
