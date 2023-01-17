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

public val SimpleIcons.Hackernoon: ImageVector
    get() {
        if (_hackernoon != null) {
            return _hackernoon!!
        }
        _hackernoon = Builder(name = "Hackernoon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.701f, 0.0f)
                verticalLineToRelative(6.223f)
                lineTo(8.85f, 6.223f)
                lineTo(8.85f, 4.654f)
                horizontalLineToRelative(1.576f)
                verticalLineToRelative(7.842f)
                lineTo(12.0f, 12.496f)
                lineTo(12.0f, 4.654f)
                horizontalLineToRelative(1.574f)
                verticalLineToRelative(1.569f)
                horizontalLineToRelative(3.15f)
                lineTo(16.724f, 0.0f)
                close()
                moveTo(16.725f, 6.223f)
                verticalLineToRelative(3.136f)
                horizontalLineToRelative(1.574f)
                lineTo(18.299f, 6.223f)
                close()
                moveTo(18.299f, 9.359f)
                verticalLineToRelative(4.705f)
                horizontalLineToRelative(1.576f)
                verticalLineToRelative(-1.568f)
                horizontalLineToRelative(1.574f)
                verticalLineToRelative(-1.568f)
                horizontalLineToRelative(-1.574f)
                lineTo(19.875f, 9.359f)
                close()
                moveTo(18.299f, 14.064f)
                horizontalLineToRelative(-1.574f)
                verticalLineToRelative(3.137f)
                horizontalLineToRelative(1.574f)
                close()
                moveTo(16.725f, 17.201f)
                horizontalLineToRelative(-3.15f)
                verticalLineToRelative(1.569f)
                lineTo(8.85f, 18.77f)
                lineTo(8.85f, 17.2f)
                lineTo(5.7f, 17.2f)
                lineTo(5.7f, 24.0f)
                horizontalLineToRelative(11.024f)
                close()
                moveTo(5.701f, 17.201f)
                verticalLineToRelative(-3.137f)
                lineTo(4.125f, 14.064f)
                verticalLineToRelative(3.137f)
                close()
                moveTo(4.125f, 14.064f)
                lineTo(4.125f, 9.36f)
                lineTo(2.551f, 9.36f)
                verticalLineToRelative(4.705f)
                close()
                moveTo(4.125f, 9.359f)
                horizontalLineToRelative(1.576f)
                lineTo(5.701f, 6.223f)
                lineTo(4.125f, 6.223f)
                close()
            }
        }
        .build()
        return _hackernoon!!
    }

private var _hackernoon: ImageVector? = null
