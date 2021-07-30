package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.ColorPicker: ImageVector
    get() {
        if (_colorPicker != null) {
            return _colorPicker!!
        }
        _colorPicker = Builder(name = "ColorPicker", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.3847f, 2.8787f)
                curveTo(19.2132f, 1.7071f, 17.3137f, 1.7071f, 16.1421f, 2.8787f)
                lineTo(14.0202f, 5.0005f)
                lineTo(13.313f, 4.2933f)
                curveTo(12.9225f, 3.9028f, 12.2894f, 3.9028f, 11.8988f, 4.2933f)
                curveTo(11.5083f, 4.6838f, 11.5083f, 5.317f, 11.8988f, 5.7075f)
                lineTo(17.5557f, 11.3644f)
                curveTo(17.9462f, 11.7549f, 18.5794f, 11.7549f, 18.9699f, 11.3644f)
                curveTo(19.3604f, 10.9739f, 19.3604f, 10.3407f, 18.9699f, 9.9502f)
                lineTo(18.2629f, 9.2432f)
                lineTo(20.3847f, 7.1213f)
                curveTo(21.5563f, 5.9497f, 21.5563f, 4.0503f, 20.3847f, 2.8787f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.9297f, 7.0912f)
                lineTo(4.1515f, 14.8693f)
                curveTo(3.2279f, 15.793f, 3.0324f, 17.169f, 3.5651f, 18.2842f)
                lineTo(1.9999f, 19.8493f)
                lineTo(3.4141f, 21.2635f)
                lineTo(4.9793f, 19.6984f)
                curveTo(6.0944f, 20.2311f, 7.4705f, 20.0356f, 8.3941f, 19.112f)
                lineTo(16.1723f, 11.3338f)
                lineTo(11.9297f, 7.0912f)
                close()
                moveTo(13.3439f, 11.3338f)
                lineTo(11.9297f, 9.9196f)
                lineTo(5.5657f, 16.2835f)
                curveTo(5.1752f, 16.6741f, 5.1752f, 17.3072f, 5.5657f, 17.6978f)
                curveTo(5.9562f, 18.0883f, 6.5894f, 18.0883f, 6.9799f, 17.6978f)
                lineTo(13.3439f, 11.3338f)
                close()
            }
        }
        .build()
        return _colorPicker!!
    }

private var _colorPicker: ImageVector? = null
