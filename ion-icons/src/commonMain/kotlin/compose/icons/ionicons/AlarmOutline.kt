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

public val IonIcons.AlarmOutline: ImageVector
    get() {
        if (_alarmOutline != null) {
            return _alarmOutline!!
        }
        _alarmOutline = Builder(name = "AlarmOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(416.07f, 272.0f)
                arcToRelative(160.0f, 160.0f, 0.0f, true, false, -160.0f, 160.0f)
                arcTo(160.0f, 160.0f, 0.0f, false, false, 416.07f, 272.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(142.12f, 91.21f)
                arcTo(46.67f, 46.67f, 0.0f, false, false, 112.0f, 80.0f)
                lineToRelative(-2.79f, 0.08f)
                curveTo(83.66f, 81.62f, 64.0f, 104.0f, 64.07f, 131.0f)
                curveToRelative(0.0f, 13.21f, 4.66f, 19.37f, 10.88f, 27.23f)
                arcTo(4.55f, 4.55f, 0.0f, false, false, 78.19f, 160.0f)
                horizontalLineToRelative(0.88f)
                arcToRelative(3.23f, 3.23f, 0.0f, false, false, 2.54f, -1.31f)
                lineTo(142.38f, 99.0f)
                arcToRelative(5.38f, 5.38f, 0.0f, false, false, 1.55f, -4.0f)
                arcTo(5.26f, 5.26f, 0.0f, false, false, 142.12f, 91.21f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(369.88f, 91.21f)
                arcTo(46.67f, 46.67f, 0.0f, false, true, 400.0f, 80.0f)
                lineToRelative(2.79f, 0.08f)
                curveTo(428.34f, 81.62f, 448.0f, 104.0f, 447.93f, 131.0f)
                curveToRelative(0.0f, 13.21f, -4.66f, 19.37f, -10.88f, 27.23f)
                arcToRelative(4.55f, 4.55f, 0.0f, false, true, -3.24f, 1.76f)
                horizontalLineToRelative(-0.88f)
                arcToRelative(3.23f, 3.23f, 0.0f, false, true, -2.54f, -1.31f)
                lineTo(369.62f, 99.0f)
                arcToRelative(5.38f, 5.38f, 0.0f, false, true, -1.55f, -4.0f)
                arcTo(5.26f, 5.26f, 0.0f, false, true, 369.88f, 91.21f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.07f, 160.0f)
                lineToRelative(0.0f, 112.0f)
                lineToRelative(-80.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(416.07f, 432.0f)
                lineTo(376.07f, 392.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(96.07f, 432.0f)
                lineTo(136.07f, 392.0f)
            }
        }
        .build()
        return _alarmOutline!!
    }

private var _alarmOutline: ImageVector? = null
