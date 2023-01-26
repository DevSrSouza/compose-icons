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

public val RoundGroup.LocationOff: ImageVector
    get() {
        if (_locationOff != null) {
            return _locationOff!!
        }
        _locationOff = Builder(name = "LocationOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.71f, 3.56f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(2.47f, 2.47f)
                curveTo(5.07f, 7.95f, 5.0f, 8.47f, 5.0f, 9.0f)
                curveToRelative(0.0f, 4.17f, 4.42f, 9.92f, 6.23f, 12.11f)
                curveToRelative(0.4f, 0.48f, 1.13f, 0.48f, 1.53f, 0.0f)
                curveToRelative(0.65f, -0.78f, 1.62f, -2.01f, 2.61f, -3.46f)
                lineToRelative(2.65f, 2.65f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                lineTo(4.12f, 3.56f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(-1.84f, 0.0f, -3.5f, 0.71f, -4.75f, 1.86f)
                lineToRelative(3.19f, 3.19f)
                curveToRelative(0.43f, -0.34f, 0.97f, -0.55f, 1.56f, -0.55f)
                curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f)
                curveToRelative(0.0f, 0.59f, -0.21f, 1.13f, -0.56f, 1.56f)
                lineToRelative(3.55f, 3.55f)
                curveTo(18.37f, 12.36f, 19.0f, 10.57f, 19.0f, 9.0f)
                curveToRelative(0.0f, -3.87f, -3.13f, -7.0f, -7.0f, -7.0f)
                close()
            }
        }
        .build()
        return _locationOff!!
    }

private var _locationOff: ImageVector? = null
