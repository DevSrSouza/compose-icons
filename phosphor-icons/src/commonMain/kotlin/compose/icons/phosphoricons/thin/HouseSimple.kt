package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.HouseSimple: ImageVector
    get() {
        if (_houseSimple != null) {
            return _houseSimple!!
        }
        _houseSimple = Builder(name = "HouseSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 220.0f)
                horizontalLineTo(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                verticalLineTo(115.5f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, true, 3.9f, -8.8f)
                lineToRelative(80.0f, -72.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 16.2f, 0.0f)
                lineToRelative(80.0f, 72.8f)
                horizontalLineToRelative(0.0f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, true, 3.9f, 8.8f)
                verticalLineTo(208.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 208.0f, 220.0f)
                close()
                moveTo(128.0f, 38.8f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -2.7f, 1.0f)
                lineToRelative(-80.0f, 72.8f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -1.3f, 2.9f)
                verticalLineTo(208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineTo(208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                verticalLineTo(115.5f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -1.3f, -2.9f)
                lineToRelative(-80.0f, -72.8f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 128.0f, 38.8f)
                close()
            }
        }
        .build()
        return _houseSimple!!
    }

private var _houseSimple: ImageVector? = null
