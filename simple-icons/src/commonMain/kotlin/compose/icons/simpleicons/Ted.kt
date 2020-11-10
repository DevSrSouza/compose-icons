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

public val SimpleIcons.Ted: VectorAsset
    get() {
        if (_ted != null) {
            return _ted!!
        }
        _ted = VectorAssetBuilder(name = "Ted", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.431f, 9.886f)
                lineTo(0.0f, 9.886f)
                lineTo(0.0f, 7.665f)
                horizontalLineToRelative(7.53f)
                verticalLineToRelative(2.221f)
                lineTo(5.1f, 9.886f)
                verticalLineToRelative(6.45f)
                lineTo(2.431f, 16.336f)
                verticalLineToRelative(-6.45f)
                close()
                moveTo(7.945f, 7.665f)
                horizontalLineToRelative(7.31f)
                verticalLineToRelative(2.221f)
                horizontalLineToRelative(-4.638f)
                verticalLineToRelative(1.083f)
                horizontalLineToRelative(4.638f)
                verticalLineToRelative(2.063f)
                horizontalLineToRelative(-4.638f)
                verticalLineToRelative(1.08f)
                horizontalLineToRelative(4.638f)
                verticalLineToRelative(2.225f)
                horizontalLineToRelative(-7.31f)
                lineTo(7.945f, 7.665f)
                close()
                moveTo(18.375f, 14.116f)
                horizontalLineToRelative(1.046f)
                curveToRelative(1.664f, 0.0f, 1.907f, -1.352f, 1.907f, -2.166f)
                curveToRelative(0.0f, -0.545f, -0.179f, -2.063f, -2.115f, -2.063f)
                horizontalLineToRelative(-0.854f)
                verticalLineToRelative(4.23f)
                lineToRelative(0.016f, -0.001f)
                close()
                moveTo(15.705f, 7.665f)
                horizontalLineToRelative(4.384f)
                curveTo(22.98f, 7.665f, 24.0f, 9.8f, 24.0f, 11.985f)
                curveToRelative(0.0f, 2.66f, -1.409f, 4.351f, -4.434f, 4.351f)
                horizontalLineToRelative(-3.861f)
                lineTo(15.705f, 7.663f)
                verticalLineToRelative(0.002f)
                close()
            }
        }
        .build()
        return _ted!!
    }

private var _ted: VectorAsset? = null
