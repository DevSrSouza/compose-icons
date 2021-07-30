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

public val LineAwesomeIcons.GlassMartiniAltSolid: ImageVector
    get() {
        if (_glassMartiniAltSolid != null) {
            return _glassMartiniAltSolid!!
        }
        _glassMartiniAltSolid = Builder(name = "GlassMartiniAltSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 4.0f)
                curveTo(5.4648f, 4.0f, 3.0f, 6.4648f, 3.0f, 9.5f)
                curveTo(3.0f, 12.5352f, 5.4648f, 15.0f, 8.5f, 15.0f)
                curveTo(9.3125f, 15.0f, 10.0781f, 14.7969f, 10.7813f, 14.4688f)
                lineTo(16.0f, 21.3438f)
                lineTo(16.0f, 27.0f)
                lineTo(12.0f, 27.0f)
                lineTo(12.0f, 29.0f)
                lineTo(22.0f, 29.0f)
                lineTo(22.0f, 27.0f)
                lineTo(18.0f, 27.0f)
                lineTo(18.0f, 21.3438f)
                lineTo(26.8125f, 9.7188f)
                lineTo(27.0f, 9.4375f)
                lineTo(27.0f, 8.0f)
                lineTo(13.75f, 8.0f)
                curveTo(13.1445f, 5.6797f, 10.9844f, 4.0f, 8.5f, 4.0f)
                close()
                moveTo(8.5f, 6.0f)
                curveTo(9.8906f, 6.0f, 11.0898f, 6.8398f, 11.625f, 8.0f)
                lineTo(7.0f, 8.0f)
                lineTo(7.0f, 9.4375f)
                lineTo(7.1875f, 9.7188f)
                lineTo(9.5313f, 12.8125f)
                curveTo(9.1875f, 12.9336f, 8.8359f, 13.0f, 8.5f, 13.0f)
                curveTo(6.5352f, 13.0f, 5.0f, 11.4648f, 5.0f, 9.5f)
                curveTo(5.0f, 7.5352f, 6.5352f, 6.0f, 8.5f, 6.0f)
                close()
                moveTo(9.9375f, 10.0f)
                lineTo(24.0625f, 10.0f)
                lineTo(22.5625f, 12.0f)
                lineTo(13.5f, 12.0f)
                lineTo(15.0f, 14.0f)
                lineTo(21.0313f, 14.0f)
                lineTo(17.0f, 19.3438f)
                close()
            }
        }
        .build()
        return _glassMartiniAltSolid!!
    }

private var _glassMartiniAltSolid: ImageVector? = null
