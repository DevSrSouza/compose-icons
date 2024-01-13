package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.FileInfinity: ImageVector
    get() {
        if (_fileInfinity != null) {
            return _fileInfinity!!
        }
        _fileInfinity = Builder(name = "FileInfinity", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.536f, 17.586f)
                arcToRelative(2.123f, 2.123f, 0.0f, false, false, -2.929f, 0.0f)
                arcToRelative(1.951f, 1.951f, 0.0f, false, false, 0.0f, 2.828f)
                curveToRelative(0.809f, 0.781f, 2.12f, 0.781f, 2.929f, 0.0f)
                curveToRelative(0.809f, -0.781f, -0.805f, 0.778f, 0.0f, 0.0f)
                lineToRelative(1.46f, -1.41f)
                lineToRelative(1.46f, -1.419f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.54f, 17.582f)
                lineToRelative(1.46f, 1.42f)
                lineToRelative(1.46f, 1.41f)
                curveToRelative(0.809f, 0.78f, -0.805f, -0.779f, 0.0f, 0.0f)
                reflectiveCurveToRelative(2.12f, 0.781f, 2.929f, 0.0f)
                arcToRelative(1.951f, 1.951f, 0.0f, false, false, 0.0f, -2.828f)
                arcToRelative(2.123f, 2.123f, 0.0f, false, false, -2.929f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 3.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.5f, 21.0f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(7.0f)
                lineToRelative(5.0f, 5.0f)
                verticalLineToRelative(6.0f)
            }
        }
        .build()
        return _fileInfinity!!
    }

private var _fileInfinity: ImageVector? = null
