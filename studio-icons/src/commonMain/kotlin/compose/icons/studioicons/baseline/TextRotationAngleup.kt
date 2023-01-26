package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.TextRotationAngleup: ImageVector
    get() {
        if (_textRotationAngleup != null) {
            return _textRotationAngleup!!
        }
        _textRotationAngleup = Builder(name = "TextRotationAngleup", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.49f, 4.21f)
                lineTo(3.43f, 5.27f)
                lineTo(7.85f, 16.4f)
                lineToRelative(1.48f, -1.48f)
                lineToRelative(-0.92f, -2.19f)
                lineToRelative(3.54f, -3.54f)
                lineToRelative(2.19f, 0.92f)
                lineToRelative(1.48f, -1.48f)
                lineTo(4.49f, 4.21f)
                close()
                moveTo(7.58f, 11.01f)
                lineTo(5.36f, 6.14f)
                lineToRelative(4.87f, 2.23f)
                lineToRelative(-2.65f, 2.64f)
                close()
                moveTo(20.57f, 9.33f)
                horizontalLineToRelative(-4.24f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-8.84f, 8.84f)
                lineTo(10.32f, 21.0f)
                lineToRelative(8.84f, -8.84f)
                lineToRelative(1.41f, 1.41f)
                lineTo(20.57f, 9.33f)
                close()
            }
        }
        .build()
        return _textRotationAngleup!!
    }

private var _textRotationAngleup: ImageVector? = null
