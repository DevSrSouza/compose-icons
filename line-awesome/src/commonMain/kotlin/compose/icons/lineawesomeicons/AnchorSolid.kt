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

public val LineAwesomeIcons.AnchorSolid: ImageVector
    get() {
        if (_anchorSolid != null) {
            return _anchorSolid!!
        }
        _anchorSolid = Builder(name = "AnchorSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(13.8008f, 4.0f, 12.0f, 5.8008f, 12.0f, 8.0f)
                curveTo(12.0f, 9.8516f, 13.2813f, 11.3984f, 15.0f, 11.8438f)
                lineTo(15.0f, 14.0f)
                lineTo(12.0f, 14.0f)
                lineTo(12.0f, 16.0f)
                lineTo(15.0f, 16.0f)
                lineTo(15.0f, 23.9688f)
                curveTo(12.5742f, 23.7773f, 10.9609f, 22.8906f, 9.8125f, 21.875f)
                curveTo(8.9375f, 21.1016f, 8.3516f, 20.25f, 7.9375f, 19.5313f)
                lineTo(9.5313f, 18.75f)
                lineTo(5.5313f, 16.9375f)
                lineTo(4.4688f, 21.25f)
                lineTo(6.125f, 20.4375f)
                curveTo(6.5977f, 21.2852f, 7.332f, 22.3711f, 8.4688f, 23.375f)
                curveTo(9.9219f, 24.6641f, 12.0664f, 25.7305f, 15.0f, 25.9375f)
                lineTo(15.0f, 26.0f)
                lineTo(16.0f, 27.0f)
                lineTo(17.0f, 26.0f)
                lineTo(17.0f, 25.9375f)
                curveTo(19.9336f, 25.7305f, 22.0781f, 24.6641f, 23.5313f, 23.375f)
                curveTo(24.668f, 22.3711f, 25.4023f, 21.2852f, 25.875f, 20.4375f)
                lineTo(27.5313f, 21.25f)
                lineTo(26.4688f, 16.9375f)
                lineTo(22.4688f, 18.75f)
                lineTo(24.0625f, 19.5313f)
                curveTo(23.6484f, 20.25f, 23.0625f, 21.1016f, 22.1875f, 21.875f)
                curveTo(21.0391f, 22.8906f, 19.4258f, 23.7773f, 17.0f, 23.9688f)
                lineTo(17.0f, 16.0f)
                lineTo(20.0f, 16.0f)
                lineTo(20.0f, 14.0f)
                lineTo(17.0f, 14.0f)
                lineTo(17.0f, 11.8438f)
                curveTo(18.7188f, 11.3984f, 20.0f, 9.8516f, 20.0f, 8.0f)
                curveTo(20.0f, 5.8008f, 18.1992f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(17.1172f, 6.0f, 18.0f, 6.8828f, 18.0f, 8.0f)
                curveTo(18.0f, 9.1172f, 17.1172f, 10.0f, 16.0f, 10.0f)
                curveTo(14.8828f, 10.0f, 14.0f, 9.1172f, 14.0f, 8.0f)
                curveTo(14.0f, 6.8828f, 14.8828f, 6.0f, 16.0f, 6.0f)
                close()
            }
        }
        .build()
        return _anchorSolid!!
    }

private var _anchorSolid: ImageVector? = null
