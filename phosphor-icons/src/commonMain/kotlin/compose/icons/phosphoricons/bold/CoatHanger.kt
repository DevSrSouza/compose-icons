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

public val BoldGroup.CoatHanger: ImageVector
    get() {
        if (_coatHanger != null) {
            return _coatHanger!!
        }
        _coatHanger = Builder(name = "CoatHanger", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 168.0f)
                lineTo(148.0f, 96.0f)
                lineToRelative(19.2f, -14.4f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 172.0f, 72.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, -88.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 39.2f, -5.4f)
                lineTo(121.0f, 86.2f)
                lineToRelative(-0.4f, 0.4f)
                lineTo(12.0f, 168.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 12.0f, 36.0f)
                horizontalLineTo(232.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 12.0f, -36.0f)
                close()
                moveTo(36.0f, 180.0f)
                lineToRelative(92.0f, -69.0f)
                lineToRelative(92.0f, 69.0f)
                close()
            }
        }
        .build()
        return _coatHanger!!
    }

private var _coatHanger: ImageVector? = null
