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

public val LineAwesomeIcons.IdCardAltSolid: ImageVector
    get() {
        if (_idCardAltSolid != null) {
            return _idCardAltSolid!!
        }
        _idCardAltSolid = Builder(name = "IdCardAltSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 5.0f)
                curveTo(13.906f, 5.0f, 13.0f, 5.906f, 13.0f, 7.0f)
                lineTo(13.0f, 8.0f)
                lineTo(4.0f, 8.0f)
                lineTo(4.0f, 26.0f)
                lineTo(28.0f, 26.0f)
                lineTo(28.0f, 8.0f)
                lineTo(19.0f, 8.0f)
                lineTo(19.0f, 7.0f)
                curveTo(19.0f, 5.906f, 18.094f, 5.0f, 17.0f, 5.0f)
                close()
                moveTo(15.0f, 7.0f)
                lineTo(17.0f, 7.0f)
                lineTo(17.0f, 9.0f)
                lineTo(15.0f, 9.0f)
                close()
                moveTo(6.0f, 10.0f)
                lineTo(13.0f, 10.0f)
                lineTo(13.0f, 11.0f)
                lineTo(19.0f, 11.0f)
                lineTo(19.0f, 10.0f)
                lineTo(26.0f, 10.0f)
                lineTo(26.0f, 24.0f)
                lineTo(6.0f, 24.0f)
                close()
                moveTo(16.0f, 12.0f)
                curveTo(13.801f, 12.0f, 12.0f, 13.801f, 12.0f, 16.0f)
                curveTo(12.0f, 17.117f, 12.469f, 18.129f, 13.215f, 18.855f)
                curveTo(11.879f, 19.758f, 11.0f, 21.281f, 11.0f, 23.0f)
                lineTo(13.0f, 23.0f)
                curveTo(13.0f, 21.332f, 14.332f, 20.0f, 16.0f, 20.0f)
                curveTo(17.668f, 20.0f, 19.0f, 21.332f, 19.0f, 23.0f)
                lineTo(21.0f, 23.0f)
                curveTo(21.0f, 21.281f, 20.121f, 19.758f, 18.785f, 18.855f)
                curveTo(19.531f, 18.129f, 20.0f, 17.117f, 20.0f, 16.0f)
                curveTo(20.0f, 13.801f, 18.199f, 12.0f, 16.0f, 12.0f)
                close()
                moveTo(16.0f, 14.0f)
                curveTo(17.117f, 14.0f, 18.0f, 14.883f, 18.0f, 16.0f)
                curveTo(18.0f, 17.117f, 17.117f, 18.0f, 16.0f, 18.0f)
                curveTo(14.883f, 18.0f, 14.0f, 17.117f, 14.0f, 16.0f)
                curveTo(14.0f, 14.883f, 14.883f, 14.0f, 16.0f, 14.0f)
                close()
            }
        }
        .build()
        return _idCardAltSolid!!
    }

private var _idCardAltSolid: ImageVector? = null
