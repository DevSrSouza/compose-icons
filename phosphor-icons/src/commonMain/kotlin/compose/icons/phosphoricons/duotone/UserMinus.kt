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

public val DuotoneGroup.UserMinus: ImageVector
    get() {
        if (_userMinus != null) {
            return _userMinus!!
        }
        _userMinus = Builder(name = "UserMinus", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(168.0f, 100.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, true, true, -60.0f, -60.0f)
                arcTo(60.0f, 60.0f, 0.0f, false, true, 168.0f, 100.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(200.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 256.0f, 136.0f)
                close()
                moveTo(199.9f, 194.9f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -1.0f, 11.2f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, -11.2f, -1.0f)
                arcToRelative(104.2f, 104.2f, 0.0f, false, false, -159.4f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.2f, -10.2f)
                arcToRelative(118.4f, 118.4f, 0.0f, false, true, 55.8f, -37.3f)
                arcToRelative(68.0f, 68.0f, 0.0f, true, true, 72.2f, 0.0f)
                arcTo(118.4f, 118.4f, 0.0f, false, true, 199.9f, 194.9f)
                close()
                moveTo(108.0f, 152.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, false, -52.0f, -52.0f)
                arcTo(52.0f, 52.0f, 0.0f, false, false, 108.0f, 152.0f)
                close()
            }
        }
        .build()
        return _userMinus!!
    }

private var _userMinus: ImageVector? = null
