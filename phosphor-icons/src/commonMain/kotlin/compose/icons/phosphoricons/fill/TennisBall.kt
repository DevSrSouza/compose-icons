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

public val FillGroup.TennisBall: ImageVector
    get() {
        if (_tennisBall != null) {
            return _tennisBall!!
        }
        _tennisBall = Builder(name = "TennisBall", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 136.0f)
                horizontalLineToRelative(3.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.9f, 4.5f)
                arcToRelative(104.2f, 104.2f, 0.0f, false, true, -94.8f, 91.1f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 224.0f, 136.0f)
                close()
                moveTo(150.5f, 150.5f)
                arcTo(102.9f, 102.9f, 0.0f, false, true, 224.0f, 120.0f)
                horizontalLineToRelative(3.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.1f, -4.4f)
                arcToRelative(104.1f, 104.1f, 0.0f, false, false, -90.9f, -90.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.4f, 4.1f)
                arcToRelative(103.7f, 103.7f, 0.0f, false, true, -30.4f, 76.7f)
                arcTo(102.9f, 102.9f, 0.0f, false, true, 32.0f, 136.0f)
                lineTo(28.9f, 136.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.1f, 4.4f)
                arcToRelative(104.1f, 104.1f, 0.0f, false, false, 90.9f, 90.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.4f, -4.1f)
                arcTo(103.7f, 103.7f, 0.0f, false, true, 150.5f, 150.5f)
                close()
                moveTo(94.2f, 94.2f)
                arcToRelative(87.6f, 87.6f, 0.0f, false, false, 25.7f, -65.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.5f, -3.7f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, false, -90.6f, 90.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.8f, 4.5f)
                arcTo(87.8f, 87.8f, 0.0f, false, false, 94.2f, 94.2f)
                close()
            }
        }
        .build()
        return _tennisBall!!
    }

private var _tennisBall: ImageVector? = null
