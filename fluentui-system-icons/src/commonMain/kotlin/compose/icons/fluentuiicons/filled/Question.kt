package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.Question: ImageVector
    get() {
        if (_question != null) {
            return _question!!
        }
        _question = Builder(name = "Question", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveTo(9.2377f, 4.0f, 7.0f, 6.2377f, 7.0f, 9.0f)
                curveTo(7.0f, 9.5523f, 7.4477f, 10.0f, 8.0f, 10.0f)
                curveTo(8.5523f, 10.0f, 9.0f, 9.5523f, 9.0f, 9.0f)
                curveTo(9.0f, 7.3423f, 10.3423f, 6.0f, 12.0f, 6.0f)
                curveTo(13.6577f, 6.0f, 15.0f, 7.3423f, 15.0f, 9.0f)
                curveTo(15.0f, 9.8165f, 14.8014f, 10.2945f, 14.5621f, 10.6286f)
                curveTo(14.3004f, 10.9938f, 13.9373f, 11.2671f, 13.4335f, 11.6135f)
                lineTo(13.3183f, 11.6923f)
                curveTo(12.8712f, 11.9977f, 12.2953f, 12.391f, 11.8493f, 12.9392f)
                curveTo(11.3224f, 13.5869f, 11.0f, 14.4061f, 11.0f, 15.5f)
                verticalLineTo(16.0f)
                curveTo(11.0f, 16.5523f, 11.4477f, 17.0f, 12.0f, 17.0f)
                curveTo(12.5523f, 17.0f, 13.0f, 16.5523f, 13.0f, 16.0f)
                verticalLineTo(15.5f)
                curveTo(13.0f, 14.8439f, 13.1776f, 14.4756f, 13.4007f, 14.2014f)
                curveTo(13.6567f, 13.8868f, 14.0026f, 13.6491f, 14.5137f, 13.2978f)
                lineTo(14.5665f, 13.2615f)
                curveTo(15.0627f, 12.9204f, 15.6996f, 12.4749f, 16.1879f, 11.7933f)
                curveTo(16.6986f, 11.0805f, 17.0f, 10.1835f, 17.0f, 9.0f)
                curveTo(17.0f, 6.2377f, 14.7623f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(12.0f, 21.25f)
                curveTo(12.6904f, 21.25f, 13.25f, 20.6904f, 13.25f, 20.0f)
                curveTo(13.25f, 19.3096f, 12.6904f, 18.75f, 12.0f, 18.75f)
                curveTo(11.3096f, 18.75f, 10.75f, 19.3096f, 10.75f, 20.0f)
                curveTo(10.75f, 20.6904f, 11.3096f, 21.25f, 12.0f, 21.25f)
                close()
            }
        }
        .build()
        return _question!!
    }

private var _question: ImageVector? = null
