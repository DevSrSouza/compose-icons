package compose.icons.studioicons.sharp

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
import compose.icons.studioicons.SharpGroup

public val SharpGroup.FormatColorFill: ImageVector
    get() {
        if (_formatColorFill != null) {
            return _formatColorFill!!
        }
        _formatColorFill = Builder(name = "FormatColorFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 17.62f)
                lineTo(17.62f, 10.0f)
                lineToRelative(-10.0f, -10.0f)
                lineTo(6.21f, 1.41f)
                lineToRelative(2.38f, 2.38f)
                lineTo(2.38f, 10.0f)
                lineTo(10.0f, 17.62f)
                close()
                moveTo(10.0f, 5.21f)
                lineTo(14.79f, 10.0f)
                horizontalLineTo(5.21f)
                lineTo(10.0f, 5.21f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 17.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                curveToRelative(0.0f, -1.33f, -2.0f, -3.5f, -2.0f, -3.5f)
                reflectiveCurveToRelative(-2.0f, 2.17f, -2.0f, 3.5f)
                curveTo(17.0f, 16.1f, 17.9f, 17.0f, 19.0f, 17.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 20.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-20.0f)
                close()
            }
        }
        .build()
        return _formatColorFill!!
    }

private var _formatColorFill: ImageVector? = null
