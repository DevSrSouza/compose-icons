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

public val RoundGroup.UploadFile: ImageVector
    get() {
        if (_uploadFile != null) {
            return _uploadFile!!
        }
        _uploadFile = Builder(name = "UploadFile", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.41f, 7.41f)
                lineToRelative(-4.83f, -4.83f)
                curveTo(14.21f, 2.21f, 13.7f, 2.0f, 13.17f, 2.0f)
                horizontalLineTo(6.0f)
                curveTo(4.9f, 2.0f, 4.01f, 2.9f, 4.01f, 4.0f)
                lineTo(4.0f, 20.0f)
                curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f)
                horizontalLineTo(18.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(8.83f)
                curveTo(20.0f, 8.3f, 19.79f, 7.79f, 19.41f, 7.41f)
                close()
                moveTo(14.8f, 15.0f)
                horizontalLineTo(13.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineTo(9.21f)
                curveToRelative(-0.45f, 0.0f, -0.67f, -0.54f, -0.35f, -0.85f)
                lineToRelative(2.8f, -2.79f)
                curveToRelative(0.2f, -0.19f, 0.51f, -0.19f, 0.71f, 0.0f)
                lineToRelative(2.79f, 2.79f)
                curveTo(15.46f, 14.46f, 15.24f, 15.0f, 14.8f, 15.0f)
                close()
                moveTo(14.0f, 9.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineTo(3.5f)
                lineTo(18.5f, 9.0f)
                horizontalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _uploadFile!!
    }

private var _uploadFile: ImageVector? = null
