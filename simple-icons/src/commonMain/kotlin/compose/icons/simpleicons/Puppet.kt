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

public val SimpleIcons.Puppet: ImageVector
    get() {
        if (_puppet != null) {
            return _puppet!!
        }
        _puppet = Builder(name = "Puppet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.984f, 21.611f)
                lineTo(6.595f, 21.611f)
                verticalLineToRelative(-2.388f)
                horizontalLineToRelative(2.39f)
                close()
                moveTo(6.595f, 2.39f)
                horizontalLineToRelative(2.39f)
                verticalLineToRelative(2.388f)
                horizontalLineToRelative(-2.39f)
                close()
                moveTo(19.793f, 8.418f)
                horizontalLineToRelative(-5.48f)
                lineToRelative(0.001f, -0.002f)
                lineToRelative(-2.941f, -2.941f)
                lineTo(11.373f, 0.0f)
                lineTo(4.207f, 0.0f)
                verticalLineToRelative(7.166f)
                horizontalLineToRelative(5.48f)
                lineToRelative(2.938f, 2.938f)
                lineToRelative(0.002f, -0.001f)
                verticalLineToRelative(3.794f)
                lineToRelative(-0.003f, -0.003f)
                lineToRelative(-2.94f, 2.94f)
                lineTo(4.207f, 16.834f)
                lineTo(4.207f, 24.0f)
                horizontalLineToRelative(7.166f)
                verticalLineToRelative(-5.477f)
                lineToRelative(2.94f, -2.94f)
                horizontalLineToRelative(5.48f)
                lineTo(19.793f, 8.417f)
            }
        }
        .build()
        return _puppet!!
    }

private var _puppet: ImageVector? = null
