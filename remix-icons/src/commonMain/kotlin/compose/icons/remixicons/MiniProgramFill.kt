package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.MiniProgramFill: ImageVector
    get() {
        if (_miniProgramFill != null) {
            return _miniProgramFill!!
        }
        _miniProgramFill = Builder(name = "MiniProgramFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.84f, 12.691f)
                lineToRelative(-0.067f, 0.02f)
                arcToRelative(1.522f, 1.522f, 0.0f, false, true, -0.414f, 0.062f)
                curveToRelative(-0.61f, 0.0f, -0.954f, -0.412f, -0.77f, -0.921f)
                curveToRelative(0.136f, -0.372f, 0.491f, -0.686f, 0.925f, -0.831f)
                curveToRelative(0.672f, -0.245f, 1.142f, -0.804f, 1.142f, -1.455f)
                curveToRelative(0.0f, -0.877f, -0.853f, -1.587f, -1.905f, -1.587f)
                reflectiveCurveToRelative(-1.904f, 0.71f, -1.904f, 1.587f)
                verticalLineToRelative(4.868f)
                curveToRelative(0.0f, 1.17f, -0.679f, 2.197f, -1.694f, 2.778f)
                arcToRelative(3.829f, 3.829f, 0.0f, false, true, -1.904f, 0.502f)
                curveToRelative(-1.984f, 0.0f, -3.598f, -1.471f, -3.598f, -3.28f)
                curveToRelative(0.0f, -0.576f, 0.164f, -1.117f, 0.451f, -1.587f)
                curveToRelative(0.444f, -0.73f, 1.184f, -1.287f, 2.07f, -1.541f)
                arcToRelative(1.55f, 1.55f, 0.0f, false, true, 0.46f, -0.073f)
                curveToRelative(0.612f, 0.0f, 0.958f, 0.414f, 0.773f, 0.924f)
                curveToRelative(-0.126f, 0.347f, -0.466f, 0.645f, -0.861f, 0.803f)
                arcToRelative(2.162f, 2.162f, 0.0f, false, false, -0.139f, 0.052f)
                curveToRelative(-0.628f, 0.26f, -1.061f, 0.798f, -1.061f, 1.422f)
                curveToRelative(0.0f, 0.877f, 0.853f, 1.587f, 1.905f, 1.587f)
                reflectiveCurveToRelative(1.904f, -0.71f, 1.904f, -1.587f)
                verticalLineTo(9.566f)
                curveToRelative(0.0f, -1.17f, 0.679f, -2.197f, 1.694f, -2.778f)
                arcToRelative(3.829f, 3.829f, 0.0f, false, true, 1.904f, -0.502f)
                curveToRelative(1.984f, 0.0f, 3.598f, 1.471f, 3.598f, 3.28f)
                curveToRelative(0.0f, 0.576f, -0.164f, 1.117f, -0.451f, 1.587f)
                curveToRelative(-0.442f, 0.726f, -1.178f, 1.282f, -2.058f, 1.538f)
                close()
                moveTo(2.0f, 12.0f)
                curveToRelative(0.0f, 5.523f, 4.477f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.477f, 10.0f, -10.0f)
                reflectiveCurveTo(17.523f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(2.0f, 6.477f, 2.0f, 12.0f)
                close()
            }
        }
        .build()
        return _miniProgramFill!!
    }

private var _miniProgramFill: ImageVector? = null
