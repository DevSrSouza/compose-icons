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

public val SimpleIcons.Yoast: VectorAsset
    get() {
        if (_yoast != null) {
            return _yoast!!
        }
        _yoast = VectorAssetBuilder(name = "Yoast", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.864f, 0.0f)
                lineTo(14.55f, 3.652f)
                lineTo(5.422f, 3.652f)
                arcTo(3.592f, 3.592f, 0.0f, false, false, 1.84f, 7.233f)
                verticalLineToRelative(9.529f)
                arcToRelative(3.592f, 3.592f, 0.0f, false, false, 3.582f, 3.581f)
                horizontalLineToRelative(1.495f)
                arcToRelative(4.9f, 4.9f, 0.0f, false, true, -0.18f, 0.029f)
                lineToRelative(-0.34f, 0.047f)
                lineTo(6.397f, 24.0f)
                horizontalLineToRelative(0.391f)
                curveToRelative(2.76f, 0.0f, 4.442f, -1.385f, 5.706f, -3.657f)
                horizontalLineToRelative(9.666f)
                lineTo(22.16f, 7.233f)
                arcToRelative(3.593f, 3.593f, 0.0f, false, false, -3.253f, -3.565f)
                lineTo(20.275f, 0.0f)
                close()
                moveTo(16.42f, 0.778f)
                horizontalLineToRelative(2.738f)
                lineToRelative(-6.055f, 16.22f)
                curveToRelative(-1.55f, 4.335f, -3.186f, 6.064f, -5.924f, 6.21f)
                verticalLineToRelative(-2.12f)
                curveToRelative(1.767f, -0.354f, 2.418f, -1.461f, 2.785f, -2.408f)
                arcToRelative(3.902f, 3.902f, 0.0f, false, false, 0.0f, -2.828f)
                lineTo(6.43f, 6.772f)
                horizontalLineToRelative(2.488f)
                lineToRelative(2.512f, 7.86f)
                close()
            }
        }
        .build()
        return _yoast!!
    }

private var _yoast: VectorAsset? = null
