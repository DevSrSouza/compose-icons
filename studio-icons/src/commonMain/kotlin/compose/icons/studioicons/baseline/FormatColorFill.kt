package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.FormatColorFill: ImageVector
    get() {
        if (_formatColorFill != null) {
            return _formatColorFill!!
        }
        _formatColorFill = Builder(name = "FormatColorFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.56f, 8.94f)
                lineTo(7.62f, 0.0f)
                lineTo(6.21f, 1.41f)
                lineToRelative(2.38f, 2.38f)
                lineTo(3.44f, 8.94f)
                curveToRelative(-0.59f, 0.59f, -0.59f, 1.54f, 0.0f, 2.12f)
                lineToRelative(5.5f, 5.5f)
                curveTo(9.23f, 16.85f, 9.62f, 17.0f, 10.0f, 17.0f)
                reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
                lineToRelative(5.5f, -5.5f)
                curveTo(17.15f, 10.48f, 17.15f, 9.53f, 16.56f, 8.94f)
                close()
                moveTo(5.21f, 10.0f)
                lineTo(10.0f, 5.21f)
                lineTo(14.79f, 10.0f)
                horizontalLineTo(5.21f)
                close()
                moveTo(19.0f, 11.5f)
                curveToRelative(0.0f, 0.0f, -2.0f, 2.17f, -2.0f, 3.5f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                curveTo(21.0f, 13.67f, 19.0f, 11.5f, 19.0f, 11.5f)
                close()
                moveTo(2.0f, 20.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _formatColorFill!!
    }

private var _formatColorFill: ImageVector? = null
