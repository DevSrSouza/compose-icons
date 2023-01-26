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

public val RoundGroup.PhotoCameraBack: ImageVector
    get() {
        if (_photoCameraBack != null) {
            return _photoCameraBack!!
        }
        _photoCameraBack = Builder(name = "PhotoCameraBack", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 5.0f)
                horizontalLineToRelative(-3.17f)
                lineToRelative(-1.24f, -1.35f)
                curveTo(15.22f, 3.24f, 14.68f, 3.0f, 14.12f, 3.0f)
                horizontalLineTo(9.88f)
                curveTo(9.32f, 3.0f, 8.78f, 3.24f, 8.41f, 3.65f)
                lineTo(7.17f, 5.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 5.0f, 2.0f, 5.9f, 2.0f, 7.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(7.0f)
                curveTo(22.0f, 5.9f, 21.1f, 5.0f, 20.0f, 5.0f)
                close()
                moveTo(17.0f, 17.0f)
                horizontalLineTo(7.0f)
                curveToRelative(-0.41f, 0.0f, -0.65f, -0.47f, -0.4f, -0.8f)
                lineToRelative(2.0f, -2.67f)
                curveToRelative(0.2f, -0.27f, 0.6f, -0.27f, 0.8f, 0.0f)
                lineTo(11.25f, 16.0f)
                lineToRelative(2.6f, -3.47f)
                curveToRelative(0.2f, -0.27f, 0.6f, -0.27f, 0.8f, 0.0f)
                lineToRelative(2.75f, 3.67f)
                curveTo(17.65f, 16.53f, 17.41f, 17.0f, 17.0f, 17.0f)
                close()
            }
        }
        .build()
        return _photoCameraBack!!
    }

private var _photoCameraBack: ImageVector? = null
