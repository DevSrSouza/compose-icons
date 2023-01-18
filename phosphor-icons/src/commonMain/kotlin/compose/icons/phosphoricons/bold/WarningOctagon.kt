package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.WarningOctagon: ImageVector
    get() {
        if (_warningOctagon != null) {
            return _warningOctagon!!
        }
        _warningOctagon = Builder(name = "WarningOctagon", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(116.0f, 132.0f)
                lineTo(116.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                close()
                moveTo(236.0f, 91.5f)
                verticalLineToRelative(72.9f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, -5.9f, 14.2f)
                lineToRelative(-51.5f, 51.5f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, true, -14.1f, 5.9f)
                horizontalLineToRelative(-73.0f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, true, -14.1f, -5.9f)
                lineTo(25.9f, 178.6f)
                arcTo(19.9f, 19.9f, 0.0f, false, true, 20.0f, 164.4f)
                lineTo(20.0f, 91.5f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, true, 5.9f, -14.1f)
                lineTo(77.4f, 25.9f)
                arcTo(19.8f, 19.8f, 0.0f, false, true, 91.5f, 20.0f)
                horizontalLineToRelative(73.0f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, true, 14.1f, 5.9f)
                lineToRelative(51.5f, 51.5f)
                arcTo(19.8f, 19.8f, 0.0f, false, true, 236.0f, 91.5f)
                close()
                moveTo(212.0f, 93.2f)
                lineTo(162.8f, 44.0f)
                lineTo(93.2f, 44.0f)
                lineTo(44.0f, 93.2f)
                verticalLineToRelative(69.6f)
                lineTo(93.2f, 212.0f)
                horizontalLineToRelative(69.6f)
                lineTo(212.0f, 162.8f)
                close()
                moveTo(128.0f, 156.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 128.0f, 156.0f)
                close()
            }
        }
        .build()
        return _warningOctagon!!
    }

private var _warningOctagon: ImageVector? = null
