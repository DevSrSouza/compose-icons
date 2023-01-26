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

public val RoundGroup.Attachment: ImageVector
    get() {
        if (_attachment != null) {
            return _attachment!!
        }
        _attachment = Builder(name = "Attachment", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.75f, 16.0f)
                horizontalLineTo(7.17f)
                curveToRelative(-2.09f, 0.0f, -3.95f, -1.53f, -4.15f, -3.61f)
                curveTo(2.79f, 10.01f, 4.66f, 8.0f, 7.0f, 8.0f)
                horizontalLineToRelative(12.36f)
                curveToRelative(1.31f, 0.0f, 2.5f, 0.94f, 2.63f, 2.24f)
                curveToRelative(0.15f, 1.5f, -1.02f, 2.76f, -2.49f, 2.76f)
                horizontalLineTo(9.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(8.75f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                reflectiveCurveToRelative(-0.34f, -0.75f, -0.75f, -0.75f)
                horizontalLineTo(9.14f)
                curveToRelative(-1.31f, 0.0f, -2.5f, 0.94f, -2.63f, 2.24f)
                curveToRelative(-0.15f, 1.5f, 1.02f, 2.76f, 2.49f, 2.76f)
                horizontalLineToRelative(10.33f)
                curveToRelative(2.09f, 0.0f, 3.95f, -1.53f, 4.15f, -3.61f)
                curveToRelative(0.23f, -2.39f, -1.64f, -4.39f, -3.98f, -4.39f)
                horizontalLineTo(7.23f)
                curveToRelative(-2.87f, 0.0f, -5.44f, 2.1f, -5.71f, 4.96f)
                curveToRelative(-0.3f, 3.29f, 2.26f, 6.04f, 5.48f, 6.04f)
                horizontalLineToRelative(10.75f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                reflectiveCurveToRelative(-0.34f, -0.75f, -0.75f, -0.75f)
                close()
            }
        }
        .build()
        return _attachment!!
    }

private var _attachment: ImageVector? = null
