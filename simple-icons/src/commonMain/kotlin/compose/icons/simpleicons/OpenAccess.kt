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

public val SimpleIcons.OpenAccess: VectorAsset
    get() {
        if (_openAccess != null) {
            return _openAccess!!
        }
        _openAccess = VectorAssetBuilder(name = "OpenAccess", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.972f, 13.487f)
                arcToRelative(7.56f, 7.56f, 0.0f, false, false, -0.54f, -1.043f)
                lineTo(18.432f, 6.416f)
                arcToRelative(6.376f, 6.376f, 0.0f, false, false, -1.88f, -4.536f)
                arcTo(6.375f, 6.375f, 0.0f, false, false, 12.016f, 0.0f)
                horizontalLineToRelative(-0.002f)
                arcToRelative(6.375f, 6.375f, 0.0f, false, false, -4.536f, 1.878f)
                arcToRelative(6.376f, 6.376f, 0.0f, false, false, -1.88f, 4.538f)
                verticalLineToRelative(0.877f)
                horizontalLineToRelative(2.57f)
                verticalLineToRelative(-0.877f)
                curveToRelative(0.0f, -1.027f, 0.4f, -1.993f, 1.127f, -2.72f)
                arcToRelative(3.822f, 3.822f, 0.0f, false, true, 2.72f, -1.126f)
                arcToRelative(3.852f, 3.852f, 0.0f, false, true, 3.847f, 3.846f)
                verticalLineToRelative(3.508f)
                arcTo(7.52f, 7.52f, 0.0f, false, false, 12.0f, 8.866f)
                arcToRelative(7.54f, 7.54f, 0.0f, false, false, -5.35f, 2.216f)
                arcToRelative(7.54f, 7.54f, 0.0f, false, false, -2.217f, 5.35f)
                arcToRelative(7.54f, 7.54f, 0.0f, false, false, 2.216f, 5.35f)
                arcTo(7.54f, 7.54f, 0.0f, false, false, 12.0f, 24.002f)
                arcToRelative(7.54f, 7.54f, 0.0f, false, false, 5.35f, -2.216f)
                arcToRelative(7.54f, 7.54f, 0.0f, false, false, 2.217f, -5.351f)
                curveToRelative(0.0f, -1.021f, -0.2f, -2.012f, -0.595f, -2.946f)
                close()
                moveTo(12.0f, 21.43f)
                curveToRelative(-2.755f, 0.0f, -4.997f, -2.242f, -4.997f, -4.997f)
                reflectiveCurveTo(9.245f, 11.436f, 12.0f, 11.436f)
                reflectiveCurveToRelative(4.997f, 2.241f, 4.997f, 4.997f)
                reflectiveCurveTo(14.755f, 21.43f, 12.0f, 21.43f)
                close()
                moveTo(14.145f, 16.456f)
                arcToRelative(2.12f, 2.12f, 0.0f, true, true, -4.24f, 0.0f)
                arcToRelative(2.12f, 2.12f, 0.0f, false, true, 4.24f, 0.0f)
                close()
            }
        }
        .build()
        return _openAccess!!
    }

private var _openAccess: VectorAsset? = null
