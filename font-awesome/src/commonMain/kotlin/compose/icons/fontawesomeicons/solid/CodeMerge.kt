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

public val SolidGroup.CodeMerge: ImageVector
    get() {
        if (_codeMerge != null) {
            return _codeMerge!!
        }
        _codeMerge = Builder(name = "CodeMerge", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(80.0f, 56.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, 48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, -48.0f)
                close()
                moveTo(112.4f, 153.2f)
                curveToRelative(28.0f, -12.4f, 47.6f, -40.5f, 47.6f, -73.2f)
                curveToRelative(0.0f, -44.2f, -35.8f, -80.0f, -80.0f, -80.0f)
                reflectiveCurveTo(0.0f, 35.8f, 0.0f, 80.0f)
                curveToRelative(0.0f, 32.8f, 19.7f, 61.0f, 48.0f, 73.3f)
                lineTo(48.0f, 358.7f)
                curveTo(19.7f, 371.0f, 0.0f, 399.2f, 0.0f, 432.0f)
                curveToRelative(0.0f, 44.2f, 35.8f, 80.0f, 80.0f, 80.0f)
                reflectiveCurveToRelative(80.0f, -35.8f, 80.0f, -80.0f)
                curveToRelative(0.0f, -32.8f, -19.7f, -61.0f, -48.0f, -73.3f)
                lineTo(112.0f, 272.0f)
                curveToRelative(26.7f, 20.1f, 60.0f, 32.0f, 96.0f, 32.0f)
                horizontalLineToRelative(86.7f)
                curveToRelative(12.3f, 28.3f, 40.5f, 48.0f, 73.3f, 48.0f)
                curveToRelative(44.2f, 0.0f, 80.0f, -35.8f, 80.0f, -80.0f)
                reflectiveCurveToRelative(-35.8f, -80.0f, -80.0f, -80.0f)
                curveToRelative(-32.8f, 0.0f, -61.0f, 19.7f, -73.3f, 48.0f)
                lineTo(208.0f, 240.0f)
                curveToRelative(-49.9f, 0.0f, -91.0f, -38.1f, -95.6f, -86.8f)
                close()
                moveTo(80.0f, 408.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, 48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, -48.0f)
                close()
                moveTo(344.0f, 272.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 48.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -48.0f, 0.0f)
                close()
            }
        }
        .build()
        return _codeMerge!!
    }

private var _codeMerge: ImageVector? = null
