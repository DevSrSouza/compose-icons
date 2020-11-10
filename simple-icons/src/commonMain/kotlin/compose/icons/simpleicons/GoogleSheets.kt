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

public val SimpleIcons.GoogleSheets: VectorAsset
    get() {
        if (_googleSheets != null) {
            return _googleSheets!!
        }
        _googleSheets = VectorAssetBuilder(name = "GoogleSheets", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.908f, 0.0f)
                curveToRelative(-0.873f, 0.0f, -1.635f, 0.764f, -1.635f, 1.637f)
                verticalLineToRelative(20.726f)
                curveToRelative(0.0f, 0.873f, 0.762f, 1.637f, 1.635f, 1.637f)
                horizontalLineToRelative(14.184f)
                curveToRelative(0.873f, 0.0f, 1.635f, -0.764f, 1.635f, -1.637f)
                lineTo(20.727f, 7.045f)
                horizontalLineToRelative(-4.909f)
                arcToRelative(2.157f, 2.157f, 0.0f, false, true, -2.136f, -2.137f)
                lineTo(13.682f, 0.0f)
                lineTo(4.908f, 0.0f)
                close()
                moveTo(14.682f, 0.5f)
                verticalLineToRelative(4.408f)
                curveToRelative(0.0f, 0.581f, 0.555f, 1.137f, 1.136f, 1.137f)
                horizontalLineToRelative(4.409f)
                lineTo(14.682f, 0.5f)
                close()
                moveTo(7.637f, 11.781f)
                horizontalLineToRelative(8.726f)
                verticalLineToRelative(7.856f)
                lineTo(7.637f, 19.637f)
                lineTo(7.637f, 11.78f)
                close()
                moveTo(8.727f, 12.873f)
                verticalLineToRelative(1.309f)
                horizontalLineToRelative(2.728f)
                verticalLineToRelative(-1.309f)
                lineTo(8.727f, 12.873f)
                close()
                moveTo(12.545f, 12.873f)
                verticalLineToRelative(1.309f)
                horizontalLineToRelative(2.728f)
                verticalLineToRelative(-1.309f)
                horizontalLineToRelative(-2.728f)
                close()
                moveTo(8.727f, 15.055f)
                verticalLineToRelative(1.308f)
                horizontalLineToRelative(2.728f)
                verticalLineToRelative(-1.308f)
                lineTo(8.727f, 15.055f)
                close()
                moveTo(12.545f, 15.055f)
                verticalLineToRelative(1.308f)
                horizontalLineToRelative(2.728f)
                verticalLineToRelative(-1.308f)
                horizontalLineToRelative(-2.728f)
                close()
                moveTo(8.727f, 17.236f)
                verticalLineToRelative(1.309f)
                horizontalLineToRelative(2.728f)
                verticalLineToRelative(-1.309f)
                lineTo(8.727f, 17.236f)
                close()
                moveTo(12.545f, 17.236f)
                verticalLineToRelative(1.309f)
                horizontalLineToRelative(2.728f)
                verticalLineToRelative(-1.309f)
                horizontalLineToRelative(-2.728f)
                close()
            }
        }
        .build()
        return _googleSheets!!
    }

private var _googleSheets: VectorAsset? = null
