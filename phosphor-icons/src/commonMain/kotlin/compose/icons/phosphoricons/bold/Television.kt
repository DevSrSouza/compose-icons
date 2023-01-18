package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.Television: ImageVector
    get() {
        if (_television != null) {
            return _television!!
        }
        _television = Builder(name = "Television", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 60.0f)
                lineTo(157.0f, 60.0f)
                lineToRelative(27.5f, -27.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, -17.0f)
                lineTo(128.0f, 55.0f)
                lineTo(88.5f, 15.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 17.0f)
                lineTo(99.0f, 60.0f)
                lineTo(40.0f, 60.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 20.0f, 80.0f)
                lineTo(20.0f, 200.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(216.0f, 220.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(236.0f, 80.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 216.0f, 60.0f)
                close()
                moveTo(44.0f, 84.0f)
                horizontalLineToRelative(84.0f)
                lineTo(128.0f, 196.0f)
                lineTo(44.0f, 196.0f)
                close()
                moveTo(212.0f, 196.0f)
                lineTo(152.0f, 196.0f)
                lineTo(152.0f, 84.0f)
                horizontalLineToRelative(60.0f)
                close()
                moveTo(168.0f, 116.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 168.0f, 116.0f)
                close()
                moveTo(200.0f, 164.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 200.0f, 164.0f)
                close()
            }
        }
        .build()
        return _television!!
    }

private var _television: ImageVector? = null
