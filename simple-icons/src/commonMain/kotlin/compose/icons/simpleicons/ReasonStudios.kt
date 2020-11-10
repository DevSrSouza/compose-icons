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

public val SimpleIcons.ReasonStudios: VectorAsset
    get() {
        if (_reasonStudios != null) {
            return _reasonStudios!!
        }
        _reasonStudios = VectorAssetBuilder(name = "ReasonStudios", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.49f, 5.114f)
                lineToRelative(8.299f, -4.79f)
                curveToRelative(0.739f, -0.427f, 1.647f, -0.432f, 2.391f, -0.017f)
                lineToRelative(0.03f, 0.017f)
                lineToRelative(8.299f, 4.79f)
                curveToRelative(0.74f, 0.427f, 1.2f, 1.212f, 1.211f, 2.065f)
                verticalLineTo(7.21f)
                verticalLineToRelative(9.58f)
                curveToRelative(0.0f, 0.854f, -0.451f, 1.644f, -1.184f, 2.08f)
                lineToRelative(-0.027f, 0.016f)
                lineToRelative(-8.299f, 4.79f)
                curveToRelative(-0.739f, 0.427f, -1.647f, 0.432f, -2.391f, 0.017f)
                lineToRelative(-0.03f, -0.017f)
                lineToRelative(-8.299f, -4.79f)
                curveToRelative(-0.74f, -0.427f, -1.199f, -1.213f, -1.21f, -2.065f)
                verticalLineTo(16.79f)
                verticalLineTo(7.21f)
                curveToRelative(0.0f, -0.854f, 0.45f, -1.644f, 1.184f, -2.08f)
                lineTo(2.49f, 5.114f)
                lineToRelative(8.299f, -4.79f)
                lineTo(2.49f, 5.114f)
                close()
                moveTo(12.0f, 4.026f)
                lineTo(5.092f, 8.013f)
                verticalLineToRelative(7.974f)
                lineTo(12.0f, 19.974f)
                verticalLineTo(12.0f)
                lineToRelative(6.908f, -3.987f)
                lineTo(12.0f, 4.026f)
                close()
            }
        }
        .build()
        return _reasonStudios!!
    }

private var _reasonStudios: VectorAsset? = null
