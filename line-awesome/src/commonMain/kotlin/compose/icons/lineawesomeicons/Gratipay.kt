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

public val LineAwesomeIcons.Gratipay: ImageVector
    get() {
        if (_gratipay != null) {
            return _gratipay!!
        }
        _gratipay = Builder(name = "Gratipay", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(9.383f, 4.0f, 4.0f, 9.383f, 4.0f, 16.0f)
                curveTo(4.0f, 22.617f, 9.383f, 28.0f, 16.0f, 28.0f)
                curveTo(22.617f, 28.0f, 28.0f, 22.617f, 28.0f, 16.0f)
                curveTo(28.0f, 9.383f, 22.617f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(21.535f, 6.0f, 26.0f, 10.465f, 26.0f, 16.0f)
                curveTo(26.0f, 21.535f, 21.535f, 26.0f, 16.0f, 26.0f)
                curveTo(10.465f, 26.0f, 6.0f, 21.535f, 6.0f, 16.0f)
                curveTo(6.0f, 10.465f, 10.465f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(12.5f, 12.0f)
                curveTo(11.117f, 12.0f, 10.0f, 13.117f, 10.0f, 14.5f)
                curveTo(10.0f, 15.027f, 10.156f, 15.535f, 10.438f, 15.938f)
                curveTo(10.438f, 15.941f, 10.469f, 15.938f, 10.469f, 15.938f)
                lineTo(16.0f, 22.25f)
                lineTo(21.531f, 15.938f)
                curveTo(21.531f, 15.938f, 21.563f, 15.906f, 21.563f, 15.906f)
                curveTo(21.844f, 15.504f, 22.0f, 15.027f, 22.0f, 14.5f)
                curveTo(22.0f, 13.117f, 20.883f, 12.0f, 19.5f, 12.0f)
                curveTo(17.734f, 12.0f, 17.313f, 13.688f, 16.0f, 13.688f)
                curveTo(14.688f, 13.688f, 14.266f, 12.0f, 12.5f, 12.0f)
                close()
            }
        }
        .build()
        return _gratipay!!
    }

private var _gratipay: ImageVector? = null
