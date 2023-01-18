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

public val FillGroup.Volleyball: ImageVector
    get() {
        if (_volleyball != null) {
            return _volleyball!!
        }
        _volleyball = Builder(name = "Volleyball", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 127.6f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 37.9f, 180.0f)
                curveToRelative(2.0f, 3.4f, 4.2f, 6.7f, 6.5f, 9.9f)
                lineToRelative(0.5f, 0.7f)
                arcToRelative(103.9f, 103.9f, 0.0f, false, false, 178.2f, -20.7f)
                arcToRelative(7.2f, 7.2f, 0.0f, false, false, 0.9f, -2.0f)
                arcToRelative(105.7f, 105.7f, 0.0f, false, false, 8.0f, -39.3f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(44.5f, 155.9f)
                arcTo(88.2f, 88.2f, 0.0f, false, true, 77.3f, 56.1f)
                lineTo(94.4f, 85.8f)
                arcToRelative(104.4f, 104.4f, 0.0f, false, false, -49.9f, 70.1f)
                close()
                moveTo(77.3f, 199.9f)
                arcToRelative(84.2f, 84.2f, 0.0f, false, true, -18.4f, -17.4f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, 43.5f, -82.9f)
                lineTo(118.8f, 128.0f)
                close()
                moveTo(209.7f, 160.6f)
                arcToRelative(88.2f, 88.2f, 0.0f, false, true, -93.5f, 3.8f)
                lineTo(132.6f, 136.0f)
                horizontalLineToRelative(83.0f)
                arcTo(89.3f, 89.3f, 0.0f, false, true, 209.7f, 160.6f)
                close()
                moveTo(181.4f, 120.0f)
                arcToRelative(105.0f, 105.0f, 0.0f, false, false, -35.7f, -78.2f)
                arcTo(87.9f, 87.9f, 0.0f, false, true, 215.6f, 120.0f)
                close()
            }
        }
        .build()
        return _volleyball!!
    }

private var _volleyball: ImageVector? = null
