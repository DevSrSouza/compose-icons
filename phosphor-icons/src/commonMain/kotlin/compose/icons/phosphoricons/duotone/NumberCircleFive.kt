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

public val DuotoneGroup.NumberCircleFive: ImageVector
    get() {
        if (_numberCircleFive != null) {
            return _numberCircleFive!!
        }
        _numberCircleFive = Builder(name = "NumberCircleFive", defaultWidth = 256.0.dp,
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
                moveTo(118.6f, 92.0f)
                lineToRelative(-4.1f, 25.2f)
                arcToRelative(37.3f, 37.3f, 0.0f, false, true, 9.4f, -1.2f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, -25.5f, 61.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 11.2f, -11.4f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 14.3f, 5.9f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, 14.2f, -5.9f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, 0.0f, -28.2f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, -14.2f, -5.9f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -14.3f, 5.9f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.5f, -7.0f)
                lineToRelative(7.8f, -48.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.9f, -6.7f)
                lineTo(152.0f, 76.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
            }
        }
        .build()
        return _numberCircleFive!!
    }

private var _numberCircleFive: ImageVector? = null
