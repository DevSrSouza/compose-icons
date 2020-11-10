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

public val SimpleIcons.WpEngine: VectorAsset
    get() {
        if (_wpEngine != null) {
            return _wpEngine!!
        }
        _wpEngine = VectorAssetBuilder(name = "WpEngine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.1f, 24.0f)
                horizontalLineToRelative(7.8f)
                verticalLineToRelative(-5.85f)
                lineToRelative(-1.95f, -1.801f)
                horizontalLineToRelative(-3.9f)
                lineTo(8.1f, 18.15f)
                lineTo(8.1f, 24.0f)
                close()
                moveTo(18.15f, 8.1f)
                lineToRelative(-1.801f, 1.95f)
                verticalLineToRelative(3.9f)
                lineToRelative(1.801f, 1.95f)
                lineTo(24.0f, 15.9f)
                lineTo(24.0f, 8.1f)
                horizontalLineToRelative(-5.85f)
                close()
                moveTo(15.9f, 0.0f)
                lineTo(8.1f, 0.0f)
                verticalLineToRelative(5.85f)
                lineToRelative(1.95f, 1.801f)
                horizontalLineToRelative(3.9f)
                lineTo(15.9f, 5.85f)
                lineTo(15.9f, 0.0f)
                close()
                moveTo(24.0f, 24.0f)
                verticalLineToRelative(-5.85f)
                lineToRelative(-1.801f, -1.801f)
                horizontalLineToRelative(-5.85f)
                lineTo(16.349f, 24.0f)
                lineTo(24.0f, 24.0f)
                close()
                moveTo(1.8f, 0.0f)
                lineTo(0.0f, 1.8f)
                verticalLineToRelative(5.85f)
                horizontalLineToRelative(7.65f)
                lineTo(7.65f, 0.0f)
                lineTo(1.8f, 0.0f)
                close()
                moveTo(16.35f, 0.0f)
                verticalLineToRelative(5.85f)
                lineToRelative(1.8f, 1.8f)
                lineTo(24.0f, 7.65f)
                lineTo(24.0f, 0.0f)
                horizontalLineToRelative(-7.65f)
                close()
                moveTo(12.0f, 13.05f)
                curveToRelative(-0.6f, 0.0f, -1.05f, -0.45f, -1.05f, -1.05f)
                reflectiveCurveToRelative(0.45f, -1.05f, 1.05f, -1.05f)
                reflectiveCurveToRelative(1.05f, 0.45f, 1.05f, 1.05f)
                reflectiveCurveToRelative(-0.45f, 1.05f, -1.05f, 1.05f)
                moveToRelative(-4.35f, 5.1f)
                lineToRelative(-1.8f, -1.8f)
                lineTo(0.0f, 16.35f)
                lineTo(0.0f, 24.0f)
                horizontalLineToRelative(5.85f)
                lineToRelative(1.801f, -1.801f)
                lineTo(7.651f, 18.15f)
                close()
                moveTo(7.65f, 8.1f)
                lineTo(0.0f, 8.1f)
                verticalLineToRelative(7.8f)
                horizontalLineToRelative(5.85f)
                lineToRelative(1.801f, -1.95f)
                lineTo(7.651f, 8.1f)
                close()
            }
        }
        .build()
        return _wpEngine!!
    }

private var _wpEngine: VectorAsset? = null
