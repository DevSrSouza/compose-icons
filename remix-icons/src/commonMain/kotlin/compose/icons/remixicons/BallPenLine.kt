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

public val RemixIcons.BallPenLine: ImageVector
    get() {
        if (_ballPenLine != null) {
            return _ballPenLine!!
        }
        _ballPenLine = Builder(name = "BallPenLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.849f, 11.808f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(-9.9f, 9.9f)
                lineTo(3.0f, 21.001f)
                verticalLineToRelative(-4.243f)
                lineTo(14.313f, 5.444f)
                lineToRelative(5.657f, 5.657f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.414f)
                lineToRelative(-7.07f, 7.071f)
                lineToRelative(-1.415f, -1.414f)
                lineToRelative(6.364f, -6.364f)
                close()
                moveTo(15.728f, 9.687f)
                lineToRelative(-1.415f, -1.414f)
                lineTo(5.0f, 17.586f)
                verticalLineToRelative(1.415f)
                horizontalLineToRelative(1.414f)
                lineToRelative(9.314f, -9.314f)
                close()
                moveTo(18.556f, 2.616f)
                lineToRelative(2.829f, 2.828f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.414f)
                lineTo(19.97f, 8.273f)
                lineTo(15.728f, 4.03f)
                lineToRelative(1.414f, -1.414f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, 0.0f)
                close()
            }
        }
        .build()
        return _ballPenLine!!
    }

private var _ballPenLine: ImageVector? = null
