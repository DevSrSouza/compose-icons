package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.NumberCircleNine: ImageVector
    get() {
        if (_numberCircleNine != null) {
            return _numberCircleNine!!
        }
        _numberCircleNine = Builder(name = "NumberCircleNine", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.2f, 102.2f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, true, 90.0f, -90.0f)
                arcTo(90.1f, 90.1f, 0.0f, false, true, 128.0f, 218.0f)
                close()
                moveTo(128.0f, 78.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, false, 5.6f, 67.5f)
                lineToRelative(-18.8f, 31.4f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 2.1f, 8.3f)
                arcToRelative(6.8f, 6.8f, 0.0f, false, false, 3.1f, 0.8f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 5.2f, -2.9f)
                lineToRelative(32.2f, -54.0f)
                curveToRelative(0.1f, -0.2f, 0.2f, -0.3f, 0.2f, -0.5f)
                arcTo(33.4f, 33.4f, 0.0f, false, false, 162.0f, 112.0f)
                arcTo(34.1f, 34.1f, 0.0f, false, false, 128.0f, 78.0f)
                close()
                moveTo(106.0f, 112.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, true, 22.0f, 22.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, true, 106.0f, 112.0f)
                close()
            }
        }
        .build()
        return _numberCircleNine!!
    }

private var _numberCircleNine: ImageVector? = null
