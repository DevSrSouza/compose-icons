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

public val FillGroup.Binoculars: ImageVector
    get() {
        if (_binoculars != null) {
            return _binoculars!!
        }
        _binoculars = Builder(name = "Binoculars", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.2f, 151.9f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.1f, -0.1f, -0.1f, -0.1f, -0.2f)
                arcToRelative(42.3f, 42.3f, 0.0f, false, false, -2.3f, -5.3f)
                lineTo(193.3f, 51.8f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -1.7f, -2.4f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -45.3f, 0.0f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 144.0f, 55.0f)
                lineTo(144.0f, 84.0f)
                lineTo(112.0f, 84.0f)
                lineTo(112.0f, 55.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -2.3f, -5.6f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -45.3f, 0.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -1.7f, 2.4f)
                lineTo(21.2f, 146.3f)
                arcToRelative(42.3f, 42.3f, 0.0f, false, false, -2.3f, 5.3f)
                curveToRelative(0.0f, 0.1f, -0.1f, 0.1f, -0.1f, 0.2f)
                horizontalLineToRelative(0.0f)
                arcTo(48.0f, 48.0f, 0.0f, true, false, 112.0f, 167.8f)
                lineTo(112.0f, 100.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(67.8f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 93.2f, -15.9f)
                close()
                moveTo(94.1f, 178.9f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -60.2f, -21.7f)
                lineToRelative(1.8f, -4.1f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 96.0f, 167.9f)
                horizontalLineToRelative(0.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, true, 94.1f, 178.9f)
                close()
                moveTo(202.9f, 198.1f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 160.0f, 168.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 60.3f, -14.8f)
                lineToRelative(1.8f, 4.1f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 202.9f, 198.1f)
                close()
            }
        }
        .build()
        return _binoculars!!
    }

private var _binoculars: ImageVector? = null
