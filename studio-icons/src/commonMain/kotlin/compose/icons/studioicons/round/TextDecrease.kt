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

public val RoundGroup.TextDecrease: ImageVector
    get() {
        if (_textDecrease != null) {
            return _textDecrease!!
        }
        _textDecrease = Builder(name = "TextDecrease", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.61f, 19.0f)
                lineTo(2.61f, 19.0f)
                curveToRelative(0.48f, 0.0f, 0.91f, -0.3f, 1.06f, -0.75f)
                lineToRelative(1.01f, -2.83f)
                horizontalLineToRelative(5.65f)
                lineToRelative(0.99f, 2.82f)
                curveTo(11.48f, 18.7f, 11.91f, 19.0f, 12.39f, 19.0f)
                curveToRelative(0.79f, 0.0f, 1.33f, -0.79f, 1.05f, -1.52f)
                lineTo(9.19f, 6.17f)
                curveTo(8.93f, 5.47f, 8.25f, 5.0f, 7.5f, 5.0f)
                reflectiveCurveTo(6.07f, 5.47f, 5.81f, 6.17f)
                lineTo(1.56f, 17.48f)
                curveTo(1.28f, 18.21f, 1.83f, 19.0f, 2.61f, 19.0f)
                close()
                moveTo(7.44f, 7.6f)
                horizontalLineToRelative(0.12f)
                lineToRelative(2.03f, 5.79f)
                horizontalLineTo(5.41f)
                lineTo(7.44f, 7.6f)
                close()
                moveTo(15.0f, 12.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-6.0f)
                curveTo(15.45f, 13.0f, 15.0f, 12.55f, 15.0f, 12.0f)
                close()
            }
        }
        .build()
        return _textDecrease!!
    }

private var _textDecrease: ImageVector? = null
