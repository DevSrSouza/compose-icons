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

public val LineAwesomeIcons.HeadphonesAltSolid: ImageVector
    get() {
        if (_headphonesAltSolid != null) {
            return _headphonesAltSolid!!
        }
        _headphonesAltSolid = Builder(name = "HeadphonesAltSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 5.0f)
                curveTo(9.938f, 5.0f, 5.0f, 9.938f, 5.0f, 16.0f)
                lineTo(5.0f, 24.0f)
                curveTo(5.0f, 25.645f, 6.355f, 27.0f, 8.0f, 27.0f)
                lineTo(11.0f, 27.0f)
                lineTo(11.0f, 18.0f)
                lineTo(7.0f, 18.0f)
                lineTo(7.0f, 16.0f)
                curveTo(7.0f, 11.016f, 11.016f, 7.0f, 16.0f, 7.0f)
                curveTo(20.984f, 7.0f, 25.0f, 11.016f, 25.0f, 16.0f)
                lineTo(25.0f, 18.0f)
                lineTo(21.0f, 18.0f)
                lineTo(21.0f, 27.0f)
                lineTo(24.0f, 27.0f)
                curveTo(25.645f, 27.0f, 27.0f, 25.645f, 27.0f, 24.0f)
                lineTo(27.0f, 16.0f)
                curveTo(27.0f, 9.938f, 22.063f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(7.0f, 20.0f)
                lineTo(9.0f, 20.0f)
                lineTo(9.0f, 25.0f)
                lineTo(8.0f, 25.0f)
                curveTo(7.434f, 25.0f, 7.0f, 24.566f, 7.0f, 24.0f)
                close()
                moveTo(23.0f, 20.0f)
                lineTo(25.0f, 20.0f)
                lineTo(25.0f, 24.0f)
                curveTo(25.0f, 24.566f, 24.566f, 25.0f, 24.0f, 25.0f)
                lineTo(23.0f, 25.0f)
                close()
            }
        }
        .build()
        return _headphonesAltSolid!!
    }

private var _headphonesAltSolid: ImageVector? = null
