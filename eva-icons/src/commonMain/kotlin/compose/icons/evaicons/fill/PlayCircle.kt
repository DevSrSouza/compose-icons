package compose.icons.evaicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.evaicons.FillGroup

public val FillGroup.PlayCircle: ImageVector
    get() {
        if (_playCircle != null) {
            return _playCircle!!
        }
        _playCircle = Builder(name = "PlayCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(-24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 14.6f)
                lineToRelative(2.81f, -2.6f)
                lineToRelative(-2.81f, -2.6f)
                lineToRelative(0.0f, 5.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, false, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 2.0f)
                close()
                moveTo(16.0f, 13.18f)
                lineTo(12.36f, 16.55f)
                arcToRelative(1.74f, 1.74f, 0.0f, false, true, -1.16f, 0.45f)
                arcToRelative(1.68f, 1.68f, 0.0f, false, true, -0.69f, -0.15f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, true, -1.0f, -1.48f)
                lineTo(9.51f, 8.63f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, true, 1.0f, -1.48f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, true, 1.85f, 0.3f)
                lineTo(16.0f, 10.82f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, true, 0.0f, 2.36f)
                close()
            }
        }
        .build()
        return _playCircle!!
    }

private var _playCircle: ImageVector? = null
