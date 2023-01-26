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

public val RoundGroup.SquareFoot: ImageVector
    get() {
        if (_squareFoot != null) {
            return _squareFoot!!
        }
        _squareFoot = Builder(name = "SquareFoot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.66f, 17.66f)
                lineToRelative(-0.71f, 0.71f)
                curveToRelative(-0.2f, 0.2f, -0.51f, 0.2f, -0.71f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0.0f, -0.71f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-1.94f, -1.94f)
                lineToRelative(-0.71f, 0.71f)
                curveToRelative(-0.2f, 0.2f, -0.51f, 0.2f, -0.71f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0.0f, -0.71f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-1.94f, -1.94f)
                lineToRelative(-0.71f, 0.71f)
                curveToRelative(-0.2f, 0.2f, -0.51f, 0.2f, -0.71f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0.0f, -0.71f)
                lineToRelative(0.71f, -0.71f)
                lineTo(9.7f, 9.7f)
                lineToRelative(-0.71f, 0.71f)
                curveToRelative(-0.2f, 0.2f, -0.51f, 0.2f, -0.71f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0.0f, -0.71f)
                lineToRelative(0.71f, -0.71f)
                lineTo(7.05f, 7.05f)
                lineTo(6.34f, 7.76f)
                curveToRelative(-0.2f, 0.2f, -0.51f, 0.2f, -0.71f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0.0f, -0.71f)
                lineToRelative(0.71f, -0.71f)
                lineTo(4.85f, 4.85f)
                curveTo(4.54f, 4.54f, 4.0f, 4.76f, 4.0f, 5.21f)
                verticalLineTo(18.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(12.79f)
                curveToRelative(0.45f, 0.0f, 0.67f, -0.54f, 0.35f, -0.85f)
                lineTo(17.66f, 17.66f)
                close()
                moveTo(7.0f, 16.0f)
                verticalLineToRelative(-4.76f)
                lineTo(12.76f, 17.0f)
                horizontalLineTo(8.0f)
                curveTo(7.45f, 17.0f, 7.0f, 16.55f, 7.0f, 16.0f)
                close()
            }
        }
        .build()
        return _squareFoot!!
    }

private var _squareFoot: ImageVector? = null
