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

public val RoundGroup.Pinch: ImageVector
    get() {
        if (_pinch != null) {
            return _pinch!!
        }
        _pinch = Builder(name = "Pinch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.2f, 17.43f)
                curveToRelative(0.0f, -0.65f, 0.6f, -1.13f, 1.24f, -0.99f)
                lineTo(13.0f, 17.24f)
                verticalLineTo(6.5f)
                curveTo(13.0f, 5.67f, 13.67f, 5.0f, 14.5f, 5.0f)
                reflectiveCurveTo(16.0f, 5.67f, 16.0f, 6.5f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(0.91f)
                curveToRelative(0.31f, 0.0f, 0.62f, 0.07f, 0.89f, 0.21f)
                lineToRelative(4.09f, 2.04f)
                curveToRelative(0.77f, 0.38f, 1.21f, 1.22f, 1.09f, 2.07f)
                lineToRelative(-0.63f, 4.46f)
                curveTo(22.21f, 22.27f, 21.36f, 23.0f, 20.37f, 23.0f)
                horizontalLineToRelative(-6.16f)
                curveToRelative(-0.53f, 0.0f, -1.29f, -0.21f, -1.66f, -0.59f)
                lineToRelative(-4.07f, -4.29f)
                curveTo(8.3f, 17.94f, 8.2f, 17.69f, 8.2f, 17.43f)
                close()
                moveTo(9.5f, 5.25f)
                curveTo(9.5f, 5.66f, 9.84f, 6.0f, 10.25f, 6.0f)
                reflectiveCurveTo(11.0f, 5.66f, 11.0f, 5.25f)
                verticalLineTo(2.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(6.75f)
                curveTo(6.34f, 1.0f, 6.0f, 1.34f, 6.0f, 1.75f)
                reflectiveCurveTo(6.34f, 2.5f, 6.75f, 2.5f)
                horizontalLineToRelative(1.69f)
                lineTo(2.5f, 8.44f)
                verticalLineTo(6.75f)
                curveTo(2.5f, 6.34f, 2.16f, 6.0f, 1.75f, 6.0f)
                reflectiveCurveTo(1.0f, 6.34f, 1.0f, 6.75f)
                verticalLineTo(10.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(3.25f)
                curveTo(5.66f, 11.0f, 6.0f, 10.66f, 6.0f, 10.25f)
                reflectiveCurveTo(5.66f, 9.5f, 5.25f, 9.5f)
                horizontalLineTo(3.56f)
                lineTo(9.5f, 3.56f)
                verticalLineTo(5.25f)
                close()
            }
        }
        .build()
        return _pinch!!
    }

private var _pinch: ImageVector? = null
