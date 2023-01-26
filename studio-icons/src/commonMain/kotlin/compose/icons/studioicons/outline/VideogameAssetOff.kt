package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.VideogameAssetOff: ImageVector
    get() {
        if (_videogameAssetOff != null) {
            return _videogameAssetOff!!
        }
        _videogameAssetOff = Builder(name = "VideogameAssetOff", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 9.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveTo(18.33f, 12.0f, 17.5f, 12.0f)
                reflectiveCurveTo(16.0f, 11.33f, 16.0f, 10.5f)
                reflectiveCurveTo(16.67f, 9.0f, 17.5f, 9.0f)
                close()
                moveTo(10.83f, 8.0f)
                horizontalLineTo(20.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-1.17f)
                lineToRelative(1.87f, 1.87f)
                curveTo(21.45f, 17.58f, 22.0f, 16.85f, 22.0f, 16.0f)
                verticalLineTo(8.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(8.83f)
                lineTo(10.83f, 8.0f)
                close()
                moveTo(19.78f, 22.61f)
                lineTo(15.17f, 18.0f)
                horizontalLineTo(4.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                verticalLineTo(8.0f)
                curveToRelative(0.0f, -0.85f, 0.55f, -1.58f, 1.3f, -1.87f)
                lineTo(1.39f, 4.22f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(18.38f, 18.38f)
                lineTo(19.78f, 22.61f)
                close()
                moveTo(13.17f, 16.0f)
                lineToRelative(-3.0f, -3.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(9.83f)
                lineTo(5.17f, 8.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(8.0f)
                horizontalLineTo(13.17f)
                close()
            }
        }
        .build()
        return _videogameAssetOff!!
    }

private var _videogameAssetOff: ImageVector? = null
