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

public val SimpleIcons.Kahoot: ImageVector
    get() {
        if (_kahoot != null) {
            return _kahoot!!
        }
        _kahoot = Builder(name = "Kahoot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.557f, 18.87f)
                lineToRelative(2.747f, -17.513f)
                lineTo(16.174f, 0.0f)
                close()
                moveTo(0.696f, 2.348f)
                verticalLineToRelative(19.078f)
                lineToRelative(4.035f, 0.14f)
                lineToRelative(-0.035f, -6.679f)
                lineToRelative(2.487f, -2.4f)
                lineToRelative(2.626f, 9.078f)
                horizontalLineToRelative(3.565f)
                lineTo(10.087f, 9.722f)
                lineToRelative(4.957f, -5.444f)
                lineToRelative(-3.496f, -1.339f)
                lineTo(4.73f, 9.443f)
                lineTo(4.73f, 1.322f)
                close()
                moveTo(18.991f, 20.208f)
                lineToRelative(-0.99f, 2.331f)
                lineTo(20.12f, 24.0f)
                lineToRelative(2.088f, -1.235f)
                lineToRelative(-0.887f, -2.556f)
                close()
            }
        }
        .build()
        return _kahoot!!
    }

private var _kahoot: ImageVector? = null
