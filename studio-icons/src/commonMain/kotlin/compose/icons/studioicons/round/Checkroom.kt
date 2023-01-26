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

public val RoundGroup.Checkroom: ImageVector
    get() {
        if (_checkroom != null) {
            return _checkroom!!
        }
        _checkroom = Builder(name = "Checkroom", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.6f, 18.2f)
                lineTo(13.0f, 11.75f)
                verticalLineToRelative(-0.91f)
                curveToRelative(1.65f, -0.49f, 2.8f, -2.17f, 2.43f, -4.05f)
                curveToRelative(-0.26f, -1.31f, -1.3f, -2.4f, -2.61f, -2.7f)
                curveToRelative(-1.76f, -0.4f, -3.37f, 0.53f, -4.02f, 1.98f)
                curveTo(8.5f, 6.74f, 8.98f, 7.5f, 9.71f, 7.5f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.39f, 0.0f, 0.75f, -0.22f, 0.9f, -0.57f)
                curveTo(10.84f, 6.38f, 11.37f, 6.0f, 12.0f, 6.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                curveToRelative(0.0f, 0.84f, -0.69f, 1.52f, -1.53f, 1.5f)
                curveTo(11.43f, 8.99f, 11.0f, 9.45f, 11.0f, 9.99f)
                lineToRelative(0.0f, 1.76f)
                lineTo(2.4f, 18.2f)
                curveTo(1.63f, 18.78f, 2.04f, 20.0f, 3.0f, 20.0f)
                horizontalLineToRelative(9.0f)
                horizontalLineToRelative(9.0f)
                curveTo(21.96f, 20.0f, 22.37f, 18.78f, 21.6f, 18.2f)
                close()
                moveTo(6.0f, 18.0f)
                lineToRelative(6.0f, -4.5f)
                lineToRelative(6.0f, 4.5f)
                horizontalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _checkroom!!
    }

private var _checkroom: ImageVector? = null
