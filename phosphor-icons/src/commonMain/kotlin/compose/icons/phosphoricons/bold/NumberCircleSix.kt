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

public val BoldGroup.NumberCircleSix: ImageVector
    get() {
        if (_numberCircleSix != null) {
            return _numberCircleSix!!
        }
        _numberCircleSix = Builder(name = "NumberCircleSix", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.1f, 108.1f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, 84.0f, -84.0f)
                arcTo(84.1f, 84.1f, 0.0f, false, true, 128.0f, 212.0f)
                close()
                moveTo(133.1f, 104.3f)
                lineTo(146.3f, 82.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -20.6f, -12.4f)
                lineToRelative(-32.3f, 54.0f)
                lineToRelative(-0.3f, 0.6f)
                arcTo(40.6f, 40.6f, 0.0f, false, false, 88.0f, 144.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 45.1f, -39.7f)
                close()
                moveTo(128.0f, 160.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 128.0f, 160.0f)
                close()
            }
        }
        .build()
        return _numberCircleSix!!
    }

private var _numberCircleSix: ImageVector? = null
