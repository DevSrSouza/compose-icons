package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Academia: VectorAsset
    get() {
        if (_academia != null) {
            return _academia!!
        }
        _academia = VectorAssetBuilder(name = "Academia", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.033f, 21.18f)
                lineTo(13.77f, 0.459f)
                horizontalLineTo(7.869f)
                lineToRelative(1.049f, 2.623f)
                lineTo(1.836f, 21.18f)
                curveTo(1.574f, 22.098f, 0.787f, 22.23f, 0.0f, 22.361f)
                verticalLineToRelative(1.18f)
                horizontalLineToRelative(6.82f)
                verticalLineToRelative(-1.18f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveTo(4.984f, 22.23f, 3.934f, 21.967f, 4.721f, 20.0f)
                curveToRelative(0.131f, -0.131f, 0.656f, -1.574f, 1.311f, -3.41f)
                horizontalLineToRelative(8.393f)
                lineToRelative(1.18f, 3.016f)
                curveToRelative(0.131f, 0.525f, 0.262f, 0.918f, 0.262f, 1.311f)
                curveToRelative(0.0f, 1.049f, -0.918f, 1.443f, -2.623f, 1.443f)
                verticalLineToRelative(1.18f)
                horizontalLineTo(24.0f)
                verticalLineToRelative(-1.18f)
                curveTo(23.082f, 22.23f, 22.295f, 21.967f, 22.033f, 21.18f)
                close()
                moveTo(6.82f, 14.361f)
                curveToRelative(1.311f, -3.279f, 2.754f, -7.082f, 3.279f, -8.525f)
                lineToRelative(3.41f, 8.525f)
                horizontalLineTo(6.82f)
                close()
            }
        }
        .build()
        return _academia!!
    }

private var _academia: VectorAsset? = null
