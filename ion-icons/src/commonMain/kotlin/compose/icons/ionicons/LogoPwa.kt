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

public val IonIcons.LogoPwa: ImageVector
    get() {
        if (_logoPwa != null) {
            return _logoPwa!!
        }
        _logoPwa = Builder(name = "LogoPwa", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(330.7f, 352.0f)
                lineToRelative(77.72f, -192.0f)
                horizontalLineTo(356.9f)
                lineTo(303.74f, 284.07f)
                lineTo(265.93f, 160.0f)
                horizontalLineTo(226.32f)
                lineTo(185.74f, 284.07f)
                lineToRelative(-28.63f, -56.53f)
                lineTo(131.21f, 307.0f)
                lineToRelative(26.3f, 45.0f)
                horizontalLineToRelative(50.7f)
                lineToRelative(36.68f, -111.27f)
                lineToRelative(35.0f, 111.27f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.79f, 286.09f)
                lineTo(80.44f, 286.09f)
                arcToRelative(93.39f, 93.39f, 0.0f, false, false, 25.62f, -3.21f)
                lineToRelative(8.18f, -25.19f)
                lineToRelative(22.88f, -70.39f)
                arcToRelative(55.75f, 55.75f, 0.0f, false, false, -6.0f, -7.82f)
                quadTo(113.54f, 160.0f, 79.59f, 160.0f)
                lineTo(0.0f, 160.0f)
                lineTo(0.0f, 352.0f)
                lineTo(48.79f, 352.0f)
                close()
                moveTo(90.69f, 204.17f)
                quadToRelative(6.89f, 6.92f, 6.88f, 18.52f)
                reflectiveQuadToRelative(-6.0f, 18.53f)
                quadToRelative(-6.64f, 7.62f, -24.44f, 7.61f)
                lineTo(48.79f, 248.83f)
                lineTo(48.79f, 197.25f)
                lineTo(67.21f, 197.25f)
                quadToRelative(16.59f, 0.0f, 23.48f, 6.92f)
                close()
                moveTo(376.85f, 317.61f)
                lineToRelative(14.79f, -37.25f)
                horizontalLineToRelative(42.69f)
                lineToRelative(-20.26f, -56.51f)
                lineTo(439.41f, 160.0f)
                lineTo(512.0f, 352.0f)
                lineTo(458.47f, 352.0f)
                lineToRelative(-12.4f, -34.39f)
                close()
            }
        }
        .build()
        return _logoPwa!!
    }

private var _logoPwa: ImageVector? = null
