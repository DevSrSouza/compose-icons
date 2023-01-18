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

public val FillGroup.DiamondsFour: ImageVector
    get() {
        if (_diamondsFour != null) {
            return _diamondsFour!!
        }
        _diamondsFour = Builder(name = "DiamondsFour", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(88.0f, 75.3f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, true, 0.0f, -22.6f)
                lineTo(116.7f, 24.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, 22.6f, 0.0f)
                lineTo(168.0f, 52.7f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, true, 0.0f, 22.6f)
                lineTo(139.3f, 104.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, -22.6f, 0.0f)
                close()
                moveTo(104.0f, 116.7f)
                lineTo(75.3f, 88.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, -22.6f, 0.0f)
                lineTo(24.0f, 116.7f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 0.0f, 22.6f)
                lineTo(52.7f, 168.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 22.6f, 0.0f)
                lineTo(104.0f, 139.3f)
                arcTo(16.1f, 16.1f, 0.0f, false, false, 104.0f, 116.7f)
                close()
                moveTo(232.0f, 116.7f)
                lineTo(203.3f, 88.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, -22.6f, 0.0f)
                lineTo(152.0f, 116.7f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 0.0f, 22.6f)
                lineTo(180.7f, 168.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 22.6f, 0.0f)
                lineTo(232.0f, 139.3f)
                arcTo(16.1f, 16.1f, 0.0f, false, false, 232.0f, 116.7f)
                close()
                moveTo(139.3f, 152.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, -22.6f, 0.0f)
                lineTo(88.0f, 180.7f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 0.0f, 22.6f)
                lineTo(116.7f, 232.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 22.6f, 0.0f)
                lineTo(168.0f, 203.3f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 0.0f, -22.6f)
                close()
            }
        }
        .build()
        return _diamondsFour!!
    }

private var _diamondsFour: ImageVector? = null
