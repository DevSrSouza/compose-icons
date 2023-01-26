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

public val RoundGroup.FilePresent: ImageVector
    get() {
        if (_filePresent != null) {
            return _filePresent!!
        }
        _filePresent = Builder(name = "FilePresent", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.17f, 2.0f)
                horizontalLineTo(6.0f)
                curveTo(4.9f, 2.0f, 4.0f, 2.9f, 4.0f, 4.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(8.83f)
                curveToRelative(0.0f, -0.53f, -0.21f, -1.04f, -0.59f, -1.41f)
                lineToRelative(-4.83f, -4.83f)
                curveTo(14.21f, 2.21f, 13.7f, 2.0f, 13.17f, 2.0f)
                close()
                moveTo(16.0f, 15.0f)
                curveToRelative(0.0f, 2.34f, -2.01f, 4.21f, -4.39f, 3.98f)
                curveTo(9.53f, 18.78f, 8.0f, 16.92f, 8.0f, 14.83f)
                lineToRelative(0.0f, -5.19f)
                curveToRelative(0.0f, -1.31f, 0.94f, -2.5f, 2.24f, -2.63f)
                curveTo(11.74f, 6.86f, 13.0f, 8.03f, 13.0f, 9.5f)
                verticalLineTo(14.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineTo(9.5f)
                curveTo(11.0f, 9.22f, 10.78f, 9.0f, 10.5f, 9.0f)
                reflectiveCurveTo(10.0f, 9.22f, 10.0f, 9.5f)
                verticalLineToRelative(5.39f)
                curveToRelative(0.0f, 1.0f, 0.68f, 1.92f, 1.66f, 2.08f)
                curveTo(12.92f, 17.18f, 14.0f, 16.21f, 14.0f, 15.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineTo(15.0f)
                close()
                moveTo(14.0f, 7.0f)
                verticalLineTo(4.0f)
                lineToRelative(4.0f, 4.0f)
                horizontalLineToRelative(-3.0f)
                curveTo(14.45f, 8.0f, 14.0f, 7.55f, 14.0f, 7.0f)
                close()
            }
        }
        .build()
        return _filePresent!!
    }

private var _filePresent: ImageVector? = null
