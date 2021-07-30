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

public val SimpleIcons.Awsamplify: ImageVector
    get() {
        if (_awsamplify != null) {
            return _awsamplify!!
        }
        _awsamplify = Builder(name = "Awsamplify", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.223f, 17.905f)
                horizontalLineToRelative(6.76f)
                lineToRelative(1.731f, 3.047f)
                lineTo(0.0f, 20.952f)
                lineToRelative(4.815f, -8.344f)
                lineToRelative(2.018f, -3.494f)
                lineToRelative(1.733f, 3.002f)
                close()
                moveTo(7.743f, 7.534f)
                lineTo(9.408f, 4.65f)
                lineToRelative(9.415f, 16.301f)
                horizontalLineToRelative(-3.334f)
                close()
                moveTo(10.333f, 3.048f)
                horizontalLineToRelative(3.33f)
                lineTo(24.0f, 20.952f)
                horizontalLineToRelative(-3.334f)
                close()
            }
        }
        .build()
        return _awsamplify!!
    }

private var _awsamplify: ImageVector? = null
