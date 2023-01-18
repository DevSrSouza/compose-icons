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

public val DuotoneGroup.UmbrellaSimple: ImageVector
    get() {
        if (_umbrellaSimple != null) {
            return _umbrellaSimple!!
        }
        _umbrellaSimple = Builder(name = "UmbrellaSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(223.7f, 136.0f)
                horizontalLineTo(32.3f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -7.9f, -8.7f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, true, 207.2f, 0.0f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 223.7f, 136.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(239.6f, 126.6f)
                arcTo(111.9f, 111.9f, 0.0f, false, false, 52.0f, 53.8f)
                arcToRelative(110.9f, 110.9f, 0.0f, false, false, -35.6f, 72.8f)
                arcToRelative(15.7f, 15.7f, 0.0f, false, false, 4.2f, 12.2f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 32.3f, 144.0f)
                horizontalLineTo(120.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 64.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -32.0f, 0.0f)
                verticalLineTo(144.0f)
                horizontalLineToRelative(87.7f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 11.7f, -5.2f)
                arcTo(15.7f, 15.7f, 0.0f, false, false, 239.6f, 126.6f)
                close()
                moveTo(32.3f, 128.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, true, 191.4f, 0.0f)
                close()
            }
        }
        .build()
        return _umbrellaSimple!!
    }

private var _umbrellaSimple: ImageVector? = null
