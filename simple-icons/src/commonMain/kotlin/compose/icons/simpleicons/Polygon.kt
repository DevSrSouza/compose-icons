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

public val SimpleIcons.Polygon: ImageVector
    get() {
        if (_polygon != null) {
            return _polygon!!
        }
        _polygon = Builder(name = "Polygon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.82f, 16.342f)
                lineToRelative(5.692f, -3.287f)
                arcTo(0.98f, 0.98f, 0.0f, false, false, 24.0f, 12.21f)
                verticalLineTo(5.635f)
                arcToRelative(0.98f, 0.98f, 0.0f, false, false, -0.488f, -0.846f)
                lineToRelative(-5.693f, -3.286f)
                arcToRelative(0.98f, 0.98f, 0.0f, false, false, -0.977f, 0.0f)
                lineTo(11.15f, 4.789f)
                arcToRelative(0.98f, 0.98f, 0.0f, false, false, -0.489f, 0.846f)
                verticalLineToRelative(11.747f)
                lineTo(6.67f, 19.686f)
                lineToRelative(-3.992f, -2.304f)
                verticalLineToRelative(-4.61f)
                lineToRelative(3.992f, -2.304f)
                lineToRelative(2.633f, 1.52f)
                verticalLineTo(8.896f)
                lineTo(7.158f, 7.658f)
                arcToRelative(0.98f, 0.98f, 0.0f, false, false, -0.977f, 0.0f)
                lineTo(0.488f, 10.945f)
                arcToRelative(0.98f, 0.98f, 0.0f, false, false, -0.488f, 0.846f)
                verticalLineToRelative(6.573f)
                arcToRelative(0.98f, 0.98f, 0.0f, false, false, 0.488f, 0.847f)
                lineToRelative(5.693f, 3.286f)
                arcToRelative(0.981f, 0.981f, 0.0f, false, false, 0.977f, 0.0f)
                lineToRelative(5.692f, -3.286f)
                arcToRelative(0.98f, 0.98f, 0.0f, false, false, 0.489f, -0.846f)
                verticalLineTo(6.618f)
                lineToRelative(0.072f, -0.041f)
                lineToRelative(3.92f, -2.263f)
                lineToRelative(3.99f, 2.305f)
                verticalLineToRelative(4.609f)
                lineToRelative(-3.99f, 2.304f)
                lineToRelative(-2.63f, -1.517f)
                verticalLineToRelative(3.092f)
                lineToRelative(2.14f, 1.236f)
                arcToRelative(0.981f, 0.981f, 0.0f, false, false, 0.978f, 0.0f)
                verticalLineToRelative(-0.001f)
                close()
            }
        }
        .build()
        return _polygon!!
    }

private var _polygon: ImageVector? = null
