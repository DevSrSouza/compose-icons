package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.Wifi: ImageVector
    get() {
        if (_wifi != null) {
            return _wifi!!
        }
        _wifi = Builder(name = "Wifi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.06f, 10.06f)
                curveToRelative(0.51f, 0.51f, 1.32f, 0.56f, 1.87f, 0.1f)
                curveToRelative(4.67f, -3.84f, 11.45f, -3.84f, 16.13f, -0.01f)
                curveToRelative(0.56f, 0.46f, 1.38f, 0.42f, 1.89f, -0.09f)
                curveToRelative(0.59f, -0.59f, 0.55f, -1.57f, -0.1f, -2.1f)
                curveToRelative(-5.71f, -4.67f, -13.97f, -4.67f, -19.69f, 0.0f)
                curveToRelative(-0.65f, 0.52f, -0.7f, 1.5f, -0.1f, 2.1f)
                close()
                moveTo(9.82f, 17.82f)
                lineToRelative(1.47f, 1.47f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                lineToRelative(1.47f, -1.47f)
                curveToRelative(0.47f, -0.47f, 0.37f, -1.28f, -0.23f, -1.59f)
                curveToRelative(-1.22f, -0.63f, -2.68f, -0.63f, -3.91f, 0.0f)
                curveToRelative(-0.57f, 0.31f, -0.68f, 1.12f, -0.21f, 1.59f)
                close()
                moveTo(6.09f, 14.09f)
                curveToRelative(0.49f, 0.49f, 1.26f, 0.54f, 1.83f, 0.13f)
                curveToRelative(2.44f, -1.73f, 5.72f, -1.73f, 8.16f, 0.0f)
                curveToRelative(0.57f, 0.4f, 1.34f, 0.36f, 1.83f, -0.13f)
                lineToRelative(0.01f, -0.01f)
                curveToRelative(0.6f, -0.6f, 0.56f, -1.62f, -0.13f, -2.11f)
                curveToRelative(-3.44f, -2.49f, -8.13f, -2.49f, -11.58f, 0.0f)
                curveToRelative(-0.69f, 0.5f, -0.73f, 1.51f, -0.12f, 2.12f)
                close()
            }
        }
        .build()
        return _wifi!!
    }

private var _wifi: ImageVector? = null
