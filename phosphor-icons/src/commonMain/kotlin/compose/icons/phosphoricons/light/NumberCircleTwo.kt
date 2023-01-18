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

public val LightGroup.NumberCircleTwo: ImageVector
    get() {
        if (_numberCircleTwo != null) {
            return _numberCircleTwo!!
        }
        _numberCircleTwo = Builder(name = "NumberCircleTwo", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
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
                moveTo(152.7f, 121.0f)
                lineTo(116.0f, 170.0f)
                horizontalLineToRelative(36.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(104.0f, 182.0f)
                arcToRelative(6.3f, 6.3f, 0.0f, false, true, -1.9f, -0.3f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 98.0f, 176.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 1.3f, -3.7f)
                lineTo(143.0f, 113.9f)
                arcToRelative(17.2f, 17.2f, 0.0f, false, false, 3.0f, -9.9f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, -34.6f, -7.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -11.0f, -4.7f)
                arcTo(30.0f, 30.0f, 0.0f, false, true, 158.0f, 104.0f)
                arcToRelative(30.4f, 30.4f, 0.0f, false, true, -5.1f, 16.8f)
                close()
            }
        }
        .build()
        return _numberCircleTwo!!
    }

private var _numberCircleTwo: ImageVector? = null
