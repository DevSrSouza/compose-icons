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

public val FillGroup.Crosshair: ImageVector
    get() {
        if (_crosshair != null) {
            return _crosshair!!
        }
        _crosshair = Builder(name = "Crosshair", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 120.0f)
                lineTo(223.7f, 120.0f)
                arcTo(96.2f, 96.2f, 0.0f, false, false, 136.0f, 32.3f)
                lineTo(136.0f, 20.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(120.0f, 32.3f)
                arcTo(96.2f, 96.2f, 0.0f, false, false, 32.3f, 120.0f)
                lineTo(20.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(32.3f, 136.0f)
                arcTo(96.2f, 96.2f, 0.0f, false, false, 120.0f, 223.7f)
                lineTo(120.0f, 236.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(136.0f, 223.7f)
                arcTo(96.2f, 96.2f, 0.0f, false, false, 223.7f, 136.0f)
                lineTo(236.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(196.0f, 136.0f)
                horizontalLineToRelative(11.6f)
                arcTo(80.3f, 80.3f, 0.0f, false, true, 136.0f, 207.6f)
                lineTo(136.0f, 196.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(11.6f)
                arcTo(80.3f, 80.3f, 0.0f, false, true, 48.4f, 136.0f)
                lineTo(60.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(48.4f, 120.0f)
                arcTo(80.3f, 80.3f, 0.0f, false, true, 120.0f, 48.4f)
                lineTo(120.0f, 60.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(136.0f, 48.4f)
                arcTo(80.3f, 80.3f, 0.0f, false, true, 207.6f, 120.0f)
                lineTo(196.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                close()
                moveTo(168.0f, 128.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, -40.0f, -40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 168.0f, 128.0f)
                close()
            }
        }
        .build()
        return _crosshair!!
    }

private var _crosshair: ImageVector? = null
