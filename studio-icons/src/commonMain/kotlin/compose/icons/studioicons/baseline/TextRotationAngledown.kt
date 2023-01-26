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

public val BaselineGroup.TextRotationAngledown: ImageVector
    get() {
        if (_textRotationAngledown != null) {
            return _textRotationAngledown!!
        }
        _textRotationAngledown = Builder(name = "TextRotationAngledown", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.4f, 4.91f)
                lineToRelative(-1.06f, -1.06f)
                lineTo(7.2f, 8.27f)
                lineToRelative(1.48f, 1.48f)
                lineToRelative(2.19f, -0.92f)
                lineToRelative(3.54f, 3.54f)
                lineToRelative(-0.92f, 2.19f)
                lineToRelative(1.48f, 1.48f)
                lineTo(19.4f, 4.91f)
                close()
                moveTo(12.59f, 8.01f)
                lineToRelative(4.87f, -2.23f)
                lineToRelative(-2.23f, 4.87f)
                lineToRelative(-2.64f, -2.64f)
                close()
                moveTo(14.27f, 21.0f)
                verticalLineToRelative(-4.24f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-8.84f, -8.84f)
                lineToRelative(-1.42f, 1.42f)
                lineToRelative(8.84f, 8.84f)
                lineTo(10.03f, 21.0f)
                horizontalLineToRelative(4.24f)
                close()
            }
        }
        .build()
        return _textRotationAngledown!!
    }

private var _textRotationAngledown: ImageVector? = null
