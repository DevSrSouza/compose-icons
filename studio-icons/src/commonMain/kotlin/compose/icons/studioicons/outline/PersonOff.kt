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

public val OutlineGroup.PersonOff: ImageVector
    get() {
        if (_personOff != null) {
            return _personOff!!
        }
        _personOff = Builder(name = "PersonOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 17.17f)
                lineToRelative(-3.37f, -3.38f)
                curveToRelative(0.64f, 0.22f, 1.23f, 0.48f, 1.77f, 0.76f)
                curveTo(19.37f, 15.06f, 19.98f, 16.07f, 20.0f, 17.17f)
                close()
                moveTo(21.19f, 21.19f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(17.17f, 20.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(-2.78f)
                curveToRelative(0.0f, -1.12f, 0.61f, -2.15f, 1.61f, -2.66f)
                curveToRelative(1.29f, -0.66f, 2.87f, -1.22f, 4.67f, -1.45f)
                lineTo(1.39f, 4.22f)
                lineToRelative(1.41f, -1.41f)
                lineTo(21.19f, 21.19f)
                close()
                moveTo(15.17f, 18.0f)
                lineToRelative(-3.0f, -3.0f)
                curveToRelative(-0.06f, 0.0f, -0.11f, 0.0f, -0.17f, 0.0f)
                curveToRelative(-2.37f, 0.0f, -4.29f, 0.73f, -5.48f, 1.34f)
                curveTo(6.2f, 16.5f, 6.0f, 16.84f, 6.0f, 17.22f)
                verticalLineTo(18.0f)
                horizontalLineTo(15.17f)
                close()
                moveTo(12.0f, 6.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                curveToRelative(0.0f, 0.86f, -0.54f, 1.59f, -1.3f, 1.87f)
                lineToRelative(1.48f, 1.48f)
                curveTo(15.28f, 10.64f, 16.0f, 9.4f, 16.0f, 8.0f)
                curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f)
                curveToRelative(-1.4f, 0.0f, -2.64f, 0.72f, -3.35f, 1.82f)
                lineToRelative(1.48f, 1.48f)
                curveTo(10.41f, 6.54f, 11.14f, 6.0f, 12.0f, 6.0f)
                close()
            }
        }
        .build()
        return _personOff!!
    }

private var _personOff: ImageVector? = null
