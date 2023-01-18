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

public val FillGroup.BracketsAngle: ImageVector
    get() {
        if (_bracketsAngle != null) {
            return _bracketsAngle!!
        }
        _bracketsAngle = Builder(name = "BracketsAngle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(86.7f, 44.3f)
                lineTo(33.5f, 128.0f)
                lineToRelative(53.2f, 83.7f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -2.4f, 11.0f)
                arcTo(7.5f, 7.5f, 0.0f, false, true, 80.0f, 224.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -6.7f, -3.7f)
                lineToRelative(-56.0f, -88.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 0.0f, -8.6f)
                lineToRelative(56.0f, -88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 13.4f, 8.6f)
                close()
                moveTo(238.7f, 123.7f)
                lineTo(182.7f, 35.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -13.4f, 8.6f)
                lineTo(222.5f, 128.0f)
                lineToRelative(-53.2f, 83.7f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 2.4f, 11.0f)
                arcTo(7.5f, 7.5f, 0.0f, false, false, 176.0f, 224.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 6.7f, -3.7f)
                lineToRelative(56.0f, -88.0f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 238.7f, 123.7f)
                close()
            }
        }
        .build()
        return _bracketsAngle!!
    }

private var _bracketsAngle: ImageVector? = null
