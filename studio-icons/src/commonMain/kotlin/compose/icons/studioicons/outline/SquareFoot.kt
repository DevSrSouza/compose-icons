package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.SquareFoot: ImageVector
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
                lineToRelative(-1.06f, 1.06f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(1.06f, -1.06f)
                lineToRelative(-1.94f, -1.94f)
                lineToRelative(-1.06f, 1.06f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(1.06f, -1.06f)
                lineToRelative(-1.94f, -1.94f)
                lineToRelative(-1.06f, 1.06f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(1.06f, -1.06f)
                lineTo(9.7f, 9.7f)
                lineToRelative(-1.06f, 1.06f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(1.06f, -1.06f)
                lineTo(7.05f, 7.05f)
                lineTo(5.99f, 8.11f)
                lineTo(5.28f, 7.4f)
                lineToRelative(1.06f, -1.06f)
                lineTo(4.0f, 4.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                lineTo(17.66f, 17.66f)
                close()
                moveTo(7.0f, 17.0f)
                verticalLineToRelative(-5.76f)
                lineTo(12.76f, 17.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _squareFoot!!
    }

private var _squareFoot: ImageVector? = null
