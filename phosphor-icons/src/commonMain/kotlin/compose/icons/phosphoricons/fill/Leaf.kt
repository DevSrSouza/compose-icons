package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.Leaf: ImageVector
    get() {
        if (_leaf != null) {
            return _leaf!!
        }
        _leaf = Builder(name = "Leaf", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(162.4f, 203.0f)
                arcToRelative(87.0f, 87.0f, 0.0f, false, true, -45.8f, 12.8f)
                horizontalLineToRelative(-3.3f)
                curveToRelative(-15.9f, -0.6f, -32.1f, -5.2f, -48.0f, -13.8f)
                lineTo(165.7f, 101.7f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -11.4f, -11.4f)
                lineTo(54.0f, 190.7f)
                curveToRelative(-8.6f, -15.9f, -13.2f, -32.1f, -13.8f, -48.0f)
                arcTo(87.3f, 87.3f, 0.0f, false, true, 53.0f, 93.6f)
                curveTo(79.1f, 50.5f, 140.2f, 27.5f, 216.5f, 32.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 7.5f, 7.5f)
                curveTo(228.5f, 115.8f, 205.5f, 176.9f, 162.4f, 203.0f)
                close()
                moveTo(57.1f, 196.1f)
                curveToRelative(-1.1f, -1.8f, -2.1f, -3.6f, -3.1f, -5.4f)
                lineTo(34.3f, 210.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, 11.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 11.4f, 0.0f)
                lineTo(65.3f, 202.0f)
                lineToRelative(-5.4f, -3.1f)
                arcTo(9.3f, 9.3f, 0.0f, false, true, 57.1f, 196.1f)
                close()
            }
        }
        .build()
        return _leaf!!
    }

private var _leaf: ImageVector? = null
