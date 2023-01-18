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

public val FillGroup.Sparkle: ImageVector
    get() {
        if (_sparkle != null) {
            return _sparkle!!
        }
        _sparkle = Builder(name = "Sparkle", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.9f, 144.0f)
                arcToRelative(15.8f, 15.8f, 0.0f, false, true, -10.5f, 15.0f)
                lineToRelative(-52.2f, 19.2f)
                lineTo(127.0f, 230.4f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -30.0f, 0.0f)
                lineTo(77.8f, 178.2f)
                lineTo(25.6f, 159.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, -30.0f)
                lineToRelative(52.2f, -19.2f)
                lineTo(97.0f, 57.6f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 30.0f, 0.0f)
                lineToRelative(19.2f, 52.2f)
                lineTo(198.4f, 129.0f)
                arcTo(15.8f, 15.8f, 0.0f, false, true, 208.9f, 144.0f)
                close()
                moveTo(152.0f, 48.0f)
                horizontalLineToRelative(16.0f)
                lineTo(168.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(184.0f, 48.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(184.0f, 32.0f)
                lineTo(184.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(168.0f, 32.0f)
                lineTo(152.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                close()
                moveTo(240.0f, 80.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(232.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(232.0f, 96.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
            }
        }
        .build()
        return _sparkle!!
    }

private var _sparkle: ImageVector? = null
