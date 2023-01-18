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

public val IonIcons.CalendarNumberOutline: ImageVector
    get() {
        if (_calendarNumberOutline != null) {
            return _calendarNumberOutline!!
        }
        _calendarNumberOutline = Builder(name = "CalendarNumberOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(96.0f, 80.0f)
                lineTo(416.0f, 80.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 464.0f, 128.0f)
                lineTo(464.0f, 416.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 416.0f, 464.0f)
                lineTo(96.0f, 464.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 48.0f, 416.0f)
                lineTo(48.0f, 128.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 96.0f, 80.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 48.0f)
                lineTo(128.0f, 80.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(384.0f, 48.0f)
                lineTo(384.0f, 80.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(464.0f, 160.0f)
                lineTo(48.0f, 160.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(304.0f, 260.0f)
                lineToRelative(43.42f, -32.0f)
                lineToRelative(4.58f, 0.0f)
                lineToRelative(0.0f, 168.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(191.87f, 306.63f)
                curveToRelative(9.11f, 0.0f, 25.79f, -4.28f, 36.72f, -15.47f)
                arcToRelative(37.9f, 37.9f, 0.0f, false, false, 11.13f, -27.26f)
                curveToRelative(0.0f, -26.12f, -22.59f, -39.9f, -47.89f, -39.9f)
                curveToRelative(-21.4f, 0.0f, -33.52f, 11.61f, -37.85f, 18.93f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(149.0f, 374.16f)
                curveToRelative(4.88f, 8.27f, 19.71f, 25.84f, 43.88f, 25.84f)
                curveToRelative(28.59f, 0.0f, 52.12f, -15.94f, 52.12f, -43.82f)
                curveToRelative(0.0f, -12.62f, -3.66f, -24.0f, -11.58f, -32.07f)
                curveToRelative(-12.36f, -12.64f, -31.25f, -17.48f, -41.55f, -17.48f)
            }
        }
        .build()
        return _calendarNumberOutline!!
    }

private var _calendarNumberOutline: ImageVector? = null
