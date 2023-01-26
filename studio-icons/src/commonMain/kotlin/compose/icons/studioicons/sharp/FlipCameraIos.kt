package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.FlipCameraIos: ImageVector
    get() {
        if (_flipCameraIos != null) {
            return _flipCameraIos!!
        }
        _flipCameraIos = Builder(name = "FlipCameraIos", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.83f, 5.0f)
                lineTo(15.0f, 3.0f)
                horizontalLineTo(9.0f)
                lineTo(7.17f, 5.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(20.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(16.83f)
                close()
                moveTo(12.0f, 18.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                horizontalLineTo(5.0f)
                lineToRelative(2.5f, -2.5f)
                lineTo(10.0f, 13.0f)
                horizontalLineTo(8.0f)
                curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f)
                curveToRelative(0.58f, 0.0f, 1.13f, -0.13f, 1.62f, -0.35f)
                lineToRelative(0.74f, 0.74f)
                curveTo(13.65f, 17.76f, 12.86f, 18.0f, 12.0f, 18.0f)
                close()
                moveTo(16.5f, 15.5f)
                lineTo(14.0f, 13.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f)
                curveToRelative(-0.58f, 0.0f, -1.13f, 0.13f, -1.62f, 0.35f)
                lineTo(9.64f, 8.62f)
                curveTo(10.35f, 8.24f, 11.14f, 8.0f, 12.0f, 8.0f)
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
