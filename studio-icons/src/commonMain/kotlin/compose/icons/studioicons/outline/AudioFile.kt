package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.AudioFile: ImageVector
    get() {
        if (_audioFile != null) {
            return _audioFile!!
        }
        _audioFile = Builder(name = "AudioFile", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 2.0f)
                horizontalLineTo(6.0f)
                curveTo(4.9f, 2.0f, 4.0f, 2.9f, 4.0f, 4.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(8.0f)
                lineTo(14.0f, 2.0f)
                close()
                moveTo(6.0f, 20.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(11.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(16.0f, 11.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(3.88f)
                curveToRelative(-0.36f, -0.24f, -0.79f, -0.38f, -1.25f, -0.38f)
                curveToRelative(-1.24f, 0.0f, -2.25f, 1.01f, -2.25f, 2.25f)
                curveToRelative(0.0f, 1.24f, 1.01f, 2.25f, 2.25f, 2.25f)
                reflectiveCurveTo(13.0f, 17.99f, 13.0f, 16.75f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _audioFile!!
    }

private var _audioFile: ImageVector? = null
