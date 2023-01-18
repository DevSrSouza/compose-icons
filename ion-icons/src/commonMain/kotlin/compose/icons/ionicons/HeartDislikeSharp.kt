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

public val IonIcons.HeartDislikeSharp: ImageVector
    get() {
        if (_heartDislikeSharp != null) {
            return _heartDislikeSharp!!
        }
        _heartDislikeSharp = Builder(name = "HeartDislikeSharp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 64.45f)
                lineToRelative(389.47f, 389.94f)
                lineToRelative(22.84f, -22.47f)
                lineToRelative(-389.46f, -389.92f)
                lineToRelative(-22.85f, 22.45f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(62.67f, 192.91f)
                curveToRelative(-0.56f, 55.63f, 19.77f, 106.94f, 62.16f, 156.88f)
                curveTo(165.08f, 397.21f, 219.39f, 429.46f, 262.3f, 458.0f)
                lineToRelative(9.0f, 6.0f)
                lineToRelative(9.0f, -6.0f)
                curveToRelative(18.49f, -12.3f, 39.1f, -25.3f, 59.79f, -39.89f)
                lineTo(71.74f, 149.28f)
                arcTo(114.62f, 114.62f, 0.0f, false, false, 62.67f, 192.91f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(417.83f, 349.79f)
                curveToRelative(42.39f, -49.94f, 62.72f, -101.25f, 62.16f, -156.88f)
                curveToRelative(-0.63f, -62.0f, -50.61f, -112.54f, -111.43f, -112.54f)
                curveToRelative(-48.26f, 0.0f, -80.35f, 28.0f, -97.23f, 48.17f)
                curveToRelative(-16.88f, -20.2f, -49.0f, -48.17f, -97.23f, -48.17f)
                arcTo(108.24f, 108.24f, 0.0f, false, false, 142.84f, 85.0f)
                lineToRelative(270.0f, 270.48f)
                curveTo(414.55f, 353.59f, 416.21f, 351.7f, 417.83f, 349.79f)
                close()
            }
        }
        .build()
        return _heartDislikeSharp!!
    }

private var _heartDislikeSharp: ImageVector? = null
