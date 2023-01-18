package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.BulbOutline: ImageVector
    get() {
        if (_bulbOutline != null) {
            return _bulbOutline!!
        }
        _bulbOutline = Builder(name = "BulbOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(304.0f, 384.0f)
                verticalLineTo(360.0f)
                curveToRelative(0.0f, -29.0f, 31.54f, -56.43f, 52.0f, -76.0f)
                curveToRelative(28.84f, -27.57f, 44.0f, -64.61f, 44.0f, -108.0f)
                curveToRelative(0.0f, -80.0f, -63.73f, -144.0f, -144.0f, -144.0f)
                arcTo(143.6f, 143.6f, 0.0f, false, false, 112.0f, 176.0f)
                curveToRelative(0.0f, 41.84f, 15.81f, 81.39f, 44.0f, 108.0f)
                curveToRelative(20.35f, 19.21f, 52.0f, 46.7f, 52.0f, 76.0f)
                verticalLineToRelative(24.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 480.0f)
                lineTo(288.0f, 480.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(208.0f, 432.0f)
                lineTo(304.0f, 432.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 384.0f)
                lineTo(256.0f, 256.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(294.0f, 240.0f)
                reflectiveCurveToRelative(-21.51f, 16.0f, -38.0f, 16.0f)
                reflectiveCurveToRelative(-38.0f, -16.0f, -38.0f, -16.0f)
            }
        }
        .build()
        return _bulbOutline!!
    }

private var _bulbOutline: ImageVector? = null
