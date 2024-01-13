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

public val SimpleIcons.Betfair: ImageVector
    get() {
        if (_betfair != null) {
            return _betfair!!
        }
        _betfair = Builder(name = "Betfair", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.218f, 3.14f)
                horizontalLineToRelative(-7.083f)
                verticalLineToRelative(3.6f)
                horizontalLineTo(9.352f)
                lineToRelative(7.359f, 8.582f)
                lineTo(24.0f, 6.67f)
                horizontalLineToRelative(-3.782f)
                close()
                moveTo(0.0f, 17.26f)
                horizontalLineToRelative(3.782f)
                verticalLineToRelative(3.6f)
                horizontalLineToRelative(7.083f)
                verticalLineToRelative(-3.6f)
                horizontalLineToRelative(3.783f)
                lineToRelative(-7.29f, -8.583f)
                close()
            }
        }
        .build()
        return _betfair!!
    }

private var _betfair: ImageVector? = null
