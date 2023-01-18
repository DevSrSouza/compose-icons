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

public val FillGroup.NumberCircleOne: ImageVector
    get() {
        if (_numberCircleOne != null) {
            return _numberCircleOne!!
        }
        _numberCircleOne = Builder(name = "NumberCircleOne", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.2f, 104.2f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(140.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(124.0f, 98.9f)
                lineToRelative(-11.6f, 7.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.8f, -13.4f)
                lineToRelative(24.0f, -16.0f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, true, 8.2f, -0.4f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 140.0f, 84.0f)
                close()
            }
        }
        .build()
        return _numberCircleOne!!
    }

private var _numberCircleOne: ImageVector? = null
