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

public val FillGroup.Bird: ImageVector
    get() {
        if (_bird != null) {
            return _bird!!
        }
        _bird = Builder(name = "Bird", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.4f, 73.3f)
                lineTo(213.2f, 57.9f)
                arcTo(60.0f, 60.0f, 0.0f, false, false, 96.0f, 76.0f)
                verticalLineTo(93.2f)
                lineTo(1.8f, 211.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 8.0f, 224.0f)
                horizontalLineTo(112.0f)
                arcTo(104.2f, 104.2f, 0.0f, false, false, 216.0f, 120.0f)
                verticalLineTo(100.3f)
                lineToRelative(20.4f, -13.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -13.4f)
                close()
                moveTo(110.1f, 141.1f)
                lineToRelative(-40.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.2f, -10.2f)
                lineToRelative(40.0f, -48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 12.2f, 10.2f)
                close()
                moveTo(164.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 164.0f, 80.0f)
                close()
            }
        }
        .build()
        return _bird!!
    }

private var _bird: ImageVector? = null
