package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.NumberThree: ImageVector
    get() {
        if (_numberThree != null) {
            return _numberThree!!
        }
        _numberThree = Builder(name = "NumberThree", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 168.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, true, 74.8f, 213.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.3f, -11.4f)
                arcTo(47.9f, 47.9f, 0.0f, true, false, 120.0f, 120.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -7.1f, -4.3f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, 0.6f, -8.3f)
                lineTo(160.6f, 40.0f)
                horizontalLineTo(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 7.1f, 4.3f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, -0.6f, 8.3f)
                lineToRelative(-48.2f, 69.0f)
                arcTo(64.1f, 64.1f, 0.0f, false, true, 184.0f, 168.0f)
                close()
            }
        }
        .build()
        return _numberThree!!
    }

private var _numberThree: ImageVector? = null
