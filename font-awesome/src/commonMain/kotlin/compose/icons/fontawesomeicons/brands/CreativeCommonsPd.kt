package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.CreativeCommonsPd: ImageVector
    get() {
        if (_creativeCommonsPd != null) {
            return _creativeCommonsPd!!
        }
        _creativeCommonsPd = Builder(name = "CreativeCommonsPd", defaultWidth = 496.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 8.0f)
                curveTo(111.0f, 8.0f, 0.0f, 119.1f, 0.0f, 256.0f)
                curveToRelative(0.0f, 137.0f, 111.0f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.0f, 248.0f, -248.0f)
                curveTo(496.0f, 119.1f, 385.0f, 8.0f, 248.0f, 8.0f)
                close()
                moveTo(248.0f, 457.5f)
                curveToRelative(-139.2f, 0.0f, -235.8f, -138.0f, -190.2f, -267.9f)
                lineToRelative(78.8f, 35.1f)
                curveToRelative(-2.1f, 10.5f, -3.3f, 21.5f, -3.3f, 32.9f)
                curveToRelative(0.0f, 99.0f, 73.9f, 126.9f, 120.4f, 126.9f)
                curveToRelative(22.9f, 0.0f, 53.5f, -6.7f, 79.4f, -29.5f)
                lineTo(297.0f, 311.1f)
                curveToRelative(-5.5f, 6.3f, -17.6f, 16.7f, -36.3f, 16.7f)
                curveToRelative(-37.8f, 0.0f, -53.7f, -39.9f, -53.9f, -71.9f)
                curveToRelative(230.4f, 102.6f, 216.5f, 96.5f, 217.9f, 96.8f)
                curveToRelative(-34.3f, 62.4f, -100.6f, 104.8f, -176.7f, 104.8f)
                close()
                moveTo(442.2f, 307.5f)
                lineToRelative(-224.0f, -100.0f)
                curveToRelative(18.8f, -34.0f, 54.9f, -30.7f, 74.7f, -11.0f)
                lineToRelative(40.4f, -41.6f)
                curveToRelative(-27.1f, -23.3f, -58.0f, -27.5f, -78.1f, -27.5f)
                curveToRelative(-47.4f, 0.0f, -80.9f, 20.5f, -100.7f, 51.6f)
                lineToRelative(-74.9f, -33.4f)
                curveToRelative(36.1f, -54.9f, 98.1f, -91.2f, 168.5f, -91.2f)
                curveToRelative(111.1f, 0.0f, 201.5f, 90.4f, 201.5f, 201.5f)
                curveToRelative(0.0f, 18.0f, -2.4f, 35.4f, -6.8f, 52.0f)
                curveToRelative(-0.3f, -0.1f, -0.4f, -0.2f, -0.6f, -0.4f)
                close()
            }
        }
        .build()
        return _creativeCommonsPd!!
    }

private var _creativeCommonsPd: ImageVector? = null
