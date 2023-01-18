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

public val RemixIcons.InkBottleFill: ImageVector
    get() {
        if (_inkBottleFill != null) {
            return _inkBottleFill!!
        }
        _inkBottleFill = Builder(name = "InkBottleFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 9.0f)
                lineToRelative(4.371f, 1.749f)
                curveToRelative(0.38f, 0.151f, 0.629f, 0.52f, 0.629f, 0.928f)
                lineTo(21.0f, 21.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(4.0f, 22.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-9.323f)
                curveToRelative(0.0f, -0.409f, 0.249f, -0.777f, 0.629f, -0.928f)
                lineTo(8.0f, 9.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(20.0f, 14.0f)
                lineTo(8.0f, 14.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(16.0f, 3.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                lineTo(7.0f, 8.0f)
                lineTo(7.0f, 4.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _inkBottleFill!!
    }

private var _inkBottleFill: ImageVector? = null
