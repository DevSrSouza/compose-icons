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

public val RoundGroup.Sursound: ImageVector
    get() {
        if (_sursound != null) {
            return _sursound!!
        }
        _sursound = Builder(name = "Sursound", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 4.0f)
                lineTo(4.0f, 4.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(22.0f, 6.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(7.11f, 16.89f)
                curveToRelative(-0.43f, 0.43f, -1.14f, 0.39f, -1.51f, -0.09f)
                curveTo(4.53f, 15.39f, 4.0f, 13.69f, 4.0f, 12.0f)
                reflectiveCurveToRelative(0.53f, -3.38f, 1.59f, -4.8f)
                curveToRelative(0.37f, -0.48f, 1.08f, -0.53f, 1.51f, -0.1f)
                curveToRelative(0.35f, 0.35f, 0.39f, 0.9f, 0.1f, 1.29f)
                curveTo(6.4f, 9.46f, 6.0f, 10.73f, 6.0f, 12.0f)
                reflectiveCurveToRelative(0.4f, 2.53f, 1.2f, 3.6f)
                curveToRelative(0.3f, 0.39f, 0.26f, 0.94f, -0.09f, 1.29f)
                close()
                moveTo(12.0f, 16.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.79f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.79f, 4.0f, -4.0f, 4.0f)
                close()
                moveTo(16.9f, 16.9f)
                curveToRelative(-0.35f, -0.35f, -0.39f, -0.9f, -0.09f, -1.29f)
                curveTo(17.6f, 14.54f, 18.0f, 13.27f, 18.0f, 12.0f)
                reflectiveCurveToRelative(-0.4f, -2.53f, -1.2f, -3.6f)
                curveToRelative(-0.3f, -0.39f, -0.26f, -0.95f, 0.09f, -1.3f)
                curveToRelative(0.43f, -0.43f, 1.14f, -0.39f, 1.51f, 0.09f)
                curveToRelative(1.07f, 1.41f, 1.6f, 3.1f, 1.6f, 4.8f)
                curveToRelative(0.0f, 1.69f, -0.53f, 3.38f, -1.59f, 4.8f)
                curveToRelative(-0.37f, 0.49f, -1.08f, 0.54f, -1.51f, 0.11f)
                close()
                moveTo(12.0f, 10.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _sursound!!
    }

private var _sursound: ImageVector? = null
