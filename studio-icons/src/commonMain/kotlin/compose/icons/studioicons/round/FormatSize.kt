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

public val RoundGroup.FormatSize: ImageVector
    get() {
        if (_formatSize != null) {
            return _formatSize!!
        }
        _formatSize = Builder(name = "FormatSize", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 5.5f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineTo(14.0f)
                verticalLineToRelative(10.5f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveTo(21.33f, 4.0f, 20.5f, 4.0f)
                horizontalLineToRelative(-10.0f)
                curveTo(9.67f, 4.0f, 9.0f, 4.67f, 9.0f, 5.5f)
                close()
                moveTo(4.5f, 12.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveTo(9.0f, 18.33f, 9.0f, 17.5f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveTo(11.33f, 9.0f, 10.5f, 9.0f)
                horizontalLineToRelative(-6.0f)
                curveTo(3.67f, 9.0f, 3.0f, 9.67f, 3.0f, 10.5f)
                reflectiveCurveTo(3.67f, 12.0f, 4.5f, 12.0f)
                close()
            }
        }
        .build()
        return _formatSize!!
    }

private var _formatSize: ImageVector? = null
