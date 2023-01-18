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

public val FillGroup.WarningOctagon: ImageVector
    get() {
        if (_warningOctagon != null) {
            return _warningOctagon!!
        }
        _warningOctagon = Builder(name = "WarningOctagon", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.3f, 80.2f)
                lineTo(175.8f, 28.7f)
                arcTo(16.1f, 16.1f, 0.0f, false, false, 164.5f, 24.0f)
                horizontalLineToRelative(-73.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, -11.3f, 4.7f)
                lineTo(28.7f, 80.2f)
                arcTo(16.1f, 16.1f, 0.0f, false, false, 24.0f, 91.5f)
                verticalLineToRelative(72.9f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 4.7f, 11.4f)
                lineToRelative(51.5f, 51.5f)
                arcTo(16.1f, 16.1f, 0.0f, false, false, 91.5f, 232.0f)
                horizontalLineToRelative(73.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 11.3f, -4.7f)
                lineToRelative(51.5f, -51.5f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 4.7f, -11.4f)
                lineTo(232.0f, 91.5f)
                arcTo(16.1f, 16.1f, 0.0f, false, false, 227.3f, 80.2f)
                close()
                moveTo(120.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                close()
                moveTo(128.0f, 184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 128.0f, 184.0f)
                close()
            }
        }
        .build()
        return _warningOctagon!!
    }

private var _warningOctagon: ImageVector? = null
