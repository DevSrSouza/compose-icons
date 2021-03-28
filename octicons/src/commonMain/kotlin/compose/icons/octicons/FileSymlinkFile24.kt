package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.FileSymlinkFile24: ImageVector
    get() {
        if (_fileSymlinkFile24 != null) {
            return _fileSymlinkFile24!!
        }
        _fileSymlinkFile24 = Builder(name = "FileSymlinkFile24", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(9.982f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.414f, 0.586f)
                lineToRelative(4.018f, 4.018f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 7.018f)
                lineTo(21.0f, 21.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(4.75f, 23.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                lineTo(19.0f, 21.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                lineTo(19.5f, 8.5f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-4.0f)
                lineTo(5.0f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(6.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                lineTo(3.0f, 3.0f)
                close()
                moveTo(15.0f, 2.5f)
                verticalLineToRelative(4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.146f, -0.336f)
                lineToRelative(-4.018f, -4.018f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 15.0f, 2.5f)
                close()
                moveTo(9.308f, 14.5f)
                lineToRelative(-2.104f, -2.236f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.092f, -1.028f)
                lineToRelative(3.294f, 3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.028f)
                lineToRelative(-3.294f, 3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.092f, -1.028f)
                lineTo(9.308f, 16.0f)
                lineTo(4.09f, 16.0f)
                arcToRelative(2.59f, 2.59f, 0.0f, false, false, -2.59f, 2.59f)
                verticalLineToRelative(3.16f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-3.16f)
                arcToRelative(4.09f, 4.09f, 0.0f, false, true, 4.09f, -4.09f)
                horizontalLineToRelative(5.218f)
                close()
            }
        }
        .build()
        return _fileSymlinkFile24!!
    }

private var _fileSymlinkFile24: ImageVector? = null
