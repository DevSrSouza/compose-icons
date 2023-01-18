package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.NumberCircleEight: ImageVector
    get() {
        if (_numberCircleEight != null) {
            return _numberCircleEight!!
        }
        _numberCircleEight = Builder(name = "NumberCircleEight", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 128.0f)
                moveToRelative(-96.0f, 0.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, true, 192.0f, 0.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, true, -192.0f, 0.0f)
            }
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
                moveTo(149.1f, 123.3f)
                horizontalLineToRelative(0.1f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, -42.4f, 0.0f)
                horizontalLineToRelative(0.1f)
                arcTo(24.4f, 24.4f, 0.0f, false, false, 104.0f, 126.0f)
                arcToRelative(33.9f, 33.9f, 0.0f, true, false, 48.0f, 48.0f)
                arcToRelative(33.8f, 33.8f, 0.0f, false, false, 0.0f, -48.0f)
                arcTo(24.4f, 24.4f, 0.0f, false, false, 149.1f, 123.3f)
                close()
                moveTo(118.1f, 111.9f)
                arcTo(14.0f, 14.0f, 0.0f, true, true, 128.0f, 116.0f)
                arcTo(14.1f, 14.1f, 0.0f, false, true, 118.1f, 111.9f)
                close()
                moveTo(140.7f, 162.7f)
                arcTo(17.9f, 17.9f, 0.0f, true, true, 146.0f, 150.0f)
                arcTo(17.9f, 17.9f, 0.0f, false, true, 140.7f, 162.7f)
                close()
            }
        }
        .build()
        return _numberCircleEight!!
    }

private var _numberCircleEight: ImageVector? = null
