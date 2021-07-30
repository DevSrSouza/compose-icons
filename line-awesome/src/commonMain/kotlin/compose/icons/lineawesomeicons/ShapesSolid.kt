package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.ShapesSolid: ImageVector
    get() {
        if (_shapesSolid != null) {
            return _shapesSolid!!
        }
        _shapesSolid = Builder(name = "ShapesSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.3574f, 3.8633f)
                lineTo(16.1895f, 15.0f)
                lineTo(28.5254f, 15.0f)
                lineTo(22.3574f, 3.8633f)
                close()
                moveTo(22.3574f, 7.9902f)
                lineTo(25.1309f, 13.0f)
                lineTo(19.584f, 13.0f)
                lineTo(22.3574f, 7.9902f)
                close()
                moveTo(9.0f, 16.0f)
                curveTo(5.691f, 16.0f, 3.0f, 18.691f, 3.0f, 22.0f)
                curveTo(3.0f, 25.309f, 5.691f, 28.0f, 9.0f, 28.0f)
                curveTo(12.309f, 28.0f, 15.0f, 25.309f, 15.0f, 22.0f)
                curveTo(15.0f, 18.691f, 12.309f, 16.0f, 9.0f, 16.0f)
                close()
                moveTo(17.0f, 17.0f)
                lineTo(17.0f, 28.0f)
                lineTo(28.0f, 28.0f)
                lineTo(28.0f, 17.0f)
                lineTo(17.0f, 17.0f)
                close()
                moveTo(9.0f, 18.0f)
                curveTo(11.206f, 18.0f, 13.0f, 19.794f, 13.0f, 22.0f)
                curveTo(13.0f, 24.206f, 11.206f, 26.0f, 9.0f, 26.0f)
                curveTo(6.794f, 26.0f, 5.0f, 24.206f, 5.0f, 22.0f)
                curveTo(5.0f, 19.794f, 6.794f, 18.0f, 9.0f, 18.0f)
                close()
                moveTo(19.0f, 19.0f)
                lineTo(26.0f, 19.0f)
                lineTo(26.0f, 26.0f)
                lineTo(19.0f, 26.0f)
                lineTo(19.0f, 19.0f)
                close()
            }
        }
        .build()
        return _shapesSolid!!
    }

private var _shapesSolid: ImageVector? = null
