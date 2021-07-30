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

public val LineAwesomeIcons.DribbbleSquare: ImageVector
    get() {
        if (_dribbbleSquare != null) {
            return _dribbbleSquare!!
        }
        _dribbbleSquare = Builder(name = "DribbbleSquare", defaultWidth = 32.0.dp, defaultHeight =
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
                moveTo(16.25f, 8.0f)
                curveTo(14.125f, 8.0f, 14.125f, 13.5045f, 14.125f, 13.5625f)
                curveTo(14.125f, 14.2035f, 14.1485f, 14.812f, 14.1875f, 15.375f)
                curveTo(13.8905f, 15.265f, 13.5545f, 15.1875f, 13.1875f, 15.1875f)
                curveTo(11.0045f, 15.1875f, 10.0f, 17.035f, 10.0f, 19.0f)
                curveTo(10.0f, 20.848f, 11.0433f, 23.0f, 13.4063f, 23.0f)
                curveTo(14.5232f, 23.0f, 15.489f, 22.2857f, 16.252f, 21.2188f)
                curveTo(16.924f, 21.9028f, 17.604f, 22.1563f, 18.127f, 22.1563f)
                curveTo(19.787f, 22.1563f, 20.8862f, 19.254f, 21.2813f, 18.0f)
                curveTo(21.3983f, 17.605f, 21.1833f, 17.1483f, 20.7813f, 17.0313f)
                curveTo(20.3862f, 16.9023f, 19.9727f, 17.1252f, 19.8438f, 17.5313f)
                curveTo(19.3787f, 19.0042f, 18.512f, 20.547f, 18.125f, 20.625f)
                curveTo(17.84f, 20.625f, 17.4452f, 20.3755f, 17.0313f, 19.8125f)
                curveTo(17.9813f, 17.8165f, 18.4688f, 15.3282f, 18.4688f, 13.6563f)
                curveTo(18.4688f, 8.9803f, 17.258f, 8.0f, 16.25f, 8.0f)
                close()
                moveTo(16.3125f, 9.625f)
                curveTo(16.5515f, 9.98f, 16.9688f, 11.1053f, 16.9688f, 13.6563f)
                curveTo(16.9688f, 15.0083f, 16.6402f, 16.5858f, 16.1563f, 17.9688f)
                curveTo(15.8403f, 16.8908f, 15.625f, 15.4415f, 15.625f, 13.5625f)
                curveTo(15.625f, 11.8235f, 15.9965f, 10.18f, 16.3125f, 9.625f)
                close()
                moveTo(12.9063f, 16.7188f)
                curveTo(12.9963f, 16.6987f, 13.0865f, 16.7188f, 13.1875f, 16.7188f)
                curveTo(13.8285f, 16.7188f, 14.3125f, 17.1875f, 14.3125f, 17.1875f)
                curveTo(14.3435f, 17.2265f, 14.3865f, 17.2815f, 14.4375f, 17.3125f)
                curveTo(14.6445f, 18.3715f, 14.9645f, 19.205f, 15.3125f, 19.877f)
                curveTo(14.7385f, 20.846f, 14.0662f, 21.4707f, 13.4063f, 21.4707f)
                curveTo(11.6952f, 21.4707f, 11.5313f, 19.9412f, 11.5313f, 19.2813f)
                curveTo(11.5313f, 19.1793f, 11.5542f, 16.9888f, 12.9063f, 16.7188f)
                close()
            }
        }
        .build()
        return _dribbbleSquare!!
    }

private var _dribbbleSquare: ImageVector? = null
