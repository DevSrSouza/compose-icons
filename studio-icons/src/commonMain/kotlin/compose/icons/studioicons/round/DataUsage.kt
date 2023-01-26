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

public val RoundGroup.DataUsage: ImageVector
    get() {
        if (_dataUsage != null) {
            return _dataUsage!!
        }
        _dataUsage = Builder(name = "DataUsage", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 3.87f)
                verticalLineToRelative(0.02f)
                curveToRelative(0.0f, 0.67f, 0.45f, 1.23f, 1.08f, 1.43f)
                curveTo(16.93f, 6.21f, 19.0f, 8.86f, 19.0f, 12.0f)
                curveToRelative(0.0f, 0.52f, -0.06f, 1.01f, -0.17f, 1.49f)
                curveToRelative(-0.14f, 0.64f, 0.12f, 1.3f, 0.69f, 1.64f)
                lineToRelative(0.01f, 0.01f)
                curveToRelative(0.86f, 0.5f, 1.98f, 0.05f, 2.21f, -0.91f)
                curveToRelative(0.17f, -0.72f, 0.26f, -1.47f, 0.26f, -2.23f)
                curveToRelative(0.0f, -4.5f, -2.98f, -8.32f, -7.08f, -9.57f)
                curveToRelative(-0.95f, -0.29f, -1.92f, 0.44f, -1.92f, 1.44f)
                close()
                moveTo(10.94f, 18.92f)
                curveToRelative(-2.99f, -0.43f, -5.42f, -2.86f, -5.86f, -5.84f)
                curveToRelative(-0.54f, -3.6f, 1.66f, -6.77f, 4.83f, -7.76f)
                curveToRelative(0.64f, -0.19f, 1.09f, -0.76f, 1.09f, -1.43f)
                verticalLineToRelative(-0.02f)
                curveToRelative(0.0f, -1.0f, -0.97f, -1.73f, -1.93f, -1.44f)
                curveToRelative(-4.51f, 1.38f, -7.66f, 5.86f, -6.98f, 10.96f)
                curveToRelative(0.59f, 4.38f, 4.13f, 7.92f, 8.51f, 8.51f)
                curveToRelative(3.14f, 0.42f, 6.04f, -0.61f, 8.13f, -2.53f)
                curveToRelative(0.74f, -0.68f, 0.61f, -1.89f, -0.26f, -2.39f)
                curveToRelative(-0.58f, -0.34f, -1.3f, -0.23f, -1.8f, 0.22f)
                curveToRelative(-1.47f, 1.34f, -3.51f, 2.05f, -5.73f, 1.72f)
                close()
            }
        }
        .build()
        return _dataUsage!!
    }

private var _dataUsage: ImageVector? = null
