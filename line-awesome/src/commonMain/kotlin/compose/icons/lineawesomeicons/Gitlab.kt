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

public val LineAwesomeIcons.Gitlab: ImageVector
    get() {
        if (_gitlab != null) {
            return _gitlab!!
        }
        _gitlab = Builder(name = "Gitlab", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.383f, 1.973f)
                lineTo(4.078f, 13.453f)
                lineTo(3.836f, 14.105f)
                lineTo(1.797f, 19.543f)
                lineTo(16.0f, 29.875f)
                lineTo(30.203f, 19.543f)
                lineTo(28.164f, 14.105f)
                lineTo(23.613f, 1.973f)
                lineTo(19.883f, 13.453f)
                lineTo(12.117f, 13.453f)
                close()
                moveTo(8.25f, 8.027f)
                lineTo(10.016f, 13.453f)
                lineTo(6.215f, 13.453f)
                close()
                moveTo(23.75f, 8.027f)
                lineTo(25.785f, 13.453f)
                lineTo(21.984f, 13.453f)
                close()
                moveTo(5.465f, 15.453f)
                lineTo(10.664f, 15.453f)
                lineTo(14.094f, 26.016f)
                lineTo(4.203f, 18.82f)
                close()
                moveTo(12.766f, 15.453f)
                lineTo(19.234f, 15.453f)
                lineTo(16.0f, 25.402f)
                close()
                moveTo(21.336f, 15.453f)
                lineTo(26.531f, 15.453f)
                lineTo(27.797f, 18.82f)
                lineTo(17.902f, 26.016f)
                close()
            }
        }
        .build()
        return _gitlab!!
    }

private var _gitlab: ImageVector? = null
