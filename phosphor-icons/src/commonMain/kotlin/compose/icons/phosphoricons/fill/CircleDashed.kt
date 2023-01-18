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

public val FillGroup.CircleDashed: ImageVector
    get() {
        if (_circleDashed != null) {
            return _circleDashed!!
        }
        _circleDashed = Builder(name = "CircleDashed", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(65.8f, 54.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.3f)
                arcTo(87.7f, 87.7f, 0.0f, false, false, 43.0f, 105.2f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -7.7f, 6.0f)
                lineToRelative(-2.1f, -0.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.7f, -9.8f)
                arcToRelative(103.2f, 103.2f, 0.0f, false, true, 27.0f, -46.6f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 65.8f, 54.5f)
                close()
                moveTo(43.0f, 150.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.8f, -5.7f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -5.7f, 9.8f)
                arcToRelative(104.8f, 104.8f, 0.0f, false, false, 27.0f, 46.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.6f, 2.3f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, false, 5.7f, -2.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, -11.4f)
                arcTo(87.6f, 87.6f, 0.0f, false, true, 43.0f, 150.8f)
                close()
                moveTo(150.8f, 213.0f)
                arcToRelative(88.1f, 88.1f, 0.0f, false, true, -45.6f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.1f, 15.5f)
                arcToRelative(107.0f, 107.0f, 0.0f, false, false, 27.0f, 3.5f)
                arcToRelative(105.4f, 105.4f, 0.0f, false, false, 26.8f, -3.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.1f, -15.5f)
                close()
                moveTo(222.8f, 145.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.8f, 5.7f)
                arcToRelative(87.2f, 87.2f, 0.0f, false, true, -22.8f, 39.4f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 5.7f, 13.7f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, false, 5.6f, -2.4f)
                arcToRelative(103.2f, 103.2f, 0.0f, false, false, 27.0f, -46.6f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 222.8f, 145.1f)
                close()
                moveTo(213.0f, 105.2f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 7.7f, 6.0f)
                lineToRelative(2.1f, -0.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.7f, -9.8f)
                arcToRelative(103.9f, 103.9f, 0.0f, false, false, -27.0f, -46.6f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -11.3f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 11.3f)
                arcTo(87.6f, 87.6f, 0.0f, false, true, 213.0f, 105.2f)
                close()
                moveTo(105.2f, 43.0f)
                arcToRelative(88.1f, 88.1f, 0.0f, false, true, 45.6f, 0.0f)
                arcToRelative(7.6f, 7.6f, 0.0f, false, false, 2.1f, 0.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.0f, -15.8f)
                arcToRelative(104.4f, 104.4f, 0.0f, false, false, -53.8f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 105.2f, 43.0f)
                close()
            }
        }
        .build()
        return _circleDashed!!
    }

private var _circleDashed: ImageVector? = null
