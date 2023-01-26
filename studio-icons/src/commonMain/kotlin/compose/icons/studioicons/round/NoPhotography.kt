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

public val RoundGroup.NoPhotography: ImageVector
    get() {
        if (_noPhotography != null) {
            return _noPhotography!!
        }
        _noPhotography = Builder(name = "NoPhotography", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.94f, 8.12f)
                lineTo(7.48f, 4.66f)
                lineTo(8.4f, 3.65f)
                curveTo(8.78f, 3.24f, 9.32f, 3.0f, 9.88f, 3.0f)
                horizontalLineToRelative(4.24f)
                curveToRelative(0.56f, 0.0f, 1.1f, 0.24f, 1.47f, 0.65f)
                lineTo(16.83f, 5.0f)
                horizontalLineTo(20.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 0.05f, -0.01f, 0.1f, -0.02f, 0.16f)
                lineToRelative(-5.1f, -5.1f)
                curveTo(16.96f, 13.71f, 17.0f, 13.36f, 17.0f, 13.0f)
                curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f)
                curveTo(11.64f, 8.0f, 11.29f, 8.04f, 10.94f, 8.12f)
                close()
                moveTo(19.78f, 22.61f)
                lineTo(18.17f, 21.0f)
                horizontalLineTo(4.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                verticalLineTo(7.0f)
                curveToRelative(0.0f, -0.59f, 0.27f, -1.12f, 0.68f, -1.49f)
                lineTo(1.39f, 4.22f)
                curveTo(1.0f, 3.83f, 1.0f, 3.2f, 1.39f, 2.81f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f)
                lineToRelative(18.38f, 18.38f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(0.0f, 0.0f)
                curveTo(20.8f, 23.0f, 20.17f, 23.0f, 19.78f, 22.61f)
                close()
                moveTo(14.49f, 17.32f)
                lineToRelative(-1.5f, -1.5f)
                curveTo(12.67f, 15.92f, 12.35f, 16.0f, 12.0f, 16.0f)
                curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f)
                curveToRelative(0.0f, -0.35f, 0.08f, -0.67f, 0.19f, -0.98f)
                lineToRelative(-1.5f, -1.5f)
                curveTo(7.25f, 11.24f, 7.0f, 12.09f, 7.0f, 13.0f)
                curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f)
                curveTo(12.91f, 18.0f, 13.76f, 17.75f, 14.49f, 17.32f)
                close()
            }
        }
        .build()
        return _noPhotography!!
    }

private var _noPhotography: ImageVector? = null
