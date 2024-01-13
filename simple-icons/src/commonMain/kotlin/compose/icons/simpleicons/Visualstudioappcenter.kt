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

public val SimpleIcons.Visualstudioappcenter: ImageVector
    get() {
        if (_visualstudioappcenter != null) {
            return _visualstudioappcenter!!
        }
        _visualstudioappcenter = Builder(name = "Visualstudioappcenter", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 0.0f)
                verticalLineToRelative(20.625f)
                lineTo(0.0f, 17.94f)
                lineTo(18.0f, 24.0f)
                lineToRelative(6.0f, -2.497f)
                lineTo(24.0f, 2.498f)
                lineTo(18.0f, 0.0f)
                close()
                moveTo(11.7f, 5.445f)
                lineTo(7.8f, 8.04f)
                lineTo(7.8f, 4.223f)
                horizontalLineToRelative(-0.09f)
                lineToRelative(-2.063f, -0.634f)
                lineTo(1.5f, 6.99f)
                verticalLineToRelative(1.594f)
                lineToRelative(2.685f, 1.747f)
                lineTo(1.5f, 12.079f)
                verticalLineToRelative(1.594f)
                lineToRelative(4.148f, 3.408f)
                lineTo(7.8f, 16.44f)
                verticalLineToRelative(-3.818f)
                lineToRelative(3.9f, 2.595f)
                lineToRelative(3.3f, -1.016f)
                verticalLineToRelative(-7.74f)
                lineToRelative(-3.3f, -1.016f)
                close()
                moveTo(5.415f, 11.606f)
                verticalLineToRelative(3.233f)
                lineTo(2.79f, 13.001f)
                lineToRelative(2.625f, -1.395f)
                close()
                moveTo(12.0f, 12.439f)
                lineTo(7.755f, 10.331f)
                lineTo(12.0f, 8.224f)
                verticalLineToRelative(4.215f)
                close()
                moveTo(2.79f, 7.695f)
                lineToRelative(2.625f, -1.837f)
                lineTo(5.415f, 9.09f)
                lineTo(2.79f, 7.695f)
                close()
            }
        }
        .build()
        return _visualstudioappcenter!!
    }

private var _visualstudioappcenter: ImageVector? = null
