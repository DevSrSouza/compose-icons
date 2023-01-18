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

public val BoldGroup.Bell: ImageVector
    get() {
        if (_bell != null) {
            return _bell!!
        }
        _bell = Builder(name = "Bell", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.3f, 173.9f)
                curveToRelative(-5.7f, -9.8f, -12.5f, -28.5f, -12.5f, -61.9f)
                verticalLineToRelative(-7.1f)
                curveToRelative(0.0f, -46.5f, -37.3f, -84.6f, -83.2f, -84.9f)
                horizontalLineTo(128.0f)
                arcToRelative(83.8f, 83.8f, 0.0f, false, false, -83.8f, 84.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 33.4f, -6.8f, 52.1f, -12.5f, 61.9f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 49.0f, 204.0f)
                horizontalLineTo(84.2f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 87.6f, 0.0f)
                horizontalLineTo(207.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 17.3f, -30.1f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -19.6f, -16.0f)
                horizontalLineToRelative(39.2f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 128.0f, 220.0f)
                close()
                moveTo(55.6f, 180.0f)
                curveToRelative(10.3f, -21.6f, 12.6f, -48.5f, 12.6f, -68.0f)
                verticalLineToRelative(-8.0f)
                arcTo(59.7f, 59.7f, 0.0f, false, true, 128.0f, 44.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(32.7f, 0.2f, 59.3f, 27.5f, 59.3f, 60.9f)
                verticalLineTo(112.0f)
                curveToRelative(0.0f, 19.5f, 2.3f, 46.4f, 12.6f, 68.0f)
                close()
            }
        }
        .build()
        return _bell!!
    }

private var _bell: ImageVector? = null
