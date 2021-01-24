package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.Bell: ImageVector
    get() {
        if (_bell != null) {
            return _bell!!
        }
        _bell = Builder(name = "Bell", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(439.39f, 362.29f)
                curveToRelative(-19.32f, -20.76f, -55.47f, -51.99f, -55.47f, -154.29f)
                curveToRelative(0.0f, -77.7f, -54.48f, -139.9f, -127.94f, -155.16f)
                verticalLineTo(32.0f)
                curveToRelative(0.0f, -17.67f, -14.32f, -32.0f, -31.98f, -32.0f)
                reflectiveCurveToRelative(-31.98f, 14.33f, -31.98f, 32.0f)
                verticalLineToRelative(20.84f)
                curveTo(118.56f, 68.1f, 64.08f, 130.3f, 64.08f, 208.0f)
                curveToRelative(0.0f, 102.3f, -36.15f, 133.53f, -55.47f, 154.29f)
                curveToRelative(-6.0f, 6.45f, -8.66f, 14.16f, -8.61f, 21.71f)
                curveToRelative(0.11f, 16.4f, 12.98f, 32.0f, 32.1f, 32.0f)
                horizontalLineToRelative(383.8f)
                curveToRelative(19.12f, 0.0f, 32.0f, -15.6f, 32.1f, -32.0f)
                curveToRelative(0.05f, -7.55f, -2.61f, -15.27f, -8.61f, -21.71f)
                close()
                moveTo(67.53f, 368.0f)
                curveToRelative(21.22f, -27.97f, 44.42f, -74.33f, 44.53f, -159.42f)
                curveToRelative(0.0f, -0.2f, -0.06f, -0.38f, -0.06f, -0.58f)
                curveToRelative(0.0f, -61.86f, 50.14f, -112.0f, 112.0f, -112.0f)
                reflectiveCurveToRelative(112.0f, 50.14f, 112.0f, 112.0f)
                curveToRelative(0.0f, 0.2f, -0.06f, 0.38f, -0.06f, 0.58f)
                curveToRelative(0.11f, 85.1f, 23.31f, 131.46f, 44.53f, 159.42f)
                horizontalLineTo(67.53f)
                close()
                moveTo(224.0f, 512.0f)
                curveToRelative(35.32f, 0.0f, 63.97f, -28.65f, 63.97f, -64.0f)
                horizontalLineTo(160.03f)
                curveToRelative(0.0f, 35.35f, 28.65f, 64.0f, 63.97f, 64.0f)
                close()
            }
        }
        .build()
        return _bell!!
    }

private var _bell: ImageVector? = null
