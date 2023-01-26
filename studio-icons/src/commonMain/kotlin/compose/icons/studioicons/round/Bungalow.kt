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

public val RoundGroup.Bungalow: ImageVector
    get() {
        if (_bungalow != null) {
            return _bungalow!!
        }
        _bungalow = Builder(name = "Bungalow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 16.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-5.21f)
                lineToRelative(0.57f, 0.92f)
                curveToRelative(0.29f, 0.47f, 0.91f, 0.61f, 1.38f, 0.32f)
                curveToRelative(0.47f, -0.29f, 0.61f, -0.91f, 0.32f, -1.38f)
                lineTo(12.85f, 4.36f)
                curveToRelative(-0.39f, -0.63f, -1.31f, -0.63f, -1.7f, 0.0f)
                lineTo(4.73f, 14.65f)
                curveToRelative(-0.29f, 0.47f, -0.15f, 1.09f, 0.32f, 1.38f)
                curveToRelative(0.47f, 0.29f, 1.08f, 0.15f, 1.38f, -0.32f)
                lineTo(7.0f, 14.8f)
                verticalLineTo(20.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-4.0f)
                curveTo(11.0f, 16.45f, 11.45f, 16.0f, 12.0f, 16.0f)
                close()
                moveTo(13.0f, 13.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveTo(13.0f, 12.45f, 13.0f, 13.0f)
                close()
            }
        }
        .build()
        return _bungalow!!
    }

private var _bungalow: ImageVector? = null
