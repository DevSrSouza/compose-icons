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

public val RoundGroup.TextRotationDown: ImageVector
    get() {
        if (_textRotationDown != null) {
            return _textRotationDown!!
        }
        _textRotationDown = Builder(name = "TextRotationDown", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.35f, 19.65f)
                lineToRelative(1.79f, -1.79f)
                curveToRelative(0.32f, -0.32f, 0.1f, -0.86f, -0.35f, -0.86f)
                lineTo(7.0f, 17.0f)
                lineTo(7.0f, 5.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-0.79f)
                curveToRelative(-0.45f, 0.0f, -0.67f, 0.54f, -0.35f, 0.85f)
                lineToRelative(1.79f, 1.79f)
                curveToRelative(0.19f, 0.2f, 0.51f, 0.2f, 0.7f, 0.01f)
                close()
                moveTo(12.2f, 8.5f)
                verticalLineToRelative(5.0f)
                lineToRelative(-1.6f, 0.66f)
                curveToRelative(-0.36f, 0.15f, -0.6f, 0.5f, -0.6f, 0.89f)
                curveToRelative(0.0f, 0.69f, 0.71f, 1.15f, 1.34f, 0.88f)
                lineToRelative(8.97f, -3.88f)
                curveToRelative(0.42f, -0.18f, 0.69f, -0.59f, 0.69f, -1.05f)
                curveToRelative(0.0f, -0.46f, -0.27f, -0.87f, -0.69f, -1.05f)
                lineToRelative(-8.97f, -3.88f)
                curveToRelative(-0.63f, -0.27f, -1.34f, 0.2f, -1.34f, 0.89f)
                curveToRelative(0.0f, 0.39f, 0.24f, 0.74f, 0.6f, 0.89f)
                lineToRelative(1.6f, 0.65f)
                close()
                moveTo(19.02f, 11.0f)
                lineTo(14.0f, 12.87f)
                lineTo(14.0f, 9.13f)
                lineTo(19.02f, 11.0f)
                close()
            }
        }
        .build()
        return _textRotationDown!!
    }

private var _textRotationDown: ImageVector? = null
