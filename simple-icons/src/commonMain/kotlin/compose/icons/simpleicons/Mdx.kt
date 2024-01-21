package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Mdx: ImageVector
    get() {
        if (_mdx != null) {
            return _mdx!!
        }
        _mdx = Builder(name = "Mdx", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.79f, 7.12f)
                horizontalLineToRelative(22.42f)
                curveToRelative(0.436f, 0.0f, 0.79f, 0.355f, 0.79f, 0.792f)
                verticalLineToRelative(8.176f)
                curveToRelative(0.0f, 0.436f, -0.354f, 0.79f, -0.79f, 0.79f)
                lineTo(0.79f, 16.878f)
                arcToRelative(0.79f, 0.79f, 0.0f, false, true, -0.79f, -0.79f)
                lineTo(0.0f, 7.912f)
                arcToRelative(0.79f, 0.79f, 0.0f, false, true, 0.79f, -0.791f)
                lineTo(0.79f, 7.12f)
                close()
                moveTo(3.297f, 14.725f)
                verticalLineToRelative(-3.122f)
                lineToRelative(1.89f, 1.89f)
                lineTo(7.12f, 11.56f)
                verticalLineToRelative(3.122f)
                horizontalLineToRelative(1.055f)
                verticalLineToRelative(-5.67f)
                lineToRelative(-2.99f, 2.99f)
                lineTo(2.24f, 9.056f)
                verticalLineToRelative(5.67f)
                horizontalLineToRelative(1.055f)
                verticalLineToRelative(-0.001f)
                close()
                moveTo(11.737f, 12.88f)
                lineTo(10.263f, 11.407f)
                lineTo(9.517f, 12.153f)
                lineTo(12.264f, 14.9f)
                lineTo(15.009f, 12.153f)
                lineTo(14.263f, 11.407f)
                lineTo(12.79f, 12.88f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-1.054f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(21.778f, 13.867f)
                lineTo(19.603f, 11.692f)
                lineTo(21.823f, 9.472f)
                lineTo(21.077f, 8.726f)
                lineTo(18.857f, 10.946f)
                lineTo(16.637f, 8.726f)
                lineTo(15.89f, 9.472f)
                lineTo(18.11f, 11.692f)
                lineTo(15.934f, 13.869f)
                lineTo(16.68f, 14.615f)
                lineTo(18.857f, 12.438f)
                lineTo(21.033f, 14.613f)
                lineTo(21.778f, 13.867f)
                close()
            }
        }
        .build()
        return _mdx!!
    }

private var _mdx: ImageVector? = null
