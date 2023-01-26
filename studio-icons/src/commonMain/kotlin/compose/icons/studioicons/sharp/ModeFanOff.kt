package compose.icons.studioicons.sharp

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
import compose.icons.studioicons.SharpGroup

public val SharpGroup.ModeFanOff: ImageVector
    get() {
        if (_modeFanOff != null) {
            return _modeFanOff!!
        }
        _modeFanOff = Builder(name = "ModeFanOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.34f, 8.36f)
                lineToRelative(-2.29f, 0.82f)
                curveToRelative(-0.18f, -0.13f, -0.38f, -0.25f, -0.58f, -0.34f)
                curveToRelative(0.17f, -0.83f, 0.63f, -1.58f, 1.36f, -2.06f)
                curveTo(16.85f, 5.44f, 16.18f, 2.0f, 13.39f, 2.0f)
                curveToRelative(-3.08f, 0.0f, -4.9f, 1.47f, -5.3f, 3.26f)
                lineTo(18.73f, 15.9f)
                curveToRelative(1.5f, 0.39f, 3.27f, -0.51f, 3.27f, -2.51f)
                curveTo(22.0f, 9.0f, 18.99f, 7.16f, 16.34f, 8.36f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                lineTo(5.27f, 8.1f)
                curveTo(3.77f, 7.7f, 2.0f, 8.61f, 2.0f, 10.61f)
                curveToRelative(0.0f, 4.4f, 3.01f, 6.24f, 5.66f, 5.03f)
                lineToRelative(2.29f, -0.82f)
                curveToRelative(0.18f, 0.13f, 0.38f, 0.25f, 0.58f, 0.34f)
                curveToRelative(-0.17f, 0.83f, -0.63f, 1.58f, -1.36f, 2.06f)
                curveTo(7.15f, 18.56f, 7.82f, 22.0f, 10.61f, 22.0f)
                curveToRelative(3.08f, 0.0f, 4.9f, -1.47f, 5.3f, -3.26f)
                lineToRelative(3.87f, 3.87f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.81f, 2.81f)
                close()
            }
        }
        .build()
        return _modeFanOff!!
    }

private var _modeFanOff: ImageVector? = null
