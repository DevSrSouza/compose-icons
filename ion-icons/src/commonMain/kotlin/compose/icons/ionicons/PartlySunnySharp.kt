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

public val IonIcons.PartlySunnySharp: ImageVector
    get() {
        if (_partlySunnySharp != null) {
            return _partlySunnySharp!!
        }
        _partlySunnySharp = Builder(name = "PartlySunnySharp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(340.0f, 480.0f)
                lineTo(106.0f, 480.0f)
                curveToRelative(-29.5f, 0.0f, -54.92f, -7.83f, -73.53f, -22.64f)
                curveTo(11.23f, 440.44f, 0.0f, 415.35f, 0.0f, 384.8f)
                curveToRelative(0.0f, -26.66f, 10.08f, -49.8f, 29.14f, -66.91f)
                curveToRelative(15.24f, -13.68f, 36.17f, -23.21f, 59.0f, -26.84f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.06f, 0.0f, 0.08f, 0.0f, 0.09f, -0.05f)
                curveToRelative(6.44f, -39.0f, 23.83f, -72.09f, 50.31f, -95.68f)
                arcTo(140.24f, 140.24f, 0.0f, false, true, 232.0f, 160.0f)
                curveToRelative(30.23f, 0.0f, 58.48f, 9.39f, 81.71f, 27.17f)
                arcToRelative(142.69f, 142.69f, 0.0f, false, true, 45.36f, 60.66f)
                curveToRelative(29.41f, 4.82f, 54.72f, 17.11f, 73.19f, 35.54f)
                curveTo(453.0f, 304.11f, 464.0f, 331.71f, 464.0f, 363.2f)
                curveToRelative(0.0f, 32.85f, -13.13f, 62.87f, -37.0f, 84.52f)
                curveTo(404.11f, 468.54f, 373.2f, 480.0f, 340.0f, 480.0f)
                close()
                moveTo(359.0f, 247.82f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(381.5f, 219.89f)
                arcToRelative(169.23f, 169.23f, 0.0f, false, true, 45.44f, 19.0f)
                arcTo(96.0f, 96.0f, 0.0f, false, false, 281.0f, 129.33f)
                quadToRelative(-2.85f, 2.0f, -5.54f, 4.2f)
                arcToRelative(162.47f, 162.47f, 0.0f, false, true, 57.73f, 28.23f)
                arcTo(174.53f, 174.53f, 0.0f, false, true, 381.5f, 219.89f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 192.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(-64.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 32.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(-32.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(255.35f, 129.63f)
                lineToRelative(12.45f, -12.45f)
                lineTo(223.18f, 72.55f)
                lineTo(200.55f, 95.18f)
                lineToRelative(33.17f, 33.17f)
                horizontalLineToRelative(0.6f)
                arcTo(172.0f, 172.0f, 0.0f, false, true, 255.35f, 129.63f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(404.203f, 117.171f)
                lineToRelative(44.626f, -44.626f)
                lineToRelative(22.627f, 22.627f)
                lineToRelative(-44.626f, 44.626f)
                close()
            }
        }
        .build()
        return _partlySunnySharp!!
    }

private var _partlySunnySharp: ImageVector? = null
