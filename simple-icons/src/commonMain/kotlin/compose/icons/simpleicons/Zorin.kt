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

public val SimpleIcons.Zorin: ImageVector
    get() {
        if (_zorin != null) {
            return _zorin!!
        }
        _zorin = Builder(name = "Zorin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 18.944f)
                lineTo(5.995f, 22.4f)
                horizontalLineToRelative(12.01f)
                lineTo(20.0f, 18.944f)
                lineTo(4.0f, 18.944f)
                close()
                moveTo(24.0f, 12.0f)
                lineToRelative(-2.013f, 3.488f)
                lineTo(9.216f, 15.488f)
                lineToRelative(12.771f, -6.976f)
                lineTo(24.0f, 12.0f)
                close()
                moveTo(0.0f, 12.0f)
                lineToRelative(2.013f, -3.488f)
                horizontalLineToRelative(12.771f)
                lineTo(2.013f, 15.488f)
                lineTo(0.0f, 12.0f)
                close()
                moveTo(4.0f, 5.056f)
                lineTo(5.995f, 1.6f)
                horizontalLineToRelative(12.01f)
                lineTo(20.0f, 5.056f)
                lineTo(4.0f, 5.056f)
                close()
            }
        }
        .build()
        return _zorin!!
    }

private var _zorin: ImageVector? = null
