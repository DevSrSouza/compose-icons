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

public val BoldGroup.Lamp: ImageVector
    get() {
        if (_lamp != null) {
            return _lamp!!
        }
        _lamp = Builder(name = "Lamp", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.3f, 136.1f)
                lineToRelative(-41.2f, -96.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 186.7f, 28.0f)
                horizontalLineTo(69.3f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 50.9f, 40.1f)
                lineToRelative(-41.2f, 96.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 28.1f, 164.0f)
                horizontalLineTo(116.0f)
                verticalLineToRelative(40.0f)
                horizontalLineTo(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                horizontalLineTo(140.0f)
                verticalLineTo(164.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(164.0f)
                horizontalLineToRelative(15.9f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 18.4f, -27.9f)
                close()
                moveTo(34.2f, 140.0f)
                lineTo(71.9f, 52.0f)
                horizontalLineTo(184.1f)
                lineToRelative(37.7f, 88.0f)
                close()
            }
        }
        .build()
        return _lamp!!
    }

private var _lamp: ImageVector? = null
