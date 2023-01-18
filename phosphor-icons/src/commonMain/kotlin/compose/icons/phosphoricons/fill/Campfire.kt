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

public val FillGroup.Campfire: ImageVector
    get() {
        if (_campfire != null) {
            return _campfire!!
        }
        _campfire = Builder(name = "Campfire", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(132.2f, 25.2f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -8.4f, 0.0f)
                arcTo(153.5f, 153.5f, 0.0f, false, false, 96.2f, 48.0f)
                curveTo(77.8f, 67.1f, 68.0f, 87.9f, 68.0f, 108.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, 120.0f, 0.0f)
                curveTo(188.0f, 60.1f, 134.5f, 26.6f, 132.2f, 25.2f)
                close()
                moveTo(128.0f, 152.0f)
                arcToRelative(23.9f, 23.9f, 0.0f, false, true, -24.0f, -24.0f)
                curveToRelative(0.0f, -24.0f, 24.0f, -40.0f, 24.0f, -40.0f)
                reflectiveCurveToRelative(24.0f, 16.0f, 24.0f, 40.0f)
                arcTo(23.9f, 23.9f, 0.0f, false, true, 128.0f, 152.0f)
                close()
                moveTo(223.6f, 226.4f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 232.0f)
                arcToRelative(6.7f, 6.7f, 0.0f, false, true, -2.4f, -0.4f)
                lineTo(128.0f, 204.4f)
                lineTo(42.4f, 231.6f)
                arcToRelative(6.7f, 6.7f, 0.0f, false, true, -2.4f, 0.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.6f, -5.6f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 5.2f, -10.0f)
                lineToRelative(64.0f, -20.4f)
                lineToRelative(-64.0f, -20.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 4.8f, -15.2f)
                lineTo(128.0f, 187.6f)
                lineToRelative(85.6f, -27.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 4.8f, 15.2f)
                lineToRelative(-64.0f, 20.4f)
                lineToRelative(64.0f, 20.4f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 223.6f, 226.4f)
                close()
            }
        }
        .build()
        return _campfire!!
    }

private var _campfire: ImageVector? = null
