package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.FileSubmodule24: ImageVector
    get() {
        if (_fileSubmodule24 != null) {
            return _fileSubmodule24!!
        }
        _fileSubmodule24 = Builder(name = "FileSubmodule24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 4.75f)
                curveTo(2.0f, 3.784f, 2.784f, 3.0f, 3.75f, 3.0f)
                horizontalLineToRelative(4.965f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 1.456f, 0.78f)
                lineToRelative(1.406f, 2.109f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.208f, 0.111f)
                horizontalLineToRelative(8.465f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(11.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 20.25f, 21.0f)
                lineTo(3.75f, 21.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 2.0f, 19.25f)
                close()
                moveTo(14.78f, 9.72f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, false, -1.275f, 0.326f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, false, 0.215f, 0.734f)
                lineToRelative(1.72f, 1.72f)
                lineTo(6.75f, 12.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(8.69f)
                lineToRelative(-1.72f, 1.72f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, false, 0.326f, 1.275f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, false, 0.734f, -0.215f)
                lineToRelative(3.0f, -3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.06f)
                close()
            }
        }
        .build()
        return _fileSubmodule24!!
    }

private var _fileSubmodule24: ImageVector? = null
