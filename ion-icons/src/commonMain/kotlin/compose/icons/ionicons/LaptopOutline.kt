package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.LaptopOutline: ImageVector
    get() {
        if (_laptopOutline != null) {
            return _laptopOutline!!
        }
        _laptopOutline = Builder(name = "LaptopOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(80.14f, 96.0f)
                lineTo(431.86f, 96.0f)
                arcTo(32.14f, 32.14f, 0.0f, false, true, 464.0f, 128.14f)
                lineTo(464.0f, 367.86f)
                arcTo(32.14f, 32.14f, 0.0f, false, true, 431.86f, 400.0f)
                lineTo(80.14f, 400.0f)
                arcTo(32.14f, 32.14f, 0.0f, false, true, 48.0f, 367.86f)
                lineTo(48.0f, 128.14f)
                arcTo(32.14f, 32.14f, 0.0f, false, true, 80.14f, 96.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 416.0f)
                lineTo(496.0f, 416.0f)
            }
        }
        .build()
        return _laptopOutline!!
    }

private var _laptopOutline: ImageVector? = null
