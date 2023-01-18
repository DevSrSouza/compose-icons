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

public val DuotoneGroup.Disc: ImageVector
    get() {
        if (_disc != null) {
            return _disc!!
        }
        _disc = Builder(name = "Disc", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(160.0f, 128.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, true, true, -9.4f, -22.6f)
                horizontalLineToRelative(0.0f)
                lineToRelative(45.3f, -45.3f)
                horizontalLineToRelative(0.0f)
                arcTo(96.0f, 96.0f, 0.0f, true, false, 224.0f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(202.2f, 55.2f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, false, -0.7f, -0.7f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, false, -0.7f, -0.7f)
                arcToRelative(104.1f, 104.1f, 0.0f, true, false, 1.4f, 1.4f)
                close()
                moveTo(167.2f, 120.0f)
                arcToRelative(40.3f, 40.3f, 0.0f, false, false, -5.8f, -14.0f)
                lineToRelative(34.2f, -34.3f)
                arcToRelative(87.5f, 87.5f, 0.0f, false, true, 20.0f, 48.3f)
                close()
                moveTo(152.0f, 128.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -24.0f, -24.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, true, 152.0f, 128.0f)
                close()
                moveTo(128.0f, 216.0f)
                arcTo(88.0f, 88.0f, 0.0f, true, true, 184.3f, 60.4f)
                lineTo(150.0f, 94.6f)
                arcTo(40.0f, 40.0f, 0.0f, true, false, 167.2f, 136.0f)
                horizontalLineToRelative(48.4f)
                arcTo(88.1f, 88.1f, 0.0f, false, true, 128.0f, 216.0f)
                close()
            }
        }
        .build()
        return _disc!!
    }

private var _disc: ImageVector? = null
