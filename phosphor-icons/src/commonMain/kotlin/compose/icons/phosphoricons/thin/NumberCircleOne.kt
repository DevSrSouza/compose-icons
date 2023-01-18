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

public val ThinGroup.NumberCircleOne: ImageVector
    get() {
        if (_numberCircleOne != null) {
            return _numberCircleOne!!
        }
        _numberCircleOne = Builder(name = "NumberCircleOne", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f)
                arcTo(100.2f, 100.2f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, true, 92.0f, -92.0f)
                arcTo(92.1f, 92.1f, 0.0f, false, true, 128.0f, 220.0f)
                close()
                moveTo(136.0f, 84.0f)
                verticalLineToRelative(92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(128.0f, 91.5f)
                lineToRelative(-17.8f, 11.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.5f, -1.1f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, 1.1f, -5.5f)
                lineToRelative(24.0f, -16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.1f, -0.2f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 136.0f, 84.0f)
                close()
            }
        }
        .build()
        return _numberCircleOne!!
    }

private var _numberCircleOne: ImageVector? = null
