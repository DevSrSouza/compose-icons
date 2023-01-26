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

public val RoundGroup.ImageNotSupported: ImageVector
    get() {
        if (_imageNotSupported != null) {
            return _imageNotSupported!!
        }
        _imageNotSupported = Builder(name = "ImageNotSupported", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.19f, 21.19f)
                lineToRelative(-0.78f, -0.78f)
                lineTo(18.0f, 18.0f)
                lineToRelative(-4.59f, -4.59f)
                lineTo(3.59f, 3.59f)
                verticalLineToRelative(0.0f)
                lineTo(2.81f, 2.81f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                curveTo(1.0f, 3.2f, 1.0f, 3.83f, 1.39f, 4.22f)
                lineTo(3.0f, 5.83f)
                verticalLineTo(19.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(13.17f)
                lineToRelative(1.61f, 1.61f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                curveTo(21.58f, 22.22f, 21.58f, 21.58f, 21.19f, 21.19f)
                close()
                moveTo(6.02f, 18.0f)
                curveToRelative(-0.42f, 0.0f, -0.65f, -0.48f, -0.39f, -0.81f)
                lineToRelative(2.49f, -3.2f)
                curveToRelative(0.2f, -0.25f, 0.58f, -0.26f, 0.78f, -0.01f)
                lineToRelative(2.1f, 2.53f)
                lineTo(12.17f, 15.0f)
                lineToRelative(3.0f, 3.0f)
                horizontalLineTo(6.02f)
                close()
                moveTo(21.0f, 18.17f)
                lineTo(5.83f, 3.0f)
                horizontalLineTo(19.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                verticalLineTo(18.17f)
                close()
            }
        }
        .build()
        return _imageNotSupported!!
    }

private var _imageNotSupported: ImageVector? = null
