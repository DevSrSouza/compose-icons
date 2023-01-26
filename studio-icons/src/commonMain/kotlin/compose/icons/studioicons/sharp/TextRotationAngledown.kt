package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.TextRotationAngledown: ImageVector
    get() {
        if (_textRotationAngledown != null) {
            return _textRotationAngledown!!
        }
        _textRotationAngledown = Builder(name = "TextRotationAngledown", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 21.0f)
                verticalLineToRelative(-4.24f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-9.2f, -9.19f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(9.19f, 9.19f)
                lineTo(10.76f, 21.0f)
                lineTo(15.0f, 21.0f)
                close()
                moveTo(11.25f, 8.48f)
                lineToRelative(3.54f, 3.54f)
                lineToRelative(-0.92f, 2.19f)
                lineToRelative(1.48f, 1.48f)
                lineToRelative(4.42f, -11.14f)
                lineToRelative(-1.06f, -1.05f)
                lineTo(7.57f, 7.92f)
                lineTo(9.06f, 9.4f)
                lineToRelative(2.19f, -0.92f)
                close()
                moveTo(17.84f, 5.43f)
                lineToRelative(-2.23f, 4.87f)
                lineToRelative(-2.64f, -2.64f)
                lineToRelative(4.87f, -2.23f)
                close()
            }
        }
        .build()
        return _textRotationAngledown!!
    }

private var _textRotationAngledown: ImageVector? = null
