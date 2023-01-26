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

public val RoundGroup.MonetizationOn: ImageVector
    get() {
        if (_monetizationOn != null) {
            return _monetizationOn!!
        }
        _monetizationOn = Builder(name = "MonetizationOn", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f)
                reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(13.41f, 18.09f)
                verticalLineToRelative(0.58f)
                curveToRelative(0.0f, 0.73f, -0.6f, 1.33f, -1.33f, 1.33f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.73f, 0.0f, -1.33f, -0.6f, -1.33f, -1.33f)
                verticalLineToRelative(-0.6f)
                curveToRelative(-1.33f, -0.28f, -2.51f, -1.01f, -3.01f, -2.24f)
                curveToRelative(-0.23f, -0.55f, 0.2f, -1.16f, 0.8f, -1.16f)
                horizontalLineToRelative(0.24f)
                curveToRelative(0.37f, 0.0f, 0.67f, 0.25f, 0.81f, 0.6f)
                curveToRelative(0.29f, 0.75f, 1.05f, 1.27f, 2.51f, 1.27f)
                curveToRelative(1.96f, 0.0f, 2.4f, -0.98f, 2.4f, -1.59f)
                curveToRelative(0.0f, -0.83f, -0.44f, -1.61f, -2.67f, -2.14f)
                curveToRelative(-2.48f, -0.6f, -4.18f, -1.62f, -4.18f, -3.67f)
                curveToRelative(0.0f, -1.72f, 1.39f, -2.84f, 3.11f, -3.21f)
                verticalLineToRelative(-0.6f)
                curveToRelative(0.0f, -0.73f, 0.6f, -1.33f, 1.33f, -1.33f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.73f, 0.0f, 1.33f, 0.6f, 1.33f, 1.33f)
                verticalLineToRelative(0.62f)
                curveToRelative(1.38f, 0.34f, 2.25f, 1.2f, 2.63f, 2.26f)
                curveToRelative(0.2f, 0.55f, -0.22f, 1.13f, -0.81f, 1.13f)
                horizontalLineToRelative(-0.26f)
                curveToRelative(-0.37f, 0.0f, -0.67f, -0.26f, -0.77f, -0.62f)
                curveToRelative(-0.23f, -0.76f, -0.86f, -1.25f, -2.12f, -1.25f)
                curveToRelative(-1.5f, 0.0f, -2.4f, 0.68f, -2.4f, 1.64f)
                curveToRelative(0.0f, 0.84f, 0.65f, 1.39f, 2.67f, 1.91f)
                reflectiveCurveToRelative(4.18f, 1.39f, 4.18f, 3.91f)
                curveToRelative(-0.02f, 1.83f, -1.39f, 2.83f, -3.13f, 3.16f)
                close()
            }
        }
        .build()
        return _monetizationOn!!
    }

private var _monetizationOn: ImageVector? = null
