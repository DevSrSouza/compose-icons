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

public val BaselineGroup.TextRotationDown: ImageVector
    get() {
        if (_textRotationDown != null) {
            return _textRotationDown!!
        }
        _textRotationDown = Builder(name = "TextRotationDown", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 12.0f)
                verticalLineToRelative(-1.5f)
                lineTo(10.0f, 5.75f)
                verticalLineToRelative(2.1f)
                lineToRelative(2.2f, 0.9f)
                verticalLineToRelative(5.0f)
                lineToRelative(-2.2f, 0.9f)
                verticalLineToRelative(2.1f)
                lineTo(21.0f, 12.0f)
                close()
                moveTo(14.0f, 9.38f)
                lineToRelative(5.02f, 1.87f)
                lineTo(14.0f, 13.12f)
                lineTo(14.0f, 9.38f)
                close()
                moveTo(6.0f, 19.75f)
                lineToRelative(3.0f, -3.0f)
                lineTo(7.0f, 16.75f)
                lineTo(7.0f, 4.25f)
                lineTo(5.0f, 4.25f)
                verticalLineToRelative(12.5f)
                lineTo(3.0f, 16.75f)
                lineToRelative(3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _textRotationDown!!
    }

private var _textRotationDown: ImageVector? = null
