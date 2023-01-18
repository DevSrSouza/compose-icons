package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.BuildSharp: ImageVector
    get() {
        if (_buildSharp != null) {
            return _buildSharp!!
        }
        _buildSharp = Builder(name = "BuildSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.0f, 209.2f)
                lineTo(32.0f, 405.58f)
                lineTo(106.65f, 480.0f)
                lineTo(304.24f, 281.83f)
                curveToRelative(46.47f, 17.46f, 105.52f, 12.54f, 143.0f, -24.78f)
                curveToRelative(40.44f, -40.32f, 40.35f, -108.0f, 16.81f, -156.79f)
                lineToRelative(-87.33f, 87.06f)
                lineToRelative(-52.32f, -52.13f)
                lineToRelative(87.33f, -87.06f)
                curveTo(363.0f, 24.46f, 294.67f, 24.34f, 254.23f, 64.66f)
                curveTo(216.2f, 102.57f, 211.45f, 162.26f, 230.0f, 209.2f)
                close()
            }
        }
        .build()
        return _buildSharp!!
    }

private var _buildSharp: ImageVector? = null
