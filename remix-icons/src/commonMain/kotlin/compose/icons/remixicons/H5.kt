package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.H5: ImageVector
    get() {
        if (_h5 != null) {
            return _h5!!
        }
        _h5 = Builder(name = "H5", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.323f)
                lineToRelative(-0.464f, 2.636f)
                curveToRelative(0.33f, -0.089f, 0.678f, -0.136f, 1.037f, -0.136f)
                curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.79f, 4.0f, -4.0f, 4.0f)
                curveToRelative(-1.827f, 0.0f, -3.367f, -1.224f, -3.846f, -2.897f)
                lineToRelative(1.923f, -0.551f)
                curveToRelative(0.24f, 0.836f, 1.01f, 1.448f, 1.923f, 1.448f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                curveToRelative(-0.63f, 0.0f, -1.193f, 0.292f, -1.56f, 0.748f)
                lineToRelative(-1.81f, -0.904f)
                lineTo(16.0f, 8.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(4.0f, 4.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(7.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(7.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _h5!!
    }

private var _h5: ImageVector? = null
