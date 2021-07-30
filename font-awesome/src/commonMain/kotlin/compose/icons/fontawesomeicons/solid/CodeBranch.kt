package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.CodeBranch: ImageVector
    get() {
        if (_codeBranch != null) {
            return _codeBranch!!
        }
        _codeBranch = Builder(name = "CodeBranch", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.0f, 144.0f)
                curveToRelative(0.0f, -44.2f, -35.8f, -80.0f, -80.0f, -80.0f)
                reflectiveCurveToRelative(-80.0f, 35.8f, -80.0f, 80.0f)
                curveToRelative(0.0f, 36.4f, 24.3f, 67.1f, 57.5f, 76.8f)
                curveToRelative(-0.6f, 16.1f, -4.2f, 28.5f, -11.0f, 36.9f)
                curveToRelative(-15.4f, 19.2f, -49.3f, 22.4f, -85.2f, 25.7f)
                curveToRelative(-28.2f, 2.6f, -57.4f, 5.4f, -81.3f, 16.9f)
                verticalLineToRelative(-144.0f)
                curveToRelative(32.5f, -10.2f, 56.0f, -40.5f, 56.0f, -76.3f)
                curveToRelative(0.0f, -44.2f, -35.8f, -80.0f, -80.0f, -80.0f)
                reflectiveCurveTo(0.0f, 35.8f, 0.0f, 80.0f)
                curveToRelative(0.0f, 35.8f, 23.5f, 66.1f, 56.0f, 76.3f)
                verticalLineToRelative(199.3f)
                curveTo(23.5f, 365.9f, 0.0f, 396.2f, 0.0f, 432.0f)
                curveToRelative(0.0f, 44.2f, 35.8f, 80.0f, 80.0f, 80.0f)
                reflectiveCurveToRelative(80.0f, -35.8f, 80.0f, -80.0f)
                curveToRelative(0.0f, -34.0f, -21.2f, -63.1f, -51.2f, -74.6f)
                curveToRelative(3.1f, -5.2f, 7.8f, -9.8f, 14.9f, -13.4f)
                curveToRelative(16.2f, -8.2f, 40.4f, -10.4f, 66.1f, -12.8f)
                curveToRelative(42.2f, -3.9f, 90.0f, -8.4f, 118.2f, -43.4f)
                curveToRelative(14.0f, -17.4f, 21.1f, -39.8f, 21.6f, -67.9f)
                curveToRelative(31.6f, -10.8f, 54.4f, -40.7f, 54.4f, -75.9f)
                close()
                moveTo(80.0f, 64.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.2f, 16.0f, -16.0f, 16.0f)
                reflectiveCurveToRelative(-16.0f, -7.2f, -16.0f, -16.0f)
                reflectiveCurveToRelative(7.2f, -16.0f, 16.0f, -16.0f)
                close()
                moveTo(80.0f, 448.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                reflectiveCurveToRelative(7.2f, -16.0f, 16.0f, -16.0f)
                reflectiveCurveToRelative(16.0f, 7.2f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.2f, 16.0f, -16.0f, 16.0f)
                close()
                moveTo(304.0f, 128.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.2f, 16.0f, -16.0f, 16.0f)
                reflectiveCurveToRelative(-16.0f, -7.2f, -16.0f, -16.0f)
                reflectiveCurveToRelative(7.2f, -16.0f, 16.0f, -16.0f)
                close()
            }
        }
        .build()
        return _codeBranch!!
    }

private var _codeBranch: ImageVector? = null
