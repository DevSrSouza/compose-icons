package compose.icons.octicons

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
import compose.icons.Octicons

public val Octicons.FileCode24: ImageVector
    get() {
        if (_fileCode24 != null) {
            return _fileCode24!!
        }
        _fileCode24 = Builder(name = "FileCode24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
                close()
                moveTo(15.0f, 2.5f)
                verticalLineToRelative(4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.146f, -0.336f)
                lineToRelative(-4.018f, -4.018f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 15.0f, 2.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.53f, 12.24f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.039f, 1.06f)
                lineToRelative(-2.639f, 2.45f)
                lineToRelative(2.64f, 2.45f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.022f, 1.1f)
                lineToRelative(-3.23f, -3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.1f)
                lineToRelative(3.23f, -3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, 0.04f)
                close()
                moveTo(8.509f, 13.3f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.02f, -1.1f)
                lineToRelative(3.231f, 3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.1f)
                lineToRelative(-3.23f, 3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.021f, -1.1f)
                lineToRelative(2.639f, -2.45f)
                lineToRelative(-2.64f, -2.45f)
                close()
            }
        }
        .build()
        return _fileCode24!!
    }

private var _fileCode24: ImageVector? = null
