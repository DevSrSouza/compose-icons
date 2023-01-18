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

public val FillGroup.ArrowCircleDown: ImageVector
    get() {
        if (_arrowCircleDown != null) {
            return _arrowCircleDown!!
        }
        _arrowCircleDown = Builder(name = "ArrowCircleDown", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.2f, 104.2f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(167.6f, 139.7f)
                lineTo(133.7f, 173.7f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -11.4f, 0.0f)
                lineToRelative(-33.9f, -34.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.3f, -11.3f)
                lineTo(120.0f, 148.7f)
                lineTo(120.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(60.7f)
                lineToRelative(20.3f, -20.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.3f, 11.3f)
                close()
            }
        }
        .build()
        return _arrowCircleDown!!
    }

private var _arrowCircleDown: ImageVector? = null