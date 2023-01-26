package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.TextRotateVertical: ImageVector
    get() {
        if (_textRotateVertical != null) {
            return _textRotateVertical!!
        }
        _textRotateVertical = Builder(name = "TextRotateVertical", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 5.0f)
                curveToRelative(-0.46f, 0.0f, -0.87f, 0.27f, -1.05f, 0.69f)
                lineToRelative(-3.88f, 8.97f)
                curveToRelative(-0.27f, 0.63f, 0.2f, 1.34f, 0.89f, 1.34f)
                curveToRelative(0.39f, 0.0f, 0.74f, -0.24f, 0.89f, -0.6f)
                lineToRelative(0.66f, -1.6f)
                horizontalLineToRelative(5.0f)
                lineToRelative(0.66f, 1.6f)
                curveToRelative(0.15f, 0.36f, 0.5f, 0.6f, 0.89f, 0.6f)
                curveToRelative(0.69f, 0.0f, 1.15f, -0.71f, 0.88f, -1.34f)
                lineToRelative(-3.88f, -8.97f)
                curveTo(15.87f, 5.27f, 15.46f, 5.0f, 15.0f, 5.0f)
                close()
                moveTo(13.13f, 12.0f)
                lineTo(15.0f, 6.98f)
                lineTo(16.87f, 12.0f)
                horizontalLineToRelative(-3.74f)
                close()
                moveTo(6.35f, 19.64f)
                lineToRelative(1.79f, -1.79f)
                curveToRelative(0.32f, -0.31f, 0.1f, -0.85f, -0.35f, -0.85f)
                lineTo(7.0f, 17.0f)
                lineTo(7.0f, 5.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.44f, -1.0f, 1.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-0.79f)
                curveToRelative(-0.45f, 0.0f, -0.67f, 0.54f, -0.35f, 0.85f)
                lineToRelative(1.79f, 1.79f)
                curveToRelative(0.19f, 0.2f, 0.51f, 0.2f, 0.7f, 0.0f)
                close()
            }
        }
        .build()
        return _textRotateVertical!!
    }

private var _textRotateVertical: ImageVector? = null
