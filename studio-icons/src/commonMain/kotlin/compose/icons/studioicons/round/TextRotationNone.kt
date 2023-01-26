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

public val RoundGroup.TextRotationNone: ImageVector
    get() {
        if (_textRotationNone != null) {
            return _textRotationNone!!
        }
        _textRotationNone = Builder(name = "TextRotationNone", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.65f, 17.65f)
                lineToRelative(-1.79f, -1.79f)
                curveToRelative(-0.32f, -0.32f, -0.86f, -0.1f, -0.86f, 0.35f)
                verticalLineTo(17.0f)
                horizontalLineTo(6.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(0.79f)
                curveToRelative(0.0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f)
                lineToRelative(1.79f, -1.79f)
                curveToRelative(0.2f, -0.19f, 0.2f, -0.51f, 0.01f, -0.7f)
                close()
                moveTo(9.5f, 11.8f)
                horizontalLineToRelative(5.0f)
                lineToRelative(0.66f, 1.6f)
                curveToRelative(0.15f, 0.36f, 0.5f, 0.6f, 0.89f, 0.6f)
                curveToRelative(0.69f, 0.0f, 1.15f, -0.71f, 0.88f, -1.34f)
                lineToRelative(-3.88f, -8.97f)
                curveTo(12.87f, 3.27f, 12.46f, 3.0f, 12.0f, 3.0f)
                curveToRelative(-0.46f, 0.0f, -0.87f, 0.27f, -1.05f, 0.69f)
                lineToRelative(-3.88f, 8.97f)
                curveToRelative(-0.27f, 0.63f, 0.2f, 1.34f, 0.89f, 1.34f)
                curveToRelative(0.39f, 0.0f, 0.74f, -0.24f, 0.89f, -0.6f)
                lineToRelative(0.65f, -1.6f)
                close()
                moveTo(12.0f, 4.98f)
                lineTo(13.87f, 10.0f)
                horizontalLineToRelative(-3.74f)
                lineTo(12.0f, 4.98f)
                close()
            }
        }
        .build()
        return _textRotationNone!!
    }

private var _textRotationNone: ImageVector? = null
