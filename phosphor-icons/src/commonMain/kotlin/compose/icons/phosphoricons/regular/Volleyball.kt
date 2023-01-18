package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.Volleyball: ImageVector
    get() {
        if (_volleyball != null) {
            return _volleyball!!
        }
        _volleyball = Builder(name = "Volleyball", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 167.9f)
                arcToRelative(105.7f, 105.7f, 0.0f, false, false, 8.0f, -39.3f)
                verticalLineToRelative(-1.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 37.9f, 180.0f)
                curveToRelative(2.0f, 3.4f, 4.2f, 6.7f, 6.5f, 9.9f)
                lineToRelative(0.5f, 0.7f)
                arcToRelative(103.9f, 103.9f, 0.0f, false, false, 178.2f, -20.7f)
                arcTo(7.2f, 7.2f, 0.0f, false, false, 224.0f, 167.9f)
                close()
                moveTo(91.1f, 48.1f)
                arcToRelative(89.1f, 89.1f, 0.0f, false, true, 24.3f, -7.2f)
                arcToRelative(88.1f, 88.1f, 0.0f, false, true, 50.0f, 79.1f)
                lineTo(132.6f, 120.0f)
                close()
                moveTo(132.6f, 136.0f)
                horizontalLineToRelative(83.0f)
                arcToRelative(89.3f, 89.3f, 0.0f, false, true, -5.9f, 24.6f)
                arcToRelative(88.2f, 88.2f, 0.0f, false, true, -93.5f, 3.8f)
                close()
                moveTo(204.2f, 84.0f)
                arcToRelative(87.2f, 87.2f, 0.0f, false, true, 11.4f, 36.0f)
                lineTo(181.4f, 120.0f)
                arcToRelative(105.0f, 105.0f, 0.0f, false, false, -35.7f, -78.2f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 204.2f, 84.0f)
                close()
                moveTo(77.3f, 56.1f)
                lineTo(94.4f, 85.8f)
                arcToRelative(104.4f, 104.4f, 0.0f, false, false, -49.9f, 70.1f)
                arcTo(88.2f, 88.2f, 0.0f, false, true, 77.3f, 56.1f)
                close()
                moveTo(58.9f, 182.5f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, 43.5f, -82.9f)
                lineTo(118.8f, 128.0f)
                lineTo(77.3f, 199.9f)
                arcTo(84.2f, 84.2f, 0.0f, false, true, 58.9f, 182.5f)
                close()
                moveTo(172.0f, 204.2f)
                arcToRelative(87.9f, 87.9f, 0.0f, false, true, -80.9f, 3.6f)
                lineToRelative(17.1f, -29.6f)
                arcToRelative(104.4f, 104.4f, 0.0f, false, false, 85.6f, 8.2f)
                arcTo(88.4f, 88.4f, 0.0f, false, true, 172.0f, 204.2f)
                close()
            }
        }
        .build()
        return _volleyball!!
    }

private var _volleyball: ImageVector? = null
