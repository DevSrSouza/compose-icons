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

public val IonIcons.TrainOutline: ImageVector
    get() {
        if (_trainOutline != null) {
            return _trainOutline!!
        }
        _trainOutline = Builder(name = "TrainOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(344.0f, 48.0f)
                lineTo(320.0f, 48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(208.0f, 32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                lineTo(168.0f, 48.0f)
                arcToRelative(56.16f, 56.16f, 0.0f, false, false, -56.0f, 56.0f)
                lineTo(112.0f, 351.0f)
                curveToRelative(0.0f, 35.3f, 144.0f, 65.0f, 144.0f, 65.0f)
                reflectiveCurveToRelative(144.0f, -29.7f, 144.0f, -65.0f)
                lineTo(400.0f, 104.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, false, 344.0f, 48.0f)
                close()
                moveTo(256.0f, 352.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 48.0f, -48.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 256.0f, 352.0f)
                close()
                moveTo(352.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(176.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(160.0f, 128.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, -16.0f)
                lineTo(336.0f, 112.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(144.0f, 464.0f)
                lineTo(368.0f, 464.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(336.0f, 432.0f)
                lineTo(384.0f, 480.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(176.0f, 432.0f)
                lineTo(128.0f, 480.0f)
            }
        }
        .build()
        return _trainOutline!!
    }

private var _trainOutline: ImageVector? = null
