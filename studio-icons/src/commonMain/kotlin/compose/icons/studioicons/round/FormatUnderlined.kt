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

public val RoundGroup.FormatUnderlined: ImageVector
    get() {
        if (_formatUnderlined != null) {
            return _formatUnderlined!!
        }
        _formatUnderlined = Builder(name = "FormatUnderlined", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.79f, 16.95f)
                curveToRelative(3.03f, -0.39f, 5.21f, -3.11f, 5.21f, -6.16f)
                verticalLineTo(4.25f)
                curveTo(18.0f, 3.56f, 17.44f, 3.0f, 16.75f, 3.0f)
                reflectiveCurveToRelative(-1.25f, 0.56f, -1.25f, 1.25f)
                verticalLineToRelative(6.65f)
                curveToRelative(0.0f, 1.67f, -1.13f, 3.19f, -2.77f, 3.52f)
                curveToRelative(-2.25f, 0.47f, -4.23f, -1.25f, -4.23f, -3.42f)
                verticalLineTo(4.25f)
                curveTo(8.5f, 3.56f, 7.94f, 3.0f, 7.25f, 3.0f)
                reflectiveCurveTo(6.0f, 3.56f, 6.0f, 4.25f)
                verticalLineTo(11.0f)
                curveToRelative(0.0f, 3.57f, 3.13f, 6.42f, 6.79f, 5.95f)
                close()
                moveTo(5.0f, 20.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(6.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _formatUnderlined!!
    }

private var _formatUnderlined: ImageVector? = null
