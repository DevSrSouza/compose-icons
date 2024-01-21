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

public val Octicons.Alert16: ImageVector
    get() {
        if (_alert16 != null) {
            return _alert16!!
        }
        _alert16 = Builder(name = "Alert16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.457f, 1.047f)
                curveToRelative(0.659f, -1.234f, 2.427f, -1.234f, 3.086f, 0.0f)
                lineToRelative(6.082f, 11.378f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 14.082f, 15.0f)
                lineTo(1.918f, 15.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -1.543f, -2.575f)
                close()
                moveTo(8.22f, 1.754f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.44f, 0.0f)
                lineTo(1.698f, 13.132f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.22f, 0.368f)
                horizontalLineToRelative(12.164f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.22f, -0.368f)
                close()
                moveTo(8.75f, 5.75f)
                verticalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                close()
                moveTo(9.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                close()
            }
        }
        .build()
        return _alert16!!
    }

private var _alert16: ImageVector? = null
