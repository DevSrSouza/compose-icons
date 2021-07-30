package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Arkecosystem: ImageVector
    get() {
        if (_arkecosystem != null) {
            return _arkecosystem!!
        }
        _arkecosystem = Builder(name = "Arkecosystem", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.8f, 0.0f)
                curveTo(0.806f, 0.0f, 0.0f, 0.805f, 0.0f, 1.8f)
                verticalLineToRelative(20.4f)
                curveToRelative(0.0f, 0.995f, 0.805f, 1.8f, 1.8f, 1.8f)
                horizontalLineToRelative(20.4f)
                curveToRelative(0.995f, 0.0f, 1.8f, -0.805f, 1.8f, -1.8f)
                lineTo(24.0f, 1.8f)
                curveToRelative(0.0f, -0.995f, -0.805f, -1.8f, -1.8f, -1.8f)
                lineTo(1.8f, 0.0f)
                close()
                moveTo(12.023f, 4.39f)
                lineToRelative(9.29f, 15.098f)
                lineToRelative(-9.29f, -9.82f)
                lineToRelative(-9.351f, 9.82f)
                lineToRelative(9.351f, -15.097f)
                close()
                moveTo(12.023f, 11.973f)
                lineToRelative(1.633f, 1.691f)
                horizontalLineToRelative(-3.285f)
                lineToRelative(1.652f, -1.691f)
                close()
                moveTo(9.31f, 14.762f)
                horizontalLineToRelative(5.41f)
                lineToRelative(1.496f, 1.574f)
                lineTo(7.813f, 16.336f)
                lineToRelative(1.496f, -1.574f)
                close()
            }
        }
        .build()
        return _arkecosystem!!
    }

private var _arkecosystem: ImageVector? = null
