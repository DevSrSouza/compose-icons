package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.LocationOff: ImageVector
    get() {
        if (_locationOff != null) {
            return _locationOff!!
        }
        _locationOff = Builder(name = "LocationOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f)
                curveToRelative(0.0f, 1.06f, -0.39f, 2.32f, -1.0f, 3.62f)
                lineToRelative(1.49f, 1.49f)
                curveTo(18.37f, 12.36f, 19.0f, 10.57f, 19.0f, 9.0f)
                curveToRelative(0.0f, -3.87f, -3.13f, -7.0f, -7.0f, -7.0f)
                curveToRelative(-1.84f, 0.0f, -3.5f, 0.71f, -4.75f, 1.86f)
                lineToRelative(1.43f, 1.43f)
                curveTo(9.56f, 4.5f, 10.72f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(12.0f, 6.5f)
                curveToRelative(-0.59f, 0.0f, -1.13f, 0.21f, -1.56f, 0.56f)
                lineToRelative(3.5f, 3.5f)
                curveToRelative(0.35f, -0.43f, 0.56f, -0.97f, 0.56f, -1.56f)
                curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(3.41f, 2.86f)
                lineTo(2.0f, 4.27f)
                lineToRelative(3.18f, 3.18f)
                curveTo(5.07f, 7.95f, 5.0f, 8.47f, 5.0f, 9.0f)
                curveToRelative(0.0f, 5.25f, 7.0f, 13.0f, 7.0f, 13.0f)
                reflectiveCurveToRelative(1.67f, -1.85f, 3.38f, -4.35f)
                lineTo(18.73f, 21.0f)
                lineToRelative(1.41f, -1.41f)
                lineTo(3.41f, 2.86f)
                close()
                moveTo(12.0f, 18.88f)
                curveToRelative(-2.01f, -2.58f, -4.8f, -6.74f, -4.98f, -9.59f)
                lineToRelative(6.92f, 6.92f)
                curveToRelative(-0.65f, 0.98f, -1.33f, 1.89f, -1.94f, 2.67f)
                close()
            }
        }
        .build()
        return _locationOff!!
    }

private var _locationOff: ImageVector? = null
