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

public val OutlineGroup.FormatColorText: ImageVector
    get() {
        if (_formatColorText != null) {
            return _formatColorText!!
        }
        _formatColorText = Builder(name = "FormatColorText", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 20.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(5.49f, 17.0f)
                horizontalLineToRelative(2.42f)
                lineToRelative(1.27f, -3.58f)
                horizontalLineToRelative(5.65f)
                lineTo(16.09f, 17.0f)
                horizontalLineToRelative(2.42f)
                lineTo(13.25f, 3.0f)
                horizontalLineToRelative(-2.5f)
                lineTo(5.49f, 17.0f)
                close()
                moveTo(9.91f, 11.39f)
                lineToRelative(2.03f, -5.79f)
                horizontalLineToRelative(0.12f)
                lineToRelative(2.03f, 5.79f)
                horizontalLineTo(9.91f)
                close()
            }
        }
        .build()
        return _formatColorText!!
    }

private var _formatColorText: ImageVector? = null
