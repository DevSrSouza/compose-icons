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

public val Octicons.GitMerge16: ImageVector
    get() {
        if (_gitMerge16 != null) {
            return _gitMerge16!!
        }
        _gitMerge16 = Builder(name = "GitMerge16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.0f, 3.254f)
                lineTo(5.0f, 3.25f)
                verticalLineToRelative(0.005f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, -0.005f)
                verticalLineToRelative(0.004f)
                close()
                moveTo(5.45f, 5.154f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, false, -1.95f, 0.218f)
                verticalLineToRelative(5.256f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, false, 1.5f, 0.0f)
                lineTo(5.0f, 7.123f)
                arcTo(5.735f, 5.735f, 0.0f, false, false, 9.25f, 9.0f)
                horizontalLineToRelative(1.378f)
                arcToRelative(2.251f, 2.251f, 0.0f, true, false, 0.0f, -1.5f)
                lineTo(9.25f, 7.5f)
                arcToRelative(4.25f, 4.25f, 0.0f, false, true, -3.8f, -2.346f)
                close()
                moveTo(12.75f, 9.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                close()
                moveTo(4.25f, 13.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                close()
            }
        }
        .build()
        return _gitMerge16!!
    }

private var _gitMerge16: ImageVector? = null
