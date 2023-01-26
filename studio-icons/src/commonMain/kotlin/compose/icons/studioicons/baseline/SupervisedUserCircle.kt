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

public val BaselineGroup.SupervisedUserCircle: ImageVector
    get() {
        if (_supervisedUserCircle != null) {
            return _supervisedUserCircle!!
        }
        _supervisedUserCircle = Builder(name = "SupervisedUserCircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.99f, 2.0f)
                curveToRelative(-5.52f, 0.0f, -10.0f, 4.48f, -10.0f, 10.0f)
                reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f)
                reflectiveCurveToRelative(-4.48f, -10.0f, -10.0f, -10.0f)
                close()
                moveTo(15.6f, 8.34f)
                curveToRelative(1.07f, 0.0f, 1.93f, 0.86f, 1.93f, 1.93f)
                curveToRelative(0.0f, 1.07f, -0.86f, 1.93f, -1.93f, 1.93f)
                curveToRelative(-1.07f, 0.0f, -1.93f, -0.86f, -1.93f, -1.93f)
                curveToRelative(-0.01f, -1.07f, 0.86f, -1.93f, 1.93f, -1.93f)
                close()
                moveTo(9.6f, 6.76f)
                curveToRelative(1.3f, 0.0f, 2.36f, 1.06f, 2.36f, 2.36f)
                curveToRelative(0.0f, 1.3f, -1.06f, 2.36f, -2.36f, 2.36f)
                reflectiveCurveToRelative(-2.36f, -1.06f, -2.36f, -2.36f)
                curveToRelative(0.0f, -1.31f, 1.05f, -2.36f, 2.36f, -2.36f)
                close()
                moveTo(9.6f, 15.89f)
                verticalLineToRelative(3.75f)
                curveToRelative(-2.4f, -0.75f, -4.3f, -2.6f, -5.14f, -4.96f)
                curveToRelative(1.05f, -1.12f, 3.67f, -1.69f, 5.14f, -1.69f)
                curveToRelative(0.53f, 0.0f, 1.2f, 0.08f, 1.9f, 0.22f)
                curveToRelative(-1.64f, 0.87f, -1.9f, 2.02f, -1.9f, 2.68f)
                close()
                moveTo(11.99f, 20.0f)
                curveToRelative(-0.27f, 0.0f, -0.53f, -0.01f, -0.79f, -0.04f)
                verticalLineToRelative(-4.07f)
                curveToRelative(0.0f, -1.42f, 2.94f, -2.13f, 4.4f, -2.13f)
                curveToRelative(1.07f, 0.0f, 2.92f, 0.39f, 3.84f, 1.15f)
                curveToRelative(-1.17f, 2.97f, -4.06f, 5.09f, -7.45f, 5.09f)
                close()
            }
        }
        .build()
        return _supervisedUserCircle!!
    }

private var _supervisedUserCircle: ImageVector? = null
