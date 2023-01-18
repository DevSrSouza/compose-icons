package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.StackLine: ImageVector
    get() {
        if (_stackLine != null) {
            return _stackLine!!
        }
        _stackLine = Builder(name = "StackLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.083f, 15.2f)
                lineToRelative(1.202f, 0.721f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 0.858f)
                lineToRelative(-8.77f, 5.262f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.03f, 0.0f)
                lineToRelative(-8.77f, -5.262f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -0.858f)
                lineToRelative(1.202f, -0.721f)
                lineTo(12.0f, 20.05f)
                lineToRelative(8.083f, -4.85f)
                close()
                moveTo(20.083f, 10.5f)
                lineToRelative(1.202f, 0.721f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 0.858f)
                lineTo(12.0f, 17.65f)
                lineToRelative(-9.285f, -5.571f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -0.858f)
                lineToRelative(1.202f, -0.721f)
                lineTo(12.0f, 15.35f)
                lineToRelative(8.083f, -4.85f)
                close()
                moveTo(12.514f, 1.309f)
                lineToRelative(8.771f, 5.262f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 0.858f)
                lineTo(12.0f, 13.0f)
                lineTo(2.715f, 7.429f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -0.858f)
                lineToRelative(8.77f, -5.262f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.03f, 0.0f)
                close()
                moveTo(12.0f, 3.332f)
                lineTo(5.887f, 7.0f)
                lineTo(12.0f, 10.668f)
                lineTo(18.113f, 7.0f)
                lineTo(12.0f, 3.332f)
                close()
            }
        }
        .build()
        return _stackLine!!
    }

private var _stackLine: ImageVector? = null
