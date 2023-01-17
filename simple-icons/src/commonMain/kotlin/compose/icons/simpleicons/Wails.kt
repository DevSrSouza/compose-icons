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

public val SimpleIcons.Wails: ImageVector
    get() {
        if (_wails != null) {
            return _wails!!
        }
        _wails = Builder(name = "Wails", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.67f, 5.252f)
                lineToRelative(-7.856f, 5.039f)
                lineToRelative(-0.369f, -0.459f)
                lineToRelative(-8.69f, -0.283f)
                lineToRelative(1.891f, 1.904f)
                lineToRelative(5.221f, 0.106f)
                lineToRelative(1.63f, 1.656f)
                lineToRelative(-5.878f, 0.662f)
                lineToRelative(1.77f, 1.783f)
                lineToRelative(5.34f, -1.185f)
                lineToRelative(0.003f, -0.006f)
                lineToRelative(0.993f, 1.168f)
                lineToRelative(-3.079f, 3.11f)
                lineToRelative(7.399f, 0.001f)
                lineToRelative(-1.582f, -5.002f)
                lineToRelative(2.209f, 3.14f)
                lineTo(24.0f, 16.886f)
                lineToRelative(-5.385f, -2.415f)
                horizontalLineToRelative(4.121f)
                lineToRelative(-5.384f, -2.418f)
                horizontalLineToRelative(4.117f)
                lineTo(16.297f, 9.73f)
                lineToRelative(1.088f, -1.443f)
                lineToRelative(4.09f, -1.076f)
                lineToRelative(-3.467f, 0.248f)
                lineToRelative(1.662f, -2.207f)
                close()
                moveTo(16.035f, 7.574f)
                lineTo(9.996f, 8.004f)
                lineTo(11.451f, 9.83f)
                lineTo(13.264f, 9.354f)
                lineTo(16.035f, 7.574f)
                close()
                moveTo(15.783f, 10.414f)
                lineTo(14.923f, 11.559f)
                lineTo(14.922f, 11.557f)
                lineTo(15.076f, 11.352f)
                lineTo(15.783f, 10.414f)
                close()
                moveTo(0.0f, 12.2f)
                lineToRelative(5.615f, 1.033f)
                lineToRelative(-1.017f, -1.027f)
                lineTo(0.0f, 12.2f)
                close()
            }
        }
        .build()
        return _wails!!
    }

private var _wails: ImageVector? = null
