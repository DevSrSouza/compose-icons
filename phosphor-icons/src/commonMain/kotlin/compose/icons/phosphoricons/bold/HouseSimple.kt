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

public val BoldGroup.HouseSimple: ImageVector
    get() {
        if (_houseSimple != null) {
            return _houseSimple!!
        }
        _houseSimple = Builder(name = "HouseSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 228.0f)
                horizontalLineTo(48.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, -20.0f)
                verticalLineTo(115.5f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 6.6f, -14.8f)
                lineTo(114.5f, 28.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 27.0f, 0.0f)
                lineToRelative(80.0f, 72.7f)
                horizontalLineToRelative(0.0f)
                arcToRelative(20.3f, 20.3f, 0.0f, false, true, 6.5f, 14.8f)
                verticalLineTo(208.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 208.0f, 228.0f)
                close()
                moveTo(52.0f, 204.0f)
                horizontalLineTo(204.0f)
                verticalLineTo(117.3f)
                lineTo(128.0f, 48.2f)
                lineTo(52.0f, 117.3f)
                close()
            }
        }
        .build()
        return _houseSimple!!
    }

private var _houseSimple: ImageVector? = null
