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

public val IonIcons.FitnessSharp: ImageVector
    get() {
        if (_fitnessSharp != null) {
            return _fitnessSharp!!
        }
        _fitnessSharp = Builder(name = "FitnessSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.0f, 272.0f)
                horizontalLineTo(442.66f)
                arcToRelative(261.41f, 261.41f, 0.0f, false, true, -18.25f, 32.0f)
                horizontalLineTo(480.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 240.0f)
                verticalLineToRelative(32.0f)
                horizontalLineTo(69.34f)
                arcToRelative(225.1f, 225.1f, 0.0f, false, true, -12.4f, -32.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(304.0f, 259.78f)
                lineTo(252.27f, 363.24f)
                lineToRelative(-48.0f, -160.0f)
                lineTo(169.89f, 272.0f)
                horizontalLineTo(69.34f)
                curveToRelative(10.0f, 20.92f, 23.5f, 41.41f, 40.63f, 61.68f)
                curveToRelative(40.12f, 47.46f, 94.25f, 79.75f, 137.0f, 108.32f)
                lineToRelative(9.0f, 6.0f)
                lineToRelative(9.0f, -6.0f)
                curveToRelative(42.78f, -28.57f, 96.91f, -60.86f, 137.0f, -108.32f)
                arcTo(322.78f, 322.78f, 0.0f, false, false, 424.41f, 304.0f)
                horizontalLineToRelative(-98.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(211.73f, 116.76f)
                lineToRelative(48.0f, 160.0f)
                lineTo(304.0f, 188.22f)
                lineTo(345.89f, 272.0f)
                horizontalLineToRelative(96.77f)
                arcTo(213.13f, 213.13f, 0.0f, false, false, 464.0f, 176.65f)
                curveTo(463.37f, 114.54f, 413.54f, 64.0f, 352.92f, 64.0f)
                curveToRelative(-48.11f, 0.0f, -80.1f, 28.0f, -96.92f, 48.21f)
                curveTo(239.18f, 92.0f, 207.19f, 64.0f, 159.08f, 64.0f)
                curveTo(98.46f, 64.0f, 48.63f, 114.54f, 48.0f, 176.65f)
                arcTo(211.23f, 211.23f, 0.0f, false, false, 56.94f, 240.0f)
                horizontalLineToRelative(93.17f)
                close()
            }
        }
        .build()
        return _fitnessSharp!!
    }

private var _fitnessSharp: ImageVector? = null
