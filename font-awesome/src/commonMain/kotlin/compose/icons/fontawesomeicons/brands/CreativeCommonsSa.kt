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

public val BrandsGroup.CreativeCommonsSa: ImageVector
    get() {
        if (_creativeCommonsSa != null) {
            return _creativeCommonsSa!!
        }
        _creativeCommonsSa = Builder(name = "CreativeCommonsSa", defaultWidth = 496.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(247.6f, 8.0f)
                curveTo(389.4f, 8.0f, 496.0f, 118.1f, 496.0f, 256.0f)
                curveToRelative(0.0f, 147.1f, -118.5f, 248.0f, -248.4f, 248.0f)
                curveTo(113.6f, 504.0f, 0.0f, 394.5f, 0.0f, 256.0f)
                curveTo(0.0f, 123.1f, 104.7f, 8.0f, 247.6f, 8.0f)
                close()
                moveTo(248.4f, 52.7f)
                curveTo(130.2f, 52.7f, 44.7f, 150.6f, 44.7f, 256.0f)
                curveToRelative(0.0f, 109.8f, 91.2f, 202.8f, 203.7f, 202.8f)
                curveToRelative(103.2f, 0.0f, 202.8f, -81.1f, 202.8f, -202.8f)
                curveToRelative(0.1f, -113.8f, -90.2f, -203.3f, -202.8f, -203.3f)
                close()
                moveTo(137.7f, 221.0f)
                curveToRelative(13.0f, -83.9f, 80.5f, -95.7f, 108.9f, -95.7f)
                curveToRelative(99.8f, 0.0f, 127.5f, 82.5f, 127.5f, 134.2f)
                curveToRelative(0.0f, 63.6f, -41.0f, 132.9f, -128.9f, 132.9f)
                curveToRelative(-38.9f, 0.0f, -99.1f, -20.0f, -109.4f, -97.0f)
                horizontalLineToRelative(62.5f)
                curveToRelative(1.5f, 30.1f, 19.6f, 45.2f, 54.5f, 45.2f)
                curveToRelative(23.3f, 0.0f, 58.0f, -18.2f, 58.0f, -82.8f)
                curveToRelative(0.0f, -82.5f, -49.1f, -80.6f, -56.7f, -80.6f)
                curveToRelative(-33.1f, 0.0f, -51.7f, 14.6f, -55.8f, 43.8f)
                horizontalLineToRelative(18.2f)
                lineToRelative(-49.2f, 49.2f)
                lineToRelative(-49.0f, -49.2f)
                horizontalLineToRelative(19.4f)
                close()
            }
        }
        .build()
        return _creativeCommonsSa!!
    }

private var _creativeCommonsSa: ImageVector? = null
