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

public val RoundGroup.FlipCameraIos: ImageVector
    get() {
        if (_flipCameraIos != null) {
            return _flipCameraIos!!
        }
        _flipCameraIos = Builder(name = "FlipCameraIos", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 5.0f)
                horizontalLineToRelative(-3.17f)
                lineToRelative(-1.24f, -1.35f)
                curveTo(15.22f, 3.24f, 14.68f, 3.0f, 14.12f, 3.0f)
                horizontalLineTo(9.88f)
                curveToRelative(-0.56f, 0.0f, -1.1f, 0.24f, -1.48f, 0.65f)
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
                moveTo(13.67f, 17.7f)
                curveTo(13.15f, 17.89f, 12.59f, 18.0f, 12.0f, 18.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                horizontalLineTo(5.0f)
                lineToRelative(2.5f, -2.5f)
                lineTo(10.0f, 13.0f)
                horizontalLineTo(8.0f)
                curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f)
                curveToRelative(0.46f, 0.0f, 0.91f, -0.08f, 1.32f, -0.23f)
                curveToRelative(0.19f, -0.07f, 0.39f, -0.03f, 0.53f, 0.11f)
                curveTo(14.11f, 17.14f, 14.01f, 17.57f, 13.67f, 17.7f)
                close()
                moveTo(16.5f, 15.5f)
                lineTo(14.0f, 13.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f)
                curveToRelative(-0.46f, 0.0f, -0.91f, 0.08f, -1.32f, 0.23f)
                curveToRelative(-0.19f, 0.07f, -0.39f, 0.03f, -0.53f, -0.11f)
                curveTo(9.89f, 8.86f, 9.99f, 8.43f, 10.33f, 8.3f)
                curveTo(10.85f, 8.11f, 11.41f, 8.0f, 12.0f, 8.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                lineTo(16.5f, 15.5f)
                close()
            }
        }
        .build()
        return _flipCameraIos!!
    }

private var _flipCameraIos: ImageVector? = null
