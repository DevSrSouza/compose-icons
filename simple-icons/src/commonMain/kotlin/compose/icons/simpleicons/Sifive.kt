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

public val SimpleIcons.Sifive: ImageVector
    get() {
        if (_sifive != null) {
            return _sifive!!
        }
        _sifive = Builder(name = "Sifive", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.9056f, 12.4076f)
                lineTo(6.0245f, 2.737f)
                horizontalLineToRelative(11.9511f)
                lineToRelative(1.2129f, 3.7623f)
                horizontalLineTo(8.6317f)
                lineToRelative(-0.6751f, 2.1342f)
                horizontalLineToRelative(11.92f)
                lineToRelative(1.792f, 5.5583f)
                lineTo(12.0f, 21.319f)
                lineToRelative(-9.1888f, -6.7771f)
                horizontalLineToRelative(6.2049f)
                lineToRelative(2.9565f, 2.1805f)
                lineToRelative(5.8505f, -4.3125f)
                lineToRelative(-14.9175f, -0.0023f)
                close()
                moveTo(19.4166f, 0.4426f)
                horizontalLineTo(4.5835f)
                lineTo(0.0f, 14.7306f)
                lineToRelative(12.0f, 8.8268f)
                lineToRelative(12.0f, -8.8298f)
                lineTo(19.4165f, 0.4427f)
                close()
            }
        }
        .build()
        return _sifive!!
    }

private var _sifive: ImageVector? = null
