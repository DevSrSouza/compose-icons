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

public val LineAwesomeIcons.Kickstarter: ImageVector
    get() {
        if (_kickstarter != null) {
            return _kickstarter!!
        }
        _kickstarter = Builder(name = "Kickstarter", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(13.633f, 11.0f)
                curveTo(12.58f, 11.0f, 12.0f, 11.808f, 12.0f, 12.816f)
                lineTo(12.0f, 19.133f)
                curveTo(12.0f, 20.186f, 12.559f, 20.992f, 13.652f, 20.992f)
                curveTo(14.529f, 20.992f, 15.252f, 20.422f, 15.252f, 19.133f)
                lineTo(15.252f, 17.428f)
                lineTo(17.723f, 20.516f)
                curveTo(18.225f, 21.124f, 19.314f, 21.201f, 20.0f, 20.516f)
                curveTo(20.596f, 19.9f, 20.603f, 19.016f, 20.162f, 18.461f)
                lineTo(18.16f, 15.898f)
                lineTo(19.732f, 13.48f)
                curveTo(20.116f, 12.929f, 20.122f, 12.074f, 19.506f, 11.479f)
                curveTo(18.837f, 10.83f, 17.685f, 10.772f, 17.0f, 11.764f)
                lineTo(15.252f, 14.426f)
                lineTo(15.252f, 12.84f)
                curveTo(15.252f, 11.587f, 14.535f, 11.0f, 13.633f, 11.0f)
                close()
            }
        }
        .build()
        return _kickstarter!!
    }

private var _kickstarter: ImageVector? = null
