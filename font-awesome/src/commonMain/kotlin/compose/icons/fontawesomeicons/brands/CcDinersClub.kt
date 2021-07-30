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

public val BrandsGroup.CcDinersClub: ImageVector
    get() {
        if (_ccDinersClub != null) {
            return _ccDinersClub!!
        }
        _ccDinersClub = Builder(name = "CcDinersClub", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(239.7f, 79.9f)
                curveToRelative(-96.9f, 0.0f, -175.8f, 78.6f, -175.8f, 175.8f)
                curveToRelative(0.0f, 96.9f, 78.9f, 175.8f, 175.8f, 175.8f)
                curveToRelative(97.2f, 0.0f, 175.8f, -78.9f, 175.8f, -175.8f)
                curveToRelative(0.0f, -97.2f, -78.6f, -175.8f, -175.8f, -175.8f)
                close()
                moveTo(199.8f, 359.5f)
                curveToRelative(-41.7f, -15.9f, -71.4f, -56.4f, -71.4f, -103.8f)
                reflectiveCurveToRelative(29.7f, -87.9f, 71.4f, -104.1f)
                verticalLineToRelative(207.9f)
                close()
                moveTo(279.6f, 359.8f)
                lineTo(279.6f, 151.6f)
                curveToRelative(41.7f, 16.2f, 71.4f, 56.7f, 71.4f, 104.1f)
                reflectiveCurveToRelative(-29.7f, 87.9f, -71.4f, 104.1f)
                close()
                moveTo(528.0f, 32.0f)
                lineTo(48.0f, 32.0f)
                curveTo(21.5f, 32.0f, 0.0f, 53.5f, 0.0f, 80.0f)
                verticalLineToRelative(352.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(480.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                lineTo(576.0f, 80.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                close()
                moveTo(329.7f, 448.0f)
                horizontalLineToRelative(-90.3f)
                curveToRelative(-106.2f, 0.0f, -193.8f, -85.5f, -193.8f, -190.2f)
                curveTo(45.6f, 143.2f, 133.2f, 64.0f, 239.4f, 64.0f)
                horizontalLineToRelative(90.3f)
                curveToRelative(105.0f, 0.0f, 200.7f, 79.2f, 200.7f, 193.8f)
                curveToRelative(0.0f, 104.7f, -95.7f, 190.2f, -200.7f, 190.2f)
                close()
            }
        }
        .build()
        return _ccDinersClub!!
    }

private var _ccDinersClub: ImageVector? = null
