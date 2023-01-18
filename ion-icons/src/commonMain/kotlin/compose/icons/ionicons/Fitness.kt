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

public val IonIcons.Fitness: ImageVector
    get() {
        if (_fitness != null) {
            return _fitness!!
        }
        _fitness = Builder(name = "Fitness", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(193.69f, 152.84f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 29.64f, 2.56f)
                lineToRelative(36.4f, 121.36f)
                lineToRelative(30.0f, -59.92f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 28.62f, 0.0f)
                lineTo(345.89f, 272.0f)
                horizontalLineToRelative(96.76f)
                arcTo(213.08f, 213.08f, 0.0f, false, false, 464.0f, 176.65f)
                curveTo(463.37f, 114.54f, 413.54f, 64.0f, 352.92f, 64.0f)
                curveToRelative(-48.09f, 0.0f, -80.0f, 29.54f, -96.92f, 51.0f)
                curveToRelative(-16.88f, -21.49f, -48.83f, -51.0f, -96.92f, -51.0f)
                curveTo(98.46f, 64.0f, 48.63f, 114.54f, 48.0f, 176.65f)
                arcTo(211.13f, 211.13f, 0.0f, false, false, 56.93f, 240.0f)
                horizontalLineToRelative(93.18f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(321.69f, 295.16f)
                lineTo(304.0f, 259.78f)
                lineToRelative(-33.69f, 67.38f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 256.0f, 336.0f)
                quadToRelative(-0.67f, 0.0f, -1.38f, -0.06f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -14.0f, -11.34f)
                lineToRelative(-36.4f, -121.36f)
                lineToRelative(-30.0f, 59.92f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 160.0f, 272.0f)
                horizontalLineTo(69.35f)
                quadToRelative(14.0f, 29.29f, 37.27f, 57.66f)
                curveToRelative(18.77f, 22.88f, 52.8f, 59.46f, 131.39f, 112.81f)
                arcToRelative(31.84f, 31.84f, 0.0f, false, false, 36.0f, 0.0f)
                curveToRelative(78.59f, -53.35f, 112.62f, -89.93f, 131.39f, -112.81f)
                arcToRelative(316.79f, 316.79f, 0.0f, false, false, 19.0f, -25.66f)
                horizontalLineTo(336.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 321.69f, 295.16f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(464.0f, 272.0f)
                horizontalLineTo(442.65f)
                arcToRelative(260.11f, 260.11f, 0.0f, false, true, -18.25f, 32.0f)
                horizontalLineTo(464.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -32.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 240.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 32.0f)
                horizontalLineTo(69.35f)
                arcToRelative(225.22f, 225.22f, 0.0f, false, true, -12.42f, -32.0f)
                close()
            }
        }
        .build()
        return _fitness!!
    }

private var _fitness: ImageVector? = null
