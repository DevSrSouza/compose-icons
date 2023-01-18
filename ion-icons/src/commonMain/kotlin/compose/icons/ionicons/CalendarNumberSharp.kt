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

public val IonIcons.CalendarNumberSharp: ImageVector
    get() {
        if (_calendarNumberSharp != null) {
            return _calendarNumberSharp!!
        }
        _calendarNumberSharp = Builder(name = "CalendarNumberSharp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 456.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, 24.0f)
                horizontalLineTo(456.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, -24.0f)
                verticalLineTo(176.0f)
                horizontalLineTo(32.0f)
                close()
                moveTo(342.17f, 212.0f)
                horizontalLineTo(368.0f)
                verticalLineTo(412.0f)
                horizontalLineTo(336.0f)
                verticalLineTo(256.29f)
                lineToRelative(-35.39f, 26.08f)
                lineToRelative(-19.0f, -25.76f)
                close()
                moveTo(222.0f, 335.3f)
                curveToRelative(-8.54f, -8.74f, -22.75f, -12.67f, -30.11f, -12.67f)
                horizontalLineToRelative(-16.0f)
                verticalLineToRelative(-32.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(4.85f, 0.0f, 17.41f, -2.6f, 25.28f, -10.65f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 6.57f, -16.08f)
                curveToRelative(0.0f, -23.23f, -28.63f, -23.9f, -31.89f, -23.9f)
                curveToRelative(-17.34f, 0.0f, -23.8f, 10.61f, -24.07f, 11.06f)
                lineToRelative(-8.13f, 13.78f)
                lineToRelative(-27.56f, -16.27f)
                lineToRelative(8.14f, -13.77f)
                curveToRelative(7.64f, -13.0f, 25.22f, -26.8f, 51.62f, -26.8f)
                curveToRelative(16.44f, 0.0f, 31.76f, 4.77f, 43.13f, 13.42f)
                curveToRelative(13.39f, 10.2f, 20.76f, 25.28f, 20.76f, 42.48f)
                arcTo(54.0f, 54.0f, 0.0f, false, true, 240.0f, 302.35f)
                curveToRelative(-1.15f, 1.18f, -2.36f, 2.28f, -3.59f, 3.35f)
                arcToRelative(66.18f, 66.18f, 0.0f, false, true, 8.42f, 7.23f)
                curveToRelative(10.56f, 10.8f, 16.14f, 25.75f, 16.14f, 43.25f)
                curveToRelative(0.0f, 18.06f, -7.61f, 34.0f, -21.42f, 44.92f)
                curveToRelative(-12.17f, 9.61f, -28.75f, 14.9f, -46.7f, 14.9f)
                curveToRelative(-27.87f, 0.0f, -48.48f, -18.16f, -57.66f, -33.7f)
                lineToRelative(-8.13f, -13.78f)
                lineToRelative(27.56f, -16.27f)
                lineTo(162.78f, 366.0f)
                curveToRelative(1.08f, 1.84f, 11.15f, 18.0f, 30.1f, 18.0f)
                curveToRelative(16.66f, 0.0f, 36.12f, -7.29f, 36.12f, -27.82f)
                curveTo(229.0f, 349.93f, 227.78f, 341.23f, 222.0f, 335.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(456.0f, 64.0f)
                horizontalLineTo(400.08f)
                verticalLineTo(32.0f)
                horizontalLineToRelative(-48.0f)
                verticalLineTo(64.0f)
                horizontalLineTo(159.92f)
                verticalLineTo(32.0f)
                horizontalLineToRelative(-48.0f)
                verticalLineTo(64.0f)
                horizontalLineTo(56.0f)
                arcTo(23.8f, 23.8f, 0.0f, false, false, 32.0f, 87.77f)
                verticalLineTo(144.0f)
                horizontalLineTo(480.0f)
                verticalLineTo(87.77f)
                arcTo(23.8f, 23.8f, 0.0f, false, false, 456.0f, 64.0f)
                close()
            }
        }
        .build()
        return _calendarNumberSharp!!
    }

private var _calendarNumberSharp: ImageVector? = null
