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

public val IonIcons.MicOutline: ImageVector
    get() {
        if (_micOutline != null) {
            return _micOutline!!
        }
        _micOutline = Builder(name = "MicOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(192.0f, 448.0f)
                lineTo(320.0f, 448.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(384.0f, 208.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 70.4f, -57.6f, 128.0f, -128.0f, 128.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-70.4f, 0.0f, -128.0f, -57.6f, -128.0f, -128.0f)
                verticalLineTo(208.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 368.0f)
                lineTo(256.0f, 448.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 64.0f)
                arcToRelative(63.68f, 63.68f, 0.0f, false, false, -64.0f, 64.0f)
                verticalLineTo(239.0f)
                curveToRelative(0.0f, 35.2f, 29.0f, 65.0f, 64.0f, 65.0f)
                reflectiveCurveToRelative(64.0f, -29.0f, 64.0f, -65.0f)
                verticalLineTo(128.0f)
                curveTo(320.0f, 92.0f, 292.0f, 64.0f, 256.0f, 64.0f)
                close()
            }
        }
        .build()
        return _micOutline!!
    }

private var _micOutline: ImageVector? = null
