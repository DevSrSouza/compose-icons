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

public val SimpleIcons.Bamboo: VectorAsset
    get() {
        if (_bamboo != null) {
            return _bamboo!!
        }
        _bamboo = VectorAssetBuilder(name = "Bamboo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.715f, 13.643f)
                horizontalLineToRelative(-4.989f)
                arcToRelative(0.651f, 0.651f, 0.0f, false, false, -0.655f, 0.555f)
                arcToRelative(4.114f, 4.114f, 0.0f, false, true, -4.062f, 3.531f)
                lineToRelative(1.35f, 6.172f)
                arcToRelative(10.374f, 10.374f, 0.0f, false, false, 9.007f, -9.545f)
                arcToRelative(0.651f, 0.651f, 0.0f, false, false, -0.651f, -0.713f)
                close()
                moveTo(13.082f, 13.485f)
                lineToRelative(7.2f, -6.171f)
                arcToRelative(0.645f, 0.645f, 0.0f, false, false, 0.0f, -0.984f)
                lineTo(13.081f, 0.16f)
                arcToRelative(0.648f, 0.648f, 0.0f, false, false, -1.073f, 0.483f)
                verticalLineToRelative(12.343f)
                arcToRelative(0.651f, 0.651f, 0.0f, false, false, 1.073f, 0.5f)
                close()
                moveTo(1.727f, 14.99f)
                arcTo(10.385f, 10.385f, 0.0f, false, false, 12.012f, 24.0f)
                verticalLineToRelative(-6.27f)
                arcToRelative(4.093f, 4.093f, 0.0f, false, true, -4.1f, -4.087f)
                lineTo(1.727f, 14.99f)
                close()
                moveTo(1.631f, 13.543f)
                verticalLineToRelative(0.1f)
                horizontalLineToRelative(6.28f)
                arcToRelative(4.093f, 4.093f, 0.0f, false, true, 4.098f, -4.087f)
                lineToRelative(-1.348f, -6.17f)
                arcToRelative(10.37f, 10.37f, 0.0f, false, false, -9.03f, 10.157f)
            }
        }
        .build()
        return _bamboo!!
    }

private var _bamboo: VectorAsset? = null
