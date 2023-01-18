package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.HouseSimple: ImageVector
    get() {
        if (_houseSimple != null) {
            return _houseSimple!!
        }
        _houseSimple = Builder(name = "HouseSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 222.0f)
                horizontalLineTo(48.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f)
                verticalLineTo(115.5f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, true, 4.6f, -10.3f)
                lineToRelative(80.0f, -72.8f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, true, 18.8f, 0.0f)
                lineToRelative(80.0f, 72.8f)
                horizontalLineToRelative(0.0f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, true, 4.6f, 10.3f)
                verticalLineTo(208.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 208.0f, 222.0f)
                close()
                moveTo(128.0f, 40.8f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, -1.3f, 0.5f)
                lineToRelative(-80.0f, 72.8f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, false, -0.7f, 1.4f)
                verticalLineTo(208.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineTo(208.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineTo(115.5f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, -0.6f, -1.4f)
                lineTo(129.3f, 41.3f)
                arcTo(1.9f, 1.9f, 0.0f, false, false, 128.0f, 40.8f)
                close()
            }
        }
        .build()
        return _houseSimple!!
    }

private var _houseSimple: ImageVector? = null
