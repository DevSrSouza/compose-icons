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

public val RoundGroup.PermCameraMic: ImageVector
    get() {
        if (_permCameraMic != null) {
            return _permCameraMic!!
        }
        _permCameraMic = Builder(name = "PermCameraMic", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 5.0f)
                horizontalLineToRelative(-3.17f)
                lineToRelative(-1.24f, -1.35f)
                curveToRelative(-0.37f, -0.41f, -0.91f, -0.65f, -1.47f, -0.65f)
                lineTo(9.88f, 3.0f)
                curveToRelative(-0.56f, 0.0f, -1.1f, 0.24f, -1.48f, 0.65f)
                lineTo(7.17f, 5.0f)
                lineTo(4.0f, 5.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-2.09f)
                curveToRelative(-2.45f, -0.42f, -4.41f, -2.32f, -4.89f, -4.75f)
                curveToRelative(-0.12f, -0.61f, 0.38f, -1.16f, 0.99f, -1.16f)
                curveToRelative(0.49f, 0.0f, 0.88f, 0.35f, 0.98f, 0.83f)
                curveTo(8.47f, 15.64f, 10.07f, 17.0f, 12.0f, 17.0f)
                reflectiveCurveToRelative(3.53f, -1.36f, 3.91f, -3.17f)
                curveToRelative(0.1f, -0.48f, 0.5f, -0.83f, 0.98f, -0.83f)
                curveToRelative(0.61f, 0.0f, 1.11f, 0.55f, 0.99f, 1.16f)
                curveToRelative(-0.48f, 2.43f, -2.44f, 4.34f, -4.89f, 4.75f)
                lineTo(12.99f, 21.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(21.99f, 7.0f)
                curveTo(22.0f, 5.9f, 21.1f, 5.0f, 20.0f, 5.0f)
                close()
                moveTo(14.0f, 13.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f)
                lineTo(10.0f, 9.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                verticalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _permCameraMic!!
    }

private var _permCameraMic: ImageVector? = null
