package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.SchoolSharp: ImageVector
    get() {
        if (_schoolSharp != null) {
            return _schoolSharp!!
        }
        _schoolSharp = Builder(name = "SchoolSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 370.43f)
                lineToRelative(-160.0f, -91.43f)
                lineToRelative(0.0f, 98.42f)
                lineToRelative(160.0f, 88.88f)
                lineToRelative(160.0f, -88.88f)
                lineToRelative(0.0f, -98.42f)
                lineToRelative(-160.0f, 91.43f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(512.25f, 192.0f)
                lineToRelative(-256.25f, -146.43f)
                lineToRelative(-256.25f, 146.43f)
                lineToRelative(256.25f, 146.43f)
                lineToRelative(208.0f, -118.86f)
                lineToRelative(0.0f, 164.43f)
                lineToRelative(48.0f, 0.0f)
                lineToRelative(0.0f, -191.86f)
                lineToRelative(0.25f, -0.14f)
                close()
            }
        }
        .build()
        return _schoolSharp!!
    }

private var _schoolSharp: ImageVector? = null
