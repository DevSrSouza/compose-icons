package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Splotch: ImageVector
    get() {
        if (_splotch != null) {
            return _splotch!!
        }
        _splotch = Builder(name = "Splotch", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(472.29f, 195.89f)
                lineToRelative(-67.06f, -22.95f)
                curveToRelative(-19.28f, -6.6f, -33.54f, -20.92f, -38.14f, -38.3f)
                lineTo(351.1f, 74.19f)
                curveToRelative(-11.58f, -43.77f, -76.57f, -57.13f, -109.98f, -22.62f)
                lineToRelative(-46.14f, 47.67f)
                curveToRelative(-13.26f, 13.71f, -33.54f, 20.93f, -54.2f, 19.31f)
                lineToRelative(-71.88f, -5.62f)
                curveToRelative(-52.05f, -4.07f, -86.93f, 44.88f, -59.03f, 82.83f)
                lineToRelative(38.54f, 52.42f)
                curveToRelative(11.08f, 15.07f, 12.82f, 33.86f, 4.64f, 50.24f)
                lineTo(24.62f, 355.4f)
                curveToRelative(-20.59f, 41.25f, 22.84f, 84.87f, 73.49f, 73.81f)
                lineToRelative(69.96f, -15.28f)
                curveToRelative(20.11f, -4.39f, 41.45f, 0.0f, 57.07f, 11.73f)
                lineToRelative(54.32f, 40.83f)
                curveToRelative(39.32f, 29.56f, 101.04f, 7.57f, 104.45f, -37.22f)
                lineToRelative(4.7f, -61.86f)
                curveToRelative(1.35f, -17.79f, 12.8f, -33.86f, 30.63f, -42.99f)
                lineToRelative(62.0f, -31.74f)
                curveToRelative(44.88f, -22.96f, 39.59f, -80.17f, -8.95f, -96.79f)
                close()
            }
        }
        .build()
        return _splotch!!
    }

private var _splotch: ImageVector? = null
