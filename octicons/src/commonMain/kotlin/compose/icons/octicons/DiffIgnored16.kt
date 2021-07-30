package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.DiffIgnored16: ImageVector
    get() {
        if (_diffIgnored16 != null) {
            return _diffIgnored16!!
        }
        _diffIgnored16 = Builder(name = "DiffIgnored16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.75f, 2.5f)
                horizontalLineToRelative(10.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, 0.25f)
                verticalLineToRelative(10.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, 0.25f)
                lineTo(2.75f, 13.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, -0.25f)
                lineTo(2.5f, 2.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, -0.25f)
                close()
                moveTo(13.25f, 1.0f)
                lineTo(2.75f, 1.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 1.0f, 2.75f)
                verticalLineToRelative(10.5f)
                curveToRelative(0.0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(10.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 15.0f, 13.25f)
                lineTo(15.0f, 2.75f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 13.25f, 1.0f)
                close()
                moveTo(11.28f, 5.78f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, -1.06f)
                lineToRelative(-5.5f, 5.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, 1.06f)
                lineToRelative(5.5f, -5.5f)
                close()
            }
        }
        .build()
        return _diffIgnored16!!
    }

private var _diffIgnored16: ImageVector? = null
