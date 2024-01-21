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
        _codeBranch = Builder(name = "CodeBranch", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(80.0f, 104.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, -48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, 48.0f)
                close()
                moveTo(160.0f, 80.0f)
                curveToRelative(0.0f, 32.8f, -19.7f, 61.0f, -48.0f, 73.3f)
                verticalLineToRelative(87.8f)
                curveToRelative(18.8f, -10.9f, 40.7f, -17.1f, 64.0f, -17.1f)
                horizontalLineToRelative(96.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                verticalLineToRelative(-6.7f)
                curveTo(307.7f, 141.0f, 288.0f, 112.8f, 288.0f, 80.0f)
                curveToRelative(0.0f, -44.2f, 35.8f, -80.0f, 80.0f, -80.0f)
                reflectiveCurveToRelative(80.0f, 35.8f, 80.0f, 80.0f)
                curveToRelative(0.0f, 32.8f, -19.7f, 61.0f, -48.0f, 73.3f)
                lineTo(400.0f, 160.0f)
                curveToRelative(0.0f, 70.7f, -57.3f, 128.0f, -128.0f, 128.0f)
                lineTo(176.0f, 288.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, 28.7f, -64.0f, 64.0f)
                verticalLineToRelative(6.7f)
                curveToRelative(28.3f, 12.3f, 48.0f, 40.5f, 48.0f, 73.3f)
                curveToRelative(0.0f, 44.2f, -35.8f, 80.0f, -80.0f, 80.0f)
                reflectiveCurveToRelative(-80.0f, -35.8f, -80.0f, -80.0f)
                curveToRelative(0.0f, -32.8f, 19.7f, -61.0f, 48.0f, -73.3f)
                lineTo(48.0f, 352.0f)
                lineTo(48.0f, 153.3f)
                curveTo(19.7f, 141.0f, 0.0f, 112.8f, 0.0f, 80.0f)
                curveTo(0.0f, 35.8f, 35.8f, 0.0f, 80.0f, 0.0f)
                reflectiveCurveToRelative(80.0f, 35.8f, 80.0f, 80.0f)
                close()
                moveTo(392.0f, 80.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -48.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 48.0f, 0.0f)
                close()
                moveTo(80.0f, 456.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, -48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, 48.0f)
                close()
            }
        }
        .build()
        return _codeBranch!!
    }

private var _codeBranch: ImageVector? = null
