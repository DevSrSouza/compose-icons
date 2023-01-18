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

public val DuotoneGroup.Prohibit: ImageVector
    get() {
        if (_prohibit != null) {
            return _prohibit!!
        }
        _prohibit = Builder(name = "Prohibit", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
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
                moveTo(202.2f, 200.8f)
                arcToRelative(103.9f, 103.9f, 0.0f, false, false, -147.0f, -147.0f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, false, -0.7f, 0.7f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, false, -0.7f, 0.7f)
                arcToRelative(103.9f, 103.9f, 0.0f, false, false, 147.0f, 147.0f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, false, 0.7f, -0.7f)
                arcTo(2.3f, 2.3f, 0.0f, false, false, 202.2f, 200.8f)
                close()
                moveTo(216.0f, 128.0f)
                arcToRelative(87.9f, 87.9f, 0.0f, false, true, -20.4f, 56.3f)
                lineTo(71.7f, 60.4f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 216.0f, 128.0f)
                close()
                moveTo(40.0f, 128.0f)
                arcTo(87.9f, 87.9f, 0.0f, false, true, 60.4f, 71.7f)
                lineTo(184.3f, 195.6f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 40.0f, 128.0f)
                close()
            }
        }
        .build()
        return _prohibit!!
    }

private var _prohibit: ImageVector? = null
