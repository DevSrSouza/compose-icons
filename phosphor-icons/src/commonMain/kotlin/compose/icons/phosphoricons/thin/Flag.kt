package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.Flag: ImageVector
    get() {
        if (_flag != null) {
            return _flag!!
        }
        _flag = Builder(name = "Flag", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(217.8f, 44.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.2f, 0.4f)
                curveToRelative(-30.2f, 22.6f, -56.3f, 11.4f, -84.0f, -0.5f)
                reflectiveCurveToRelative(-58.1f, -24.9f, -92.0f, 0.5f)
                lineToRelative(-0.2f, 0.2f)
                lineToRelative(-0.3f, 0.3f)
                lineToRelative(-0.3f, 0.3f)
                curveToRelative(0.0f, 0.1f, -0.1f, 0.2f, -0.2f, 0.3f)
                reflectiveCurveToRelative(-0.1f, 0.2f, -0.2f, 0.3f)
                reflectiveCurveToRelative(-0.1f, 0.2f, -0.1f, 0.4f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, -0.1f, 0.3f)
                arcToRelative(6.1654277E13f, 6.1654277E13f, 0.0f, false, false, -0.2f, 0.8f)
                verticalLineTo(216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(170.1f)
                curveToRelative(29.5f, -21.1f, 55.2f, -10.1f, 82.4f, 1.6f)
                curveToRelative(16.5f, 7.0f, 33.2f, 14.2f, 50.9f, 14.2f)
                curveToRelative(13.1f, 0.0f, 26.7f, -3.9f, 41.1f, -14.7f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 220.0f, 168.0f)
                verticalLineTo(48.0f)
                arcTo(4.2f, 4.2f, 0.0f, false, false, 217.8f, 44.4f)
                close()
                moveTo(212.0f, 166.0f)
                curveToRelative(-29.5f, 21.0f, -55.2f, 10.0f, -82.4f, -1.7f)
                reflectiveCurveTo(75.2f, 141.0f, 44.0f, 160.4f)
                verticalLineTo(50.1f)
                curveTo(73.5f, 29.0f, 99.2f, 40.0f, 126.4f, 51.7f)
                reflectiveCurveTo(180.8f, 75.0f, 212.0f, 55.6f)
                close()
            }
        }
        .build()
        return _flag!!
    }

private var _flag: ImageVector? = null
