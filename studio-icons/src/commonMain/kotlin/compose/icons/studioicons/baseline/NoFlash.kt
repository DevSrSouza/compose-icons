package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.NoFlash: ImageVector
    get() {
        if (_noFlash != null) {
            return _noFlash!!
        }
        _noFlash = Builder(name = "NoFlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.93f, 13.93f)
                lineTo(2.45f, 2.45f)
                lineTo(1.04f, 3.87f)
                lineToRelative(5.3f, 5.3f)
                lineTo(6.14f, 9.4f)
                horizontalLineTo(3.6f)
                curveTo(2.72f, 9.4f, 2.0f, 10.12f, 2.0f, 11.0f)
                verticalLineToRelative(9.4f)
                curveTo(2.0f, 21.28f, 2.72f, 22.0f, 3.6f, 22.0f)
                horizontalLineToRelative(12.8f)
                curveToRelative(0.75f, 0.0f, 1.38f, -0.52f, 1.55f, -1.22f)
                lineToRelative(2.18f, 2.18f)
                lineToRelative(1.41f, -1.41f)
                lineTo(18.0f, 18.0f)
                lineTo(13.93f, 13.93f)
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
                horizontalLineToRelative(1.75f)
                lineToRelative(1.28f, 1.4f)
                horizontalLineToRelative(2.54f)
                curveToRelative(0.88f, 0.0f, 1.6f, 0.72f, 1.6f, 1.6f)
                verticalLineTo(15.17f)
                close()
                moveTo(20.4f, 5.6f)
                horizontalLineTo(22.0f)
                lineTo(19.0f, 11.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(4.0f)
                lineTo(20.4f, 5.6f)
                close()
            }
        }
        .build()
        return _noFlash!!
    }

private var _noFlash: ImageVector? = null
