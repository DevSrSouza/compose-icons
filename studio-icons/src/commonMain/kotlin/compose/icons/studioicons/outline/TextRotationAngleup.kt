package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.TextRotationAngleup: ImageVector
    get() {
        if (_textRotationAngleup != null) {
            return _textRotationAngleup!!
        }
        _textRotationAngleup = Builder(name = "TextRotationAngleup", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.76f, 9.0f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-9.19f, 9.19f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(9.19f, -9.19f)
                lineTo(21.0f, 13.24f)
                lineTo(21.0f, 9.0f)
                horizontalLineToRelative(-4.24f)
                close()
                moveTo(8.48f, 12.75f)
                lineToRelative(3.54f, -3.54f)
                lineToRelative(2.19f, 0.92f)
                lineToRelative(1.48f, -1.48f)
                lineTo(4.56f, 4.23f)
                lineTo(3.5f, 5.29f)
                lineToRelative(4.42f, 11.14f)
                lineToRelative(1.48f, -1.48f)
                lineToRelative(-0.92f, -2.2f)
                close()
                moveTo(7.66f, 11.03f)
                lineTo(5.43f, 6.16f)
                lineToRelative(4.87f, 2.23f)
                lineToRelative(-2.64f, 2.64f)
                close()
            }
        }
        .build()
        return _textRotationAngleup!!
    }

private var _textRotationAngleup: ImageVector? = null
