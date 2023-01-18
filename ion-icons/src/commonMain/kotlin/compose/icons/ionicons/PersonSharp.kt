package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.PersonSharp: ImageVector
    get() {
        if (_personSharp != null) {
            return _personSharp!!
        }
        _personSharp = Builder(name = "PersonSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 256.0f)
                arcTo(112.0f, 112.0f, 0.0f, true, false, 144.0f, 144.0f)
                arcTo(112.0f, 112.0f, 0.0f, false, false, 256.0f, 256.0f)
                close()
                moveTo(256.0f, 288.0f)
                curveToRelative(-69.42f, 0.0f, -208.0f, 42.88f, -208.0f, 128.0f)
                verticalLineToRelative(64.0f)
                lineTo(464.0f, 480.0f)
                lineTo(464.0f, 416.0f)
                curveTo(464.0f, 330.88f, 325.42f, 288.0f, 256.0f, 288.0f)
                close()
            }
        }
        .build()
        return _personSharp!!
    }

private var _personSharp: ImageVector? = null
