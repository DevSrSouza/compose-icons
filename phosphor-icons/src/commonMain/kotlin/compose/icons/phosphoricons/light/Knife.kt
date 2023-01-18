package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Knife: ImageVector
    get() {
        if (_knife != null) {
            return _knife!!
        }
        _knife = Builder(name = "Knife", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.4f, 33.6f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, -36.8f, 0.1f)
                lineTo(19.7f, 211.8f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, -1.5f, 5.9f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 4.5f, 4.1f)
                arcToRelative(148.9f, 148.9f, 0.0f, false, false, 34.4f, 4.0f)
                curveToRelative(33.1f, 0.0f, 66.2f, -10.8f, 97.3f, -31.8f)
                reflectiveCurveToRelative(49.6f, -45.4f, 50.4f, -46.4f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, -0.6f, -7.8f)
                lineToRelative(-20.1f, -20.2f)
                lineToRelative(46.4f, -49.3f)
                arcTo(26.1f, 26.1f, 0.0f, false, false, 230.4f, 33.6f)
                close()
                moveTo(191.9f, 144.4f)
                arcToRelative(226.1f, 226.1f, 0.0f, false, true, -44.6f, 39.8f)
                curveToRelative(-36.2f, 24.5f, -73.5f, 33.8f, -111.2f, 28.0f)
                lineTo(146.5f, 99.0f)
                lineToRelative(24.8f, 24.8f)
                lineToRelative(0.4f, 0.4f)
                horizontalLineToRelative(0.1f)
                close()
                moveTo(221.9f, 61.9f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-46.2f, 49.2f)
                lineTo(154.9f, 90.4f)
                lineToRelative(47.2f, -48.3f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 19.8f, 19.8f)
                close()
            }
        }
        .build()
        return _knife!!
    }

private var _knife: ImageVector? = null
