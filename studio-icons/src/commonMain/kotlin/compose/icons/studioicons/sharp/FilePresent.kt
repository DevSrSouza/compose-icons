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

public val SharpGroup.FilePresent: ImageVector
    get() {
        if (_filePresent != null) {
            return _filePresent!!
        }
        _filePresent = Builder(name = "FilePresent", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 2.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(8.0f)
                lineTo(14.0f, 2.0f)
                close()
                moveTo(16.0f, 15.0f)
                curveToRelative(0.0f, 2.21f, -1.79f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.79f, -4.0f, -4.0f)
                verticalLineTo(9.5f)
                curveTo(8.0f, 8.12f, 9.12f, 7.0f, 10.5f, 7.0f)
                reflectiveCurveTo(13.0f, 8.12f, 13.0f, 9.5f)
                verticalLineTo(15.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(9.5f)
                curveTo(11.0f, 9.22f, 10.78f, 9.0f, 10.5f, 9.0f)
                reflectiveCurveTo(10.0f, 9.22f, 10.0f, 9.5f)
                verticalLineTo(15.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(15.0f)
                close()
                moveTo(14.0f, 8.0f)
                verticalLineTo(4.0f)
                lineToRelative(4.0f, 4.0f)
                horizontalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _filePresent!!
    }

private var _filePresent: ImageVector? = null
