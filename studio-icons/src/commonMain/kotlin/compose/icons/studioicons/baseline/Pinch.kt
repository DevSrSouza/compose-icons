package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.Pinch: ImageVector
    get() {
        if (_pinch != null) {
            return _pinch!!
        }
        _pinch = Builder(name = "Pinch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 2.5f)
                verticalLineTo(1.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(3.56f)
                lineTo(3.56f, 9.5f)
                horizontalLineTo(6.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(2.44f)
                lineTo(8.44f, 2.5f)
                horizontalLineTo(6.0f)
                close()
                moveTo(22.98f, 16.82f)
                lineToRelative(-0.63f, 4.46f)
                curveTo(22.21f, 22.27f, 21.36f, 23.0f, 20.37f, 23.0f)
                horizontalLineToRelative(-6.16f)
                curveToRelative(-0.53f, 0.0f, -1.29f, -0.21f, -1.66f, -0.59f)
                lineTo(8.0f, 17.62f)
                lineToRelative(0.83f, -0.84f)
                curveToRelative(0.24f, -0.24f, 0.58f, -0.35f, 0.92f, -0.28f)
                lineTo(13.0f, 17.24f)
                verticalLineTo(6.5f)
                curveTo(13.0f, 5.67f, 13.67f, 5.0f, 14.5f, 5.0f)
                reflectiveCurveTo(16.0f, 5.67f, 16.0f, 6.5f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(0.91f)
                curveToRelative(0.31f, 0.0f, 0.62f, 0.07f, 0.89f, 0.21f)
                lineToRelative(4.09f, 2.04f)
                curveTo(22.66f, 15.14f, 23.1f, 15.97f, 22.98f, 16.82f)
                close()
            }
        }
        .build()
        return _pinch!!
    }

private var _pinch: ImageVector? = null
