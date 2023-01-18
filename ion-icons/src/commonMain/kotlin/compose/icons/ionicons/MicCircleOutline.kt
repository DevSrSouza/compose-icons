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

public val IonIcons.MicCircleOutline: ImageVector
    get() {
        if (_micCircleOutline != null) {
            return _micCircleOutline!!
        }
        _micCircleOutline = Builder(name = "MicCircleOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(448.0f, 256.0f)
                curveToRelative(0.0f, -106.0f, -86.0f, -192.0f, -192.0f, -192.0f)
                reflectiveCurveTo(64.0f, 150.0f, 64.0f, 256.0f)
                reflectiveCurveToRelative(86.0f, 192.0f, 192.0f, 192.0f)
                reflectiveCurveTo(448.0f, 362.0f, 448.0f, 256.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 368.0f)
                lineTo(288.0f, 368.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(336.0f, 224.3f)
                verticalLineToRelative(23.92f)
                curveToRelative(0.0f, 39.42f, -40.58f, 71.48f, -80.0f, 71.48f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-39.42f, 0.0f, -80.0f, -32.06f, -80.0f, -71.48f)
                verticalLineTo(224.3f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 320.0f)
                lineTo(256.0f, 368.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 128.0f)
                lineTo(256.0f, 128.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 304.0f, 176.0f)
                lineTo(304.0f, 240.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 256.0f, 288.0f)
                lineTo(256.0f, 288.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 208.0f, 240.0f)
                lineTo(208.0f, 176.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 256.0f, 128.0f)
                close()
            }
        }
        .build()
        return _micCircleOutline!!
    }

private var _micCircleOutline: ImageVector? = null
