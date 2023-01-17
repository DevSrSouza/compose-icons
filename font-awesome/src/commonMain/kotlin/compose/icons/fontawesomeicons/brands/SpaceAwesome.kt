package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.SpaceAwesome: ImageVector
    get() {
        if (_spaceAwesome != null) {
            return _spaceAwesome!!
        }
        _spaceAwesome = Builder(name = "SpaceAwesome", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 256.0f)
                horizontalLineTo(128.0f)
                verticalLineTo(512.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(352.0f)
                horizontalLineTo(32.0f)
                verticalLineTo(320.0f)
                horizontalLineTo(64.0f)
                verticalLineTo(288.0f)
                horizontalLineTo(96.0f)
                verticalLineTo(256.0f)
                close()
                moveTo(512.0f, 352.0f)
                verticalLineTo(512.0f)
                horizontalLineTo(384.0f)
                verticalLineTo(256.0f)
                horizontalLineTo(416.0f)
                verticalLineTo(288.0f)
                horizontalLineTo(448.0f)
                verticalLineTo(320.0f)
                horizontalLineTo(480.0f)
                verticalLineTo(352.0f)
                horizontalLineTo(512.0f)
                close()
                moveTo(320.0f, 64.0f)
                horizontalLineTo(352.0f)
                verticalLineTo(448.0f)
                horizontalLineTo(320.0f)
                verticalLineTo(416.0f)
                horizontalLineTo(192.0f)
                verticalLineTo(448.0f)
                horizontalLineTo(160.0f)
                verticalLineTo(64.0f)
                horizontalLineTo(192.0f)
                verticalLineTo(32.0f)
                horizontalLineTo(224.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(288.0f)
                verticalLineTo(32.0f)
                horizontalLineTo(320.0f)
                verticalLineTo(64.0f)
                close()
                moveTo(288.0f, 128.0f)
                horizontalLineTo(224.0f)
                verticalLineTo(192.0f)
                horizontalLineTo(288.0f)
                verticalLineTo(128.0f)
                close()
            }
        }
        .build()
        return _spaceAwesome!!
    }

private var _spaceAwesome: ImageVector? = null
