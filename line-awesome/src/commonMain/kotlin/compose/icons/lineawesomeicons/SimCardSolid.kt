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

public val LineAwesomeIcons.SimCardSolid: ImageVector
    get() {
        if (_simCardSolid != null) {
            return _simCardSolid!!
        }
        _simCardSolid = Builder(name = "SimCardSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 4.0f)
                curveTo(8.4766f, 4.0f, 7.9414f, 4.1836f, 7.5625f, 4.5625f)
                curveTo(7.1836f, 4.9414f, 7.0f, 5.4766f, 7.0f, 6.0f)
                lineTo(7.0f, 26.0f)
                curveTo(7.0f, 26.5234f, 7.1836f, 27.0586f, 7.5625f, 27.4375f)
                curveTo(7.9414f, 27.8164f, 8.4766f, 28.0f, 9.0f, 28.0f)
                lineTo(23.0f, 28.0f)
                curveTo(23.5234f, 28.0f, 24.0586f, 27.8164f, 24.4375f, 27.4375f)
                curveTo(24.8164f, 27.0586f, 25.0f, 26.5234f, 25.0f, 26.0f)
                lineTo(25.0f, 11.4063f)
                curveTo(25.0f, 10.8828f, 24.7227f, 10.3164f, 24.4063f, 10.0f)
                lineTo(19.0f, 4.5938f)
                curveTo(18.6836f, 4.2773f, 18.1172f, 4.0f, 17.5938f, 4.0f)
                close()
                moveTo(9.0f, 6.0f)
                lineTo(17.5938f, 6.0f)
                lineTo(23.0f, 11.4063f)
                lineTo(23.0f, 26.0f)
                lineTo(9.0f, 26.0f)
                close()
                moveTo(11.0f, 15.0f)
                lineTo(11.0f, 24.0f)
                lineTo(21.0f, 24.0f)
                lineTo(21.0f, 15.0f)
                close()
                moveTo(13.0f, 17.0f)
                lineTo(19.0f, 17.0f)
                lineTo(19.0f, 22.0f)
                lineTo(13.0f, 22.0f)
                close()
            }
        }
        .build()
        return _simCardSolid!!
    }

private var _simCardSolid: ImageVector? = null
