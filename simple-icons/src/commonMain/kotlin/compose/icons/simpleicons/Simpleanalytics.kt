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

public val SimpleIcons.Simpleanalytics: ImageVector
    get() {
        if (_simpleanalytics != null) {
            return _simpleanalytics!!
        }
        _simpleanalytics = Builder(name = "Simpleanalytics", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.019f, 13.019f)
                horizontalLineToRelative(3.849f)
                lineTo(4.868f, 24.0f)
                horizontalLineToRelative(-3.85f)
                close()
                moveTo(9.962f, 6.339f)
                horizontalLineToRelative(3.85f)
                lineTo(13.812f, 24.0f)
                horizontalLineToRelative(-3.85f)
                close()
                moveTo(19.132f, 0.0f)
                horizontalLineToRelative(3.85f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(-3.85f)
                close()
            }
        }
        .build()
        return _simpleanalytics!!
    }

private var _simpleanalytics: ImageVector? = null
