package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.StarOfDavid: ImageVector
    get() {
        if (_starOfDavid != null) {
            return _starOfDavid!!
        }
        _starOfDavid = Builder(name = "StarOfDavid", defaultWidth = 464.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 464.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(405.68f, 256.0f)
                lineToRelative(53.21f, -89.39f)
                curveTo(473.3f, 142.4f, 455.48f, 112.0f, 426.88f, 112.0f)
                lineTo(319.96f, 112.0f)
                lineToRelative(-55.95f, -93.98f)
                curveTo(256.86f, 6.01f, 244.43f, 0.0f, 232.0f, 0.0f)
                reflectiveCurveToRelative(-24.86f, 6.01f, -32.01f, 18.02f)
                lineTo(144.04f, 112.0f)
                lineTo(37.11f, 112.0f)
                curveToRelative(-28.6f, 0.0f, -46.42f, 30.4f, -32.01f, 54.61f)
                lineTo(58.32f, 256.0f)
                lineTo(5.1f, 345.39f)
                curveTo(-9.31f, 369.6f, 8.51f, 400.0f, 37.11f, 400.0f)
                horizontalLineToRelative(106.93f)
                lineToRelative(55.95f, 93.98f)
                curveTo(207.14f, 505.99f, 219.57f, 512.0f, 232.0f, 512.0f)
                reflectiveCurveToRelative(24.86f, -6.01f, 32.01f, -18.02f)
                lineTo(319.96f, 400.0f)
                horizontalLineToRelative(106.93f)
                curveToRelative(28.6f, 0.0f, 46.42f, -30.4f, 32.01f, -54.61f)
                lineTo(405.68f, 256.0f)
                close()
                moveTo(392.9f, 168.0f)
                lineToRelative(-19.8f, 33.26f)
                lineTo(353.3f, 168.0f)
                horizontalLineToRelative(39.6f)
                close()
                moveTo(340.51f, 256.0f)
                lineToRelative(-52.39f, 88.0f)
                lineTo(175.88f, 344.0f)
                lineToRelative(-52.39f, -88.0f)
                lineToRelative(52.38f, -88.0f)
                horizontalLineToRelative(112.25f)
                lineToRelative(52.39f, 88.0f)
                close()
                moveTo(232.0f, 73.72f)
                lineTo(254.79f, 112.0f)
                horizontalLineToRelative(-45.57f)
                lineTo(232.0f, 73.72f)
                close()
                moveTo(71.1f, 168.0f)
                horizontalLineToRelative(39.6f)
                lineToRelative(-19.8f, 33.26f)
                lineTo(71.1f, 168.0f)
                close()
                moveTo(71.1f, 344.0f)
                lineToRelative(19.8f, -33.26f)
                lineTo(110.7f, 344.0f)
                lineTo(71.1f, 344.0f)
                close()
                moveTo(232.0f, 438.28f)
                lineTo(209.21f, 400.0f)
                horizontalLineToRelative(45.57f)
                lineTo(232.0f, 438.28f)
                close()
                moveTo(353.29f, 344.0f)
                lineToRelative(19.8f, -33.26f)
                lineTo(392.9f, 344.0f)
                horizontalLineToRelative(-39.61f)
                close()
            }
        }
        .build()
        return _starOfDavid!!
    }

private var _starOfDavid: ImageVector? = null
