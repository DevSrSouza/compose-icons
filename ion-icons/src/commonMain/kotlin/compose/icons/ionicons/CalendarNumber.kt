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

public val IonIcons.CalendarNumber: ImageVector
    get() {
        if (_calendarNumber != null) {
            return _calendarNumber!!
        }
        _calendarNumber = Builder(name = "CalendarNumber", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(416.0f, 64.0f)
                horizontalLineTo(400.0f)
                verticalLineTo(48.45f)
                curveToRelative(0.0f, -8.61f, -6.62f, -16.0f, -15.23f, -16.43f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 368.0f, 48.0f)
                verticalLineTo(64.0f)
                horizontalLineTo(144.0f)
                verticalLineTo(48.45f)
                curveToRelative(0.0f, -8.61f, -6.62f, -16.0f, -15.23f, -16.43f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 112.0f, 48.0f)
                verticalLineTo(64.0f)
                horizontalLineTo(96.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, -64.0f, 64.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineTo(476.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                verticalLineTo(128.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 416.0f, 64.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(476.0f, 176.0f)
                horizontalLineTo(36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineTo(416.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 64.0f, 64.0f)
                horizontalLineTo(416.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 64.0f, -64.0f)
                verticalLineTo(180.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 476.0f, 176.0f)
                close()
                moveTo(239.58f, 401.1f)
                curveToRelative(-12.17f, 9.61f, -28.75f, 14.9f, -46.7f, 14.9f)
                curveToRelative(-27.87f, 0.0f, -48.48f, -18.16f, -57.66f, -33.7f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 162.78f, 366.0f)
                curveToRelative(1.08f, 1.84f, 11.15f, 18.0f, 30.1f, 18.0f)
                curveToRelative(16.66f, 0.0f, 36.12f, -7.29f, 36.12f, -27.82f)
                curveToRelative(0.0f, -6.25f, -1.22f, -14.95f, -7.0f, -20.88f)
                curveToRelative(-8.54f, -8.74f, -22.75f, -12.67f, -30.11f, -12.67f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, -32.0f)
                curveToRelative(4.85f, 0.0f, 17.41f, -2.6f, 25.28f, -10.65f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 6.57f, -16.08f)
                curveToRelative(0.0f, -23.23f, -28.63f, -23.9f, -31.89f, -23.9f)
                curveToRelative(-17.34f, 0.0f, -23.8f, 10.61f, -24.07f, 11.06f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -27.55f, -16.26f)
                curveToRelative(7.64f, -13.0f, 25.22f, -26.8f, 51.62f, -26.8f)
                curveToRelative(16.44f, 0.0f, 31.76f, 4.77f, 43.13f, 13.42f)
                curveToRelative(13.39f, 10.2f, 20.76f, 25.28f, 20.76f, 42.48f)
                arcTo(54.0f, 54.0f, 0.0f, false, true, 240.0f, 302.35f)
                curveToRelative(-1.15f, 1.18f, -2.36f, 2.28f, -3.59f, 3.35f)
                arcToRelative(66.18f, 66.18f, 0.0f, false, true, 8.42f, 7.23f)
                curveToRelative(10.56f, 10.8f, 16.14f, 25.75f, 16.14f, 43.25f)
                curveTo(261.0f, 374.24f, 253.39f, 390.19f, 239.58f, 401.1f)
                close()
                moveTo(368.0f, 396.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -32.0f, 0.0f)
                verticalLineTo(256.29f)
                lineToRelative(-22.51f, 16.59f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -19.0f, -25.76f)
                lineToRelative(43.42f, -32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 9.49f, -3.12f)
                horizontalLineTo(352.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                close()
            }
        }
        .build()
        return _calendarNumber!!
    }

private var _calendarNumber: ImageVector? = null
