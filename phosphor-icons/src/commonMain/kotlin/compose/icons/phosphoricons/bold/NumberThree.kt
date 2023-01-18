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

public val BoldGroup.NumberThree: ImageVector
    get() {
        if (_numberThree != null) {
            return _numberThree!!
        }
        _numberThree = Builder(name = "NumberThree", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.0f, 168.0f)
                arcTo(68.0f, 68.0f, 0.0f, false, true, 71.9f, 216.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                arcTo(44.0f, 44.0f, 0.0f, true, false, 120.0f, 124.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -9.8f, -18.9f)
                lineTo(152.9f, 44.0f)
                horizontalLineTo(80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 9.8f, 18.9f)
                lineToRelative(-45.0f, 64.3f)
                arcTo(68.1f, 68.1f, 0.0f, false, true, 188.0f, 168.0f)
                close()
            }
        }
        .build()
        return _numberThree!!
    }

private var _numberThree: ImageVector? = null
