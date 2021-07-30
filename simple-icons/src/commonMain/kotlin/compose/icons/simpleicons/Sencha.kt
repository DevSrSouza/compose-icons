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

public val SimpleIcons.Sencha: ImageVector
    get() {
        if (_sencha != null) {
            return _sencha!!
        }
        _sencha = Builder(name = "Sencha", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.287f, 24.0f)
                curveToRelative(0.458f, -1.221f, 0.917f, -1.532f, 0.917f, -2.442f)
                curveToRelative(0.0f, -1.452f, -0.878f, -2.8f, -2.237f, -3.434f)
                lineToRelative(-5.831f, -2.813f)
                curveTo(5.211f, 13.85f, 3.392f, 10.97f, 3.392f, 7.797f)
                curveToRelative(0.0f, -3.23f, 1.867f, -6.133f, 4.871f, -7.576f)
                lineTo(8.712f, 0.0f)
                curveTo(8.129f, 0.674f, 7.796f, 1.532f, 7.796f, 2.44f)
                curveToRelative(0.0f, 1.453f, 0.878f, 2.801f, 2.237f, 3.435f)
                lineToRelative(5.831f, 2.813f)
                curveToRelative(2.926f, 1.462f, 4.744f, 4.342f, 4.744f, 7.514f)
                curveToRelative(0.0f, 3.23f, -1.867f, 6.133f, -4.871f, 7.577f)
                lineTo(15.287f, 24.0f)
            }
        }
        .build()
        return _sencha!!
    }

private var _sencha: ImageVector? = null
