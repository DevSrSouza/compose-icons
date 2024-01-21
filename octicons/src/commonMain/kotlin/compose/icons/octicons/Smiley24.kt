package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Smiley24: ImageVector
    get() {
        if (_smiley24 != null) {
            return _smiley24!!
        }
        _smiley24 = Builder(name = "Smiley24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.456f, 14.494f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.068f, 0.17f)
                arcToRelative(3.08f, 3.08f, 0.0f, false, false, 0.572f, 0.492f)
                arcTo(3.381f, 3.381f, 0.0f, false, false, 12.0f, 15.72f)
                curveToRelative(0.855f, 0.0f, 1.487f, -0.283f, 1.904f, -0.562f)
                arcToRelative(3.081f, 3.081f, 0.0f, false, false, 0.572f, -0.492f)
                lineToRelative(0.021f, -0.026f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.197f, 0.905f)
                lineToRelative(-0.027f, 0.034f)
                curveToRelative(-0.013f, 0.016f, -0.03f, 0.038f, -0.052f, 0.063f)
                curveToRelative(-0.044f, 0.05f, -0.105f, 0.119f, -0.184f, 0.198f)
                arcToRelative(4.569f, 4.569f, 0.0f, false, true, -0.695f, 0.566f)
                arcTo(4.88f, 4.88f, 0.0f, false, true, 12.0f, 17.22f)
                arcToRelative(4.88f, 4.88f, 0.0f, false, true, -2.736f, -0.814f)
                arcToRelative(4.57f, 4.57f, 0.0f, false, true, -0.695f, -0.566f)
                arcToRelative(3.253f, 3.253f, 0.0f, false, true, -0.236f, -0.261f)
                curveToRelative(-0.259f, -0.332f, -0.223f, -0.824f, 0.123f, -1.084f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                curveToRelative(6.075f, 0.0f, 11.0f, 4.925f, 11.0f, 11.0f)
                reflectiveCurveToRelative(-4.925f, 11.0f, -11.0f, 11.0f)
                reflectiveCurveTo(1.0f, 18.075f, 1.0f, 12.0f)
                reflectiveCurveTo(5.925f, 1.0f, 12.0f, 1.0f)
                close()
                moveTo(2.5f, 12.0f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, false, 9.5f, 9.5f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, false, 9.5f, -9.5f)
                arcTo(9.5f, 9.5f, 0.0f, false, false, 12.0f, 2.5f)
                arcTo(9.5f, 9.5f, 0.0f, false, false, 2.5f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 10.75f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 2.5f, 0.0f)
                close()
                moveTo(16.25f, 12.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, -2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, 2.5f)
                close()
            }
        }
        .build()
        return _smiley24!!
    }

private var _smiley24: ImageVector? = null
