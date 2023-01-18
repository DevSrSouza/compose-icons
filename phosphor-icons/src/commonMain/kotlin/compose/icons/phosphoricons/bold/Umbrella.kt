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

public val BoldGroup.Umbrella: ImageVector
    get() {
        if (_umbrella != null) {
            return _umbrella!!
        }
        _umbrella = Builder(name = "Umbrella", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.6f, 126.3f)
                arcToRelative(116.0f, 116.0f, 0.0f, false, false, -231.2f, 0.0f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, false, 5.2f, 15.2f)
                arcTo(20.2f, 20.2f, 0.0f, false, false, 32.3f, 148.0f)
                horizontalLineTo(116.0f)
                verticalLineToRelative(52.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 72.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                verticalLineTo(148.0f)
                horizontalLineToRelative(83.7f)
                arcToRelative(20.2f, 20.2f, 0.0f, false, false, 14.7f, -6.5f)
                arcTo(19.7f, 19.7f, 0.0f, false, false, 243.6f, 126.3f)
                close()
                moveTo(100.4f, 124.0f)
                curveToRelative(2.7f, -39.3f, 18.1f, -63.5f, 27.6f, -74.9f)
                curveToRelative(9.5f, 11.4f, 24.9f, 35.6f, 27.6f, 74.9f)
                close()
                moveTo(65.5f, 68.4f)
                arcTo(92.7f, 92.7f, 0.0f, false, true, 99.0f, 48.7f)
                curveTo(88.8f, 65.3f, 78.4f, 90.1f, 76.4f, 124.0f)
                horizontalLineTo(36.8f)
                arcTo(91.7f, 91.7f, 0.0f, false, true, 65.5f, 68.4f)
                close()
                moveTo(179.6f, 124.0f)
                curveToRelative(-2.0f, -33.9f, -12.4f, -58.7f, -22.6f, -75.3f)
                arcToRelative(92.7f, 92.7f, 0.0f, false, true, 33.5f, 19.7f)
                arcTo(91.7f, 91.7f, 0.0f, false, true, 219.2f, 124.0f)
                close()
            }
        }
        .build()
        return _umbrella!!
    }

private var _umbrella: ImageVector? = null
