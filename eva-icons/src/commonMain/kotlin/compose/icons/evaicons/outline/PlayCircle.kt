package compose.icons.evaicons.outline

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
import compose.icons.evaicons.OutlineGroup

public val OutlineGroup.PlayCircle: ImageVector
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
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, false, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 20.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 12.0f, 20.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.34f, 7.45f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, false, -1.85f, -0.3f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, false, -1.0f, 1.48f)
                verticalLineToRelative(6.74f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, false, 1.0f, 1.48f)
                arcToRelative(1.68f, 1.68f, 0.0f, false, false, 0.69f, 0.15f)
                arcToRelative(1.74f, 1.74f, 0.0f, false, false, 1.16f, -0.45f)
                lineTo(16.0f, 13.18f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, false, 0.0f, -2.36f)
                close()
                moveTo(11.5f, 14.6f)
                verticalLineTo(9.4f)
                lineTo(14.31f, 12.0f)
                close()
            }
        }
        .build()
        return _playCircle!!
    }

private var _playCircle: ImageVector? = null
