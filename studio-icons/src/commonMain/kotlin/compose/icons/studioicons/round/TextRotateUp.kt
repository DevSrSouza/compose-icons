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

public val RoundGroup.TextRotateUp: ImageVector
    get() {
        if (_textRotateUp != null) {
            return _textRotateUp!!
        }
        _textRotateUp = Builder(name = "TextRotateUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.35f, 4.35f)
                curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0.0f)
                lineToRelative(-1.79f, 1.79f)
                curveToRelative(-0.31f, 0.32f, -0.09f, 0.86f, 0.36f, 0.86f)
                horizontalLineTo(17.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(0.79f)
                curveToRelative(0.45f, 0.0f, 0.67f, -0.54f, 0.35f, -0.85f)
                lineToRelative(-1.79f, -1.8f)
                close()
                moveTo(11.8f, 15.5f)
                verticalLineToRelative(-5.0f)
                lineToRelative(1.6f, -0.66f)
                curveToRelative(0.36f, -0.14f, 0.6f, -0.49f, 0.6f, -0.88f)
                curveToRelative(0.0f, -0.69f, -0.71f, -1.15f, -1.34f, -0.88f)
                lineToRelative(-8.97f, 3.88f)
                curveToRelative(-0.42f, 0.17f, -0.69f, 0.58f, -0.69f, 1.04f)
                curveToRelative(0.0f, 0.46f, 0.27f, 0.87f, 0.69f, 1.05f)
                lineToRelative(8.97f, 3.88f)
                curveToRelative(0.63f, 0.27f, 1.34f, -0.2f, 1.34f, -0.89f)
                curveToRelative(0.0f, -0.39f, -0.24f, -0.74f, -0.6f, -0.89f)
                lineToRelative(-1.6f, -0.65f)
                close()
                moveTo(4.98f, 13.0f)
                lineTo(10.0f, 11.13f)
                verticalLineToRelative(3.74f)
                lineTo(4.98f, 13.0f)
                close()
            }
        }
        .build()
        return _textRotateUp!!
    }

private var _textRotateUp: ImageVector? = null
