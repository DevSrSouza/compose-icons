package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.Circle3Filled: ImageVector
    get() {
        if (_circle3Filled != null) {
            return _circle3Filled!!
        }
        _circle3Filled = Builder(name = "Circle3Filled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(5.523f, 0.0f, 10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveToRelative(-10.0f, -4.477f, -10.0f, -10.0f)
                reflectiveCurveToRelative(4.477f, -10.0f, 10.0f, -10.0f)
                close()
                moveTo(13.0f, 7.0f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(-0.15f, 0.005f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.85f, 1.995f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.974f, 0.23f)
                lineToRelative(0.02f, -0.113f)
                lineToRelative(0.006f, -0.117f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(-0.133f, 0.007f)
                curveToRelative(-1.111f, 0.12f, -1.154f, 1.73f, -0.128f, 1.965f)
                lineToRelative(0.128f, 0.021f)
                lineToRelative(0.133f, 0.007f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.993f, 0.117f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.85f, 1.995f)
                lineToRelative(0.15f, 0.005f)
                horizontalLineToRelative(2.0f)
                lineToRelative(0.15f, -0.005f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.844f, -1.838f)
                lineToRelative(0.006f, -0.157f)
                verticalLineToRelative(-2.0f)
                lineToRelative(-0.005f, -0.15f)
                arcToRelative(1.988f, 1.988f, 0.0f, false, false, -0.17f, -0.667f)
                lineToRelative(-0.075f, -0.152f)
                lineToRelative(-0.019f, -0.032f)
                lineToRelative(0.02f, -0.03f)
                arcToRelative(2.01f, 2.01f, 0.0f, false, false, 0.242f, -0.795f)
                lineToRelative(0.007f, -0.174f)
                verticalLineToRelative(-2.0f)
                lineToRelative(-0.005f, -0.15f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.838f, -1.844f)
                lineToRelative(-0.157f, -0.006f)
                close()
            }
        }
        .build()
        return _circle3Filled!!
    }

private var _circle3Filled: ImageVector? = null
