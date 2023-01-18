package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.CoatHanger: ImageVector
    get() {
        if (_coatHanger != null) {
            return _coatHanger!!
        }
        _coatHanger = Builder(name = "CoatHanger", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(241.6f, 171.2f)
                lineTo(141.3f, 96.0f)
                lineToRelative(23.5f, -17.6f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 168.0f, 72.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -80.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 47.7f, -3.8f)
                lineTo(123.3f, 89.5f)
                lineToRelative(-0.2f, 0.2f)
                lineTo(14.4f, 171.2f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 200.0f)
                horizontalLineTo(232.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 9.6f, -28.8f)
                close()
                moveTo(24.0f, 184.0f)
                lineToRelative(104.0f, -78.0f)
                lineToRelative(104.0f, 78.0f)
                horizontalLineTo(24.0f)
                close()
            }
        }
        .build()
        return _coatHanger!!
    }

private var _coatHanger: ImageVector? = null
