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

public val BaselineGroup.TextRotateUp: ImageVector
    get() {
        if (_textRotateUp != null) {
            return _textRotateUp!!
        }
        _textRotateUp = Builder(name = "TextRotateUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 12.0f)
                verticalLineToRelative(1.5f)
                lineToRelative(11.0f, 4.75f)
                verticalLineToRelative(-2.1f)
                lineToRelative(-2.2f, -0.9f)
                verticalLineToRelative(-5.0f)
                lineToRelative(2.2f, -0.9f)
                verticalLineToRelative(-2.1f)
                lineTo(3.0f, 12.0f)
                close()
                moveTo(10.0f, 14.62f)
                lineToRelative(-5.02f, -1.87f)
                lineTo(10.0f, 10.88f)
                verticalLineToRelative(3.74f)
                close()
                moveTo(18.0f, 4.25f)
                lineToRelative(-3.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(2.0f)
                lineTo(19.0f, 7.25f)
                horizontalLineToRelative(2.0f)
                lineToRelative(-3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _textRotateUp!!
    }

private var _textRotateUp: ImageVector? = null
