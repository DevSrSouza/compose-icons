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

public val DuotoneGroup.NumberCircleTwo: ImageVector
    get() {
        if (_numberCircleTwo != null) {
            return _numberCircleTwo!!
        }
        _numberCircleTwo = Builder(name = "NumberCircleTwo", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
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
                moveTo(154.3f, 122.2f)
                lineTo(120.0f, 168.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(104.0f, 184.0f)
                arcToRelative(7.3f, 7.3f, 0.0f, false, true, -2.5f, -0.4f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 96.0f, 176.0f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, 1.7f, -4.9f)
                lineToRelative(43.7f, -58.3f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 128.0f, 88.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, -14.7f, 9.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -14.8f, -6.3f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 56.0f, 30.4f)
                close()
            }
        }
        .build()
        return _numberCircleTwo!!
    }

private var _numberCircleTwo: ImageVector? = null
