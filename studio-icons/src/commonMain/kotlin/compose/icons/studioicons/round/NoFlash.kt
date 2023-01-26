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

public val RoundGroup.NoFlash: ImageVector
    get() {
        if (_noFlash != null) {
            return _noFlash!!
        }
        _noFlash = Builder(name = "NoFlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.16f, 3.16f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(4.6f, 4.6f)
                lineTo(6.14f, 9.4f)
                horizontalLineTo(3.6f)
                curveTo(2.72f, 9.4f, 2.0f, 10.12f, 2.0f, 11.0f)
                verticalLineToRelative(9.4f)
                curveTo(2.0f, 21.28f, 2.72f, 22.0f, 3.6f, 22.0f)
                horizontalLineToRelative(12.8f)
                curveToRelative(0.75f, 0.0f, 1.38f, -0.52f, 1.55f, -1.22f)
                lineToRelative(1.47f, 1.47f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                lineTo(3.16f, 3.16f)
                close()
                moveTo(10.0f, 20.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f)
                curveToRelative(0.0f, -1.95f, 1.4f, -3.57f, 3.25f, -3.92f)
                lineToRelative(1.57f, 1.57f)
                curveToRelative(-0.26f, -0.09f, -0.53f, -0.15f, -0.82f, -0.15f)
                curveToRelative(-1.38f, 0.0f, -2.5f, 1.12f, -2.5f, 2.5f)
                curveToRelative(0.0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0.0f, -0.29f, -0.06f, -0.56f, -0.15f, -0.82f)
                lineToRelative(1.57f, 1.57f)
                curveTo(13.57f, 18.6f, 11.95f, 20.0f, 10.0f, 20.0f)
                close()
                moveTo(18.0f, 15.17f)
                lineTo(10.83f, 8.0f)
                horizontalLineToRelative(0.87f)
                curveToRelative(0.56f, 0.0f, 1.1f, 0.24f, 1.48f, 0.65f)
                lineToRelative(0.69f, 0.75f)
                horizontalLineToRelative(2.54f)
                curveToRelative(0.88f, 0.0f, 1.6f, 0.72f, 1.6f, 1.6f)
                verticalLineTo(15.17f)
                close()
                moveTo(20.4f, 5.6f)
                horizontalLineToRelative(0.75f)
                curveToRelative(0.38f, 0.0f, 0.62f, 0.41f, 0.44f, 0.74f)
                lineTo(19.0f, 11.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(-0.5f)
                curveTo(18.22f, 7.0f, 18.0f, 6.78f, 18.0f, 6.5f)
                verticalLineToRelative(-4.0f)
                curveTo(18.0f, 2.22f, 18.22f, 2.0f, 18.5f, 2.0f)
                horizontalLineToRelative(2.73f)
                curveToRelative(0.36f, 0.0f, 0.6f, 0.37f, 0.46f, 0.7f)
                lineTo(20.4f, 5.6f)
                close()
            }
        }
        .build()
        return _noFlash!!
    }

private var _noFlash: ImageVector? = null
