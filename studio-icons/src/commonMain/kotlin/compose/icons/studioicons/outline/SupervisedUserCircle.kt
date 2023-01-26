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

public val OutlineGroup.SupervisedUserCircle: ImageVector
    get() {
        if (_supervisedUserCircle != null) {
            return _supervisedUserCircle!!
        }
        _supervisedUserCircle = Builder(name = "SupervisedUserCircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 10.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.35f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.35f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.35f, 3.0f, -3.0f)
                close()
                moveTo(9.5f, 11.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(16.0f, 13.0f)
                curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f)
                curveToRelative(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f)
                curveToRelative(-1.11f, 0.0f, -2.01f, 0.89f, -2.0f, 2.0f)
                curveToRelative(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f)
                close()
                moveTo(11.99f, 2.01f)
                curveToRelative(-5.52f, 0.0f, -10.0f, 4.48f, -10.0f, 10.0f)
                reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f)
                reflectiveCurveToRelative(-4.48f, -10.0f, -10.0f, -10.0f)
                close()
                moveTo(5.84f, 17.12f)
                curveToRelative(0.68f, -0.54f, 2.27f, -1.11f, 3.66f, -1.11f)
                curveToRelative(0.07f, 0.0f, 0.15f, 0.01f, 0.23f, 0.01f)
                curveToRelative(0.24f, -0.64f, 0.67f, -1.29f, 1.3f, -1.86f)
                curveToRelative(-0.56f, -0.1f, -1.09f, -0.16f, -1.53f, -0.16f)
                curveToRelative(-1.3f, 0.0f, -3.39f, 0.45f, -4.73f, 1.43f)
                curveToRelative(-0.5f, -1.04f, -0.78f, -2.2f, -0.78f, -3.43f)
                curveToRelative(0.0f, -4.41f, 3.59f, -8.0f, 8.0f, -8.0f)
                reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f)
                curveToRelative(0.0f, 1.2f, -0.27f, 2.34f, -0.75f, 3.37f)
                curveToRelative(-1.0f, -0.59f, -2.36f, -0.87f, -3.24f, -0.87f)
                curveToRelative(-1.52f, 0.0f, -4.5f, 0.81f, -4.5f, 2.7f)
                verticalLineToRelative(2.78f)
                curveToRelative(-2.27f, -0.13f, -4.29f, -1.21f, -5.66f, -2.86f)
                close()
            }
        }
        .build()
        return _supervisedUserCircle!!
    }

private var _supervisedUserCircle: ImageVector? = null
