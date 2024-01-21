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

public val BrandsGroup.GoogleScholar: ImageVector
    get() {
        if (_googleScholar != null) {
            return _googleScholar!!
        }
        _googleScholar = Builder(name = "GoogleScholar", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(390.9f, 298.5f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.1f, 0.1f, 0.1f)
                curveToRelative(9.2f, 19.4f, 14.4f, 41.1f, 14.4f, 64.0f)
                curveTo(405.3f, 445.1f, 338.5f, 512.0f, 256.0f, 512.0f)
                reflectiveCurveToRelative(-149.3f, -66.9f, -149.3f, -149.3f)
                curveToRelative(0.0f, -22.9f, 5.2f, -44.6f, 14.4f, -64.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.7f, -3.6f, 3.6f, -7.2f, 5.6f, -10.7f)
                curveToRelative(4.4f, -7.6f, 9.4f, -14.7f, 15.0f, -21.3f)
                curveToRelative(27.4f, -32.6f, 68.5f, -53.3f, 114.4f, -53.3f)
                curveToRelative(33.6f, 0.0f, 64.6f, 11.1f, 89.6f, 29.9f)
                curveToRelative(9.1f, 6.9f, 17.4f, 14.7f, 24.8f, 23.5f)
                curveToRelative(5.6f, 6.6f, 10.6f, 13.8f, 15.0f, 21.3f)
                curveToRelative(2.0f, 3.4f, 3.8f, 7.0f, 5.5f, 10.5f)
                close()
                moveTo(417.3f, 279.7f)
                curveToRelative(-30.1f, -58.4f, -91.0f, -98.4f, -161.3f, -98.4f)
                reflectiveCurveToRelative(-131.2f, 40.0f, -161.3f, 98.4f)
                lineTo(0.0f, 202.7f)
                lineTo(256.0f, 0.0f)
                lineTo(512.0f, 202.7f)
                lineToRelative(-94.7f, 77.1f)
                close()
            }
        }
        .build()
        return _googleScholar!!
    }

private var _googleScholar: ImageVector? = null
