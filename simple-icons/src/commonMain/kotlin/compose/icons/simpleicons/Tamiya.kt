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

public val SimpleIcons.Tamiya: ImageVector
    get() {
        if (_tamiya != null) {
            return _tamiya!!
        }
        _tamiya = Builder(name = "Tamiya", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 6.408f)
                verticalLineToRelative(4.27f)
                horizontalLineToRelative(4.496f)
                lineToRelative(1.36f, -4.27f)
                close()
                moveTo(5.856f, 6.408f)
                lineTo(7.254f, 10.678f)
                horizontalLineToRelative(4.496f)
                verticalLineToRelative(-4.27f)
                close()
                moveTo(11.75f, 10.678f)
                lineTo(8.123f, 13.322f)
                lineTo(9.521f, 17.592f)
                horizontalLineToRelative(2.23f)
                close()
                moveTo(9.52f, 17.592f)
                lineTo(5.856f, 14.947f)
                lineTo(2.229f, 17.592f)
                close()
                moveTo(2.229f, 17.592f)
                lineTo(3.627f, 13.322f)
                lineTo(0.0f, 10.678f)
                verticalLineToRelative(6.914f)
                close()
                moveTo(12.25f, 6.408f)
                verticalLineToRelative(4.27f)
                horizontalLineToRelative(4.496f)
                lineToRelative(1.36f, -4.27f)
                close()
                moveTo(18.106f, 6.408f)
                lineTo(19.504f, 10.678f)
                lineTo(24.0f, 10.678f)
                verticalLineToRelative(-4.27f)
                close()
                moveTo(24.0f, 10.678f)
                lineToRelative(-3.627f, 2.644f)
                lineToRelative(1.398f, 4.27f)
                lineTo(24.0f, 17.592f)
                close()
                moveTo(21.77f, 17.592f)
                lineTo(18.106f, 14.947f)
                lineTo(14.479f, 17.592f)
                close()
                moveTo(14.48f, 17.592f)
                lineTo(15.877f, 13.322f)
                lineTo(12.25f, 10.678f)
                verticalLineToRelative(6.914f)
                close()
            }
        }
        .build()
        return _tamiya!!
    }

private var _tamiya: ImageVector? = null
