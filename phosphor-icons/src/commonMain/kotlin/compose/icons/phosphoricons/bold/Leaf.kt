package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.Leaf: ImageVector
    get() {
        if (_leaf != null) {
            return _leaf!!
        }
        _leaf = Builder(name = "Leaf", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 39.3f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 216.7f, 28.0f)
                curveToRelative(-39.7f, -2.3f, -74.8f, 2.4f, -104.2f, 13.9f)
                reflectiveCurveToRelative(-50.0f, 28.2f, -62.9f, 49.6f)
                curveToRelative(-17.7f, 29.2f, -17.7f, 64.6f, -0.5f, 98.4f)
                lineTo(31.5f, 207.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 17.0f, 0.0f)
                lineToRelative(17.6f, -17.6f)
                curveToRelative(16.8f, 8.5f, 34.0f, 12.9f, 50.6f, 12.9f)
                arcToRelative(91.6f, 91.6f, 0.0f, false, false, 47.8f, -13.4f)
                curveToRelative(21.4f, -12.9f, 38.5f, -34.7f, 49.6f, -62.9f)
                reflectiveCurveTo(230.3f, 79.0f, 228.0f, 39.3f)
                close()
                moveTo(152.1f, 185.9f)
                curveToRelative(-20.2f, 12.2f, -43.9f, 13.1f, -68.0f, 2.9f)
                lineToRelative(84.4f, -84.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, -17.0f)
                lineTo(67.2f, 171.9f)
                curveToRelative(-10.2f, -24.1f, -9.3f, -47.8f, 2.9f, -68.0f)
                curveToRelative(21.0f, -34.6f, 70.7f, -53.8f, 134.4f, -52.4f)
                curveTo(206.0f, 115.1f, 186.7f, 164.9f, 152.1f, 185.9f)
                close()
            }
        }
        .build()
        return _leaf!!
    }

private var _leaf: ImageVector? = null
