package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Bit: ImageVector
    get() {
        if (_bit != null) {
            return _bit!!
        }
        _bit = Builder(name = "Bit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveTo(5.373f, 24.0f, 0.0f, 18.627f, 0.0f, 12.0f)
                reflectiveCurveTo(5.373f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.373f, 12.0f, 12.0f)
                reflectiveCurveToRelative(-5.373f, 12.0f, -12.0f, 12.0f)
                close()
                moveTo(10.856f, 13.07f)
                curveToRelative(0.0f, -1.292f, -0.763f, -2.019f, -1.858f, -2.019f)
                curveToRelative(-0.341f, 0.0f, -0.637f, 0.072f, -0.862f, 0.224f)
                lineTo(8.136f, 9.552f)
                curveToRelative(0.0f, -0.323f, -0.197f, -0.485f, -0.601f, -0.485f)
                reflectiveCurveToRelative(-0.601f, 0.162f, -0.601f, 0.485f)
                verticalLineToRelative(4.533f)
                curveToRelative(0.0f, 0.305f, 0.0f, 0.601f, 0.413f, 0.835f)
                curveToRelative(0.359f, 0.206f, 0.826f, 0.305f, 1.328f, 0.305f)
                curveToRelative(1.4f, 0.0f, 2.181f, -0.844f, 2.181f, -2.154f)
                close()
                moveTo(8.136f, 14.12f)
                verticalLineToRelative(-1.921f)
                arcToRelative(0.923f, 0.923f, 0.0f, false, true, 0.565f, -0.18f)
                curveToRelative(0.556f, 0.0f, 0.924f, 0.413f, 0.924f, 1.131f)
                curveToRelative(0.0f, 0.709f, -0.359f, 1.104f, -0.942f, 1.104f)
                curveToRelative(-0.206f, 0.0f, -0.395f, -0.045f, -0.548f, -0.135f)
                close()
                moveTo(13.104f, 9.866f)
                curveToRelative(0.0f, -0.413f, -0.296f, -0.691f, -0.709f, -0.691f)
                reflectiveCurveToRelative(-0.709f, 0.278f, -0.709f, 0.691f)
                curveToRelative(0.0f, 0.413f, 0.296f, 0.7f, 0.709f, 0.7f)
                reflectiveCurveToRelative(0.709f, -0.287f, 0.709f, -0.7f)
                close()
                moveTo(12.996f, 11.535f)
                curveToRelative(0.0f, -0.323f, -0.197f, -0.485f, -0.601f, -0.485f)
                reflectiveCurveToRelative(-0.601f, 0.162f, -0.601f, 0.485f)
                verticalLineToRelative(3.186f)
                curveToRelative(0.0f, 0.323f, 0.197f, 0.485f, 0.601f, 0.485f)
                reflectiveCurveToRelative(0.601f, -0.162f, 0.601f, -0.485f)
                verticalLineToRelative(-3.186f)
                close()
                moveTo(16.636f, 14.129f)
                curveToRelative(-0.072f, 0.0f, -0.135f, 0.018f, -0.206f, 0.036f)
                curveToRelative(-0.081f, 0.018f, -0.18f, 0.045f, -0.278f, 0.045f)
                curveToRelative(-0.153f, 0.0f, -0.269f, -0.054f, -0.332f, -0.18f)
                curveToRelative(-0.081f, -0.153f, -0.081f, -0.386f, -0.081f, -0.548f)
                verticalLineToRelative(-1.346f)
                horizontalLineToRelative(0.754f)
                curveToRelative(0.323f, 0.0f, 0.485f, -0.162f, 0.485f, -0.503f)
                reflectiveCurveToRelative(-0.162f, -0.503f, -0.485f, -0.503f)
                horizontalLineToRelative(-0.754f)
                verticalLineToRelative(-0.79f)
                curveToRelative(0.0f, -0.323f, -0.197f, -0.485f, -0.601f, -0.485f)
                reflectiveCurveToRelative(-0.601f, 0.162f, -0.601f, 0.485f)
                verticalLineToRelative(0.79f)
                horizontalLineToRelative(-0.314f)
                curveToRelative(-0.323f, 0.0f, -0.485f, 0.162f, -0.485f, 0.503f)
                reflectiveCurveToRelative(0.162f, 0.503f, 0.485f, 0.503f)
                horizontalLineToRelative(0.314f)
                verticalLineToRelative(1.346f)
                curveToRelative(0.0f, 0.413f, 0.018f, 0.799f, 0.197f, 1.122f)
                curveToRelative(0.197f, 0.359f, 0.583f, 0.619f, 1.23f, 0.619f)
                curveToRelative(0.35f, 0.0f, 0.691f, -0.081f, 0.889f, -0.197f)
                curveToRelative(0.171f, -0.099f, 0.215f, -0.224f, 0.215f, -0.35f)
                curveToRelative(0.0f, -0.197f, -0.099f, -0.548f, -0.431f, -0.548f)
                close()
            }
        }
        .build()
        return _bit!!
    }

private var _bit: ImageVector? = null
