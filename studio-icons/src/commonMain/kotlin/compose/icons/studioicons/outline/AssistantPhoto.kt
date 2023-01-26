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

public val OutlineGroup.AssistantPhoto: ImageVector
    get() {
        if (_assistantPhoto != null) {
            return _assistantPhoto!!
        }
        _assistantPhoto = Builder(name = "AssistantPhoto", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.36f, 6.0f)
                lineToRelative(0.08f, 0.39f)
                lineToRelative(0.32f, 1.61f)
                horizontalLineTo(18.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-3.36f)
                lineToRelative(-0.08f, -0.39f)
                lineToRelative(-0.32f, -1.61f)
                horizontalLineTo(7.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(5.36f)
                moveTo(14.0f, 4.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(5.6f)
                lineToRelative(0.4f, 2.0f)
                horizontalLineToRelative(7.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(-5.6f)
                lineTo(14.0f, 4.0f)
                close()
            }
        }
        .build()
        return _assistantPhoto!!
    }

private var _assistantPhoto: ImageVector? = null