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

public val BoldGroup.NumberCircleOne: ImageVector
    get() {
        if (_numberCircleOne != null) {
            return _numberCircleOne!!
        }
        _numberCircleOne = Builder(name = "NumberCircleOne", defaultWidth = 256.0.dp, defaultHeight
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
                moveTo(144.0f, 84.0f)
                verticalLineToRelative(92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(120.0f, 106.4f)
                lineToRelative(-5.3f, 3.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -13.4f, -20.0f)
                lineToRelative(24.0f, -16.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, 12.4f, -0.6f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 144.0f, 84.0f)
                close()
            }
        }
        .build()
        return _numberCircleOne!!
    }

private var _numberCircleOne: ImageVector? = null
