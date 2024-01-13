package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.AccessibilityInset16: ImageVector
    get() {
        if (_accessibilityInset16 != null) {
            return _accessibilityInset16!!
        }
        _accessibilityInset16 = Builder(name = "AccessibilityInset16", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 0.0f, 16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(10.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -2.95f, 1.76f)
                arcToRelative(1.87f, 1.87f, 0.0f, false, false, -0.32f, 0.24f)
                lineTo(3.75f, 6.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(2.363f)
                lineToRelative(-0.607f, 5.67f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.49f, 0.16f)
                lineToRelative(0.25f, -2.33f)
                horizontalLineToRelative(1.508f)
                lineToRelative(0.25f, 2.33f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.492f, -0.16f)
                lineTo(9.888f, 7.5f)
                horizontalLineToRelative(2.362f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(9.27f, 6.0f)
                arcToRelative(1.98f, 1.98f, 0.0f, false, false, -0.32f, -0.24f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 10.0f, 4.0f)
                close()
            }
        }
        .build()
        return _accessibilityInset16!!
    }

private var _accessibilityInset16: ImageVector? = null
