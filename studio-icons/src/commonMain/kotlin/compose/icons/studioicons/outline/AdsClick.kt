package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.AdsClick: ImageVector
    get() {
        if (_adsClick != null) {
            return _adsClick!!
        }
        _adsClick = Builder(name = "AdsClick", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.71f, 17.99f)
                curveTo(8.53f, 17.84f, 6.0f, 15.22f, 6.0f, 12.0f)
                curveToRelative(0.0f, -3.31f, 2.69f, -6.0f, 6.0f, -6.0f)
                curveToRelative(3.22f, 0.0f, 5.84f, 2.53f, 5.99f, 5.71f)
                lineToRelative(-2.1f, -0.63f)
                curveTo(15.48f, 9.31f, 13.89f, 8.0f, 12.0f, 8.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f)
                curveToRelative(0.0f, 1.89f, 1.31f, 3.48f, 3.08f, 3.89f)
                lineTo(11.71f, 17.99f)
                close()
                moveTo(22.0f, 12.0f)
                curveToRelative(0.0f, 0.3f, -0.01f, 0.6f, -0.04f, 0.9f)
                lineToRelative(-1.97f, -0.59f)
                curveTo(20.0f, 12.21f, 20.0f, 12.1f, 20.0f, 12.0f)
                curveToRelative(0.0f, -4.42f, -3.58f, -8.0f, -8.0f, -8.0f)
                reflectiveCurveToRelative(-8.0f, 3.58f, -8.0f, 8.0f)
                reflectiveCurveToRelative(3.58f, 8.0f, 8.0f, 8.0f)
                curveToRelative(0.1f, 0.0f, 0.21f, 0.0f, 0.31f, -0.01f)
                lineToRelative(0.59f, 1.97f)
                curveTo(12.6f, 21.99f, 12.3f, 22.0f, 12.0f, 22.0f)
                curveTo(6.48f, 22.0f, 2.0f, 17.52f, 2.0f, 12.0f)
                curveTo(2.0f, 6.48f, 6.48f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(22.0f, 6.48f, 22.0f, 12.0f)
                close()
                moveTo(18.23f, 16.26f)
                lineTo(22.0f, 15.0f)
                lineToRelative(-10.0f, -3.0f)
                lineToRelative(3.0f, 10.0f)
                lineToRelative(1.26f, -3.77f)
                lineToRelative(4.27f, 4.27f)
                lineToRelative(1.98f, -1.98f)
                lineTo(18.23f, 16.26f)
                close()
            }
        }
        .build()
        return _adsClick!!
    }

private var _adsClick: ImageVector? = null
