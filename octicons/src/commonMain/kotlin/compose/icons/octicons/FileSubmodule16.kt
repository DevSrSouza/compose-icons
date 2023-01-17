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

public val Octicons.FileSubmodule16: ImageVector
    get() {
        if (_fileSubmodule16 != null) {
            return _fileSubmodule16!!
        }
        _fileSubmodule16 = Builder(name = "FileSubmodule16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 2.75f)
                curveTo(0.0f, 1.784f, 0.784f, 1.0f, 1.75f, 1.0f)
                lineTo(5.0f, 1.0f)
                curveToRelative(0.55f, 0.0f, 1.07f, 0.26f, 1.4f, 0.7f)
                lineToRelative(0.9f, 1.2f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.2f, 0.1f)
                horizontalLineToRelative(6.75f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(8.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 14.25f, 15.0f)
                lineTo(1.75f, 15.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 0.0f, 13.25f)
                close()
                moveTo(9.42f, 12.11f)
                lineTo(12.303f, 9.433f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.0f, -0.366f)
                lineTo(9.42f, 6.39f)
                arcToRelative(0.249f, 0.249f, 0.0f, false, false, -0.42f, 0.183f)
                lineTo(9.0f, 8.5f)
                lineTo(4.75f, 8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                lineTo(9.0f, 10.0f)
                verticalLineToRelative(1.927f)
                curveToRelative(0.0f, 0.218f, 0.26f, 0.331f, 0.42f, 0.183f)
                close()
            }
        }
        .build()
        return _fileSubmodule16!!
    }

private var _fileSubmodule16: ImageVector? = null
