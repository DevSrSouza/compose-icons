package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.FlipCameraIos: ImageVector
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
                lineTo(15.0f, 3.0f)
                horizontalLineTo(9.0f)
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
                moveTo(20.0f, 19.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(3.17f)
                horizontalLineToRelative(0.88f)
                lineToRelative(0.59f, -0.65f)
                lineTo(9.88f, 5.0f)
                horizontalLineToRelative(4.24f)
                lineToRelative(1.24f, 1.35f)
                lineTo(15.95f, 7.0f)
                horizontalLineToRelative(0.88f)
                horizontalLineTo(20.0f)
                verticalLineTo(19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 17.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(-2.5f, -2.5f)
                lineTo(5.0f, 13.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f)
                curveToRelative(0.86f, 0.0f, 1.65f, -0.24f, 2.36f, -0.62f)
                lineToRelative(-0.74f, -0.74f)
                curveTo(13.13f, 16.87f, 12.58f, 17.0f, 12.0f, 17.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 8.0f)
                curveToRelative(-0.86f, 0.0f, -1.65f, 0.24f, -2.36f, 0.62f)
                lineToRelative(0.74f, 0.73f)
                curveTo(10.87f, 9.13f, 11.42f, 9.0f, 12.0f, 9.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(2.5f, 2.5f)
                lineTo(19.0f, 13.0f)
                horizontalLineToRelative(-2.0f)
                curveTo(17.0f, 10.24f, 14.76f, 8.0f, 12.0f, 8.0f)
                close()
            }
        }
        .build()
        return _flipCameraIos!!
    }

private var _flipCameraIos: ImageVector? = null
