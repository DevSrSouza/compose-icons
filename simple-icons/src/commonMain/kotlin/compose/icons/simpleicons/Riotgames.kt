package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Riotgames: ImageVector
    get() {
        if (_riotgames != null) {
            return _riotgames!!
        }
        _riotgames = Builder(name = "Riotgames", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.534f, 21.77f)
                lineToRelative(-1.09f, -2.81f)
                lineToRelative(10.52f, 0.54f)
                lineToRelative(-0.451f, 4.5f)
                close()
                moveTo(15.06f, 0.0f)
                lineTo(0.307f, 6.969f)
                lineTo(2.59f, 17.471f)
                horizontalLineTo(5.6f)
                lineToRelative(-0.52f, -7.512f)
                lineToRelative(0.461f, -0.144f)
                lineToRelative(1.81f, 7.656f)
                horizontalLineToRelative(3.126f)
                lineToRelative(-0.116f, -9.15f)
                lineToRelative(0.462f, -0.144f)
                lineToRelative(1.582f, 9.294f)
                horizontalLineToRelative(3.31f)
                lineToRelative(0.78f, -11.053f)
                lineToRelative(0.462f, -0.144f)
                lineToRelative(0.82f, 11.197f)
                horizontalLineToRelative(4.376f)
                lineToRelative(1.54f, -15.37f)
                close()
            }
        }
        .build()
        return _riotgames!!
    }

private var _riotgames: ImageVector? = null
