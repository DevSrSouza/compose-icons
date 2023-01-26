package compose.icons.studioicons.round

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
import compose.icons.studioicons.RoundGroup

public val RoundGroup.FormatColorText: ImageVector
    get() {
        if (_formatColorText != null) {
            return _formatColorText!!
        }
        _formatColorText = Builder(name = "FormatColorText", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 20.0f)
                horizontalLineTo(4.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveTo(21.1f, 20.0f, 20.0f, 20.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.11f, 17.0f)
                lineTo(7.11f, 17.0f)
                curveToRelative(0.48f, 0.0f, 0.91f, -0.3f, 1.06f, -0.75f)
                lineToRelative(1.01f, -2.83f)
                horizontalLineToRelative(5.65f)
                lineToRelative(0.99f, 2.82f)
                curveTo(15.98f, 16.7f, 16.41f, 17.0f, 16.89f, 17.0f)
                curveToRelative(0.79f, 0.0f, 1.33f, -0.79f, 1.05f, -1.52f)
                lineTo(13.69f, 4.17f)
                curveTo(13.43f, 3.47f, 12.75f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(-1.43f, 0.47f, -1.69f, 1.17f)
                lineTo(6.06f, 15.48f)
                curveTo(5.78f, 16.21f, 6.33f, 17.0f, 7.11f, 17.0f)
                close()
                moveTo(11.94f, 5.6f)
                horizontalLineToRelative(0.12f)
                lineToRelative(2.03f, 5.79f)
                horizontalLineTo(9.91f)
                lineTo(11.94f, 5.6f)
                close()
            }
        }
        .build()
        return _formatColorText!!
    }

private var _formatColorText: ImageVector? = null
