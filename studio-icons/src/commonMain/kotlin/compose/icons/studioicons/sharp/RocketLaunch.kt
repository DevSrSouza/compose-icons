package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.RocketLaunch: ImageVector
    get() {
        if (_rocketLaunch != null) {
            return _rocketLaunch!!
        }
        _rocketLaunch = Builder(name = "RocketLaunch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.19f, 6.35f)
                curveToRelative(-2.04f, 2.29f, -3.44f, 5.58f, -3.57f, 5.89f)
                lineTo(2.0f, 10.69f)
                lineToRelative(4.81f, -4.81f)
                lineTo(9.19f, 6.35f)
                lineTo(9.19f, 6.35f)
                close()
                moveTo(11.17f, 17.0f)
                curveToRelative(0.0f, 0.0f, 3.74f, -1.55f, 5.89f, -3.7f)
                curveToRelative(5.4f, -5.4f, 4.5f, -9.62f, 4.21f, -10.57f)
                curveToRelative(-0.95f, -0.3f, -5.17f, -1.19f, -10.57f, 4.21f)
                curveTo(8.55f, 9.09f, 7.0f, 12.83f, 7.0f, 12.83f)
                lineTo(11.17f, 17.0f)
                close()
                moveTo(17.65f, 14.81f)
                curveToRelative(-2.29f, 2.04f, -5.58f, 3.44f, -5.89f, 3.57f)
                lineTo(13.31f, 22.0f)
                lineToRelative(4.81f, -4.81f)
                lineTo(17.65f, 14.81f)
                lineTo(17.65f, 14.81f)
                close()
                moveTo(9.0f, 18.0f)
                curveToRelative(0.0f, 0.83f, -0.34f, 1.58f, -0.88f, 2.12f)
                curveTo(6.94f, 21.3f, 2.0f, 22.0f, 2.0f, 22.0f)
                reflectiveCurveToRelative(0.7f, -4.94f, 1.88f, -6.12f)
                curveTo(4.42f, 15.34f, 5.17f, 15.0f, 6.0f, 15.0f)
                curveTo(7.66f, 15.0f, 9.0f, 16.34f, 9.0f, 18.0f)
                close()
                moveTo(13.0f, 9.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveTo(13.0f, 10.1f, 13.0f, 9.0f)
                close()
            }
        }
        .build()
        return _rocketLaunch!!
    }

private var _rocketLaunch: ImageVector? = null
