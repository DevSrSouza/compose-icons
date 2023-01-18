package compose.icons.phosphoricons.duotone

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
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.CircleHalfTilt: ImageVector
    get() {
        if (_circleHalfTilt != null) {
            return _circleHalfTilt!!
        }
        _circleHalfTilt = Builder(name = "CircleHalfTilt", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(195.9f, 195.9f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, true, -135.8f, 0.0f)
                lineTo(195.9f, 60.1f)
                arcTo(96.0f, 96.0f, 0.0f, false, true, 195.9f, 195.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(201.5f, 54.5f)
                arcToRelative(103.8f, 103.8f, 0.0f, false, false, -147.0f, 0.0f)
                arcToRelative(103.8f, 103.8f, 0.0f, false, false, 0.0f, 147.0f)
                arcToRelative(103.8f, 103.8f, 0.0f, false, false, 147.0f, 0.0f)
                arcToRelative(103.8f, 103.8f, 0.0f, false, false, 0.0f, -147.0f)
                close()
                moveTo(40.0f, 128.0f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 184.3f, 60.4f)
                lineTo(60.4f, 184.3f)
                arcTo(87.3f, 87.3f, 0.0f, false, true, 40.0f, 128.0f)
                close()
                moveTo(190.2f, 190.2f)
                arcToRelative(88.1f, 88.1f, 0.0f, false, true, -118.5f, 5.4f)
                lineTo(195.6f, 71.7f)
                arcToRelative(87.9f, 87.9f, 0.0f, false, true, -5.4f, 118.5f)
                close()
            }
        }
        .build()
        return _circleHalfTilt!!
    }

private var _circleHalfTilt: ImageVector? = null
