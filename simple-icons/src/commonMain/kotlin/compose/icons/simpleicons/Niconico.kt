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

public val SimpleIcons.Niconico: ImageVector
    get() {
        if (_niconico != null) {
            return _niconico!!
        }
        _niconico = Builder(name = "Niconico", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.4787f, 7.534f)
                verticalLineToRelative(12.1279f)
                arcTo(2.0213f, 2.0213f, 0.0f, false, false, 2.5f, 21.6832f)
                horizontalLineToRelative(2.3888f)
                lineToRelative(1.323f, 2.0948f)
                arcToRelative(0.4778f, 0.4778f, 0.0f, false, false, 0.4043f, 0.2205f)
                arcToRelative(0.4778f, 0.4778f, 0.0f, false, false, 0.441f, -0.2205f)
                lineToRelative(1.323f, -2.0948f)
                horizontalLineToRelative(6.9828f)
                lineToRelative(1.323f, 2.0948f)
                arcToRelative(0.4778f, 0.4778f, 0.0f, false, false, 0.441f, 0.2205f)
                curveToRelative(0.1838f, 0.0f, 0.3308f, -0.0735f, 0.4043f, -0.2205f)
                lineToRelative(1.323f, -2.0948f)
                horizontalLineToRelative(2.6462f)
                arcToRelative(2.0213f, 2.0213f, 0.0f, false, false, 2.0213f, -2.0213f)
                verticalLineTo(7.5339f)
                arcToRelative(2.0213f, 2.0213f, 0.0f, false, false, -2.0213f, -1.9845f)
                horizontalLineToRelative(-7.681f)
                lineToRelative(4.4468f, -4.4469f)
                lineTo(17.1637f, 0.0f)
                lineToRelative(-5.1452f, 5.1452f)
                lineTo(6.8f, 0.0f)
                lineTo(5.6973f, 1.1025f)
                lineToRelative(4.4102f, 4.4102f)
                horizontalLineTo(2.5367f)
                arcToRelative(2.0213f, 2.0213f, 0.0f, false, false, -2.058f, 2.058f)
                close()
            }
        }
        .build()
        return _niconico!!
    }

private var _niconico: ImageVector? = null
