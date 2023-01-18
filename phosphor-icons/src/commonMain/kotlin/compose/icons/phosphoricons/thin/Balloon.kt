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

public val ThinGroup.Balloon: ImageVector
    get() {
        if (_balloon != null) {
            return _balloon!!
        }
        _balloon = Builder(name = "Balloon", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcToRelative(84.1f, 84.1f, 0.0f, false, false, -84.0f, 84.0f)
                curveToRelative(0.0f, 22.6f, 9.1f, 47.6f, 24.3f, 67.0f)
                curveToRelative(12.5f, 16.0f, 27.5f, 26.5f, 43.5f, 30.8f)
                lineToRelative(-11.5f, 28.7f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 0.4f, 3.7f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 104.0f, 236.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.3f, -1.8f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 0.4f, -3.7f)
                lineToRelative(-11.5f, -28.7f)
                curveToRelative(16.0f, -4.3f, 31.0f, -14.8f, 43.5f, -30.8f)
                curveToRelative(15.2f, -19.4f, 24.3f, -44.4f, 24.3f, -67.0f)
                arcTo(84.1f, 84.1f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(146.1f, 228.0f)
                lineTo(109.9f, 228.0f)
                lineToRelative(9.8f, -24.6f)
                arcToRelative(57.7f, 57.7f, 0.0f, false, false, 16.6f, 0.0f)
                close()
                moveTo(128.0f, 196.0f)
                curveToRelative(-42.1f, 0.0f, -76.0f, -50.3f, -76.0f, -92.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, true, 152.0f, 0.0f)
                curveTo(204.0f, 145.7f, 170.1f, 196.0f, 128.0f, 196.0f)
                close()
                moveTo(179.3f, 95.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.3f, 4.6f)
                horizontalLineToRelative(-0.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.9f, -3.3f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, -36.1f, -36.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.4f, -7.9f)
                arcTo(52.1f, 52.1f, 0.0f, false, true, 179.3f, 95.3f)
                close()
            }
        }
        .build()
        return _balloon!!
    }

private var _balloon: ImageVector? = null
