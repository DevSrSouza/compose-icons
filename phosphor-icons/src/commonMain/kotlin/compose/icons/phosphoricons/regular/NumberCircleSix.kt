package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.NumberCircleSix: ImageVector
    get() {
        if (_numberCircleSix != null) {
            return _numberCircleSix!!
        }
        _numberCircleSix = Builder(name = "NumberCircleSix", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.2f, 104.2f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(128.0f, 216.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, 88.0f, -88.0f)
                arcTo(88.1f, 88.1f, 0.0f, false, true, 128.0f, 216.0f)
                close()
                moveTo(128.0f, 108.0f)
                horizontalLineToRelative(-1.8f)
                lineToRelative(16.7f, -27.9f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -13.8f, -8.2f)
                lineToRelative(-32.2f, 54.0f)
                lineToRelative(-0.3f, 0.6f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 128.0f, 108.0f)
                close()
                moveTo(128.0f, 164.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 128.0f, 164.0f)
                close()
            }
        }
        .build()
        return _numberCircleSix!!
    }

private var _numberCircleSix: ImageVector? = null
