package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Medium: ImageVector
    get() {
        if (_medium != null) {
            return _medium!!
        }
        _medium = Builder(name = "Medium", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 32.0f)
                verticalLineToRelative(448.0f)
                horizontalLineToRelative(448.0f)
                lineTo(448.0f, 32.0f)
                lineTo(0.0f, 32.0f)
                close()
                moveTo(372.2f, 138.1f)
                lineToRelative(-24.0f, 23.0f)
                curveToRelative(-2.1f, 1.6f, -3.1f, 4.2f, -2.7f, 6.7f)
                verticalLineToRelative(169.3f)
                curveToRelative(-0.4f, 2.6f, 0.6f, 5.2f, 2.7f, 6.7f)
                lineToRelative(23.5f, 23.0f)
                verticalLineToRelative(5.1f)
                horizontalLineToRelative(-118.0f)
                lineTo(253.7f, 367.0f)
                lineToRelative(24.3f, -23.6f)
                curveToRelative(2.4f, -2.4f, 2.4f, -3.1f, 2.4f, -6.7f)
                lineTo(280.4f, 199.8f)
                lineToRelative(-67.6f, 171.6f)
                horizontalLineToRelative(-9.1f)
                lineTo(125.0f, 199.8f)
                verticalLineToRelative(115.0f)
                curveToRelative(-0.7f, 4.8f, 1.0f, 9.7f, 4.4f, 13.2f)
                lineToRelative(31.6f, 38.3f)
                verticalLineToRelative(5.1f)
                lineTo(71.2f, 371.4f)
                verticalLineToRelative(-5.1f)
                lineToRelative(31.6f, -38.3f)
                curveToRelative(3.4f, -3.5f, 4.9f, -8.4f, 4.1f, -13.2f)
                verticalLineToRelative(-133.0f)
                curveToRelative(0.4f, -3.7f, -1.0f, -7.3f, -3.8f, -9.8f)
                lineTo(75.0f, 138.1f)
                lineTo(75.0f, 133.0f)
                horizontalLineToRelative(87.3f)
                lineToRelative(67.4f, 148.0f)
                lineTo(289.0f, 133.1f)
                horizontalLineToRelative(83.2f)
                verticalLineToRelative(5.0f)
                close()
            }
        }
        .build()
        return _medium!!
    }

private var _medium: ImageVector? = null
